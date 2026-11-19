package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
final class zzag extends zzah {

    /* JADX INFO: renamed from: u */
    public final transient int f21575u;

    /* JADX INFO: renamed from: v */
    public final transient int f21576v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzah f21577w;

    public zzag(zzah zzahVar, int i2, int i3) {
        this.f21577w = zzahVar;
        this.f21575u = i2;
        this.f21576v = i3;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: b */
    public final Object[] mo9087b() {
        return this.f21577w.mo9087b();
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: d */
    public final int mo9088d() {
        return this.f21577w.mo9088d() + this.f21575u;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: g */
    public final int mo9089g() {
        return this.f21577w.mo9088d() + this.f21575u + this.f21576v;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzr.m9108a(i2, this.f21576v);
        return this.f21577w.get(i2 + this.f21575u);
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: j */
    public final boolean mo9091j() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: n */
    public final zzah subList(int i2, int i3) {
        zzr.m9110c(i2, i3, this.f21576v);
        int i4 = this.f21575u;
        return this.f21577w.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21576v;
    }
}
