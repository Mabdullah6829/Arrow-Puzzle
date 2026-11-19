package p007E;

import com.google.common.p055io.BaseEncoding$DecodingException;
import java.math.RoundingMode;
import java.util.Arrays;
import p001B.AbstractC0076b;
import p043a.AbstractC0878a;

/* JADX INFO: renamed from: E.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0192a {

    /* JADX INFO: renamed from: a */
    public final String f378a;

    /* JADX INFO: renamed from: b */
    public final char[] f379b;

    /* JADX INFO: renamed from: c */
    public final int f380c;

    /* JADX INFO: renamed from: d */
    public final int f381d;

    /* JADX INFO: renamed from: e */
    public final int f382e;

    /* JADX INFO: renamed from: f */
    public final int f383f;

    /* JADX INFO: renamed from: g */
    public final byte[] f384g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f385h;

    public C0192a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i2 = 0;
        while (true) {
            if (i2 >= cArr.length) {
                this.f378a = str;
                this.f379b = cArr;
                try {
                    int length = cArr.length;
                    RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                    int iM1804o = AbstractC0878a.m1804o(length);
                    this.f381d = iM1804o;
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM1804o);
                    int i3 = 1 << (3 - iNumberOfTrailingZeros);
                    this.f382e = i3;
                    this.f383f = iM1804o >> iNumberOfTrailingZeros;
                    this.f380c = cArr.length - 1;
                    this.f384g = bArr;
                    boolean[] zArr = new boolean[i3];
                    for (int i4 = 0; i4 < this.f383f; i4++) {
                        int i5 = this.f381d;
                        RoundingMode roundingMode2 = RoundingMode.CEILING;
                        zArr[AbstractC0878a.m1799h(i4 * 8, i5)] = true;
                    }
                    this.f385h = zArr;
                    return;
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
                }
            }
            char c = cArr[i2];
            if (!(c < 128)) {
                throw new IllegalArgumentException(AbstractC0076b.m141p("Non-ASCII character: %s", Character.valueOf(c)));
            }
            if (!(bArr[c] == -1)) {
                throw new IllegalArgumentException(AbstractC0076b.m141p("Duplicate character: %s", Character.valueOf(c)));
            }
            bArr[c] = (byte) i2;
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m283a(char c) throws BaseEncoding$DecodingException {
        if (c > 127) {
            throw new BaseEncoding$DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        byte b = this.f384g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new BaseEncoding$DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        throw new BaseEncoding$DecodingException("Unrecognized character: " + c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0192a)) {
            return false;
        }
        C0192a c0192a = (C0192a) obj;
        c0192a.getClass();
        return Arrays.equals(this.f379b, c0192a.f379b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f379b) + 1237;
    }

    public final String toString() {
        return this.f378a;
    }
}
