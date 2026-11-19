package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbm implements zzbbn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f7522a;

    public zzbbm(zzbbo zzbboVar, Activity activity) {
        this.f7522a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    /* JADX INFO: renamed from: a */
    public final void mo4722a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f7522a);
    }
}
