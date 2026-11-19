package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzife implements Iterator {

    /* JADX INFO: renamed from: s */
    public final Iterator f19797s;

    public zzife(Iterator it) {
        this.f19797s = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19797s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f19797s.next();
        return entry.getValue() instanceof zziff ? new zzifd(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f19797s.remove();
    }
}
