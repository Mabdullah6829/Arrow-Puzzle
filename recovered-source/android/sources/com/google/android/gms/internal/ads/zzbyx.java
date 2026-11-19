package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyx extends zzbnv {

    /* JADX INFO: renamed from: s */
    public final NativeAd.OnNativeAdLoadedListener f9561s;

    public zzbyx(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.f9561s = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    /* JADX INFO: renamed from: j1 */
    public final void mo5077j1(zzboc zzbocVar) {
        this.f9561s.mo3309a(new zzbys(zzbocVar));
    }
}
