package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory */
/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class C6031x19dc4d73 implements Factory<ApplicationInfo> {
    private final Provider<FirebaseApp> firebaseAppProvider;

    private C6031x19dc4d73(Provider<FirebaseApp> provider) {
        this.firebaseAppProvider = provider;
    }

    public static ApplicationInfo applicationInfo(FirebaseApp firebaseApp) {
        return (ApplicationInfo) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.Companion.applicationInfo(firebaseApp));
    }

    public static C6031x19dc4d73 create(Provider<FirebaseApp> provider) {
        return new C6031x19dc4d73(provider);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, p050c0.InterfaceC1888a
    public ApplicationInfo get() {
        return applicationInfo((FirebaseApp) this.firebaseAppProvider.get());
    }
}
