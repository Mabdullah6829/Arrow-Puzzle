package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6209Y0 extends AbstractList implements InterfaceC6225e0, RandomAccess {

    /* JADX INFO: renamed from: s */
    public final C6222d0 f24132s;

    public C6209Y0(C6222d0 c6222d0) {
        this.f24132s = c6222d0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return (String) this.f24132s.get(i2);
    }

    @Override // com.google.protobuf.InterfaceC6225e0
    public final Object getRaw(int i2) {
        return this.f24132s.f24161t.get(i2);
    }

    @Override // com.google.protobuf.InterfaceC6225e0
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f24132s.f24161t);
    }

    @Override // com.google.protobuf.InterfaceC6225e0
    public final InterfaceC6225e0 getUnmodifiableView() {
        return this;
    }

    @Override // com.google.protobuf.InterfaceC6225e0
    /* JADX INFO: renamed from: i */
    public final void mo11830i(AbstractC6251n abstractC6251n) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C6207X0 c6207x0 = new C6207X0();
        c6207x0.f24131s = this.f24132s.iterator();
        return c6207x0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        C6205W0 c6205w0 = new C6205W0();
        c6205w0.f24130s = this.f24132s.listIterator(i2);
        return c6205w0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24132s.f24161t.size();
    }
}
