package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfub implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long f16535s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx f16536t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzful f16537u;

    public zzfub(zzful zzfulVar, long j2, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.f16535s = j2;
        this.f16536t = zzdxVar;
        Objects.requireNonNull(zzfulVar);
        this.f16537u = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzful zzfulVar = this.f16537u;
        if (zzfulVar.f16571q != null) {
            com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.f16536t;
            String str = !(zzdxVar instanceof zzdcs) ? null : ((zzdcs) zzdxVar).f12049v;
            zzfulVar.f16571q.m6684g("paa", "pano_ts", this.f16535s, zzfulVar.m6711s(), zzfulVar.m6712t(), str, zzfulVar.f16573s, zzfulVar.m6702g());
        }
    }
}
