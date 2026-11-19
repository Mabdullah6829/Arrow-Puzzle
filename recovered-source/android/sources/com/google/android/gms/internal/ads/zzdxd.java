package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxd implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzgcq f13240a;

    public zzdxd(zzgcq zzgcqVar) {
        this.f13240a = zzgcqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzgcq zzgcqVar = this.f13240a;
        DataStore dataStore = (DataStore) zzgcqVar.f16985a.zzb();
        ExecutorService executorService = zzcfy.f9952g;
        zzinh.m8554a(executorService);
        return new zzdxc(new zzgcp(dataStore, new zzgbs(executorService), (zzdxe) zzgcqVar.f16986b.zzb(), new zzgbo()));
    }
}
