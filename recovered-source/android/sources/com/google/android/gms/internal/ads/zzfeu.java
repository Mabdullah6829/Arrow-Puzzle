package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfeu implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f15557a;

    public zzfeu(ScheduledExecutorService scheduledExecutorService) {
        this.f15557a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.m7375i(zzhcf.m7373g(zzhcf.m7367a(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8493d5)).longValue(), TimeUnit.MILLISECONDS, this.f15557a), new zzgti() { // from class: com.google.android.gms.internal.ads.zzfet
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return new zzfev((Bundle) obj);
            }
        }, zzcfy.f9946a);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 49;
    }
}
