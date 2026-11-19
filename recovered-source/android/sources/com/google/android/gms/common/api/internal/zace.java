package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zace extends RegisterListenerMethod {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ RegistrationMethods.Builder f4334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zace(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z) {
        super(listenerHolder, featureArr, z);
        this.f4334d = builder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    /* JADX INFO: renamed from: a */
    public final void mo3480a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        this.f4334d.f4266a.mo3483a(anyClient, taskCompletionSource);
    }
}
