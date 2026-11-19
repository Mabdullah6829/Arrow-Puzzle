package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgc {

    /* JADX INFO: renamed from: a */
    public zzhgk f18650a = null;

    /* JADX INFO: renamed from: b */
    public zzibm f18651b = null;

    /* JADX INFO: renamed from: c */
    public Integer f18652c = null;

    private zzhgc() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhgd m7445a() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarM7580b;
        zzhgk zzhgkVar = this.f18650a;
        if (zzhgkVar == null || (zzibmVar = this.f18651b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhgkVar.f18673a != zzibmVar.f19616a.f19614a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhgkVar.mo7421a() && this.f18652c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f18650a.mo7421a() && this.f18652c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        zzhgj zzhgjVar = this.f18650a.f18674b;
        if (zzhgjVar == zzhgj.f18671d) {
            zzibkVarM7580b = zzhnf.f19007a;
        } else if (zzhgjVar == zzhgj.f18670c) {
            zzibkVarM7580b = zzhnf.m7579a(this.f18652c.intValue());
        } else {
            if (zzhgjVar != zzhgj.f18669b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f18650a.f18674b)));
            }
            zzibkVarM7580b = zzhnf.m7580b(this.f18652c.intValue());
        }
        return new zzhgd(this.f18650a, this.f18651b, zzibkVarM7580b, this.f18652c);
    }

    public /* synthetic */ zzhgc(int i2) {
    }
}
