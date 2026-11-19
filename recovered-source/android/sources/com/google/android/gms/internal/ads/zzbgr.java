package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgr extends zzbel implements zzbgt {
    @Override // com.google.android.gms.internal.ads.zzbgt
    /* JADX INFO: renamed from: A */
    public final void mo4871A(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        m4811u0(2, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    /* JADX INFO: renamed from: S3 */
    public final void mo4872S3(zzbgq zzbgqVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzbgqVar);
        m4811u0(1, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    /* JADX INFO: renamed from: d0 */
    public final void mo4873d0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzeVar);
        m4811u0(3, parcelM4810u);
    }
}
