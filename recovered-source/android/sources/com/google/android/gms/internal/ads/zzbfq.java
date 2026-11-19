package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class zzbfq implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: B */
    public long f7762B;

    /* JADX INFO: renamed from: s */
    public Activity f7763s;

    /* JADX INFO: renamed from: t */
    public Application f7764t;

    /* JADX INFO: renamed from: z */
    public Runnable f7770z;

    /* JADX INFO: renamed from: u */
    public final Object f7765u = new Object();

    /* JADX INFO: renamed from: v */
    public final AtomicBoolean f7766v = new AtomicBoolean(true);

    /* JADX INFO: renamed from: w */
    public boolean f7767w = false;

    /* JADX INFO: renamed from: x */
    public final ArrayList f7768x = new ArrayList();

    /* JADX INFO: renamed from: y */
    public final ArrayList f7769y = new ArrayList();

    /* JADX INFO: renamed from: A */
    public boolean f7761A = false;

    /* JADX INFO: renamed from: a */
    public final void m4850a(Activity activity) {
        synchronized (this.f7765u) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f7763s = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f7765u) {
            try {
                Activity activity2 = this.f7763s;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f7763s = null;
                }
                ArrayList arrayList = this.f7769y;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    zzdxc zzdxcVar = (zzdxc) obj;
                    try {
                        if (zzdxcVar.f13238b.getAndSet(false)) {
                            zzgcp zzgcpVar = zzdxcVar.f13237a;
                            zzgcpVar.getClass();
                            zzgsw.m7115a(zzgcpVar.f16975a, zzgcpVar.f16976b, new zzgcl(zzgcpVar, null));
                        }
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AppActivityTracker.ActivityListener.onActivityDestroyed", e);
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m4850a(activity);
        synchronized (this.f7765u) {
            try {
                ArrayList arrayList = this.f7769y;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    zzdxc zzdxcVar = (zzdxc) obj;
                    try {
                        if (zzdxcVar.f13238b.get()) {
                            zzgcp zzgcpVar = zzdxcVar.f13237a;
                            zzgcpVar.getClass();
                            zzgsw.m7115a(zzgcpVar.f16975a, zzgcpVar.f16976b, new zzgbz(zzgcpVar, null));
                        }
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AppActivityTracker.ActivityListener.onActivityPaused", e);
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7767w = true;
        Runnable runnable = this.f7770z;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.f3626l.removeCallbacks(runnable);
        }
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
        zzbfp zzbfpVar = new zzbfp(this);
        this.f7770z = zzbfpVar;
        zzfVar.postDelayed(zzbfpVar, this.f7762B);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m4850a(activity);
        int i2 = 0;
        this.f7767w = false;
        boolean andSet = this.f7766v.getAndSet(true);
        Runnable runnable = this.f7770z;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.f3626l.removeCallbacks(runnable);
        }
        synchronized (this.f7765u) {
            try {
                ArrayList arrayList = this.f7769y;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    zzdxc zzdxcVar = (zzdxc) obj;
                    try {
                        if (zzdxcVar.f13238b.get()) {
                            zzgcp zzgcpVar = zzdxcVar.f13237a;
                            zzgcpVar.getClass();
                            zzgsw.m7115a(zzgcpVar.f16975a, zzgcpVar.f16976b, new zzgcn(zzgcpVar, null));
                        }
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AppActivityTracker.ActivityListener.onActivityResumed", e);
                        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
                    }
                }
                if (andSet) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("App is still foreground.");
                } else {
                    ArrayList arrayList2 = this.f7768x;
                    int size2 = arrayList2.size();
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        try {
                            ((zzbfr) obj2).mo2997k0(true);
                        } catch (Exception e2) {
                            int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m4850a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
