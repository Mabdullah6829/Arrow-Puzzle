package p005D;

import p001B.AbstractC0076b;

/* JADX INFO: renamed from: D.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0157b {

    /* JADX INFO: renamed from: s */
    public static final char[] f272s = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof AbstractC0157b) {
            AbstractC0157b abstractC0157b = (AbstractC0157b) obj;
            byte[] bArr = ((C0156a) this).f271t;
            if (bArr.length * 8 == ((C0156a) abstractC0157b).f271t.length * 8) {
                int length = bArr.length;
                byte[] bArr2 = ((C0156a) abstractC0157b).f271t;
                if (length != bArr2.length) {
                    z = false;
                } else {
                    z = true;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        z &= bArr[i2] == bArr2[i2];
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((C0156a) this).f271t;
        if (bArr.length * 8 >= 32) {
            boolean z = bArr.length >= 4;
            int length = bArr.length;
            if (z) {
                return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
            }
            throw new IllegalStateException(AbstractC0076b.m141p("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i2 = bArr[0] & 255;
        for (int i3 = 1; i3 < bArr.length; i3++) {
            i2 |= (bArr[i3] & 255) << (i3 * 8);
        }
        return i2;
    }

    public final String toString() {
        byte[] bArr = ((C0156a) this).f271t;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = f272s;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
