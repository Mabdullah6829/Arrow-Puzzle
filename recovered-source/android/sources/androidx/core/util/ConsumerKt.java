package androidx.core.util;

import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public final class ConsumerKt {
    public static final <T> java.util.function.Consumer<T> asConsumer(InterfaceC6348c interfaceC6348c) {
        return new ContinuationConsumer(interfaceC6348c);
    }
}
