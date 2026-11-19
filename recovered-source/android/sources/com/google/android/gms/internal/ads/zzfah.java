package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfah implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15267a;

    /* JADX INFO: renamed from: b */
    public final zzecz f15268b;

    public zzfah(zzhcp zzhcpVar, zzecz zzeczVar) {
        this.f15267a = zzhcpVar;
        this.f15268b = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15267a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfag
            /* JADX WARN: Code duplicated, block: B:21:0x0053  */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.ads.internal.client.zzba zzbaVar;
                String str;
                boolean z;
                zzecz zzeczVar = this.f15266a.f15268b;
                synchronized (zzeczVar) {
                    zzbio zzbioVar = zzbix.f8616ka;
                    zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && zzeczVar.m6167f()) {
                        long j2 = zzeczVar.f13646q;
                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                        if (j2 < System.currentTimeMillis() / 1000) {
                            zzeczVar.f13644o = "{}";
                            zzeczVar.f13646q = LocationRequestCompat.PASSIVE_INTERVAL;
                            str = "";
                        } else if (zzeczVar.f13644o.equals("{}")) {
                            str = "";
                        } else {
                            str = zzeczVar.f13644o;
                        }
                    } else {
                        str = "";
                    }
                }
                synchronized (zzeczVar) {
                    z = zzeczVar.f13648s;
                }
                return new zzfai(str, z, com.google.android.gms.ads.internal.zzt.f3698C.f3715o.m3102g(), zzeczVar.f13645p != null, zzeczVar.f13652w < ((Long) zzbaVar.f3098c.m5030a(zzbix.f8098Fa)).longValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 23;
    }
}
