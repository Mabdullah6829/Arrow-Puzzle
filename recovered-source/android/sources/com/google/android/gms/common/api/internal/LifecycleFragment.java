package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public interface LifecycleFragment {
    /* JADX INFO: renamed from: a */
    void mo3476a(String str, LifecycleCallback lifecycleCallback);

    /* JADX INFO: renamed from: b */
    LifecycleCallback mo3477b(Class cls, String str);

    /* JADX INFO: renamed from: c */
    Activity mo3478c();

    void startActivityForResult(Intent intent, int i2);
}
