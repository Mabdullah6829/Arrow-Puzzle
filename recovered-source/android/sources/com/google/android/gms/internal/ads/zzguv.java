package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzguv implements Iterator {

    /* JADX INFO: renamed from: s */
    public final Iterator f18215s;

    /* JADX INFO: renamed from: t */
    public Collection f18216t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzguw f18217u;

    public zzguv(zzguw zzguwVar) {
        Objects.requireNonNull(zzguwVar);
        this.f18217u = zzguwVar;
        this.f18215s = zzguwVar.f18218v.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18215s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f18215s.next();
        this.f18216t = (Collection) entry.getValue();
        return this.f18217u.m7159c(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgtr.m7134g("no calls to next() since the last call to remove()", this.f18216t != null);
        this.f18215s.remove();
        this.f18217u.f18219w.f18257w -= this.f18216t.size();
        this.f18216t.clear();
        this.f18216t = null;
    }
}
