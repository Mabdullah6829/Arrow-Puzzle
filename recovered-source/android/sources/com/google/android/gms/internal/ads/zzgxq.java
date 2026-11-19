package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzgxq extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: s */
    public final List f18337s;

    /* JADX INFO: renamed from: t */
    public final zzgti f18338t;

    public zzgxq(List list, zzgti zzgtiVar) {
        list.getClass();
        this.f18337s = list;
        this.f18338t = zzgtiVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.f18338t.apply(this.f18337s.get(i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f18337s.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        return new zzgxp(this, this.f18337s.listIterator(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        return this.f18338t.apply(this.f18337s.remove(i2));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        this.f18337s.subList(i2, i3).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18337s.size();
    }
}
