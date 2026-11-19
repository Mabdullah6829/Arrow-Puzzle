package androidx.collection.internal;

import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class LockExtKt {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m12272synchronized(Lock lock, InterfaceC6487a block) {
        T t;
        AbstractC6452k.m12181e(lock, "<this>");
        AbstractC6452k.m12181e(block, "block");
        synchronized (lock) {
            t = (T) block.invoke();
        }
        return t;
    }
}
