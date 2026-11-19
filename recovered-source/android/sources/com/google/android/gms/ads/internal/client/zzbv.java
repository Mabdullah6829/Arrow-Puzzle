package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbvj;

/* JADX INFO: loaded from: classes.dex */
public final class zzbv extends zzbel implements IInterface {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* JADX INFO: renamed from: D0 */
    public final IBinder m2880D0(ObjectWrapper objectWrapper, zzr zzrVar, String str, zzbvj zzbvjVar, int i2) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, objectWrapper);
        zzben.m4815c(parcelM4810u, zzrVar);
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, zzbvjVar);
        parcelM4810u.writeInt(261710000);
        parcelM4810u.writeInt(i2);
        Parcel parcelM4809k0 = m4809k0(2, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        parcelM4809k0.recycle();
        return strongBinder;
    }
}
