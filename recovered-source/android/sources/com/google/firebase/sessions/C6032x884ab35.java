package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import com.google.firebase.sessions.settings.SessionConfigs;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory */
/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
public final class C6032x884ab35 implements Factory<DataStore<SessionConfigs>> {
    private final Provider<Context> appContextProvider;
    private final Provider<InterfaceC6353h> blockingDispatcherProvider;

    private C6032x884ab35(Provider<Context> provider, Provider<InterfaceC6353h> provider2) {
        this.appContextProvider = provider;
        this.blockingDispatcherProvider = provider2;
    }

    public static C6032x884ab35 create(Provider<Context> provider, Provider<InterfaceC6353h> provider2) {
        return new C6032x884ab35(provider, provider2);
    }

    public static DataStore<SessionConfigs> sessionConfigsDataStore(Context context, InterfaceC6353h interfaceC6353h) {
        return (DataStore) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore(context, interfaceC6353h));
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, p050c0.InterfaceC1888a
    public DataStore<SessionConfigs> get() {
        return sessionConfigsDataStore((Context) this.appContextProvider.get(), (InterfaceC6353h) this.blockingDispatcherProvider.get());
    }
}
