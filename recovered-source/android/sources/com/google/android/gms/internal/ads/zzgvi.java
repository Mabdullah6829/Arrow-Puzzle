package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
class zzgvi extends zzgvg implements List {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzgvj f18255x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvi(zzgvj zzgvjVar, Object obj, List list, zzgvg zzgvgVar) {
        super(zzgvjVar, obj, list, zzgvgVar);
        this.f18255x = zzgvjVar;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        m7167a();
        boolean zIsEmpty = this.f18250t.isEmpty();
        ((List) this.f18250t).add(i2, obj);
        this.f18255x.f18257w++;
        if (zIsEmpty) {
            m7168b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f18250t).addAll(i2, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f18255x.f18257w += this.f18250t.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        m7168b();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        m7167a();
        return ((List) this.f18250t).get(i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m7167a();
        return ((List) this.f18250t).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m7167a();
        return ((List) this.f18250t).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m7167a();
        return new zzgvh(this);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        m7167a();
        Object objRemove = ((List) this.f18250t).remove(i2);
        this.f18255x.f18257w--;
        zzb();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        m7167a();
        return ((List) this.f18250t).set(i2, obj);
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        m7167a();
        List listSubList = ((List) this.f18250t).subList(i2, i3);
        zzgvg zzgvgVar = this.f18251u;
        if (zzgvgVar == null) {
            zzgvgVar = this;
        }
        zzgvj zzgvjVar = this.f18255x;
        zzgvjVar.getClass();
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.f18249s;
        return z ? new zzgvc(zzgvjVar, obj, listSubList, zzgvgVar) : new zzgvi(zzgvjVar, obj, listSubList, zzgvgVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        m7167a();
        return new zzgvh(this, i2);
    }
}
