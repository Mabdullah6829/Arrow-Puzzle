package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgd extends com.google.android.gms.internal.measurement.zzbm implements zzge {
    public zzgd() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.m9821d(parcel);
        zze(arrayListCreateTypedArrayList);
        return true;
    }
}
