package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbna extends zzbel implements zzbnc {
    public zzbna(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    /* JADX INFO: renamed from: B2 */
    public final IObjectWrapper mo5069B2() {
        return AbstractC1456a.m2439f(m4809k0(9, m4810u()));
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    /* JADX INFO: renamed from: N */
    public final boolean mo5070N(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        Parcel parcelM4809k0 = m4809k0(10, parcelM4810u);
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    /* JADX INFO: renamed from: T */
    public final boolean mo5071T(IObjectWrapper iObjectWrapper) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        Parcel parcelM4809k0 = m4809k0(17, parcelM4810u);
        boolean z = parcelM4809k0.readInt() != 0;
        parcelM4809k0.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final String zzh() {
        Parcel parcelM4809k0 = m4809k0(4, m4810u());
        String string = parcelM4809k0.readString();
        parcelM4809k0.recycle();
        return string;
    }
}
