package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzceo extends zzbel implements zzceq {
    @Override // com.google.android.gms.internal.ads.zzceq
    /* JADX INFO: renamed from: m */
    public final void mo5282m(String str) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        m4811u0(2, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    /* JADX INFO: renamed from: p1 */
    public final void mo5283p1(String str, String str2, Bundle bundle) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        parcelM4810u.writeString(str2);
        zzben.m4815c(parcelM4810u, bundle);
        m4811u0(3, parcelM4810u);
    }
}
