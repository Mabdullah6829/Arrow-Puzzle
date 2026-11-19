package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhva {

    /* JADX INFO: renamed from: a */
    public zzhvd f19200a = null;

    /* JADX INFO: renamed from: b */
    public zzhvb f19201b = null;

    /* JADX INFO: renamed from: c */
    public zzhvc f19202c = null;

    /* JADX INFO: renamed from: d */
    public zzhve f19203d = zzhve.f19219e;

    private zzhva() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhvf m7976a() throws GeneralSecurityException {
        zzhvd zzhvdVar = this.f19200a;
        if (zzhvdVar == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        zzhvb zzhvbVar = this.f19201b;
        if (zzhvbVar == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        zzhvc zzhvcVar = this.f19202c;
        if (zzhvcVar == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        zzhve zzhveVar = this.f19203d;
        if (zzhvbVar == zzhvb.f19204c && zzhvcVar != zzhvc.f19209b) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        zzhvb zzhvbVar2 = zzhvb.f19205d;
        zzhvc zzhvcVar2 = zzhvc.f19211d;
        if (zzhvbVar == zzhvbVar2 && zzhvcVar != zzhvc.f19210c && zzhvcVar != zzhvcVar2) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (zzhvbVar != zzhvb.f19206e || zzhvcVar == zzhvcVar2) {
            return new zzhvf(zzhvdVar, zzhvbVar, zzhvcVar, zzhveVar);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public /* synthetic */ zzhva(int i2) {
    }
}
