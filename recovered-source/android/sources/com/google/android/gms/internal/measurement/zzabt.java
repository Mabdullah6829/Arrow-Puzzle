package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabt implements Closeable {

    /* JADX INFO: renamed from: t */
    public static final ThreadLocal f21924t = new zzabs();

    /* JADX INFO: renamed from: s */
    public int f21925s = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i2 = this.f21925s;
        if (i2 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f21925s = i2 - 1;
    }
}
