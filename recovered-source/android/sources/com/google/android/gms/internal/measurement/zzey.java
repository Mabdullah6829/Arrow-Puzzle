package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzey implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzez f22474s;

    public zzey(zzez zzezVar) {
        this.f22474s = zzezVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f22474s.m9860l(new zzer(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f22474s.m9860l(new zzex(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f22474s.m9860l(new zzeu(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f22474s.m9860l(new zzet(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzcm zzcmVar = new zzcm();
        this.f22474s.m9860l(new zzew(this, activity, zzcmVar));
        Bundle bundleM9831k0 = zzcmVar.m9831k0(50L);
        if (bundleM9831k0 != null) {
            bundle.putAll(bundleM9831k0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f22474s.m9860l(new zzes(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f22474s.m9860l(new zzev(this, activity));
    }
}
