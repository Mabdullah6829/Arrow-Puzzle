package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcd extends zzbem implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzdx zzdvVar;
        if (i2 == 1) {
            String string = parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
                zzdvVar = iInterfaceQueryLocalInterface instanceof zzdx ? (zzdx) iInterfaceQueryLocalInterface : new zzdv(strongBinder);
            } else {
                zzdvVar = null;
            }
            zzben.m4818f(parcel);
            mo2885a4(string, zzdvVar);
            throw null;
        }
        if (i2 == 2) {
            String string2 = parcel.readString();
            zzben.m4818f(parcel);
            mo2886j0(string2);
            throw null;
        }
        if (i2 != 3) {
            return false;
        }
        String string3 = parcel.readString();
        zze zzeVar = (zze) zzben.m4814b(parcel, zze.CREATOR);
        zzben.m4818f(parcel);
        mo2884Y1(string3, zzeVar);
        throw null;
    }
}
