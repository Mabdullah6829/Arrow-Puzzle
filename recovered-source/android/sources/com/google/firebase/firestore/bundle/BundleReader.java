package com.google.firebase.firestore.bundle;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.util.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.json.JSONObject;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class BundleReader {
    protected static final int BUFFER_CAPACITY = 1024;
    private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");
    private ByteBuffer buffer;
    private final InputStream bundleInputStream;
    long bytesRead;
    private final InputStreamReader dataReader;

    @Nullable
    BundleMetadata metadata;
    private final BundleSerializer serializer;

    public BundleReader(BundleSerializer bundleSerializer, InputStream inputStream) {
        this.serializer = bundleSerializer;
        this.bundleInputStream = inputStream;
        this.dataReader = new InputStreamReader(inputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
        this.buffer = byteBufferAllocate;
        byteBufferAllocate.flip();
    }

    private IllegalArgumentException abort(String str) throws IOException {
        close();
        throw new IllegalArgumentException(AbstractC0271e0.m398f("Invalid bundle: ", str));
    }

    private BundleElement decodeBundleElement(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("metadata")) {
            BundleMetadata bundleMetadataDecodeBundleMetadata = this.serializer.decodeBundleMetadata(jSONObject.getJSONObject("metadata"));
            Logger.debug("BundleElement", "BundleMetadata element loaded", new Object[0]);
            return bundleMetadataDecodeBundleMetadata;
        }
        if (jSONObject.has("namedQuery")) {
            NamedQuery namedQueryDecodeNamedQuery = this.serializer.decodeNamedQuery(jSONObject.getJSONObject("namedQuery"));
            Logger.debug("BundleElement", "Query loaded: " + namedQueryDecodeNamedQuery.getName(), new Object[0]);
            return namedQueryDecodeNamedQuery;
        }
        if (jSONObject.has("documentMetadata")) {
            BundledDocumentMetadata bundledDocumentMetadataDecodeBundledDocumentMetadata = this.serializer.decodeBundledDocumentMetadata(jSONObject.getJSONObject("documentMetadata"));
            Logger.debug("BundleElement", "Document metadata loaded: " + bundledDocumentMetadataDecodeBundledDocumentMetadata.getKey(), new Object[0]);
            return bundledDocumentMetadataDecodeBundledDocumentMetadata;
        }
        if (!jSONObject.has("document")) {
            throw abort(AbstractC0271e0.m398f("Cannot decode unknown Bundle element: ", str));
        }
        BundleDocument bundleDocumentDecodeDocument = this.serializer.decodeDocument(jSONObject.getJSONObject("document"));
        Logger.debug("BundleElement", "Document loaded: " + bundleDocumentDecodeDocument.getKey(), new Object[0]);
        return bundleDocumentDecodeDocument;
    }

    private int indexOfOpenBracket() {
        this.buffer.mark();
        for (int i2 = 0; i2 < this.buffer.remaining(); i2++) {
            try {
                if (this.buffer.get() == 123) {
                    return i2;
                }
            } finally {
                this.buffer.reset();
            }
        }
        return -1;
    }

    private boolean pullMoreData() throws IOException {
        this.buffer.compact();
        int i2 = this.bundleInputStream.read(this.buffer.array(), this.buffer.position() + this.buffer.arrayOffset(), this.buffer.remaining());
        boolean z = i2 > 0;
        if (z) {
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.position() + i2);
        }
        this.buffer.flip();
        return z;
    }

    private String readJsonString(int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i2 > 0) {
            if (this.buffer.remaining() == 0 && !pullMoreData()) {
                throw abort("Reached the end of bundle when more data was expected.");
            }
            int iMin = Math.min(i2, this.buffer.remaining());
            byteArrayOutputStream.write(this.buffer.array(), this.buffer.position() + this.buffer.arrayOffset(), iMin);
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.position() + iMin);
            i2 -= iMin;
        }
        return byteArrayOutputStream.toString(UTF8_CHARSET.name());
    }

    @Nullable
    private String readLengthPrefix() {
        int iIndexOfOpenBracket;
        do {
            iIndexOfOpenBracket = indexOfOpenBracket();
            if (iIndexOfOpenBracket != -1) {
                break;
            }
        } while (pullMoreData());
        if (this.buffer.remaining() == 0) {
            return null;
        }
        if (iIndexOfOpenBracket == -1) {
            throw abort("Reached the end of bundle when a length string is expected.");
        }
        byte[] bArr = new byte[iIndexOfOpenBracket];
        this.buffer.get(bArr);
        return UTF8_CHARSET.decode(ByteBuffer.wrap(bArr)).toString();
    }

    @Nullable
    private BundleElement readNextElement() {
        String lengthPrefix = readLengthPrefix();
        if (lengthPrefix == null) {
            return null;
        }
        int i2 = Integer.parseInt(lengthPrefix);
        String jsonString = readJsonString(i2);
        this.bytesRead += (long) (lengthPrefix.getBytes(UTF8_CHARSET).length + i2);
        return decodeBundleElement(jsonString);
    }

    public void close() throws IOException {
        this.bundleInputStream.close();
    }

    public BundleMetadata getBundleMetadata() {
        BundleMetadata bundleMetadata = this.metadata;
        if (bundleMetadata != null) {
            return bundleMetadata;
        }
        BundleElement nextElement = readNextElement();
        if (!(nextElement instanceof BundleMetadata)) {
            throw abort("Expected first element in bundle to be a metadata object");
        }
        BundleMetadata bundleMetadata2 = (BundleMetadata) nextElement;
        this.metadata = bundleMetadata2;
        this.bytesRead = 0L;
        return bundleMetadata2;
    }

    public long getBytesRead() {
        return this.bytesRead;
    }

    public BundleElement getNextElement() {
        getBundleMetadata();
        return readNextElement();
    }
}
