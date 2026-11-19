package com.google.firebase.firestore.auth;

import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: renamed from: com.google.firebase.firestore.auth.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5740a implements AppCheckTokenListener, Deferred.DeferredHandler {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ FirebaseAppCheckTokenProvider f23651s;

    public /* synthetic */ C5740a(FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider) {
        this.f23651s = firebaseAppCheckTokenProvider;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        this.f23651s.lambda$new$1(provider);
    }

    @Override // com.google.firebase.appcheck.interop.AppCheckTokenListener
    public void onAppCheckTokenChanged(AppCheckTokenResult appCheckTokenResult) {
        this.f23651s.lambda$new$0(appCheckTokenResult);
    }
}
