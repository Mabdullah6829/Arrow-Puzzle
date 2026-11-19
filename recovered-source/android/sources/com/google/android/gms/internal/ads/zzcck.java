package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcck extends zzbel implements zzccm {
    public zzcck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    /* JADX INFO: renamed from: a */
    public final String mo5330a() {
        Parcel parcelM4809k0 = m4809k0(1, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    /* JADX INFO: renamed from: b */
    public final int mo5331b() {
        Parcel parcelM4809k0 = m4809k0(2, m4810u());
        int i2 = parcelM4809k0.readInt();
        parcelM4809k0.recycle();
        return i2;
    }
}
