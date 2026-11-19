package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbmg extends zzbel implements zzbmi {
    public zzbmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    /* JADX INFO: renamed from: c */
    public final IObjectWrapper mo5065c() {
        return AbstractC1456a.m2439f(m4809k0(4, m4810u()));
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final com.google.android.gms.ads.internal.client.zzea zzj() {
        Parcel parcelM4809k0 = m4809k0(7, m4810u());
        com.google.android.gms.ads.internal.client.zzea zzeaVarM2924k4 = com.google.android.gms.ads.internal.client.zzdz.m2924k4(parcelM4809k0.readStrongBinder());
        parcelM4809k0.recycle();
        return zzeaVarM2924k4;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final boolean zzk() {
        Parcel parcelM4809k0 = m4809k0(8, m4810u());
        ClassLoader classLoader = zzben.f7689a;
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final boolean zzl() {
        Parcel parcelM4809k0 = m4809k0(10, m4810u());
        ClassLoader classLoader = zzben.f7689a;
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }
}
