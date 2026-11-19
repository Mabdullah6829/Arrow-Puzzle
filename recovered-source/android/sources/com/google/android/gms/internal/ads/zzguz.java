package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzguz extends zzgxx {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzgvj f18227t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzguz(zzgvj zzgvjVar, Map map) {
        super(map);
        Objects.requireNonNull(zzgvjVar);
        this.f18227t = zzgvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            zzguy zzguyVar = (zzguy) it;
            if (!zzguyVar.hasNext()) {
                return;
            }
            zzguyVar.next();
            zzguyVar.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f18342s.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f18342s.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18342s.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgxx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzguy(this, this.f18342s.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgxx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f18342s.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f18227t.f18257w -= size;
        return size > 0;
    }
}
