package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
class zzgvd extends zzguw implements SortedMap {

    /* JADX INFO: renamed from: x */
    public SortedSet f18243x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ zzgvj f18244y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvd(zzgvj zzgvjVar, SortedMap sortedMap) {
        super(zzgvjVar, sortedMap);
        Objects.requireNonNull(zzgvjVar);
        this.f18244y = zzgvjVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo7163f().comparator();
    }

    @Override // com.google.android.gms.internal.ads.zzgxz
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet mo7160b() {
        return new zzgve(this.f18244y, mo7163f());
    }

    @Override // com.google.android.gms.internal.ads.zzguw, com.google.android.gms.internal.ads.zzgxz, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f18243x;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo7160b = mo7160b();
        this.f18243x = sortedSetMo7160b;
        return sortedSetMo7160b;
    }

    /* JADX INFO: renamed from: f */
    public SortedMap mo7163f() {
        return (SortedMap) this.f18218v;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo7163f().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzgvd(this.f18244y, mo7163f().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo7163f().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzgvd(this.f18244y, mo7163f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzgvd(this.f18244y, mo7163f().tailMap(obj));
    }
}
