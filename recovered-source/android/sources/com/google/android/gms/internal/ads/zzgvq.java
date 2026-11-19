package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
class zzgvq extends AbstractCollection {

    /* JADX INFO: renamed from: s */
    public final Collection f18264s;

    /* JADX INFO: renamed from: t */
    public final zzgts f18265t;

    public zzgvq(Collection collection, zzgts zzgtsVar) {
        this.f18264s = collection;
        this.f18265t = zzgtsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzgtr.m7128a(this.f18265t.mo3897b(obj));
        return this.f18264s.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzgtr.m7128a(this.f18265t.mo3897b(it.next()));
        }
        return this.f18264s.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection collection = this.f18264s;
        boolean z = collection instanceof RandomAccess;
        zzgts zzgtsVar = this.f18265t;
        if (!z || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            zzgtsVar.getClass();
            while (it.hasNext()) {
                if (zzgtsVar.mo3897b(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        zzgtsVar.getClass();
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Object obj = list.get(i3);
            if (!zzgtsVar.mo3897b(obj)) {
                if (i3 > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        zzgxh.m7248b(list, zzgtsVar, i2, i3);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        zzgxh.m7248b(list, zzgtsVar, i2, i3);
                        return;
                    }
                }
                i2++;
            }
        }
        list.subList(i2, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        Collection collection = this.f18264s;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f18265t.mo3897b(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Iterator it = this.f18264s.iterator();
        zzgts zzgtsVar = this.f18265t;
        zzgtr.m7135h(zzgtsVar, "predicate");
        int i2 = 0;
        while (it.hasNext()) {
            if (zzgtsVar.mo3897b(it.next())) {
                return i2 == -1;
            }
            i2++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f18264s.iterator();
        it.getClass();
        zzgts zzgtsVar = this.f18265t;
        zzgtsVar.getClass();
        return new zzgxi(it, zzgtsVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f18264s.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f18264s.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f18265t.mo3897b(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f18264s.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f18265t.mo3897b(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f18264s.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (this.f18265t.mo3897b(it.next())) {
                i2++;
            }
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return zzgxt.m7250a((zzgzh) iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zzgxt.m7250a((zzgzh) iterator()).toArray(objArr);
    }
}
