package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgvx extends AbstractSet {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzgwa f18274s;

    public /* synthetic */ zzgvx(zzgwa zzgwaVar) {
        this.f18274s = zzgwaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f18274s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f18274s.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgwa zzgwaVar = this.f18274s;
        Map mapM7183e = zzgwaVar.m7183e();
        return mapM7183e != null ? mapM7183e.keySet().iterator() : new zzgvs(zzgwaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzgwa zzgwaVar = this.f18274s;
        Map mapM7183e = zzgwaVar.m7183e();
        if (mapM7183e != null) {
            return mapM7183e.keySet().remove(obj);
        }
        return zzgwaVar.m7188j(obj) != zzgwa.f18279B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18274s.size();
    }
}
