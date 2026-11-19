package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccq extends zzbel implements zzccs {
    @Override // com.google.android.gms.internal.ads.zzccs
    /* JADX INFO: renamed from: a */
    public final void mo5332a() {
        m4811u0(1, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    /* JADX INFO: renamed from: b */
    public final void mo5333b() {
        m4811u0(2, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    /* JADX INFO: renamed from: b3 */
    public final void mo5334b3(zzccm zzccmVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzccmVar);
        m4811u0(3, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    /* JADX INFO: renamed from: l */
    public final void mo5335l(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        m4811u0(4, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    /* JADX INFO: renamed from: w3 */
    public final void mo5336w3(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzeVar);
        m4811u0(5, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzj() {
        m4811u0(6, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk() {
        m4811u0(7, m4810u());
    }
}
