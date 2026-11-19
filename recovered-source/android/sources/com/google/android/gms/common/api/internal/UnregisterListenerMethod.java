package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {

    /* JADX INFO: renamed from: a */
    public final ListenerHolder.ListenerKey f4279a;

    public UnregisterListenerMethod(ListenerHolder.ListenerKey listenerKey) {
        this.f4279a = listenerKey;
    }
}
