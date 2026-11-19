package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory */
/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
public final class C6033xa7e684e2 implements Factory<DataStore<SessionData>> {
    private final Provider<Context> appContextProvider;
    private final Provider<InterfaceC6353h> blockingDispatcherProvider;
    private final Provider<SessionDataSerializer> sessionDataSerializerProvider;

    private C6033xa7e684e2(Provider<Context> provider, Provider<InterfaceC6353h> provider2, Provider<SessionDataSerializer> provider3) {
        this.appContextProvider = provider;
        this.blockingDispatcherProvider = provider2;
        this.sessionDataSerializerProvider = provider3;
    }

    public static C6033xa7e684e2 create(Provider<Context> provider, Provider<InterfaceC6353h> provider2, Provider<SessionDataSerializer> provider3) {
        return new C6033xa7e684e2(provider, provider2, provider3);
    }

    public static DataStore<SessionData> sessionDataStore(Context context, InterfaceC6353h interfaceC6353h, SessionDataSerializer sessionDataSerializer) {
        return (DataStore) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.Companion.sessionDataStore(context, interfaceC6353h, sessionDataSerializer));
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, p050c0.InterfaceC1888a
    public DataStore<SessionData> get() {
        return sessionDataStore((Context) this.appContextProvider.get(), (InterfaceC6353h) this.blockingDispatcherProvider.get(), (SessionDataSerializer) this.sessionDataSerializerProvider.get());
    }
}
