package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwu extends zzbel implements zzbww {
    public zzbwu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    /* JADX INFO: renamed from: q */
    public final void mo5235q(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzeVar);
        m4811u0(3, parcelM4810u);
    }
}
