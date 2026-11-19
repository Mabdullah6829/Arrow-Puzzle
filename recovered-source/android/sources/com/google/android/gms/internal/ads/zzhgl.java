package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgl {

    /* JADX INFO: renamed from: a */
    public zzhgt f18675a = null;

    /* JADX INFO: renamed from: b */
    public zzibm f18676b = null;

    /* JADX INFO: renamed from: c */
    public Integer f18677c = null;

    private zzhgl() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhgm m7450a() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarM7580b;
        zzhgt zzhgtVar = this.f18675a;
        if (zzhgtVar == null || (zzibmVar = this.f18676b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhgtVar.f18695a != zzibmVar.f19616a.f19614a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhgtVar.mo7421a() && this.f18677c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f18675a.mo7421a() && this.f18677c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        zzhgs zzhgsVar = this.f18675a.f18696b;
        if (zzhgsVar == zzhgs.f18693d) {
            zzibkVarM7580b = zzhnf.f19007a;
        } else if (zzhgsVar == zzhgs.f18692c) {
            zzibkVarM7580b = zzhnf.m7579a(this.f18677c.intValue());
        } else {
            if (zzhgsVar != zzhgs.f18691b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f18675a.f18696b)));
            }
            zzibkVarM7580b = zzhnf.m7580b(this.f18677c.intValue());
        }
        return new zzhgm(this.f18675a, this.f18676b, zzibkVarM7580b, this.f18677c);
    }

    public /* synthetic */ zzhgl(int i2) {
    }
}
