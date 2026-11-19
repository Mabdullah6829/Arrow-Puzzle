package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzaek implements Iterator {

    /* JADX INFO: renamed from: s */
    public final Iterator f22054s;

    public zzaek(Iterator it) {
        this.f22054s = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22054s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f22054s.next();
        return entry.getValue() instanceof zzael ? new zzaej(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f22054s.remove();
    }
}
