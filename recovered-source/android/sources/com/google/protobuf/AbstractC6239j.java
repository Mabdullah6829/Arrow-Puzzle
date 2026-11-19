package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6239j implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(nextByte());
    }

    public abstract byte nextByte();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
