package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {

    /* JADX INFO: renamed from: a */
    public final ListenerHolder f4260a;

    /* JADX INFO: renamed from: b */
    public final Feature[] f4261b;

    /* JADX INFO: renamed from: c */
    public final boolean f4262c;

    public RegisterListenerMethod(ListenerHolder listenerHolder, Feature[] featureArr, boolean z) {
        this.f4260a = listenerHolder;
        this.f4261b = featureArr;
        this.f4262c = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3480a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource);
}
