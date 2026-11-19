package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzice extends AbstractSet {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzich f19643s;

    public zzice(zzich zzichVar) {
        this.f19643s = zzichVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19643s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19643s.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzicd(this.f19643s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzich zzichVar = this.f19643s;
        zzichVar.getClass();
        zzicg zzicgVarM8064a = null;
        if (obj != null) {
            try {
                zzicgVarM8064a = zzichVar.m8064a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (zzicgVarM8064a != null) {
            zzichVar.m8065b(zzicgVarM8064a, true);
        }
        return zzicgVarM8064a != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19643s.f19661v;
    }
}
