package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcba extends zzbem implements zzcbb {
    public zzcba() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzben.m4814b(parcel, ParcelFileDescriptor.CREATOR);
            zzben.m4818f(parcel);
            mo5301Q2(parcelFileDescriptor);
        } else if (i2 == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzben.m4814b(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzben.m4818f(parcel);
            mo5302m1(zzbaVar);
        } else {
            if (i2 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzben.m4814b(parcel, ParcelFileDescriptor.CREATOR);
            zzcbk zzcbkVar = (zzcbk) zzben.m4814b(parcel, zzcbk.CREATOR);
            zzben.m4818f(parcel);
            mo5300H3(parcelFileDescriptor2, zzcbkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
