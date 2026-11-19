package androidx.core.util;

import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(InterfaceC6348c interfaceC6348c) {
        return new AndroidXContinuationConsumer(interfaceC6348c);
    }
}
