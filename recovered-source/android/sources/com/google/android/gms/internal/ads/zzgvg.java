package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class zzgvg extends AbstractCollection {

    /* JADX INFO: renamed from: s */
    public final Object f18249s;

    /* JADX INFO: renamed from: t */
    public Collection f18250t;

    /* JADX INFO: renamed from: u */
    public final zzgvg f18251u;

    /* JADX INFO: renamed from: v */
    public final Collection f18252v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzgvj f18253w;

    public zzgvg(zzgvj zzgvjVar, Object obj, List list, zzgvg zzgvgVar) {
        this.f18253w = zzgvjVar;
        this.f18249s = obj;
        this.f18250t = list;
        this.f18251u = zzgvgVar;
        this.f18252v = zzgvgVar == null ? null : zzgvgVar.f18250t;
    }

    /* JADX INFO: renamed from: a */
    public final void m7167a() {
        zzgvg zzgvgVar = this.f18251u;
        if (zzgvgVar != null) {
            zzgvgVar.m7167a();
            if (zzgvgVar.f18250t != this.f18252v) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f18250t.isEmpty()) {
            Collection collection = (Collection) this.f18253w.f18256v.get(this.f18249s);
            if (collection != null) {
                this.f18250t = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        m7167a();
        boolean zIsEmpty = this.f18250t.isEmpty();
        boolean zAdd = this.f18250t.add(obj);
        if (zAdd) {
            this.f18253w.f18257w++;
            if (zIsEmpty) {
                m7168b();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f18250t.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f18253w.f18257w += this.f18250t.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        m7168b();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m7168b() {
        zzgvg zzgvgVar = this.f18251u;
        if (zzgvgVar != null) {
            zzgvgVar.m7168b();
        } else {
            this.f18253w.f18256v.put(this.f18249s, this.f18250t);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f18250t.clear();
        this.f18253w.f18257w -= size;
        zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        m7167a();
        return this.f18250t.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        m7167a();
        return this.f18250t.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m7167a();
        return this.f18250t.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        m7167a();
        return this.f18250t.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        m7167a();
        return new zzgvf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        m7167a();
        boolean zRemove = this.f18250t.remove(obj);
        if (zRemove) {
            this.f18253w.f18257w--;
            zzb();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f18250t.removeAll(collection);
        if (zRemoveAll) {
            this.f18253w.f18257w += this.f18250t.size() - size;
            zzb();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f18250t.retainAll(collection);
        if (zRetainAll) {
            this.f18253w.f18257w += this.f18250t.size() - size;
            zzb();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        m7167a();
        return this.f18250t.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m7167a();
        return this.f18250t.toString();
    }

    public final void zzb() {
        zzgvg zzgvgVar = this.f18251u;
        if (zzgvgVar != null) {
            zzgvgVar.zzb();
        } else if (this.f18250t.isEmpty()) {
            this.f18253w.f18256v.remove(this.f18249s);
        }
    }
}
