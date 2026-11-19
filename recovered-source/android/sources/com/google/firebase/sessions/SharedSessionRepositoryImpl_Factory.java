package com.google.firebase.sessions;

import androidx.datastore.core.DataStore;
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
public final class SharedSessionRepositoryImpl_Factory implements Factory<SharedSessionRepositoryImpl> {
    private final Provider<InterfaceC6353h> backgroundDispatcherProvider;
    private final Provider<ProcessDataManager> processDataManagerProvider;
    private final Provider<DataStore<SessionData>> sessionDataStoreProvider;
    private final Provider<SessionFirelogPublisher> sessionFirelogPublisherProvider;
    private final Provider<SessionGenerator> sessionGeneratorProvider;
    private final Provider<SessionsSettings> sessionsSettingsProvider;
    private final Provider<TimeProvider> timeProvider;

    private SharedSessionRepositoryImpl_Factory(Provider<SessionsSettings> provider, Provider<SessionGenerator> provider2, Provider<SessionFirelogPublisher> provider3, Provider<TimeProvider> provider4, Provider<DataStore<SessionData>> provider5, Provider<ProcessDataManager> provider6, Provider<InterfaceC6353h> provider7) {
        this.sessionsSettingsProvider = provider;
        this.sessionGeneratorProvider = provider2;
        this.sessionFirelogPublisherProvider = provider3;
        this.timeProvider = provider4;
        this.sessionDataStoreProvider = provider5;
        this.processDataManagerProvider = provider6;
        this.backgroundDispatcherProvider = provider7;
    }

    public static SharedSessionRepositoryImpl_Factory create(Provider<SessionsSettings> provider, Provider<SessionGenerator> provider2, Provider<SessionFirelogPublisher> provider3, Provider<TimeProvider> provider4, Provider<DataStore<SessionData>> provider5, Provider<ProcessDataManager> provider6, Provider<InterfaceC6353h> provider7) {
        return new SharedSessionRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static SharedSessionRepositoryImpl newInstance(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, DataStore<SessionData> dataStore, ProcessDataManager processDataManager, InterfaceC6353h interfaceC6353h) {
        return new SharedSessionRepositoryImpl(sessionsSettings, sessionGenerator, sessionFirelogPublisher, timeProvider, dataStore, processDataManager, interfaceC6353h);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, p050c0.InterfaceC1888a
    public SharedSessionRepositoryImpl get() {
        return newInstance((SessionsSettings) this.sessionsSettingsProvider.get(), (SessionGenerator) this.sessionGeneratorProvider.get(), (SessionFirelogPublisher) this.sessionFirelogPublisherProvider.get(), (TimeProvider) this.timeProvider.get(), (DataStore) this.sessionDataStoreProvider.get(), (ProcessDataManager) this.processDataManagerProvider.get(), (InterfaceC6353h) this.backgroundDispatcherProvider.get());
    }
}
