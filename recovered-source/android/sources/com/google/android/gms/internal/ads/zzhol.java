package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhol {

    /* JADX INFO: renamed from: a */
    public zzhot f19058a = null;

    /* JADX INFO: renamed from: b */
    public zzibm f19059b = null;

    /* JADX INFO: renamed from: c */
    public Integer f19060c = null;

    private zzhol() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhom m7599a() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarM7579a;
        zzhot zzhotVar = this.f19058a;
        if (zzhotVar == null || (zzibmVar = this.f19059b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhotVar.f19080a != zzibmVar.f19616a.f19614a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhotVar.mo7421a() && this.f19060c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f19058a.mo7421a() && this.f19060c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        zzhos zzhosVar = this.f19058a.f19082c;
        if (zzhosVar == zzhos.f19078e) {
            zzibkVarM7579a = zzhnf.f19007a;
        } else if (zzhosVar == zzhos.f19077d || zzhosVar == zzhos.f19076c) {
            zzibkVarM7579a = zzhnf.m7579a(this.f19060c.intValue());
        } else {
            if (zzhosVar != zzhos.f19075b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f19058a.f19082c)));
            }
            zzibkVarM7579a = zzhnf.m7580b(this.f19060c.intValue());
        }
        return new zzhom(this.f19058a, this.f19059b, zzibkVarM7579a, this.f19060c);
    }

    public /* synthetic */ zzhol(int i2) {
    }
}
