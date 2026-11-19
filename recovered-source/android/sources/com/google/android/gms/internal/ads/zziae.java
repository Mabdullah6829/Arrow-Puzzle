package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zziae {
    /* JADX INFO: renamed from: a */
    public static ECParameterSpec m8035a(zziac zziacVar) throws NoSuchAlgorithmException {
        int iOrdinal = zziacVar.ordinal();
        if (iOrdinal == 0) {
            return zzhlt.f18949a;
        }
        if (iOrdinal == 1) {
            return zzhlt.f18950b;
        }
        if (iOrdinal == 2) {
            return zzhlt.f18951c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(zziacVar.toString()));
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m8036b(byte[] bArr) {
        int length;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i2 >= length || bArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == length) {
            i2 = length - 1;
        }
        int i3 = (bArr[i2] & 128) == 128 ? 1 : 0;
        int i4 = length - i2;
        byte[] bArr2 = new byte[i4 + i3];
        System.arraycopy(bArr, i2, bArr2, i3, i4);
        return bArr2;
    }
}
