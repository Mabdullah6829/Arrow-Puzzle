package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevz implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Executor f15002a;

    /* JADX INFO: renamed from: b */
    public final zzcfk f15003b;

    public zzevz(Executor executor, zzcfk zzcfkVar) {
        this.f15002a = executor;
        this.f15003b = zzcfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8210M3)).booleanValue() ? zzhcf.m7367a(new zzewa(null)) : zzhcf.m7375i(this.f15003b.m5388h(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzevy
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new zzewa(arrayList);
            }
        }, this.f15002a);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 10;
    }
}
