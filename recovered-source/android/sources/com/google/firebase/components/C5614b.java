package com.google.firebase.components;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: renamed from: com.google.firebase.components.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5614b implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23540a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23541b;

    public /* synthetic */ C5614b(Object obj, int i2) {
        this.f23540a = i2;
        this.f23541b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f23540a) {
            case 0:
                return ComponentDiscovery.instantiate((String) this.f23541b);
            default:
                return FirebaseInstallations.lambda$new$0((FirebaseApp) this.f23541b);
        }
    }
}
