package com.google.firebase.sessions.api;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6375e(m12158c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", m12159f = "FirebaseSessionsDependencies.kt", m12160l = {76}, m12161m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
public final class FirebaseSessionsDependencies$getRegisteredSubscribers$1 extends AbstractC6373c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseSessionsDependencies this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSessionsDependencies$getRegisteredSubscribers$1(FirebaseSessionsDependencies firebaseSessionsDependencies, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.this$0 = firebaseSessionsDependencies;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
    }
}
