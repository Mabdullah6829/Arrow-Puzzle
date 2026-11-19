package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdd extends zzbdm {

    /* JADX INFO: renamed from: h */
    public final boolean f7640h;

    public zzbdd(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2) {
        super(zzbbzVar, "NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", zzaxtVar, i2, 61);
        this.f7640h = zzbbzVar.f7561o.f7530a;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        long jLongValue = ((Long) this.f7658e.invoke(null, this.f7654a.f7547a, Boolean.valueOf(this.f7640h))).longValue();
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4609e0(jLongValue);
        }
    }
}
