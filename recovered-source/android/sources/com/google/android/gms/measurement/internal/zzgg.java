package com.google.android.gms.measurement.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgg extends com.google.android.gms.internal.measurement.zzbm implements zzgh {
    public zzgg() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) com.google.android.gms.internal.measurement.zzbn.m9818a(parcel, zzoq.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.m9821d(parcel);
        zze(zzoqVar);
        return true;
    }
}
