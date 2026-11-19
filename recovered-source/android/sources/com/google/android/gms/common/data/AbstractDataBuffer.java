package com.google.android.gms.common.data;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {
    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new DataBufferIterator(this);
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
