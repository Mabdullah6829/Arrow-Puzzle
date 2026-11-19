package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcx extends zzbm implements zzcy {
    public zzcx() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) zzbn.m9818a(parcel, Bundle.CREATOR);
            long j2 = parcel.readLong();
            zzbn.m9821d(parcel);
            mo9835y0(string, string2, bundle, j2);
            parcel2.writeNoException();
        } else {
            if (i2 != 2) {
                return false;
            }
            int iMo9834b = mo9834b();
            parcel2.writeNoException();
            parcel2.writeInt(iMo9834b);
        }
        return true;
    }
}
