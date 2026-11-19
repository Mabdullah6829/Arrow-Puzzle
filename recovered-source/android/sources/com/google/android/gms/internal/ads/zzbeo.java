package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbeo extends zzbel implements zzbeq {
    @Override // com.google.android.gms.internal.ads.zzbeq
    /* JADX INFO: renamed from: O */
    public final Bundle mo4819O(Bundle bundle) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, bundle);
        Parcel parcelM4809k0 = m4809k0(1, parcelM4810u);
        Bundle bundle2 = (Bundle) zzben.m4814b(parcelM4809k0, Bundle.CREATOR);
        parcelM4809k0.recycle();
        return bundle2;
    }
}
