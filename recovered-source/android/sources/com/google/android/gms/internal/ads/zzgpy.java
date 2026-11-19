package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
final class zzgpy implements zzgpl, zzgfo {

    /* JADX INFO: renamed from: a */
    public final Context f18013a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f18014b;

    /* JADX INFO: renamed from: c */
    public NetworkCapabilities f18015c = null;

    public zzgpy(Context context, ExecutorService executorService) {
        this.f18013a = context;
        this.f18014b = executorService;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0035 A[Catch: all -> 0x0019, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:15:0x001b, B:17:0x0024, B:19:0x0028, B:21:0x0031, B:23:0x0035), top: B:34:0x000a }] */
    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: b */
    public final void mo7051b(HashMap map) {
        NetworkCapabilities networkCapabilities;
        long j2;
        synchronized (this) {
            networkCapabilities = this.f18015c;
        }
        map.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.f18015c;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j2 = 2;
                    } else if (this.f18015c.hasTransport(1)) {
                        j2 = 1;
                    } else {
                        j2 = this.f18015c.hasTransport(0) ? 0L : -1L;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        map.put("nt", Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final ListenableFuture zza() {
        zzhde zzhdeVar = new zzhde(Executors.callable(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgpy zzgpyVar = this.f18012s;
                zzgpw zzgpwVar = new zzgpw(zzgpyVar);
                try {
                    Object systemService = zzgpyVar.f18013a.getSystemService("connectivity");
                    if (systemService == null) {
                        throw null;
                    }
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(zzgpwVar);
                } catch (Throwable unused) {
                }
            }
        }, null));
        this.f18014b.execute(zzhdeVar);
        return zzhdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: a */
    public final void mo7050a(HashMap map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: c */
    public final void mo7052c(HashMap map, Context context, View view) {
    }
}
