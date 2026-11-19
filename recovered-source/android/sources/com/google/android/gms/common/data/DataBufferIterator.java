package com.google.android.gms.common.data;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class DataBufferIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: s */
    public final DataBuffer f4384s;

    /* JADX INFO: renamed from: t */
    public int f4385t;

    public DataBufferIterator(AbstractDataBuffer abstractDataBuffer) {
        Preconditions.m3544h(abstractDataBuffer);
        this.f4384s = abstractDataBuffer;
        this.f4385t = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4385t < this.f4384s.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            int i2 = this.f4385t;
            throw new NoSuchElementException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 35), "Cannot advance the iterator beyond ", i2));
        }
        int i3 = this.f4385t + 1;
        this.f4385t = i3;
        return this.f4384s.get(i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
