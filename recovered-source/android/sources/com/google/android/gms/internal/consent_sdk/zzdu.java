package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
final class zzdu extends zzdv {

    /* JADX INFO: renamed from: u */
    public final transient int f21634u;

    /* JADX INFO: renamed from: v */
    public final transient int f21635v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzdv f21636w;

    public zzdu(zzdv zzdvVar, int i2, int i3) {
        this.f21636w = zzdvVar;
        this.f21634u = i2;
        this.f21635v = i3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: b */
    public final int mo9133b() {
        return this.f21636w.mo9134d() + this.f21634u + this.f21635v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: d */
    public final int mo9134d() {
        return this.f21636w.mo9134d() + this.f21634u;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzdj.m9123a(i2, this.f21635v);
        return this.f21636w.get(i2 + this.f21634u);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: h */
    public final Object[] mo9136h() {
        return this.f21636w.mo9136h();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdv, java.util.List
    /* JADX INFO: renamed from: j */
    public final zzdv subList(int i2, int i3) {
        zzdj.m9125c(i2, i3, this.f21635v);
        int i4 = this.f21634u;
        return this.f21636w.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21635v;
    }
}
