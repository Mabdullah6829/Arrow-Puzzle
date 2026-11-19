package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfba implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15304a;

    /* JADX INFO: renamed from: b */
    public final zzeaw f15305b;

    public zzfba(zzhcp zzhcpVar, zzeaw zzeawVar) {
        this.f15304a = zzhcpVar;
        this.f15305b = zzeawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15304a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfaz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map;
                zzeaw zzeawVar = this.f15296a.f15305b;
                synchronized (zzeawVar) {
                    map = new HashMap();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8130H8)).booleanValue()) {
                        zzeawVar.m6140b();
                        for (Map.Entry entry : zzeawVar.f13485a.entrySet()) {
                            map.put((zzeaz) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                        }
                    }
                }
                return new zzfbb(map);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 62;
    }
}
