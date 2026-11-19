package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.X0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6207X0 implements Iterator {

    /* JADX INFO: renamed from: s */
    public Iterator f24131s;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24131s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f24131s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
