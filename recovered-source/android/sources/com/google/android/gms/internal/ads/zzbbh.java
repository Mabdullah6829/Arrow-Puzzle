package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbh implements zzbbn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f7516a;

    public zzbbh(zzbbo zzbboVar, Activity activity) {
        this.f7516a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    /* JADX INFO: renamed from: a */
    public final void mo4722a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f7516a);
    }
}
