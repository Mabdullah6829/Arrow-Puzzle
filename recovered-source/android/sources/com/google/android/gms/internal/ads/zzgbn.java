package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import java.util.concurrent.ExecutorService;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbn implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnx f16897a;

    public zzgbn(zzcnx zzcnxVar) {
        this.f16897a = zzcnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        final Context context = this.f16897a.f10629a.f10620b;
        zzinh.m8554a(context);
        ExecutorService executorService = zzcfy.f9952g;
        zzinh.m8554a(executorService);
        DataStore dataStoreCreate$default = DataStoreFactory.create$default(DataStoreFactory.INSTANCE, zzgbl.f16894a, null, null, new zzgbs(executorService).m6869a(), new InterfaceC6487a() { // from class: com.google.android.gms.internal.ads.zzgbm
            @Override // p078p0.InterfaceC6487a
            public final /* synthetic */ Object invoke() {
                return DataStoreFile.dataStoreFile(context, "ad_quality_data.pb");
            }
        }, 6, null);
        zzinh.m8554a(dataStoreCreate$default);
        return dataStoreCreate$default;
    }
}
