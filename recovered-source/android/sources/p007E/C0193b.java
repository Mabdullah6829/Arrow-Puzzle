package p007E;

import com.google.common.p055io.BaseEncoding$DecodingException;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: E.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0193b extends C0195d {

    /* JADX INFO: renamed from: e */
    public final char[] f386e;

    public C0193b(C0192a c0192a) {
        super(c0192a, (Character) null);
        this.f386e = new char[512];
        char[] cArr = c0192a.f379b;
        AbstractC0076b.m130e(cArr.length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            char[] cArr2 = this.f386e;
            cArr2[i2] = cArr[i2 >>> 4];
            cArr2[i2 | 256] = cArr[i2 & 15];
        }
    }

    @Override // p007E.C0195d
    /* JADX INFO: renamed from: b */
    public final int mo284b(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        if (charSequence.length() % 2 == 1) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequence.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i2);
            C0192a c0192a = this.f389a;
            bArr[i3] = (byte) ((c0192a.m283a(cCharAt) << 4) | c0192a.m283a(charSequence.charAt(i2 + 1)));
            i2 += 2;
            i3++;
        }
        return i3;
    }

    @Override // p007E.C0195d
    /* JADX INFO: renamed from: e */
    public final void mo285e(StringBuilder sb, byte[] bArr, int i2) {
        AbstractC0076b.m136k(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            char[] cArr = this.f386e;
            sb.append(cArr[i4]);
            sb.append(cArr[i4 | 256]);
        }
    }
}
