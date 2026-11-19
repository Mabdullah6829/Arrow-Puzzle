package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfco implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15420a;

    /* JADX INFO: renamed from: b */
    public final Context f15421b;

    public zzfco(Context context, zzhcp zzhcpVar) {
        this.f15420a = zzhcpVar;
        this.f15421b = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15420a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzfcm(com.google.android.gms.ads.internal.util.zzac.m3089b(this.f15419a.f15421b, (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8427Z6)));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 37;
    }
}
