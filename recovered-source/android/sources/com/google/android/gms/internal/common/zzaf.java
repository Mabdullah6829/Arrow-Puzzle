package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
final class zzaf extends zzah {

    /* JADX INFO: renamed from: u */
    public final transient zzah f21574u;

    public zzaf(zzah zzahVar) {
        this.f21574u = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f21574u.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzah zzahVar = this.f21574u;
        zzr.m9108a(i2, zzahVar.size());
        return zzahVar.get((zzahVar.size() - 1) - i2);
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        zzah zzahVar = this.f21574u;
        int iLastIndexOf = zzahVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (zzahVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: j */
    public final boolean mo9091j() {
        return this.f21574u.mo9091j();
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(Object obj) {
        zzah zzahVar = this.f21574u;
        int iIndexOf = zzahVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (zzahVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah
    /* JADX INFO: renamed from: m */
    public final zzah mo9096m() {
        return this.f21574u;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final zzah subList(int i2, int i3) {
        zzah zzahVar = this.f21574u;
        zzr.m9110c(i2, i3, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i3, zzahVar.size() - i2).mo9096m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21574u.size();
    }
}
