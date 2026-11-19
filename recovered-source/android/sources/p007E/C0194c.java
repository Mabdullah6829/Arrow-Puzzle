package p007E;

import com.google.common.p055io.BaseEncoding$DecodingException;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: E.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0194c extends C0195d {
    public C0194c(String str, String str2) {
        this(new C0192a(str, str2.toCharArray()), (Character) '=');
    }

    @Override // p007E.C0195d
    /* JADX INFO: renamed from: b */
    public final int mo284b(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        CharSequence charSequenceM289f = m289f(charSequence);
        int length = charSequenceM289f.length();
        C0192a c0192a = this.f389a;
        if (!c0192a.f385h[length % c0192a.f382e]) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequenceM289f.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceM289f.length()) {
            int i4 = i2 + 2;
            int iM283a = (c0192a.m283a(charSequenceM289f.charAt(i2 + 1)) << 12) | (c0192a.m283a(charSequenceM289f.charAt(i2)) << 18);
            int i5 = i3 + 1;
            bArr[i3] = (byte) (iM283a >>> 16);
            if (i4 < charSequenceM289f.length()) {
                int i6 = i2 + 3;
                int iM283a2 = iM283a | (c0192a.m283a(charSequenceM289f.charAt(i4)) << 6);
                int i7 = i3 + 2;
                bArr[i5] = (byte) ((iM283a2 >>> 8) & 255);
                if (i6 < charSequenceM289f.length()) {
                    i2 += 4;
                    i3 += 3;
                    bArr[i7] = (byte) ((iM283a2 | c0192a.m283a(charSequenceM289f.charAt(i6))) & 255);
                } else {
                    i3 = i7;
                    i2 = i6;
                }
            } else {
                i3 = i5;
                i2 = i4;
            }
        }
        return i3;
    }

    @Override // p007E.C0195d
    /* JADX INFO: renamed from: e */
    public final void mo285e(StringBuilder sb, byte[] bArr, int i2) {
        int i3 = 0;
        AbstractC0076b.m136k(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = i3 + 2;
            int i6 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16);
            i3 += 3;
            int i7 = i6 | (bArr[i5] & 255);
            C0192a c0192a = this.f389a;
            char[] cArr = c0192a.f379b;
            char[] cArr2 = c0192a.f379b;
            sb.append(cArr[i7 >>> 18]);
            sb.append(cArr2[(i7 >>> 12) & 63]);
            sb.append(cArr2[(i7 >>> 6) & 63]);
            sb.append(cArr2[i7 & 63]);
        }
        if (i3 < i2) {
            m288d(sb, bArr, i3, i2 - i3);
        }
    }

    public C0194c(C0192a c0192a, Character ch) {
        super(c0192a, ch);
        AbstractC0076b.m130e(c0192a.f379b.length == 64);
    }
}
