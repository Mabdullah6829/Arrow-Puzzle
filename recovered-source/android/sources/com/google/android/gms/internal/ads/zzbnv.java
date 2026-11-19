package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbnv extends zzbem implements zzbnw {
    public zzbnv() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzboc zzboaVar;
        if (i2 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzboaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            zzboaVar = iInterfaceQueryLocalInterface instanceof zzboc ? (zzboc) iInterfaceQueryLocalInterface : new zzboa(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        }
        zzben.m4818f(parcel);
        mo5077j1(zzboaVar);
        parcel2.writeNoException();
        return true;
    }
}
