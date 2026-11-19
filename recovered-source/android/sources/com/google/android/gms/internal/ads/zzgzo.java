package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgzo {

    /* JADX INFO: renamed from: a */
    public static final zzgzo f18401a = new zzgzl("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: b */
    public static final zzgzo f18402b = new zzgzl("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* JADX INFO: renamed from: c */
    public static final zzgzo f18403c;

    static {
        new zzgzn("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new zzgzn("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f18403c = new zzgzk(new zzgzj("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7274a(StringBuilder sb, byte[] bArr, int i2);

    /* JADX INFO: renamed from: b */
    public abstract int mo7275b(byte[] bArr, CharSequence charSequence);

    /* JADX INFO: renamed from: c */
    public abstract int mo7277c(int i2);

    /* JADX INFO: renamed from: d */
    public abstract int mo7278d(int i2);

    /* JADX INFO: renamed from: e */
    public CharSequence mo7279e(CharSequence charSequence) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public abstract zzgzo mo7280f();

    /* JADX INFO: renamed from: g */
    public final String m7282g(int i2, byte[] bArr) {
        zzgtr.m7138k(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(mo7277c(i2));
        try {
            mo7274a(sb, bArr, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m7283h(String str) {
        try {
            CharSequence charSequenceMo7279e = mo7279e(str);
            int iMo7278d = mo7278d(charSequenceMo7279e.length());
            byte[] bArr = new byte[iMo7278d];
            int iMo7275b = mo7275b(bArr, charSequenceMo7279e);
            if (iMo7275b == iMo7278d) {
                return bArr;
            }
            byte[] bArr2 = new byte[iMo7275b];
            System.arraycopy(bArr, 0, bArr2, 0, iMo7275b);
            return bArr2;
        } catch (zzgzm e) {
            throw new IllegalArgumentException(e);
        }
    }
}
