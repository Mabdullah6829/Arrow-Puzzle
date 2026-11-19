package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class RegistrationMethods<A extends Api.AnyClient, L> {

    /* JADX INFO: renamed from: a */
    public final RegisterListenerMethod f4263a;

    /* JADX INFO: renamed from: b */
    public final UnregisterListenerMethod f4264b;

    /* JADX INFO: renamed from: c */
    public final Runnable f4265c;

    public static class Builder<A extends Api.AnyClient, L> {

        /* JADX INFO: renamed from: a */
        public RemoteCall f4266a;

        /* JADX INFO: renamed from: b */
        public RemoteCall f4267b;

        /* JADX INFO: renamed from: d */
        public ListenerHolder f4269d;

        /* JADX INFO: renamed from: e */
        public Feature[] f4270e;

        /* JADX INFO: renamed from: c */
        public Runnable f4268c = zacg.f4336s;

        /* JADX INFO: renamed from: f */
        public boolean f4271f = true;

        private Builder() {
        }

        /* JADX INFO: renamed from: a */
        public final RegistrationMethods m3482a() {
            Preconditions.m3538b(this.f4266a != null, "Must set register function");
            Preconditions.m3538b(this.f4267b != null, "Must set unregister function");
            Preconditions.m3538b(this.f4269d != null, "Must set holder");
            ListenerHolder.ListenerKey listenerKey = this.f4269d.f4257b;
            Preconditions.m3545i(listenerKey, "Key must not be null");
            return new RegistrationMethods(new zace(this, this.f4269d, this.f4270e, this.f4271f), new zacf(this, listenerKey), this.f4268c);
        }
    }

    public /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable) {
        this.f4263a = registerListenerMethod;
        this.f4264b = unregisterListenerMethod;
        this.f4265c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static Builder m3481a() {
        Builder builder = new Builder();
        builder.f4268c = zacg.f4336s;
        builder.f4271f = true;
        return builder;
    }
}
