package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsj implements Closeable {

    /* JADX INFO: renamed from: s */
    public final Closeable f22864s;

    public zzsj(InputStream inputStream) {
        this.f22864s = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable = this.f22864s;
        if (closeable != null) {
            closeable.close();
        }
    }
}
