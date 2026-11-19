package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcca extends zzbel implements zzccc {
    public zzcca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    /* JADX INFO: renamed from: E */
    public final void mo5312E(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        m4811u0(7, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    /* JADX INFO: renamed from: a */
    public final void mo5313a() {
        m4811u0(1, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    /* JADX INFO: renamed from: b */
    public final void mo5314b() {
        m4811u0(2, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    /* JADX INFO: renamed from: c */
    public final void mo5315c() {
        m4811u0(3, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    /* JADX INFO: renamed from: f1 */
    public final void mo5316f1(zzcbt zzcbtVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzcbtVar);
        m4811u0(5, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzh() {
        m4811u0(4, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzj() {
        m4811u0(6, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzl() {
        m4811u0(8, m4810u());
    }
}
