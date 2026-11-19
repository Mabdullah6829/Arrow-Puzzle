package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbg implements zzbbn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f7514a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f7515b;

    public zzbbg(zzbbo zzbboVar, Activity activity, Bundle bundle) {
        this.f7514a = activity;
        this.f7515b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    /* JADX INFO: renamed from: a */
    public final void mo4722a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f7514a, this.f7515b);
    }
}
