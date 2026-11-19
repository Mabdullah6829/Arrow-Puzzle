package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpu implements zzgpl, zzgfo {

    /* JADX INFO: renamed from: a */
    public final Context f18001a;

    /* JADX INFO: renamed from: b */
    public final zzgqo f18002b;

    /* JADX INFO: renamed from: c */
    public final zzhcp f18003c;

    /* JADX INFO: renamed from: d */
    public final zzgdq f18004d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f18005e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public ListenableFuture f18006f = zzhcj.f18518t;

    public zzgpu(Context context, zzgdq zzgdqVar, zzgqo zzgqoVar, zzhcp zzhcpVar) {
        this.f18001a = context;
        this.f18002b = zzgqoVar;
        this.f18003c = zzhcpVar;
        this.f18004d = zzgdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: a */
    public final void mo7050a(HashMap map) {
        map.put("gs", this.f18006f);
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: b */
    public final void mo7051b(HashMap map) {
        map.put("gs", this.f18006f);
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: c */
    public final void mo7052c(HashMap map, Context context, View view) {
        map.put("gs", this.f18006f);
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final ListenableFuture zza() {
        if (this.f18005e.getAndSet(true) || !this.f18004d.m6922V()) {
            return zzhcj.f18518t;
        }
        return this.f18003c.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final zzgpu zzgpuVar = this.f18000s;
                ListenableFuture listenableFutureSubmit = zzgpuVar.f18003c.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzgps
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        Context context = zzgpuVar.f18001a;
                        try {
                            return zzfxx.m6773a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                zzgpuVar.f18002b.m7064e(53, listenableFutureSubmit);
                zzgpuVar.f18006f = listenableFutureSubmit;
            }
        });
    }
}
