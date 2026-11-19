package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
class zzgvf implements Iterator {

    /* JADX INFO: renamed from: s */
    public final Iterator f18246s;

    /* JADX INFO: renamed from: t */
    public final Collection f18247t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzgvg f18248u;

    public zzgvf(zzgvg zzgvgVar) {
        this.f18248u = zzgvgVar;
        Collection collection = zzgvgVar.f18250t;
        this.f18247t = collection;
        this.f18246s = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: renamed from: a */
    public final void m7166a() {
        zzgvg zzgvgVar = this.f18248u;
        zzgvgVar.m7167a();
        if (zzgvgVar.f18250t != this.f18247t) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m7166a();
        return this.f18246s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m7166a();
        return this.f18246s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f18246s.remove();
        zzgvg zzgvgVar = this.f18248u;
        zzgvgVar.f18253w.f18257w--;
        zzgvgVar.zzb();
    }

    public zzgvf(zzgvi zzgviVar, ListIterator listIterator) {
        this.f18248u = zzgviVar;
        this.f18247t = zzgviVar.f18250t;
        this.f18246s = listIterator;
    }
}
