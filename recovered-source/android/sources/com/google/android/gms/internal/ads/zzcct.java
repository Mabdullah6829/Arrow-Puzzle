package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcct extends zzbel implements IInterface {
    /* JADX INFO: renamed from: D0 */
    public final IBinder m5337D0(ObjectWrapper objectWrapper, String str, zzbvf zzbvfVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, objectWrapper);
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzbvfVar);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(1, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        parcelM4809k0.recycle();
        return strongBinder;
    }
}
