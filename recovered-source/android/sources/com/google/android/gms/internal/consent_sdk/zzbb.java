package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbb implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: s */
    public final Activity f21597s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzbe f21598t;

    public zzbb(zzbe zzbeVar, Activity activity) {
        Objects.requireNonNull(zzbeVar);
        this.f21598t = zzbeVar;
        this.f21597s = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Dialog dialog = this.f21598t.f21599a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity != this.f21597s) {
            return;
        }
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        zzbe zzbeVar = this.f21598t;
        if (zIsChangingConfigurations) {
            zzbeVar.getClass();
        }
        new zzg(3, "Activity is destroyed.");
        Dialog dialog = zzbeVar.f21599a;
        if (dialog != null) {
            dialog.dismiss();
            zzbeVar.f21599a = null;
        }
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
