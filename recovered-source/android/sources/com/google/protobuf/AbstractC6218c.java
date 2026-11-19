package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6218c implements InterfaceC6262s0 {
    protected int memoizedHashCode;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC6215b.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(AbstractC6251n abstractC6251n) {
        if (!abstractC6251n.mo11724r()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m11849a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract int getSerializedSize(InterfaceC6178I0 interfaceC6178I0);

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    @Override // com.google.protobuf.InterfaceC6262s0
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC6269w.f24289d;
            C6265u c6265u = new C6265u(bArr, 0, serializedSize);
            writeTo(c6265u);
            if (c6265u.m12016b0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m11849a("byte array"), e);
        }
    }

    public AbstractC6251n toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C6248m c6248m = AbstractC6251n.f24219t;
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC6269w.f24289d;
            C6265u c6265u = new C6265u(bArr, 0, serializedSize);
            writeTo(c6265u);
            if (c6265u.m12016b0() == 0) {
                return new C6248m(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m11849a("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM12070E = AbstractC6269w.m12070E(serializedSize) + serializedSize;
        if (iM12070E > 4096) {
            iM12070E = 4096;
        }
        C6267v c6267v = new C6267v(outputStream, iM12070E);
        c6267v.mo12013Y(serializedSize);
        writeTo(c6267v);
        if (c6267v.f24272h > 0) {
            c6267v.m12026g0();
        }
    }

    @Override // com.google.protobuf.InterfaceC6262s0
    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = AbstractC6269w.f24289d;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C6267v c6267v = new C6267v(outputStream, serializedSize);
        writeTo(c6267v);
        if (c6267v.f24272h > 0) {
            c6267v.m12026g0();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC6215b.addAll((Iterable) iterable, (List) list);
    }
}
