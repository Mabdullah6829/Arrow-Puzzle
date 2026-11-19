package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhkh implements zzhdr {

    /* JADX INFO: renamed from: a */
    public final zzhdr f18888a;

    /* JADX INFO: renamed from: b */
    public final byte[] f18889b;

    public zzhkh(zzhdr zzhdrVar, byte[] bArr) {
        this.f18888a = zzhdrVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f18889b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f18889b;
        int length = bArr3.length;
        zzhdr zzhdrVar = this.f18888a;
        if (length == 0) {
            return zzhdrVar.mo7400a(bArr, bArr2);
        }
        if (zzhok.m7598c(bArr3, bArr)) {
            return zzhdrVar.mo7400a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
