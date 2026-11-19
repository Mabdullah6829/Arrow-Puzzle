package com.google.protobuf;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.protobuf.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6205W0 implements ListIterator {

    /* JADX INFO: renamed from: s */
    public ListIterator f24130s;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f24130s.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24130s.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f24130s.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24130s.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f24130s.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24130s.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
