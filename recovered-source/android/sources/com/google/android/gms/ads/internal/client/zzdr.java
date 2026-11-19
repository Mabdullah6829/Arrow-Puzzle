package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public final class zzdr extends zzbel implements zzdt {
    public zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    /* JADX INFO: renamed from: N2 */
    public final void mo2915N2(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        zzben.m4817e(parcelM4810u, iObjectWrapper);
        zzben.m4817e(parcelM4810u, iObjectWrapper2);
        m4811u0(1, parcelM4810u);
    }
}
