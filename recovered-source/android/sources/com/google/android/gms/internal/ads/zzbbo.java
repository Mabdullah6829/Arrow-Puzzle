package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbo implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: s */
    public final Application f7523s;

    /* JADX INFO: renamed from: t */
    public final WeakReference f7524t;

    /* JADX INFO: renamed from: u */
    public boolean f7525u = false;

    public zzbbo(Application application, zzbcg zzbcgVar) {
        this.f7524t = new WeakReference(zzbcgVar);
        this.f7523s = application;
    }

    /* JADX INFO: renamed from: a */
    public final void m4723a(zzbbn zzbbnVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f7524t.get();
            if (activityLifecycleCallbacks != null) {
                zzbbnVar.mo4722a(activityLifecycleCallbacks);
            } else {
                if (this.f7525u) {
                    return;
                }
                this.f7523s.unregisterActivityLifecycleCallbacks(this);
                this.f7525u = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m4723a(new zzbbg(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m4723a(new zzbbm(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m4723a(new zzbbj(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m4723a(new zzbbi(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m4723a(new zzbbl(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m4723a(new zzbbh(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m4723a(new zzbbk(this, activity));
    }
}
