package com.google.firebase.sessions.api;

import p078p0.InterfaceC6487a;

/* JADX INFO: renamed from: com.google.firebase.sessions.api.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6044a implements InterfaceC6487a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ FirebaseSessionsDependencies.Dependency f24040s;

    public /* synthetic */ C6044a(FirebaseSessionsDependencies.Dependency dependency) {
        this.f24040s = dependency;
    }

    @Override // p078p0.InterfaceC6487a
    public final Object invoke() {
        return FirebaseSessionsDependencies.getRegisteredSubscribers$lambda$2$lambda$1(this.f24040s);
    }
}
