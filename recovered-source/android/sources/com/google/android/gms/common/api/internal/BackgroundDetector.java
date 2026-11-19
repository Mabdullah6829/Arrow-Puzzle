package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: w */
    public static final BackgroundDetector f4219w = new BackgroundDetector();

    /* JADX INFO: renamed from: s */
    public final AtomicBoolean f4220s = new AtomicBoolean();

    /* JADX INFO: renamed from: t */
    public final AtomicBoolean f4221t = new AtomicBoolean();

    /* JADX INFO: renamed from: u */
    public final ArrayList f4222u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public boolean f4223v = false;

    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z);
    }

    private BackgroundDetector() {
    }

    /* JADX INFO: renamed from: a */
    public static void m3446a(Application application) {
        BackgroundDetector backgroundDetector = f4219w;
        synchronized (backgroundDetector) {
            try {
                if (!backgroundDetector.f4223v) {
                    application.registerActivityLifecycleCallbacks(backgroundDetector);
                    application.registerComponentCallbacks(backgroundDetector);
                    backgroundDetector.f4223v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3447b(boolean z) {
        synchronized (f4219w) {
            try {
                ArrayList arrayList = this.f4222u;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((BackgroundStateChangeListener) obj).onBackgroundStateChanged(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f4220s.compareAndSet(true, false);
        this.f4221t.set(true);
        if (zCompareAndSet) {
            m3447b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f4220s.compareAndSet(true, false);
        this.f4221t.set(true);
        if (zCompareAndSet) {
            m3447b(false);
        }
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

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f4220s.compareAndSet(false, true)) {
            this.f4221t.set(true);
            m3447b(true);
        }
    }
}
