package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcy implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Context f15439a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f15440b;

    public zzfcy(Context context, zzhcp zzhcpVar) {
        this.f15439a = context;
        this.f15440b = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        if (!((Boolean) zzbkp.f8998b.m5057c()).booleanValue()) {
            return zzhcf.m7367a(new zzfcz(-1, -1));
        }
        return this.f15440b.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context = this.f15438a.f15439a;
                return new zzfcz(zzbii.m5011b(context, "init_without_write"), zzbii.m5011b(context, "crash_without_write"));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 59;
    }
}
