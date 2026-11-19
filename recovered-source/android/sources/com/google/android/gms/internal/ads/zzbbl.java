package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbl implements zzbbn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f7520a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f7521b;

    public zzbbl(zzbbo zzbboVar, Activity activity, Bundle bundle) {
        this.f7520a = activity;
        this.f7521b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    /* JADX INFO: renamed from: a */
    public final void mo4722a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f7520a, this.f7521b);
    }
}
