package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
class zzgve extends zzguz implements SortedSet {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzgvj f18245u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgve(zzgvj zzgvjVar, SortedMap sortedMap) {
        super(zzgvjVar, sortedMap);
        Objects.requireNonNull(zzgvjVar);
        this.f18245u = zzgvjVar;
    }

    /* JADX INFO: renamed from: a */
    public SortedMap mo7165a() {
        return (SortedMap) this.f18342s;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo7165a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo7165a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzgve(this.f18245u, mo7165a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo7165a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzgve(this.f18245u, mo7165a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzgve(this.f18245u, mo7165a().tailMap(obj));
    }
}
