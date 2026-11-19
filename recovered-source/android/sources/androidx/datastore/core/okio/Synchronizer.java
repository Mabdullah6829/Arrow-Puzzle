package androidx.datastore.core.okio;

import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class Synchronizer {
    public final <T> T withLock(InterfaceC6487a block) {
        T t;
        AbstractC6452k.m12181e(block, "block");
        synchronized (this) {
            t = (T) block.invoke();
        }
        return t;
    }
}
