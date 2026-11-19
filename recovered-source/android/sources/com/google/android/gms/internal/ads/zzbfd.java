package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzbfd implements zzbfk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f7727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f7728b;

    public zzbfd(zzbfl zzbflVar, Activity activity, Bundle bundle) {
        this.f7727a = activity;
        this.f7728b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    /* JADX INFO: renamed from: a */
    public final void mo4842a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f7727a, this.f7728b);
    }
}
