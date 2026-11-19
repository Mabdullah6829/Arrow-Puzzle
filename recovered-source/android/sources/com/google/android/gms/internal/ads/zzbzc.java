package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbzc extends zzbel implements zzbze {
    @Override // com.google.android.gms.internal.ads.zzbze
    /* JADX INFO: renamed from: m0 */
    public final zzbzb mo5278m0(ObjectWrapper objectWrapper, zzbvf zzbvfVar) {
        zzbzb zzbyzVar;
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, objectWrapper);
        zzben.m4817e(parcelM4810u, zzbvfVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(1, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzbyzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbyzVar = iInterfaceQueryLocalInterface instanceof zzbzb ? (zzbzb) iInterfaceQueryLocalInterface : new zzbyz(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzbyzVar;
    }
}
