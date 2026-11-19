package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzhno implements Iterator {

    /* JADX INFO: renamed from: s */
    public final Iterator f19015s;

    /* JADX INFO: renamed from: t */
    public final Iterator f19016t;

    public /* synthetic */ zzhno(Iterator it, Iterator it2) {
        this.f19015s = it;
        this.f19016t = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19015s.hasNext() || this.f19016t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f19015s;
        return it.hasNext() ? it.next() : this.f19016t.next();
    }
}
