package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyr extends zzgxd {

    /* JADX INFO: renamed from: v */
    public final transient zzgww f18362v;

    /* JADX INFO: renamed from: w */
    public final transient zzgwt f18363w;

    public zzgyr(zzgww zzgwwVar, zzgwt zzgwtVar) {
        this.f18362v = zzgwwVar;
        this.f18363w = zzgwtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: a */
    public final zzgzh iterator() {
        return this.f18363w.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f18362v.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: h */
    public final zzgwt mo7211h() {
        return this.f18363w;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f18363w.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: j */
    public final boolean mo7212j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: k */
    public final int mo7213k(int i2, Object[] objArr) {
        return this.f18363w.mo7213k(i2, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18362v.size();
    }
}
