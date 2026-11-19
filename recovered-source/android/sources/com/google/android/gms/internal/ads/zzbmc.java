package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbmc extends zzbel implements zzbme {
    public zzbmc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final String zzb() {
        Parcel parcelM4809k0 = m4809k0(2, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final ArrayList zzc() {
        Parcel parcelM4809k0 = m4809k0(3, m4810u());
        ArrayList arrayList = parcelM4809k0.readArrayList(zzben.f7689a);
        parcelM4809k0.recycle();
        return arrayList;
    }
}
