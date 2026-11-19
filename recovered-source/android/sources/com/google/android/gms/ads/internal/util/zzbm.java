package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public final class zzbm extends zzbel implements zzbo {
    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zze(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        parcelM4810u.writeString(str);
        parcelM4810u.writeString(str2);
        Parcel parcelM4809k0 = m4809k0(1, parcelM4810u);
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final void zzf(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        m4811u0(2, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzaVar);
        Parcel parcelM4809k0 = m4809k0(3, parcelM4810u);
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }
}
