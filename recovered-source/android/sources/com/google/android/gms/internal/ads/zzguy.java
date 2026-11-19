package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzguy implements Iterator {

    /* JADX INFO: renamed from: s */
    public Map.Entry f18224s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Iterator f18225t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzguz f18226u;

    public zzguy(zzguz zzguzVar, Iterator it) {
        this.f18225t = it;
        this.f18226u = zzguzVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18225t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f18225t.next();
        this.f18224s = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgtr.m7134g("no calls to next() since the last call to remove()", this.f18224s != null);
        Collection collection = (Collection) this.f18224s.getValue();
        this.f18225t.remove();
        this.f18226u.f18227t.f18257w -= collection.size();
        collection.clear();
        this.f18224s = null;
    }
}
