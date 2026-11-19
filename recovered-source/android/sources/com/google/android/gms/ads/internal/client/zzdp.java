package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdp extends zzbem implements zzdq {
    public zzdp() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* JADX INFO: renamed from: k4 */
    public static zzdq m2914k4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof zzdq ? (zzdq) iInterfaceQueryLocalInterface : new zzdo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            zzt zztVar = (zzt) zzben.m4814b(parcel, zzt.CREATOR);
            zzben.m4818f(parcel);
            ((zzfo) this).mo2913g3(zztVar);
            parcel2.writeNoException();
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        boolean zMo2912b = ((zzfo) this).mo2912b();
        parcel2.writeNoException();
        ClassLoader classLoader = zzben.f7689a;
        parcel2.writeInt(zMo2912b ? 1 : 0);
        return true;
    }
}
