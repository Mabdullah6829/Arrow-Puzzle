package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqk implements zzgpl, zzgfo {

    /* JADX INFO: renamed from: h */
    public static final String[] f18051h = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a */
    public final Context f18052a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f18053b;

    /* JADX INFO: renamed from: c */
    public final String[] f18054c;

    /* JADX INFO: renamed from: d */
    public long f18055d = 0;

    /* JADX INFO: renamed from: e */
    public long f18056e = 0;

    /* JADX INFO: renamed from: f */
    public long f18057f = -1;

    /* JADX INFO: renamed from: g */
    public boolean f18058g = false;

    public zzgqk(Context context, ExecutorService executorService, String[] strArr) {
        this.f18052a = context;
        this.f18053b = executorService;
        this.f18054c = strArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: a */
    public final void mo7050a(HashMap map) {
        m7056d();
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: b */
    public final void mo7051b(HashMap map) {
        long j2;
        long j3;
        m7056d();
        synchronized (this) {
            try {
                j2 = this.f18058g ? this.f18056e - this.f18055d : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        map.put("vs", Long.valueOf(j2));
        synchronized (this) {
            j3 = this.f18057f;
            this.f18057f = -1L;
        }
        map.put("vf", Long.valueOf(j3));
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: c */
    public final void mo7052c(HashMap map, Context context, View view) {
        m7056d();
    }

    /* JADX INFO: renamed from: d */
    public final void m7056d() {
        synchronized (this) {
            try {
                if (this.f18058g) {
                    this.f18056e = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final ListenableFuture zza() {
        if (Build.VERSION.SDK_INT < 30) {
            return zzhcj.f18518t;
        }
        zzhde zzhdeVar = new zzhde(Executors.callable(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgqj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgqk zzgqkVar = this.f18050s;
                zzgqi zzgqiVar = new zzgqi(zzgqkVar);
                try {
                    Object systemService = zzgqkVar.f18052a.getSystemService("appops");
                    if (systemService == null) {
                        throw null;
                    }
                    ((AppOpsManager) systemService).startWatchingActive(zzgqkVar.f18054c, zzgqkVar.f18053b, zzgqiVar);
                } catch (Throwable unused) {
                }
            }
        }, null));
        this.f18053b.execute(zzhdeVar);
        return zzhdeVar;
    }
}
