package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccn extends zzbel implements zzccp {
    public zzccn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: S1 */
    public final void mo2964S1(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccw zzccwVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzmVar);
        zzben.m4817e(parcelM4810u, zzccwVar);
        m4811u0(1, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: e */
    public final com.google.android.gms.ads.internal.client.zzdx mo2967e() {
        Parcel parcelM4809k0 = m4809k0(12, m4810u());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarM2920k4 = com.google.android.gms.ads.internal.client.zzdw.m2920k4(parcelM4809k0.readStrongBinder());
        parcelM4809k0.recycle();
        return zzdxVarM2920k4;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: n2 */
    public final void mo2971n2(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(5, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: t1 */
    public final void mo2973t1(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccw zzccwVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzmVar);
        zzben.m4817e(parcelM4810u, zzccwVar);
        m4811u0(14, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    /* JADX INFO: renamed from: u1 */
    public final void mo2974u1(zzccs zzccsVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzccsVar);
        m4811u0(2, parcelM4810u);
    }
}
