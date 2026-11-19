package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf extends zzbel implements zzbh {
    public zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: A */
    public final void mo2818A(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        m4811u0(2, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: a */
    public final void mo2819a() {
        m4811u0(3, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: b */
    public final void mo2820b() {
        m4811u0(4, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: c */
    public final void mo2821c() {
        m4811u0(5, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    /* JADX INFO: renamed from: d0 */
    public final void mo2822d0(zze zzeVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzeVar);
        m4811u0(8, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() {
        m4811u0(1, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        m4811u0(6, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        m4811u0(9, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        m4811u0(7, m4810u());
    }
}
