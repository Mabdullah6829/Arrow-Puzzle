package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13790a;

    public zzefh(zzini zziniVar) {
        this.f13790a = zziniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context context = (Context) this.f13790a.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzegd(context, zzhcpVar);
    }
}
