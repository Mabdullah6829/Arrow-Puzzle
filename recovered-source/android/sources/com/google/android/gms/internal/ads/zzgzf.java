package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgzf implements Iterator {

    /* JADX INFO: renamed from: s */
    public final Iterator f18387s;

    public zzgzf(Iterator it) {
        it.getClass();
        this.f18387s = it;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo7249a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18387s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo7249a(this.f18387s.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f18387s.remove();
    }
}
