package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzccr extends zzbem implements zzccs {
    public zzccr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzccm zzcckVar;
        switch (i2) {
            case 1:
                mo5332a();
                break;
            case 2:
                mo5333b();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzcckVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzcckVar = iInterfaceQueryLocalInterface instanceof zzccm ? (zzccm) iInterfaceQueryLocalInterface : new zzcck(strongBinder);
                }
                zzben.m4818f(parcel);
                mo5334b3(zzcckVar);
                break;
            case 4:
                int i3 = parcel.readInt();
                zzben.m4818f(parcel);
                mo5335l(i3);
                break;
            case 5:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzben.m4818f(parcel);
                mo5336w3(zzeVar);
                break;
            case 6:
                zzj();
                break;
            case 7:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
