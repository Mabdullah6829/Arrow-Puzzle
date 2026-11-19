package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfu {

    /* JADX INFO: renamed from: a */
    public zzhgb f18627a = null;

    /* JADX INFO: renamed from: b */
    public zzibm f18628b = null;

    /* JADX INFO: renamed from: c */
    public Integer f18629c = null;

    private zzhfu() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhfv m7437a() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarM7580b;
        zzhgb zzhgbVar = this.f18627a;
        if (zzhgbVar == null || (zzibmVar = this.f18628b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhgbVar.f18647a != zzibmVar.f19616a.f19614a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhgbVar.mo7421a() && this.f18629c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f18627a.mo7421a() && this.f18629c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        zzhga zzhgaVar = this.f18627a.f18649c;
        if (zzhgaVar == zzhga.f18645d) {
            zzibkVarM7580b = zzhnf.f19007a;
        } else if (zzhgaVar == zzhga.f18644c) {
            zzibkVarM7580b = zzhnf.m7579a(this.f18629c.intValue());
        } else {
            if (zzhgaVar != zzhga.f18643b) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f18627a.f18649c)));
            }
            zzibkVarM7580b = zzhnf.m7580b(this.f18629c.intValue());
        }
        return new zzhfv(this.f18627a, this.f18628b, zzibkVarM7580b, this.f18629c);
    }

    public /* synthetic */ zzhfu(int i2) {
    }
}
