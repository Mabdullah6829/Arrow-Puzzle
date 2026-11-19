package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgvz extends AbstractCollection {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzgwa f18278s;

    public /* synthetic */ zzgvz(zzgwa zzgwaVar) {
        this.f18278s = zzgwaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f18278s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzgwa zzgwaVar = this.f18278s;
        Map mapM7183e = zzgwaVar.m7183e();
        return mapM7183e != null ? mapM7183e.values().iterator() : new zzgvu(zzgwaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f18278s.size();
    }
}
