package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzbfi implements zzbfk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f7733a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f7734b;

    public zzbfi(zzbfl zzbflVar, Activity activity, Bundle bundle) {
        this.f7733a = activity;
        this.f7734b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    /* JADX INFO: renamed from: a */
    public final void mo4842a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f7733a, this.f7734b);
    }
}
