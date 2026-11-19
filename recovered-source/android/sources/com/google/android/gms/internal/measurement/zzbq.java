package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbq extends zzbl implements zzbs {
    @Override // com.google.android.gms.internal.measurement.zzbs
    /* JADX INFO: renamed from: O */
    public final Bundle mo9822O(Bundle bundle) {
        Parcel parcelZza = zza();
        zzbn.m9819b(parcelZza, bundle);
        Parcel parcelZzP = zzP(1, parcelZza);
        Bundle bundle2 = (Bundle) zzbn.m9818a(parcelZzP, Bundle.CREATOR);
        parcelZzP.recycle();
        return bundle2;
    }
}
