package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgws extends zzgwt {

    /* JADX INFO: renamed from: u */
    public final transient int f18300u;

    /* JADX INFO: renamed from: v */
    public final transient int f18301v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzgwt f18302w;

    public zzgws(zzgwt zzgwtVar, int i2, int i3) {
        this.f18302w = zzgwtVar;
        this.f18300u = i2;
        this.f18301v = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: b */
    public final Object[] mo7208b() {
        return this.f18302w.mo7208b();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: d */
    public final int mo7209d() {
        return this.f18302w.mo7209d() + this.f18300u;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: g */
    public final int mo7210g() {
        return this.f18302w.mo7209d() + this.f18300u + this.f18301v;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzgtr.m7136i(i2, this.f18301v);
        return this.f18302w.get(i2 + this.f18300u);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: j */
    public final boolean mo7212j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwt, java.util.List
    /* JADX INFO: renamed from: m */
    public final zzgwt subList(int i2, int i3) {
        zzgtr.m7138k(i2, i3, this.f18301v);
        int i4 = this.f18300u;
        return this.f18302w.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18301v;
    }
}
