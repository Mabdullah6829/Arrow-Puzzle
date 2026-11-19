package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqr extends zzbel implements zzgqt {
    @Override // com.google.android.gms.internal.ads.zzgqt
    /* JADX INFO: renamed from: D2 */
    public final void mo7068D2(Bundle bundle, zzgqv zzgqvVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, bundle);
        zzben.m4817e(parcelM4810u, zzgqvVar);
        m4812x0(3, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    /* JADX INFO: renamed from: K0 */
    public final void mo7069K0(String str, Bundle bundle, zzgqv zzgqvVar) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        zzben.m4815c(parcelM4810u, bundle);
        zzben.m4817e(parcelM4810u, zzgqvVar);
        m4812x0(1, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    /* JADX INFO: renamed from: d4 */
    public final void mo7070d4(Bundle bundle, zzgqv zzgqvVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, bundle);
        zzben.m4817e(parcelM4810u, zzgqvVar);
        m4812x0(2, parcelM4810u);
    }
}
