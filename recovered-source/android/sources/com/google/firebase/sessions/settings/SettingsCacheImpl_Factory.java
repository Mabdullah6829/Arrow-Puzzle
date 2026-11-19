package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import p062g0.InterfaceC6353h;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Background"})
@DaggerGenerated
public final class SettingsCacheImpl_Factory implements Factory<SettingsCacheImpl> {
    private final Provider<InterfaceC6353h> backgroundDispatcherProvider;
    private final Provider<DataStore<SessionConfigs>> sessionConfigsDataStoreProvider;
    private final Provider<TimeProvider> timeProvider;

    private SettingsCacheImpl_Factory(Provider<InterfaceC6353h> provider, Provider<TimeProvider> provider2, Provider<DataStore<SessionConfigs>> provider3) {
        this.backgroundDispatcherProvider = provider;
        this.timeProvider = provider2;
        this.sessionConfigsDataStoreProvider = provider3;
    }

    public static SettingsCacheImpl_Factory create(Provider<InterfaceC6353h> provider, Provider<TimeProvider> provider2, Provider<DataStore<SessionConfigs>> provider3) {
        return new SettingsCacheImpl_Factory(provider, provider2, provider3);
    }

    public static SettingsCacheImpl newInstance(InterfaceC6353h interfaceC6353h, TimeProvider timeProvider, DataStore<SessionConfigs> dataStore) {
        return new SettingsCacheImpl(interfaceC6353h, timeProvider, dataStore);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, p050c0.InterfaceC1888a
    public SettingsCacheImpl get() {
        return newInstance((InterfaceC6353h) this.backgroundDispatcherProvider.get(), (TimeProvider) this.timeProvider.get(), (DataStore) this.sessionConfigsDataStoreProvider.get());
    }
}
