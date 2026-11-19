package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbnl extends zzbem implements zzbnm {
    public zzbnl() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzbnc zzbnaVar;
        if (i2 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbnaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbnaVar = iInterfaceQueryLocalInterface instanceof zzbnc ? (zzbnc) iInterfaceQueryLocalInterface : new zzbna(strongBinder);
        }
        String string = parcel.readString();
        zzben.m4818f(parcel);
        mo5074y1(zzbnaVar, string);
        parcel2.writeNoException();
        return true;
    }
}
