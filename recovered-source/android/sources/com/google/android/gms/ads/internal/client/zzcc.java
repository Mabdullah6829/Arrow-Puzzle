package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public final class zzcc extends zzbel implements zzce {
    @Override // com.google.android.gms.ads.internal.client.zzce
    /* JADX INFO: renamed from: Y1 */
    public final void mo2884Y1(String str, zze zzeVar) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        zzben.m4815c(parcelM4810u, zzeVar);
        m4811u0(3, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    /* JADX INFO: renamed from: a4 */
    public final void mo2885a4(String str, zzdx zzdxVar) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzdxVar);
        m4811u0(1, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    /* JADX INFO: renamed from: j0 */
    public final void mo2886j0(String str) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        m4811u0(2, parcelM4810u);
    }
}
