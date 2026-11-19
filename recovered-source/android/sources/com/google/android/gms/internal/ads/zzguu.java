package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzguu extends zzgxw {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzguw f18214s;

    public zzguu(zzguw zzguwVar) {
        this.f18214s = zzguwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    /* JADX INFO: renamed from: a */
    public final Map mo7157a() {
        return this.f18214s;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f18214s.f18218v.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzguv(this.f18214s);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        Object key = entry.getKey();
        zzgvj zzgvjVar = this.f18214s.f18219w;
        try {
            objRemove = zzgvjVar.f18256v.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        zzgvjVar.f18257w -= size;
        return true;
    }
}
