package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcep extends zzbem implements zzceq {
    public zzcep() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            parcel.readString();
            parcel.readString();
            zzben.m4818f(parcel);
        } else if (i2 == 2) {
            String string = parcel.readString();
            zzben.m4818f(parcel);
            ((zzbzy) this).mo5282m(string);
        } else {
            if (i2 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
            zzben.m4818f(parcel);
            ((zzbzy) this).mo5283p1(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
