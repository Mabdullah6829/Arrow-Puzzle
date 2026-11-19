package com.google.firebase.firestore.auth;

import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;

/* JADX INFO: renamed from: com.google.firebase.firestore.auth.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5741b implements IdTokenListener, Deferred.DeferredHandler {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ FirebaseAuthCredentialsProvider f23652s;

    public /* synthetic */ C5741b(FirebaseAuthCredentialsProvider firebaseAuthCredentialsProvider) {
        this.f23652s = firebaseAuthCredentialsProvider;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        this.f23652s.lambda$new$1(provider);
    }

    @Override // com.google.firebase.auth.internal.IdTokenListener
    public void onIdTokenChanged(InternalTokenResult internalTokenResult) {
        this.f23652s.lambda$new$0(internalTokenResult);
    }
}
