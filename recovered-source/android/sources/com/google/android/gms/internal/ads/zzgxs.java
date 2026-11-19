package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgxs extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: s */
    public final List f18340s;

    /* JADX INFO: renamed from: t */
    public final zzgti f18341t;

    public zzgxs(List list, zzgti zzgtiVar) {
        list.getClass();
        this.f18340s = list;
        this.f18341t = zzgtiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f18340s.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        return new zzgxr(this, this.f18340s.listIterator(i2));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        this.f18340s.subList(i2, i3).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18340s.size();
    }
}
