package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzceu extends zzbel implements zzcew {
    @Override // com.google.android.gms.internal.ads.zzcew
    /* JADX INFO: renamed from: m0 */
    public final zzcet mo5377m0(ObjectWrapper objectWrapper, zzbvf zzbvfVar) {
        zzcet zzcerVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, objectWrapper);
        zzben.m4817e(parcelM4810u, zzbvfVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(2, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzcerVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcerVar = iInterfaceQueryLocalInterface instanceof zzcet ? (zzcet) iInterfaceQueryLocalInterface : new zzcer(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzcerVar;
    }
}
