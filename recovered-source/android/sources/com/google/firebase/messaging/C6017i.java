package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.firebase.messaging.i */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6017i implements SuccessContinuation, RequestDeduplicator.GetTokenRequest {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FirebaseMessaging f24016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f24017b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Store.Token f24018c;

    public /* synthetic */ C6017i(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f24016a = firebaseMessaging;
        this.f24017b = str;
        this.f24018c = token;
    }

    @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
    public Task start() {
        return this.f24016a.lambda$blockingGetToken$14(this.f24017b, this.f24018c);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return this.f24016a.lambda$blockingGetToken$13(this.f24017b, this.f24018c, (String) obj);
    }
}
