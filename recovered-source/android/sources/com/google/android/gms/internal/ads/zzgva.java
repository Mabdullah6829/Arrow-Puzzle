package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
final class zzgva extends zzgvd implements NavigableMap {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ zzgvj f18241z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgva(zzgvj zzgvjVar, NavigableMap navigableMap) {
        super(zzgvjVar, navigableMap);
        Objects.requireNonNull(zzgvjVar);
        this.f18241z = zzgvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, com.google.android.gms.internal.ads.zzgxz
    /* JADX INFO: renamed from: b */
    public final Set mo7160b() {
        return new zzgvb(this.f18241z, (NavigableMap) ((SortedMap) this.f18218v));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) this.f18218v)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m7159c(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18218v)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvd
    /* JADX INFO: renamed from: d */
    public final SortedSet mo7160b() {
        return new zzgvb(this.f18241z, (NavigableMap) ((SortedMap) this.f18218v));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzgva(this.f18241z, ((NavigableMap) ((SortedMap) this.f18218v)).descendingMap());
    }

    @Override // com.google.android.gms.internal.ads.zzgvd
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.android.gms.internal.ads.zzgvd
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SortedMap mo7163f() {
        return (NavigableMap) ((SortedMap) this.f18218v);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) this.f18218v)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m7159c(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) this.f18218v)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m7159c(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18218v)).floorKey(obj);
    }

    /* JADX INFO: renamed from: g */
    public final AbstractMap.SimpleImmutableEntry m7164g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzgvj zzgvjVar = this.f18241z;
        Collection collectionMo7156e = zzgvjVar.mo7156e();
        collectionMo7156e.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), zzgvjVar.mo7154c(collectionMo7156e));
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) this.f18218v)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m7159c(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18218v)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, com.google.android.gms.internal.ads.zzguw, com.google.android.gms.internal.ads.zzgxz, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) this.f18218v)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m7159c(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) this.f18218v)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m7159c(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f18218v)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m7164g(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m7164g(((zzgxz) descendingMap()).entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgvd, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new zzgva(this.f18241z, ((NavigableMap) ((SortedMap) this.f18218v)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzgva(this.f18241z, ((NavigableMap) ((SortedMap) this.f18218v)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new zzgva(this.f18241z, ((NavigableMap) ((SortedMap) this.f18218v)).tailMap(obj, z));
    }
}
