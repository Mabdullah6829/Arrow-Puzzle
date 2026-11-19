package com.google.android.gms.internal.ads;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6452k;
import p080q0.InterfaceC6520a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzihv implements Iterator, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Iterator f19928s;

    public zzihv(Iterator delegate) {
        AbstractC6452k.m12181e(delegate, "delegate");
        this.f19928s = delegate;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19928s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f19928s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
