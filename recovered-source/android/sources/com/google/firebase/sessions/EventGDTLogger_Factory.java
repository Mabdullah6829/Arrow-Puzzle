package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import p063h.InterfaceC6361g;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class EventGDTLogger_Factory implements Factory<EventGDTLogger> {
    private final Provider<com.google.firebase.inject.Provider<InterfaceC6361g>> transportFactoryProvider;

    private EventGDTLogger_Factory(Provider<com.google.firebase.inject.Provider<InterfaceC6361g>> provider) {
        this.transportFactoryProvider = provider;
    }

    public static EventGDTLogger_Factory create(Provider<com.google.firebase.inject.Provider<InterfaceC6361g>> provider) {
        return new EventGDTLogger_Factory(provider);
    }

    public static EventGDTLogger newInstance(com.google.firebase.inject.Provider<InterfaceC6361g> provider) {
        return new EventGDTLogger(provider);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, p050c0.InterfaceC1888a
    public EventGDTLogger get() {
        return newInstance((com.google.firebase.inject.Provider) this.transportFactoryProvider.get());
    }
}
