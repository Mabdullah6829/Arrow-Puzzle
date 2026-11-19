package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfal implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15276a;

    public zzfal(zzhcp zzhcpVar) {
        this.f15276a = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15276a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                bundle.putInt("web_view_count", zztVar.f3708h.f9899k.get());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8273Pf)).booleanValue()) {
                    ActivityManager.MemoryInfo memoryInfoM3037j = com.google.android.gms.ads.internal.util.client.zzf.m3037j(zztVar.f3708h.f9893e);
                    if (memoryInfoM3037j != null) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            bundle.putLong("a_ad_mem", memoryInfoM3037j.advertisedMem);
                        }
                        bundle.putLong("a_total", memoryInfoM3037j.totalMem);
                        bundle.putLong("a_avai", memoryInfoM3037j.availMem);
                        bundle.putLong("a_threshold", memoryInfoM3037j.threshold);
                        bundle.putBoolean("a_is_low_mem", memoryInfoM3037j.lowMemory);
                    }
                    bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
                }
                return new zzfam(bundle);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 24;
    }
}
