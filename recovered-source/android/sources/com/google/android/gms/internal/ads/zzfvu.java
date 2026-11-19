package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class zzfvu implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: s */
    public boolean f16674s;

    /* JADX INFO: renamed from: t */
    public boolean f16675t;

    /* JADX INFO: renamed from: u */
    public zzfvt f16676u;

    /* JADX INFO: renamed from: a */
    public boolean mo6731a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void mo6732b(boolean z) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
        if (!this.f16675t) {
            this.f16675t = true;
            if (this.f16674s) {
                mo6732b(true);
                zzfvt zzfvtVar = this.f16676u;
                if (zzfvtVar != null) {
                    zzfvtVar.mo6730L(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z = runningAppProcessInfo.importance == 100 || mo6731a();
        if (this.f16675t != z) {
            this.f16675t = z;
            if (this.f16674s) {
                mo6732b(z);
                zzfvt zzfvtVar = this.f16676u;
                if (zzfvtVar != null) {
                    zzfvtVar.mo6730L(z);
                }
            }
        }
    }
}
