package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdf extends zzbem implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* JADX INFO: renamed from: k4 */
    public static zzdg m2909k4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface : new zzde(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(((zzew) this).f3172s);
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(((zzew) this).f3173t);
        return true;
    }
}
