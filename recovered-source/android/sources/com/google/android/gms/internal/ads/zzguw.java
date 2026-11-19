package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class zzguw extends zzgxz {

    /* JADX INFO: renamed from: v */
    public final transient Map f18218v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzgvj f18219w;

    public zzguw(zzgvj zzgvjVar, Map map) {
        Objects.requireNonNull(zzgvjVar);
        this.f18219w = zzgvjVar;
        this.f18218v = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgxz
    /* JADX INFO: renamed from: a */
    public final Set mo7158a() {
        return new zzguu(this);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractMap.SimpleImmutableEntry m7159c(Map.Entry entry) {
        Object key = entry.getKey();
        return new AbstractMap.SimpleImmutableEntry(key, this.f18219w.mo7155d(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f18218v;
        zzgvj zzgvjVar = this.f18219w;
        if (map == zzgvjVar.f18256v) {
            zzgvjVar.m7170f();
            return;
        }
        zzguv zzguvVar = new zzguv(this);
        while (zzguvVar.hasNext()) {
            zzguvVar.next();
            zzguvVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f18218v;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f18218v.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f18218v;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.f18219w.mo7155d(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f18218v.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgxz, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        zzgvj zzgvjVar = this.f18219w;
        Set set = zzgvjVar.f18259s;
        if (set != null) {
            return set;
        }
        Set setMo7171g = zzgvjVar.mo7171g();
        zzgvjVar.f18259s = setMo7171g;
        return setMo7171g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f18218v.remove(obj);
        if (collection == null) {
            return null;
        }
        zzgvj zzgvjVar = this.f18219w;
        Collection collectionMo7156e = zzgvjVar.mo7156e();
        collectionMo7156e.addAll(collection);
        zzgvjVar.f18257w -= collection.size();
        collection.clear();
        return collectionMo7156e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18218v.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f18218v.toString();
    }
}
