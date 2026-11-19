package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzkn extends zzbm implements zzko {
    public zzkn() {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 2) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        zzbn.m9821d(parcel);
        zzka zzkaVar = (zzka) this;
        zzkaVar.f22570s.m3479a(new zzjz(zzkaVar, bArrCreateByteArray));
        return true;
    }
}
