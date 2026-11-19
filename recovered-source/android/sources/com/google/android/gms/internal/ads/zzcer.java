package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcer extends zzbel implements zzcet {
    public zzcer(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    /* JADX INFO: renamed from: E0 */
    public final void mo3322E0(IObjectWrapper iObjectWrapper, zzcex zzcexVar, zzceq zzceqVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4815c(parcelM4810u, zzcexVar);
        zzben.m4817e(parcelM4810u, zzceqVar);
        m4811u0(1, parcelM4810u);
    }
}
