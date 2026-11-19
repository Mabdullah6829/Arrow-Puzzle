package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC1889Ad;
import com.facebook.ads.RewardedInterstitialAdExtendedListener;
import com.facebook.ads.RewardedInterstitialAdListener;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedInterstitialAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.SE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3604SE implements RewardedVideoAdExtendedListener, S2SRewardedVideoAdListener, S2SRewardedVideoAdExtendedListener {
    public final RewardedInterstitialAdListener A00;

    public C3604SE(RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00 = rewardedInterstitialAdListener;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC1889Ad interfaceC1889Ad) {
        this.A00.onAdClicked(interfaceC1889Ad);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC1889Ad interfaceC1889Ad) {
        this.A00.onAdLoaded(interfaceC1889Ad);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC1889Ad interfaceC1889Ad, AdError adError) {
        this.A00.onError(interfaceC1889Ad, adError);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC1889Ad interfaceC1889Ad) {
        this.A00.onLoggingImpression(interfaceC1889Ad);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        if (this.A00 instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) this.A00).onRewardServerFailed();
        }
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        if (this.A00 instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) this.A00).onRewardServerSuccess();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        if (this.A00 instanceof RewardedInterstitialAdExtendedListener) {
            ((RewardedInterstitialAdExtendedListener) this.A00).onRewardedInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.onRewardedInterstitialClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.onRewardedInterstitialCompleted();
    }
}
