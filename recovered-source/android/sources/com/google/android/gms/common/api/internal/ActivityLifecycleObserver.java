package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityLifecycleObserver {
    /* JADX INFO: renamed from: a */
    public static final zab m3445a(Activity activity) {
        zaa zaaVar;
        synchronized (activity) {
            try {
                LifecycleFragment lifecycleFragmentM3466c = LifecycleCallback.m3466c(activity);
                zaaVar = (zaa) lifecycleFragmentM3466c.mo3477b(zaa.class, "LifecycleObserverOnStop");
                if (zaaVar == null) {
                    zaaVar = new zaa(lifecycleFragmentM3466c);
                    zaaVar.f4280t = new ArrayList();
                    lifecycleFragmentM3466c.mo3476a("LifecycleObserverOnStop", zaaVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new zab(zaaVar);
    }
}
