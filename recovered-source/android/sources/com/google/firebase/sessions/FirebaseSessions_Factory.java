package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import com.google.firebase.sessions.settings.SessionsSettings;
import p062g0.InterfaceC6353h;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Background"})
@DaggerGenerated
public final class FirebaseSessions_Factory implements Factory<FirebaseSessions> {
    private final Provider<InterfaceC6353h> backgroundDispatcherProvider;
    private final Provider<FirebaseApp> firebaseAppProvider;
    private final Provider<SessionsActivityLifecycleCallbacks> sessionsActivityLifecycleCallbacksProvider;
    private final Provider<SessionsSettings> settingsProvider;

    private FirebaseSessions_Factory(Provider<FirebaseApp> provider, Provider<SessionsSettings> provider2, Provider<InterfaceC6353h> provider3, Provider<SessionsActivityLifecycleCallbacks> provider4) {
        this.firebaseAppProvider = provider;
        this.settingsProvider = provider2;
        this.backgroundDispatcherProvider = provider3;
        this.sessionsActivityLifecycleCallbacksProvider = provider4;
    }

    public static FirebaseSessions_Factory create(Provider<FirebaseApp> provider, Provider<SessionsSettings> provider2, Provider<InterfaceC6353h> provider3, Provider<SessionsActivityLifecycleCallbacks> provider4) {
        return new FirebaseSessions_Factory(provider, provider2, provider3, provider4);
    }

    public static FirebaseSessions newInstance(FirebaseApp firebaseApp, SessionsSettings sessionsSettings, InterfaceC6353h interfaceC6353h, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        return new FirebaseSessions(firebaseApp, sessionsSettings, interfaceC6353h, sessionsActivityLifecycleCallbacks);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, p050c0.InterfaceC1888a
    public FirebaseSessions get() {
        return newInstance((FirebaseApp) this.firebaseAppProvider.get(), (SessionsSettings) this.settingsProvider.get(), (InterfaceC6353h) this.backgroundDispatcherProvider.get(), (SessionsActivityLifecycleCallbacks) this.sessionsActivityLifecycleCallbacksProvider.get());
    }
}
