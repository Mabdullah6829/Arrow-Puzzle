package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzddm extends zzdix implements zzddd {

    /* JADX INFO: renamed from: t */
    public final ScheduledExecutorService f12076t;

    /* JADX INFO: renamed from: u */
    public ScheduledFuture f12077u;

    /* JADX INFO: renamed from: v */
    public boolean f12078v;

    public zzddm(zzddi zzddiVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f12078v = false;
        this.f12076t = scheduledExecutorService;
        m5924Y(zzddiVar, executor);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m5904K0() {
        this.f12077u = this.f12076t.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzddk
            @Override // java.lang.Runnable
            public final void run() {
                zzddm zzddmVar = this.f12074s;
                synchronized (zzddmVar) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3070c("Timeout waiting for show call succeed to be called.");
                    zzddmVar.mo5902l(new zzdnv("Timeout for show call succeed."));
                    zzddmVar.f12078v = true;
                }
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8500dc)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    /* JADX INFO: renamed from: a */
    public final void mo5901a() {
        m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdde
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((zzddd) obj).mo5901a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    /* JADX INFO: renamed from: l */
    public final void mo5902l(final zzdnv zzdnvVar) {
        if (this.f12078v) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f12077u;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzddj
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((zzddd) obj).mo5902l(zzdnvVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    /* JADX INFO: renamed from: l0 */
    public final void mo5903l0(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzddl
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((zzddd) obj).mo5903l0(zzeVar);
            }
        });
    }
}
