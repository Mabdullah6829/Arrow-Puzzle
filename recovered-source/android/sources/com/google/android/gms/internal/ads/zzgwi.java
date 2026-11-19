package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgwi extends zzgwk implements Collection {
    public boolean add(Object obj) {
        return mo6719g().add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return mo6719g().addAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgwk
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Object mo6718b() {
        throw null;
    }

    @Override // java.util.Collection
    public final void clear() {
        mo6719g().clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return mo6719g().contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return mo6719g().containsAll(collection);
    }

    /* JADX INFO: renamed from: g */
    public abstract Collection mo6719g();

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return mo6719g().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return mo6719g().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return mo6719g().remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return mo6719g().removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return mo6719g().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return mo6719g().size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return mo6719g().toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return mo6719g().toArray(objArr);
    }
}
