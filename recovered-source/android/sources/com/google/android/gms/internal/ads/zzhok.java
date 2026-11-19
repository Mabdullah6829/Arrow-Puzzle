package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhok {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f19057a = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static final zzibk m7596a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(cCharAt);
                throw new zzhoj(sb.toString());
            }
            bArr[i2] = (byte) cCharAt;
        }
        return zzibk.m8050a(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static final zzibk m7597b(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(cCharAt);
                throw new GeneralSecurityException(sb.toString());
            }
            bArr[i2] = (byte) cCharAt;
        }
        return zzibk.m8050a(bArr);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7598c(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        return true;
    }
}
