package com.google.android.gms.common.data;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* JADX INFO: renamed from: u */
    public Object f4396u;

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            int i2 = this.f4385t;
            throw new NoSuchElementException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 35), "Cannot advance the iterator beyond ", i2));
        }
        int i3 = this.f4385t + 1;
        this.f4385t = i3;
        if (i3 != 0) {
            DataBufferRef dataBufferRef = (DataBufferRef) this.f4396u;
            if (i3 >= 0) {
                throw null;
            }
            Preconditions.m3546j(false);
            dataBufferRef.f4386a = i3;
            throw null;
        }
        Object obj = this.f4384s.get(0);
        Preconditions.m3544h(obj);
        this.f4396u = obj;
        if (obj instanceof DataBufferRef) {
            return obj;
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalStateException(AbstractC1456a.m2450q(new StringBuilder(strValueOf.length() + 44), "DataBuffer reference of type ", strValueOf, " is not movable"));
    }
}
