package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzbfl implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: s */
    public final Application f7736s;

    /* JADX INFO: renamed from: t */
    public final WeakReference f7737t;

    /* JADX INFO: renamed from: u */
    public boolean f7738u = false;

    public zzbfl(Application application, zzbez zzbezVar) {
        this.f7737t = new WeakReference(zzbezVar);
        this.f7736s = application;
    }

    /* JADX INFO: renamed from: a */
    public final void m4843a(zzbfk zzbfkVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f7737t.get();
            if (activityLifecycleCallbacks != null) {
                zzbfkVar.mo4842a(activityLifecycleCallbacks);
            } else {
                if (this.f7738u) {
                    return;
                }
                this.f7736s.unregisterActivityLifecycleCallbacks(this);
                this.f7738u = true;
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m4843a(new zzbfd(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m4843a(new zzbfj(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m4843a(new zzbfg(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m4843a(new zzbff(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m4843a(new zzbfi(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m4843a(new zzbfe(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m4843a(new zzbfh(this, activity));
    }
}
