package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmu implements Closeable {

    /* JADX INFO: renamed from: s */
    public final Inflater f22654s = new Inflater(true);

    private zzmu() {
    }

    /* JADX INFO: renamed from: c */
    public static zzmu m10527c() {
        return new zzmu();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22654s.end();
    }
}
