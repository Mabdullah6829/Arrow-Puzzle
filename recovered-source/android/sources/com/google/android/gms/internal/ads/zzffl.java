package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffl implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15583a;

    public zzffl(zzhcp zzhcpVar) {
        this.f15583a = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15583a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzffk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                zzbio zzbioVar = zzbix.f8759t0;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                String str = (String) zzbaVar.f3098c.m5030a(zzbioVar);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8776u0)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, com.google.android.gms.ads.internal.util.zzch.m3146a(str2));
                        }
                    }
                }
                return new zzffm(map);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 51;
    }
}
