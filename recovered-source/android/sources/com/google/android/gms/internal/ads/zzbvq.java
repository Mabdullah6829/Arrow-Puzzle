package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvq extends zzbel implements zzbvs {
    public zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    /* JADX INFO: renamed from: a */
    public final IObjectWrapper mo5205a() {
        return AbstractC1456a.m2439f(m4809k0(1, m4810u()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    /* JADX INFO: renamed from: b */
    public final boolean mo5206b() {
        Parcel parcelM4809k0 = m4809k0(2, m4810u());
        ClassLoader classLoader = zzben.f7689a;
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }
}
