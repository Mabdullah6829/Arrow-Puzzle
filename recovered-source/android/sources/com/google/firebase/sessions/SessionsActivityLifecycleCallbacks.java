package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private boolean enabled;
    private final SharedSessionRepository sharedSessionRepository;

    public SessionsActivityLifecycleCallbacks(SharedSessionRepository sharedSessionRepository) {
        AbstractC6452k.m12181e(sharedSessionRepository, "sharedSessionRepository");
        this.sharedSessionRepository = sharedSessionRepository;
        this.enabled = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC6452k.m12181e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC6452k.m12181e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC6452k.m12181e(activity, "activity");
        if (this.enabled) {
            this.sharedSessionRepository.appBackground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC6452k.m12181e(activity, "activity");
        if (this.enabled) {
            this.sharedSessionRepository.appForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC6452k.m12181e(activity, "activity");
        AbstractC6452k.m12181e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC6452k.m12181e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC6452k.m12181e(activity, "activity");
    }

    public final void onAppDelete() {
        this.enabled = false;
    }
}
