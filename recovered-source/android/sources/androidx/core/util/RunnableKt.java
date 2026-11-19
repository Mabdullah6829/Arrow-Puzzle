package androidx.core.util;

import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public final class RunnableKt {
    public static final Runnable asRunnable(InterfaceC6348c interfaceC6348c) {
        return new ContinuationRunnable(interfaceC6348c);
    }
}
