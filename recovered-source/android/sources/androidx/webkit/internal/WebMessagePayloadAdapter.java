package androidx.webkit.internal;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class WebMessagePayloadAdapter implements WebMessagePayloadBoundaryInterface {
    private final byte[] mArrayBuffer;
    private final String mString;
    private final int mType;

    public WebMessagePayloadAdapter(String str) {
        this.mType = 0;
        this.mString = str;
        this.mArrayBuffer = null;
    }

    private void checkType(int i2) {
        if (this.mType == i2) {
            return;
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Expected ", ", but type is ");
        sbM404l.append(this.mType);
        throw new IllegalStateException(sbM404l.toString());
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
        checkType(1);
        byte[] bArr = this.mArrayBuffer;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public String getAsString() {
        checkType(0);
        return this.mString;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.mType;
    }

    public WebMessagePayloadAdapter(byte[] bArr) {
        this.mType = 1;
        this.mString = null;
        this.mArrayBuffer = bArr;
    }
}
