package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbvf;

/* JADX INFO: loaded from: classes.dex */
public final class zzcf extends zzbel implements zzch {
    public zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    /* JADX INFO: renamed from: X */
    public final void mo2887X(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        m4811u0(18, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    /* JADX INFO: renamed from: x2 */
    public final void mo2888x2(zzbvf zzbvfVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbvfVar);
        m4811u0(8, parcelM4810u);
    }
}
