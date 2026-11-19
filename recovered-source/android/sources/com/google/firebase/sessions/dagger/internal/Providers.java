package com.google.firebase.sessions.dagger.internal;

import p050c0.InterfaceC1888a;

/* JADX INFO: loaded from: classes2.dex */
public final class Providers {
    private Providers() {
    }

    public static <T> Provider<T> asDaggerProvider(final InterfaceC1888a interfaceC1888a) {
        Preconditions.checkNotNull(interfaceC1888a);
        return interfaceC1888a instanceof Provider ? (Provider) interfaceC1888a : new Provider<T>() { // from class: com.google.firebase.sessions.dagger.internal.Providers.1
            @Override // com.google.firebase.sessions.dagger.internal.Provider, p050c0.InterfaceC1888a
            public T get() {
                return (T) interfaceC1888a.get();
            }
        };
    }
}
