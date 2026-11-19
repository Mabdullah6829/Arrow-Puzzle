package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zacd {

    /* JADX INFO: renamed from: a */
    public final RegisterListenerMethod f4331a;

    /* JADX INFO: renamed from: b */
    public final UnregisterListenerMethod f4332b;

    /* JADX INFO: renamed from: c */
    public final Runnable f4333c;

    public zacd(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable) {
        this.f4331a = registerListenerMethod;
        this.f4332b = unregisterListenerMethod;
        this.f4333c = runnable;
    }
}
