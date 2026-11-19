package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvj;

/* JADX INFO: loaded from: classes.dex */
public final class zzct extends zzbel implements zzcv {
    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzbvj getAdapterCreator() {
        Parcel parcelM4809k0 = m4809k0(2, m4810u());
        zzbvj zzbvjVarM5157k4 = zzbvi.m5157k4(parcelM4809k0.readStrongBinder());
        parcelM4809k0.recycle();
        return zzbvjVarM5157k4;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzez getLiteSdkVersion() {
        Parcel parcelM4809k0 = m4809k0(1, m4810u());
        zzez zzezVar = (zzez) zzben.m4814b(parcelM4809k0, zzez.CREATOR);
        parcelM4809k0.recycle();
        return zzezVar;
    }
}
