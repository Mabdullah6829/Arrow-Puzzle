package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleActivity {

    /* JADX INFO: renamed from: a */
    public final Activity f4254a;

    public LifecycleActivity(Activity activity) {
        Preconditions.m3545i(activity, "Activity must not be null");
        this.f4254a = activity;
    }
}
