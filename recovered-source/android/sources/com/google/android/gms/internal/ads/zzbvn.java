package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvn extends zzbel implements zzbvp {
    public zzbvn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: B3 */
    public final void mo5186B3(String str, String str2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        parcelM4810u.writeString(str2);
        m4811u0(9, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: C0 */
    public final void mo5187C0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzeVar);
        m4811u0(23, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: F */
    public final void mo5188F() {
        m4811u0(15, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: H1 */
    public final void mo5189H1(zzccm zzccmVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzccmVar);
        m4811u0(16, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: J0 */
    public final void mo5190J0(zzcci zzcciVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: Y */
    public final void mo5191Y() {
        m4811u0(25, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: a */
    public final void mo5192a() {
        m4811u0(1, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: a0 */
    public final void mo5193a0(int i2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: b */
    public final void mo5194b() {
        m4811u0(2, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: b1 */
    public final void mo5195b1(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzeVar);
        m4811u0(24, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: c0 */
    public final void mo5196c0(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: e0 */
    public final void mo5197e0() {
        m4811u0(11, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: f4 */
    public final void mo5198f4(int i2, String str) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        parcelM4810u.writeString(str);
        m4811u0(22, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: h1 */
    public final void mo5199h1(zzbnc zzbncVar, String str) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbncVar);
        parcelM4810u.writeString(str);
        m4811u0(10, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: j */
    public final void mo5200j() {
        m4811u0(13, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: k */
    public final void mo5201k() {
        m4811u0(20, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: p */
    public final void mo5202p(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        m4811u0(3, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    /* JADX INFO: renamed from: t2 */
    public final void mo5203t2() {
        m4811u0(18, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzh() {
        m4811u0(4, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzi() {
        m4811u0(5, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzj() {
        m4811u0(6, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzk() {
        m4811u0(8, m4810u());
    }
}
