package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbzj extends zzbel implements zzbzl {
    public zzbzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    /* JADX INFO: renamed from: F2 */
    public final IBinder mo5279F2(ObjectWrapper objectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, objectWrapper);
        Parcel parcelM4809k0 = m4809k0(1, parcelM4810u);
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        parcelM4809k0.recycle();
        return strongBinder;
    }
}
