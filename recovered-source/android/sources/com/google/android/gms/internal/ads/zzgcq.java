package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcq implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f16985a;

    /* JADX INFO: renamed from: b */
    public final zzini f16986b;

    public zzgcq(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f16985a = zzimyVar;
        this.f16986b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        DataStore dataStore = (DataStore) this.f16985a.zzb();
        ExecutorService executorService = zzcfy.f9952g;
        zzinh.m8554a(executorService);
        return new zzgcp(dataStore, new zzgbs(executorService), (zzdxe) this.f16986b.zzb(), new zzgbo());
    }
}
