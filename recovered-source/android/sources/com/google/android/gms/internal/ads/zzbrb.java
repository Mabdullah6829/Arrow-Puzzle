package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbrb extends zzbel implements zzbrd {
    @Override // com.google.android.gms.internal.ads.zzbrd
    /* JADX INFO: renamed from: v2 */
    public final zzbra mo5121v2(ObjectWrapper objectWrapper, zzbvf zzbvfVar, zzbqu zzbquVar) {
        zzbra zzbqyVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, objectWrapper);
        zzben.m4817e(parcelM4810u, zzbvfVar);
        parcelM4810u.writeInt(261710000);
        zzben.m4817e(parcelM4810u, zzbquVar);
        Parcel parcelM4809k0 = m4809k0(1, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbqyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbqyVar = iInterfaceQueryLocalInterface instanceof zzbra ? (zzbra) iInterfaceQueryLocalInterface : new zzbqy(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbqyVar;
    }
}
