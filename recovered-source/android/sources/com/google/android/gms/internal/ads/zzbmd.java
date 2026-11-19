package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbmd extends zzbem implements zzbme {
    public zzbmd() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* JADX INFO: renamed from: k4 */
    public static zzbme m5064k4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof zzbme ? (zzbme) iInterfaceQueryLocalInterface : new zzbmc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((zzblt) this).f9142s);
            return true;
        }
        if (i2 != 3) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeList(((zzblt) this).f9144u);
        return true;
    }
}
