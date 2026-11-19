package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public final class zzdo extends zzbel implements zzdq {
    public zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    /* JADX INFO: renamed from: b */
    public final boolean mo2912b() {
        Parcel parcelM4809k0 = m4809k0(2, m4810u());
        ClassLoader classLoader = zzben.f7689a;
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    /* JADX INFO: renamed from: g3 */
    public final void mo2913g3(zzt zztVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zztVar);
        m4811u0(1, parcelM4810u);
    }
}
