package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
final class zzbya implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ AdOverlayInfoParcel f9496s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzbyb f9497t;

    public zzbya(zzbyb zzbybVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f9496s = adOverlayInfoParcel;
        this.f9497t = zzbybVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.overlay.zzn zznVar = com.google.android.gms.ads.internal.zzt.f3698C.f3702b;
        com.google.android.gms.ads.internal.overlay.zzn.m3014a(this.f9497t.f9498a, this.f9496s, true, null);
    }
}
