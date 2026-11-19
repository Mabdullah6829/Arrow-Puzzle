package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import p062g0.InterfaceC6353h;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
public final class RemoteSettingsFetcher_Factory implements Factory<RemoteSettingsFetcher> {
    private final Provider<ApplicationInfo> appInfoProvider;
    private final Provider<InterfaceC6353h> blockingDispatcherProvider;

    private RemoteSettingsFetcher_Factory(Provider<ApplicationInfo> provider, Provider<InterfaceC6353h> provider2) {
        this.appInfoProvider = provider;
        this.blockingDispatcherProvider = provider2;
    }

    public static RemoteSettingsFetcher_Factory create(Provider<ApplicationInfo> provider, Provider<InterfaceC6353h> provider2) {
        return new RemoteSettingsFetcher_Factory(provider, provider2);
    }

    public static RemoteSettingsFetcher newInstance(ApplicationInfo applicationInfo, InterfaceC6353h interfaceC6353h) {
        return new RemoteSettingsFetcher(applicationInfo, interfaceC6353h);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, p050c0.InterfaceC1888a
    public RemoteSettingsFetcher get() {
        return newInstance((ApplicationInfo) this.appInfoProvider.get(), (InterfaceC6353h) this.blockingDispatcherProvider.get());
    }
}
