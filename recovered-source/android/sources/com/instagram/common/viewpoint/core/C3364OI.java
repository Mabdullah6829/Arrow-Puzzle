package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC1889Ad;
import com.facebook.ads.RewardedVideoAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.OI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3364OI implements RewardedVideoAdListener {
    public final /* synthetic */ C4607ib A00;

    public C3364OI(C4607ib c4607ib) {
        this.A00 = c4607ib;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC1889Ad interfaceC1889Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC1889Ad interfaceC1889Ad) {
        this.A00.A00.A07.onAdLoaded(this.A00.A00.A08.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC1889Ad interfaceC1889Ad, AdError adError) {
        this.A00.A00.A02 = null;
        ((AbstractC4669jd) this.A00.A00.A03).A2J(false);
        this.A00.A00.A07.onAdLoaded(this.A00.A00.A08.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC1889Ad interfaceC1889Ad) {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.A00.A07.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.A00.A07.onRewardedVideoCompleted();
    }
}
