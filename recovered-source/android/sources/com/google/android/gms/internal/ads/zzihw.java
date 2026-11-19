package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import p080q0.InterfaceC6520a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzihw implements Iterator, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Iterator f19929s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Iterator f19930t;

    public zzihw(Iterator it) {
        this.f19930t = it;
        this.f19929s = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19929s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzihy((Map.Entry) this.f19930t.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
