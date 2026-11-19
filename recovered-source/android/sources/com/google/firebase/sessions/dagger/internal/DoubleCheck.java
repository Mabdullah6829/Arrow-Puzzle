package com.google.firebase.sessions.dagger.internal;

import com.google.firebase.sessions.dagger.Lazy;
import p050c0.InterfaceC1888a;

/* JADX INFO: loaded from: classes2.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile Provider<T> provider;

    private DoubleCheck(Provider<T> provider) {
        this.provider = provider;
    }

    private synchronized Object getSynchronized() {
        Object obj;
        obj = this.instance;
        if (obj == UNINITIALIZED) {
            obj = this.provider.get();
            this.instance = reentrantCheck(this.instance, obj);
            this.provider = null;
        }
        return obj;
    }

    public static <T> Lazy<T> lazy(Provider<T> provider) {
        return provider instanceof Lazy ? (Lazy) provider : new DoubleCheck((Provider) Preconditions.checkNotNull(provider));
    }

    public static <T> Provider<T> provider(Provider<T> provider) {
        Preconditions.checkNotNull(provider);
        return provider instanceof DoubleCheck ? provider : new DoubleCheck(provider);
    }

    private static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == UNINITIALIZED || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // com.google.firebase.sessions.dagger.internal.Provider, p050c0.InterfaceC1888a
    public T get() {
        T t = (T) this.instance;
        return t == UNINITIALIZED ? (T) getSynchronized() : t;
    }

    public static <P extends InterfaceC1888a, T> Lazy<T> lazy(P p2) {
        return lazy(Providers.asDaggerProvider(p2));
    }

    @Deprecated
    public static <P extends InterfaceC1888a, T> InterfaceC1888a provider(P p2) {
        return provider(Providers.asDaggerProvider(p2));
    }
}
