package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
final class zzbfg implements zzbfk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f7731a;

    public zzbfg(zzbfl zzbflVar, Activity activity) {
        this.f7731a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    /* JADX INFO: renamed from: a */
    public final void mo4842a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f7731a);
    }
}
