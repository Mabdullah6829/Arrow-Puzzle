package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhyp implements zzhev {

    /* JADX INFO: renamed from: a */
    public final zzhev f19471a;

    /* JADX INFO: renamed from: b */
    public final byte[] f19472b;

    /* JADX INFO: renamed from: c */
    public final byte[] f19473c;

    public zzhyp(zzhev zzhevVar, byte[] bArr, byte[] bArr2) {
        this.f19471a = zzhevVar;
        this.f19472b = bArr;
        this.f19473c = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m8008b(zzhnz zzhnzVar) throws GeneralSecurityException {
        zzhtx zzhtxVar = zzhnzVar.f19034e;
        Integer num = zzhnzVar.f19035f;
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhnf.m7580b(num.intValue()).m8051b();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhnf.f19007a.m8051b();
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return zzhnf.m7579a(num.intValue()).m8051b();
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    /* JADX INFO: renamed from: a */
    public final void mo7422a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19472b;
        int length = bArr3.length;
        zzhev zzhevVar = this.f19471a;
        byte[] bArr4 = this.f19473c;
        if (length == 0 && bArr4.length == 0) {
            zzhevVar.mo7422a(bArr, bArr2);
        } else {
            if (!zzhok.m7598c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            if (bArr4.length != 0) {
                bArr2 = zzhzw.m8023a(bArr2, bArr4);
            }
            zzhevVar.mo7422a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
