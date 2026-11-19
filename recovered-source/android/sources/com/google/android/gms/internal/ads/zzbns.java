package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbns extends zzbem implements zzbnt {
    public zzbns() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        com.google.android.gms.ads.internal.client.zzbu zzbsVar;
        if (i2 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbu ? (com.google.android.gms.ads.internal.client.zzbu) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbs(strongBinder);
        }
        ((zzbok) this).mo5076B0(zzbsVar, AbstractC1456a.m2440g(parcel, parcel));
        parcel2.writeNoException();
        return true;
    }
}
