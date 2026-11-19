package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfgu extends com.google.android.gms.ads.internal.client.zzbt implements com.google.android.gms.ads.internal.overlay.zzr, zzbgk {

    /* JADX INFO: renamed from: B */
    public zzcuz f15642B;

    /* JADX INFO: renamed from: C */
    public zzcvm f15643C;

    /* JADX INFO: renamed from: s */
    public final zzcnq f15644s;

    /* JADX INFO: renamed from: t */
    public final Context f15645t;

    /* JADX INFO: renamed from: v */
    public final String f15647v;

    /* JADX INFO: renamed from: w */
    public final zzfgo f15648w;

    /* JADX INFO: renamed from: x */
    public final zzfgm f15649x;

    /* JADX INFO: renamed from: y */
    public final VersionInfoParcel f15650y;

    /* JADX INFO: renamed from: z */
    public final zzdzt f15651z;

    /* JADX INFO: renamed from: u */
    public AtomicBoolean f15646u = new AtomicBoolean();

    /* JADX INFO: renamed from: A */
    public long f15641A = -1;

    public zzfgu(zzcnq zzcnqVar, Context context, String str, zzfgo zzfgoVar, zzfgm zzfgmVar, VersionInfoParcel versionInfoParcel, zzdzt zzdztVar) {
        this.f15644s = zzcnqVar;
        this.f15645t = context;
        this.f15647v = str;
        this.f15648w = zzfgoVar;
        this.f15649x = zzfgmVar;
        this.f15650y = versionInfoParcel;
        this.f15651z = zzdztVar;
        zzfgmVar.f15628x.set(this);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: A1 */
    public final void mo2864A1(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.f15648w.f15603i.f16021i = zzxVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: B1 */
    public final void mo3015B1() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: C */
    public final synchronized boolean mo2865C() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: D3 */
    public final synchronized void mo2841D3(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: F0 */
    public final void mo2842F0(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: G0 */
    public final void mo3016G0() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: G2 */
    public final synchronized void mo2843G2(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: I3 */
    public final void mo2844I3(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: K1 */
    public final void mo3017K1() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: M0 */
    public final void mo2869M0(zzccc zzcccVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: M3 */
    public final void mo2845M3(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: P */
    public final long mo2846P() {
        return 0L;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: U0 */
    public final void mo2847U0(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: U2 */
    public final void mo3018U2() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: W1 */
    public final void mo3019W1() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: W3 */
    public final void mo2848W3(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Y0 */
    public final void mo2849Y0(long j2) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Y2 */
    public final void mo2870Y2(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z */
    public final synchronized boolean mo2850Z(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z;
        try {
            if (!zzmVar.m2976H()) {
                if (((Boolean) zzbkv.f9042d.m5057c()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (this.f15650y.f3398u < ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8066Dc)).intValue() || !z) {
                    Preconditions.m3540d("loadAd must be called on the main UI thread.");
                }
            }
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            if (com.google.android.gms.ads.internal.util.zzs.m3209h(this.f15645t) && zzmVar.f3216K == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("Failed to load the ad because app ID is missing.");
                this.f15649x.mo5830v(zzfmi.m6535d(4, null, null));
                return false;
            }
            if (mo2879t()) {
                return false;
            }
            this.f15646u = new AtomicBoolean();
            return this.f15648w.m6432a(zzmVar, this.f15647v, new zzfgq(), new zzfgr(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: Z0 */
    public final void mo2851Z0(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: a3 */
    public final synchronized void mo3020a3() {
        zzcvm zzcvmVar = this.f15643C;
        if (zzcvmVar != null) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            zzcvmVar.m5845f(1, SystemClock.elapsedRealtime() - this.f15641A);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: b */
    public final synchronized void mo2852b() {
        Preconditions.m3540d("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: c */
    public final synchronized void mo2853c() {
        Preconditions.m3540d("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: c1 */
    public final void mo3021c1(int i2) {
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            m6439k4(2);
            return;
        }
        if (i3 == 1) {
            m6439k4(4);
        } else if (i3 != 2) {
            m6439k4(6);
        } else {
            m6439k4(3);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: c2 */
    public final void mo2854c2(zzbgt zzbgtVar) {
        this.f15649x.f15624t.set(zzbgtVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: d */
    public final boolean mo2871d() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: d2 */
    public final void mo3022d2() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: e */
    public final synchronized void mo2872e() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: g */
    public final synchronized com.google.android.gms.ads.internal.client.zzr mo2855g() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: g1 */
    public final synchronized void mo2874g1(zzbjs zzbjsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: h */
    public final synchronized String mo2875h() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: k */
    public final synchronized String mo2856k() {
        return this.f15647v;
    }

    /* JADX INFO: renamed from: k4 */
    public final synchronized void m6439k4(int i2) {
        try {
            if (this.f15646u.compareAndSet(false, true)) {
                this.f15649x.m6437b();
                zzcuz zzcuzVar = this.f15642B;
                if (zzcuzVar != null) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3707g.m4853c(zzcuzVar);
                }
                if (this.f15643C != null) {
                    long jElapsedRealtime = -1;
                    if (this.f15641A != -1) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.f15641A;
                    }
                    this.f15643C.m5845f(i2, jElapsedRealtime);
                }
                zzc();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: l3 */
    public final synchronized void mo2877l3(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: n */
    public final synchronized String mo2878n() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: o2 */
    public final synchronized void mo2857o2(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.m3540d("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: r */
    public final synchronized com.google.android.gms.ads.internal.client.zzdx mo2858r() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: s1 */
    public final void mo3023s1() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: t */
    public final synchronized boolean mo2879t() {
        ListenableFuture listenableFuture;
        listenableFuture = this.f15648w.f15604j;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    /* JADX INFO: renamed from: u */
    public final void mo4870u() {
        m6439k4(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: u0 */
    public final void mo3024u0() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: v */
    public final com.google.android.gms.ads.internal.client.zzcl mo2859v() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: w */
    public final synchronized com.google.android.gms.ads.internal.client.zzea mo2860w() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: x3 */
    public final void mo2861x3(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z */
    public final com.google.android.gms.ads.internal.client.zzbh mo2862z() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: z3 */
    public final void mo2863z3(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzb() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzc() {
        Preconditions.m3540d("destroy must be called on the main UI thread.");
        zzcvm zzcvmVar = this.f15643C;
        if (zzcvmVar != null) {
            zzcvmVar.m5844d();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        if (this.f15643C != null) {
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            zztVar.f3711k.getClass();
            this.f15641A = SystemClock.elapsedRealtime();
            int i2 = this.f15643C.f11564m;
            if (i2 > 0) {
                ScheduledExecutorService scheduledExecutorServiceMo5689h = this.f15644s.mo5689h();
                DefaultClock defaultClock = zztVar.f3711k;
                zzcuz zzcuzVar = new zzcuz(scheduledExecutorServiceMo5689h, defaultClock);
                this.f15642B = zzcuzVar;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        final zzfgu zzfguVar = this.f15639s;
                        zzfguVar.f15644s.mo5688g().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgt
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzfguVar.m6439k4(5);
                            }
                        });
                    }
                };
                synchronized (zzcuzVar) {
                    zzcuzVar.f11538x = runnable;
                    defaultClock.getClass();
                    long j2 = i2;
                    zzcuzVar.f11536v = SystemClock.elapsedRealtime() + j2;
                    zzcuzVar.f11535u = scheduledExecutorServiceMo5689h.schedule(runnable, j2, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: E1 */
    public final void mo2866E1() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: H */
    public final void mo2867H() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: L */
    public final void mo2868L() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: f */
    public final void mo2873f() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    /* JADX INFO: renamed from: i */
    public final void mo2876i() {
    }
}
