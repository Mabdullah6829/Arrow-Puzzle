package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd extends zza implements zzf {
    @Override // com.google.android.gms.internal.ads_identifier.zzf
    /* JADX INFO: renamed from: a */
    public final boolean mo9070a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i2 = zzc.f21526a;
        parcelObtain.writeInt(1);
        Parcel parcelM9069u = m9069u(2, parcelObtain);
        boolean z = parcelM9069u.readInt() != 0;
        parcelM9069u.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    /* JADX INFO: renamed from: d */
    public final boolean mo9071d() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelM9069u = m9069u(6, parcelObtain);
        int i2 = zzc.f21526a;
        boolean z = parcelM9069u.readInt() != 0;
        parcelM9069u.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelM9069u = m9069u(1, parcelObtain);
        String string = parcelM9069u.readString();
        parcelM9069u.recycle();
        return string;
    }
}
