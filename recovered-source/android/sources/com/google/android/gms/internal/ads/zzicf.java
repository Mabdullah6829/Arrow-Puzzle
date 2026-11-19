package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzicf implements Iterator {

    /* JADX INFO: renamed from: s */
    public zzicg f19644s;

    /* JADX INFO: renamed from: t */
    public zzicg f19645t;

    /* JADX INFO: renamed from: u */
    public int f19646u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzich f19647v;

    public zzicf(zzich zzichVar) {
        Objects.requireNonNull(zzichVar);
        this.f19647v = zzichVar;
        this.f19644s = zzichVar.f19663x.f19652v;
        this.f19645t = null;
        this.f19646u = zzichVar.f19662w;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzicg next() {
        zzicg zzicgVar = this.f19644s;
        zzich zzichVar = this.f19647v;
        if (zzicgVar == zzichVar.f19663x) {
            throw new NoSuchElementException();
        }
        if (zzichVar.f19662w != this.f19646u) {
            throw new ConcurrentModificationException();
        }
        this.f19644s = zzicgVar.f19652v;
        this.f19645t = zzicgVar;
        return zzicgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19644s != this.f19647v.f19663x;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzicg zzicgVar = this.f19645t;
        if (zzicgVar == null) {
            throw new IllegalStateException();
        }
        zzich zzichVar = this.f19647v;
        zzichVar.m8065b(zzicgVar, true);
        this.f19645t = null;
        this.f19646u = zzichVar.f19662w;
    }
}
