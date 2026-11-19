package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcaz extends zzbel implements zzcbb {
    public zzcaz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    /* JADX INFO: renamed from: H3 */
    public final void mo5300H3(ParcelFileDescriptor parcelFileDescriptor, zzcbk zzcbkVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, parcelFileDescriptor);
        zzben.m4815c(parcelM4810u, zzcbkVar);
        m4811u0(3, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    /* JADX INFO: renamed from: Q2 */
    public final void mo5301Q2(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, parcelFileDescriptor);
        m4811u0(1, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    /* JADX INFO: renamed from: m1 */
    public final void mo5302m1(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzbaVar);
        m4811u0(2, parcelM4810u);
    }
}
