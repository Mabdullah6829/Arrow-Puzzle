package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcr extends zzbm implements zzcs {
    public zzcr() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
        zzbn.m9821d(parcel);
        ((zzcm) this).zzb(bundle);
        parcel2.writeNoException();
        return true;
    }
}
