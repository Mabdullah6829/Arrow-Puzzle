package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsp extends zzbel implements zzbsr {
    @Override // com.google.android.gms.internal.ads.zzbsr
    /* JADX INFO: renamed from: E2 */
    public final void mo5124E2(zzbsl zzbslVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbslVar);
        m4811u0(1, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    /* JADX INFO: renamed from: o */
    public final void mo5125o(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        m4811u0(2, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    /* JADX INFO: renamed from: q */
    public final void mo5126q(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzeVar);
        m4811u0(3, parcelM4810u);
    }
}
