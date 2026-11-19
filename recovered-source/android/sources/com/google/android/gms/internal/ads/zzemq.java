package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemq implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f14241a;

    /* JADX INFO: renamed from: b */
    public final zzina f14242b;

    public zzemq(zzini zziniVar, zzina zzinaVar) {
        this.f14241a = zziniVar;
        this.f14242b = zzinaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context context = (Context) this.f14241a.zzb();
        zzcvg zzcvgVar = (zzcvg) this.f14242b.f20011a;
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzemp(context, zzcvgVar, zzhcpVar);
    }
}
