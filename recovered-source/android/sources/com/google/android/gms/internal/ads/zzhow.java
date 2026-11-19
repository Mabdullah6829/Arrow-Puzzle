package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhow {

    /* JADX INFO: renamed from: a */
    public zzhpg f19084a = null;

    /* JADX INFO: renamed from: b */
    public zzibm f19085b = null;

    /* JADX INFO: renamed from: c */
    public Integer f19086c = null;

    private zzhow() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhox m7605a() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarM7579a;
        zzhpg zzhpgVar = this.f19084a;
        if (zzhpgVar == null || (zzibmVar = this.f19085b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhpgVar.f19120a != zzibmVar.f19616a.f19614a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhpgVar.mo7421a() && this.f19086c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f19084a.mo7421a() && this.f19086c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        zzhpf zzhpfVar = this.f19084a.f19122c;
        if (zzhpfVar == zzhpf.f19118e) {
            zzibkVarM7579a = zzhnf.f19007a;
        } else if (zzhpfVar == zzhpf.f19117d || zzhpfVar == zzhpf.f19116c) {
            zzibkVarM7579a = zzhnf.m7579a(this.f19086c.intValue());
        } else {
            if (zzhpfVar != zzhpf.f19115b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f19084a.f19122c)));
            }
            zzibkVarM7579a = zzhnf.m7580b(this.f19086c.intValue());
        }
        return new zzhox(this.f19084a, this.f19085b, zzibkVarM7579a, this.f19086c);
    }

    public /* synthetic */ zzhow(int i2) {
    }
}
