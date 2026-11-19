package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbel;

/* JADX INFO: loaded from: classes.dex */
public final class zzcj extends zzbel implements zzcl {
    public zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    /* JADX INFO: renamed from: n0 */
    public final void mo2889n0(String str, String str2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        parcelM4810u.writeString(str2);
        m4811u0(1, parcelM4810u);
    }
}
