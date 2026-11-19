package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
final class zzgvb extends zzgve implements NavigableSet {

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgvj f18242v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvb(zzgvj zzgvjVar, NavigableMap navigableMap) {
        super(zzgvjVar, navigableMap);
        Objects.requireNonNull(zzgvjVar);
        this.f18242v = zzgvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SortedMap mo7165a() {
        return (NavigableMap) ((SortedMap) this.f18342s);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18342s)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((zzguz) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new zzgvb(this.f18242v, ((NavigableMap) ((SortedMap) this.f18342s)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18342s)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgve, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18342s)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18342s)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        zzguy zzguyVar = (zzguy) iterator();
        if (!zzguyVar.hasNext()) {
            return null;
        }
        Object next = zzguyVar.next();
        zzguyVar.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // com.google.android.gms.internal.ads.zzgve, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgve, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new zzgvb(this.f18242v, ((NavigableMap) ((SortedMap) this.f18342s)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzgvb(this.f18242v, ((NavigableMap) ((SortedMap) this.f18342s)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new zzgvb(this.f18242v, ((NavigableMap) ((SortedMap) this.f18342s)).tailMap(obj, z));
    }
}
