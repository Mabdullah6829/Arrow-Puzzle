package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzgux implements Iterator {

    /* JADX INFO: renamed from: s */
    public final Iterator f18220s;

    /* JADX INFO: renamed from: t */
    public Collection f18221t = null;

    /* JADX INFO: renamed from: u */
    public Iterator f18222u = zzgxk.f18331s;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgvj f18223v;

    public zzgux(zzgvj zzgvjVar) {
        this.f18223v = zzgvjVar;
        this.f18220s = zzgvjVar.f18256v.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18220s.hasNext() || this.f18222u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f18222u.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f18220s.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f18221t = collection;
            this.f18222u = collection.iterator();
        }
        return this.f18222u.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f18222u.remove();
        Collection collection = this.f18221t;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f18220s.remove();
        }
        this.f18223v.f18257w--;
    }
}
