package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgzw implements Closeable {

    /* JADX INFO: renamed from: s */
    public final ArrayDeque f18409s = new ArrayDeque(4);

    /* JADX INFO: renamed from: t */
    public Throwable f18410t;

    static {
        zzgzv zzgzvVar = new Object() { // from class: com.google.android.gms.internal.ads.zzgzv
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.f18410t;
        while (true) {
            ArrayDeque arrayDeque = this.f18409s;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) arrayDeque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        zzgzu.f18407a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
                    }
                }
            }
        }
        if (this.f18410t != null || th == null) {
            return;
        }
        Object obj = zzgun.f18209a;
        if (IOException.class.isInstance(th)) {
            throw ((Throwable) IOException.class.cast(th));
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }
}
