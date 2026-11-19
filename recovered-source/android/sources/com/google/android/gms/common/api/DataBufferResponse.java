package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final Object get(int i2) {
        throw null;
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        throw null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
        throw null;
    }
}
