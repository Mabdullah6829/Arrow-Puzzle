package com.instagram.common.viewpoint.core;

import com.facebook.ads.RewardedVideoAd;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.SJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3609SJ implements RewardedVideoAd.RewardedVideoAdShowConfigBuilder, RewardedVideoAd.RewardedVideoShowAdConfig {
    public int A00 = -1;
    public long A01;

    public final int A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A01;
    }

    public final C3609SJ A02(long j2) {
        this.A01 = j2;
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder, com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final RewardedVideoAd.RewardedVideoShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder
    public final RewardedVideoAd.RewardedVideoAdShowConfigBuilder withAppOrientation(int i2) {
        this.A00 = i2;
        return this;
    }
}
