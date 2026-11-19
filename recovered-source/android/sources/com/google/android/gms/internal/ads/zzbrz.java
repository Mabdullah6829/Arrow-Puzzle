package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbrz extends zzbem implements zzbsa {
    public zzbrz() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 2) {
            ((zzebv) this).m6147a();
        } else {
            if (i2 != 3) {
                return false;
            }
            String string = parcel.readString();
            zzben.m4818f(parcel);
            ((zzebv) this).m6148j0(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
