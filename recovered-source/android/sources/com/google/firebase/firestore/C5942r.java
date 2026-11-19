package com.google.firebase.firestore;

import p078p0.InterfaceC6487a;

/* JADX INFO: renamed from: com.google.firebase.firestore.r */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5942r implements InterfaceC6487a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23914s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23915t;

    public /* synthetic */ C5942r(Object obj, int i2) {
        this.f23914s = i2;
        this.f23915t = obj;
    }

    @Override // p078p0.InterfaceC6487a
    public final Object invoke() {
        switch (this.f23914s) {
            case 0:
                return FirestoreKt.C57261.invokeSuspend$lambda$1((ListenerRegistration) this.f23915t);
            case 1:
                return FirestoreKt.C57272.invokeSuspend$lambda$1((ListenerRegistration) this.f23915t);
            case 2:
                return RealtimePipeline.C57351.invokeSuspend$lambda$1((ListenerRegistration) this.f23915t);
            default:
                return RealtimePipeline.rewrittenStages_delegate$lambda$5((RealtimePipeline) this.f23915t);
        }
    }
}
