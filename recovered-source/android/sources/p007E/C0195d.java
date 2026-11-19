package p007E;

import com.google.common.p055io.BaseEncoding$DecodingException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import p001B.AbstractC0076b;
import p043a.AbstractC0878a;

/* JADX INFO: renamed from: E.d */
/* JADX INFO: loaded from: classes2.dex */
public class C0195d {

    /* JADX INFO: renamed from: c */
    public static final C0194c f387c = new C0194c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: d */
    public static final C0194c f388d = new C0194c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* JADX INFO: renamed from: a */
    public final C0192a f389a;

    /* JADX INFO: renamed from: b */
    public final Character f390b;

    static {
        new C0195d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C0195d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new C0193b(new C0192a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public C0195d(C0192a c0192a, Character ch) {
        boolean z;
        c0192a.getClass();
        this.f389a = c0192a;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = c0192a.f384g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        AbstractC0076b.m129d("Padding character %s was already in alphabet", z, ch);
        this.f390b = ch;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m286a(String str) {
        try {
            CharSequence charSequenceM289f = m289f(str);
            int length = (int) (((((long) this.f389a.f381d) * ((long) charSequenceM289f.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iMo284b = mo284b(bArr, charSequenceM289f);
            if (iMo284b == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iMo284b];
            System.arraycopy(bArr, 0, bArr2, 0, iMo284b);
            return bArr2;
        } catch (BaseEncoding$DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public int mo284b(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        CharSequence charSequenceM289f = m289f(charSequence);
        int length = charSequenceM289f.length();
        C0192a c0192a = this.f389a;
        boolean[] zArr = c0192a.f385h;
        int i2 = c0192a.f381d;
        int i3 = c0192a.f382e;
        if (!zArr[length % i3]) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequenceM289f.length());
        }
        int i4 = 0;
        for (int i5 = 0; i5 < charSequenceM289f.length(); i5 += i3) {
            long jM283a = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                jM283a <<= i2;
                if (i5 + i7 < charSequenceM289f.length()) {
                    jM283a |= (long) c0192a.m283a(charSequenceM289f.charAt(i6 + i5));
                    i6++;
                }
            }
            int i8 = c0192a.f383f;
            int i9 = (i8 * 8) - (i6 * i2);
            int i10 = (i8 - 1) * 8;
            while (i10 >= i9) {
                bArr[i4] = (byte) ((jM283a >>> i10) & 255);
                i10 -= 8;
                i4++;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: c */
    public final String m287c(byte[] bArr) {
        int length = bArr.length;
        AbstractC0076b.m136k(0, length, bArr.length);
        C0192a c0192a = this.f389a;
        int i2 = c0192a.f382e;
        int i3 = c0192a.f383f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(AbstractC0878a.m1799h(length, i3) * i2);
        try {
            mo285e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m288d(StringBuilder sb, byte[] bArr, int i2, int i3) {
        AbstractC0076b.m136k(i2, i2 + i3, bArr.length);
        C0192a c0192a = this.f389a;
        int i4 = c0192a.f383f;
        int i5 = c0192a.f381d;
        int i6 = 0;
        AbstractC0076b.m130e(i3 <= i4);
        long j2 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            j2 = (j2 | ((long) (bArr[i2 + i7] & 255))) << 8;
        }
        int i8 = ((i3 + 1) * 8) - i5;
        while (i6 < i3 * 8) {
            sb.append(c0192a.f379b[((int) (j2 >>> (i8 - i6))) & c0192a.f380c]);
            i6 += i5;
        }
        Character ch = this.f390b;
        if (ch != null) {
            while (i6 < c0192a.f383f * 8) {
                sb.append(ch.charValue());
                i6 += i5;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo285e(StringBuilder sb, byte[] bArr, int i2) {
        int i3 = 0;
        AbstractC0076b.m136k(0, i2, bArr.length);
        while (i3 < i2) {
            C0192a c0192a = this.f389a;
            m288d(sb, bArr, i3, Math.min(c0192a.f383f, i2 - i3));
            i3 += c0192a.f383f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0195d) {
            C0195d c0195d = (C0195d) obj;
            if (this.f389a.equals(c0195d.f389a) && Objects.equals(this.f390b, c0195d.f390b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final CharSequence m289f(CharSequence charSequence) {
        Character ch = this.f390b;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        return this.f389a.hashCode() ^ Objects.hashCode(this.f390b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C0192a c0192a = this.f389a;
        sb.append(c0192a);
        if (8 % c0192a.f381d != 0) {
            Character ch = this.f390b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public C0195d(String str, String str2) {
        this(new C0192a(str, str2.toCharArray()), (Character) '=');
    }
}
