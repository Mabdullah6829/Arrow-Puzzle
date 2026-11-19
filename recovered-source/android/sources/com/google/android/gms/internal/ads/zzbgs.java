package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbgs extends zzbem implements zzbgt {
    public zzbgs() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzbgq zzbgoVar;
        if (i2 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbgoVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbgoVar = iInterfaceQueryLocalInterface instanceof zzbgq ? (zzbgq) iInterfaceQueryLocalInterface : new zzbgo(strongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
            }
            zzben.m4818f(parcel);
            mo4872S3(zzbgoVar);
        } else if (i2 == 2) {
            int i3 = parcel.readInt();
            zzben.m4818f(parcel);
            mo4871A(i3);
        } else {
            if (i2 != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzben.m4818f(parcel);
            mo4873d0(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
