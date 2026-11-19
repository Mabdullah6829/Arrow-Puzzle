package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbmq extends zzbel implements zzbms {
    public zzbmq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    /* JADX INFO: renamed from: q3 */
    public final IBinder mo5067q3(ObjectWrapper objectWrapper, ObjectWrapper objectWrapper2, ObjectWrapper objectWrapper3) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, objectWrapper);
        zzben.m4817e(parcelM4810u, objectWrapper2);
        zzben.m4817e(parcelM4810u, objectWrapper3);
        parcelM4810u.writeInt(261710000);
        Parcel parcelM4809k0 = m4809k0(1, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        parcelM4809k0.recycle();
        return strongBinder;
    }
}
