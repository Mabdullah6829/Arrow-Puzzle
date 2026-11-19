package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfk {

    /* JADX INFO: renamed from: a */
    public zzhft f18588a = null;

    /* JADX INFO: renamed from: b */
    public zzibm f18589b = null;

    /* JADX INFO: renamed from: c */
    public zzibm f18590c = null;

    /* JADX INFO: renamed from: d */
    public Integer f18591d = null;

    private zzhfk() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhfl m7430a() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarM7580b;
        zzhft zzhftVar = this.f18588a;
        if (zzhftVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzibm zzibmVar2 = this.f18589b;
        if (zzibmVar2 == null || (zzibmVar = this.f18590c) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzhftVar.f18621a != zzibmVar2.f19616a.f19614a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzhftVar.f18622b != zzibmVar.f19616a.f19614a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (zzhftVar.mo7421a() && this.f18591d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f18588a.mo7421a() && this.f18591d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        zzhfs zzhfsVar = this.f18588a.f18625e;
        if (zzhfsVar == zzhfs.f18619d) {
            zzibkVarM7580b = zzhnf.f19007a;
        } else if (zzhfsVar == zzhfs.f18618c) {
            zzibkVarM7580b = zzhnf.m7579a(this.f18591d.intValue());
        } else {
            if (zzhfsVar != zzhfs.f18617b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f18588a.f18625e)));
            }
            zzibkVarM7580b = zzhnf.m7580b(this.f18591d.intValue());
        }
        return new zzhfl(this.f18588a, this.f18589b, this.f18590c, zzibkVarM7580b, this.f18591d);
    }

    public /* synthetic */ zzhfk(int i2) {
    }
}
