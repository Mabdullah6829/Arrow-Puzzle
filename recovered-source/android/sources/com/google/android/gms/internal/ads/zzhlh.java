package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhlh {
    /* JADX INFO: renamed from: a */
    public static byte[] m7507a(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m7508b(BigInteger bigInteger, int i2) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i2) {
            return byteArray;
        }
        int i3 = i2 + 1;
        if (length > i3) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i3) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, 0, bArr, i2 - length, length);
        return bArr;
    }
}
