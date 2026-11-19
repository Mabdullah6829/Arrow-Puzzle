package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbi implements zzbbn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f7517a;

    public zzbbi(zzbbo zzbboVar, Activity activity) {
        this.f7517a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    /* JADX INFO: renamed from: a */
    public final void mo4722a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f7517a);
    }
}
