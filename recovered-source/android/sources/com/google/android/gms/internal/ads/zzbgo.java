package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgo extends zzbel implements zzbgq {
    @Override // com.google.android.gms.internal.ads.zzbgq
    /* JADX INFO: renamed from: c */
    public final com.google.android.gms.ads.internal.client.zzdx mo4878c() {
        Parcel parcelM4809k0 = m4809k0(5, m4810u());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarM2920k4 = com.google.android.gms.ads.internal.client.zzdw.m2920k4(parcelM4809k0.readStrongBinder());
        parcelM4809k0.recycle();
        return zzdxVarM2920k4;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    /* JADX INFO: renamed from: i4 */
    public final void mo4879i4(IObjectWrapper iObjectWrapper, zzbgx zzbgxVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4817e(parcelM4810u, zzbgxVar);
        m4811u0(4, parcelM4810u);
    }
}
