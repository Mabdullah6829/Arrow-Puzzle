package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: renamed from: com.google.firebase.concurrent.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5629g implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23576a;

    public /* synthetic */ C5629g(int i2) {
        this.f23576a = i2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f23576a) {
            case 0:
                return ExecutorsRegistrar.lambda$static$0();
            case 1:
                return ExecutorsRegistrar.lambda$static$1();
            case 2:
                return ExecutorsRegistrar.lambda$static$2();
            case 3:
                return ExecutorsRegistrar.lambda$static$3();
            case 4:
                return FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
            default:
                return FirebaseMessaging.lambda$static$0();
        }
    }
}
