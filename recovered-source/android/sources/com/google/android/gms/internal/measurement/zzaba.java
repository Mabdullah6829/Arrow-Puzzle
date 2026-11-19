package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzaba implements Iterator {

    /* JADX INFO: renamed from: s */
    public int f21891s = 0;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzabb f21892t;

    public zzaba(zzabb zzabbVar) {
        this.f21892t = zzabbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f21891s;
        zzabb zzabbVar = this.f21892t;
        return i2 < zzabbVar.m9321b() - zzabbVar.m9320a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f21891s;
        zzabb zzabbVar = this.f21892t;
        if (i2 >= zzabbVar.m9321b() - zzabbVar.m9320a()) {
            throw new NoSuchElementException();
        }
        zzabc zzabcVar = zzabbVar.f21894t;
        Object obj = zzabcVar.f21896s[zzabbVar.m9320a() + i2];
        this.f21891s = i2 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
