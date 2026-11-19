package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes.dex */
public class RewardedInterstitialAd implements FullScreenAd {
    public static final int UNSET_VIDEO_DURATION = -1;
    private final RewardedInterstitialAdApi mRewardedInterstitialAdApi;

    public interface RewardedInterstitialAdLoadConfigBuilder extends InterfaceC1889Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.InterfaceC1889Ad.LoadConfigBuilder
        RewardedInterstitialLoadAdConfig build();

        RewardedInterstitialAdLoadConfigBuilder withAdListener(RewardedInterstitialAdListener rewardedInterstitialAdListener);

        @Override // com.facebook.ads.InterfaceC1889Ad.LoadConfigBuilder
        RewardedInterstitialAdLoadConfigBuilder withBid(String str);

        RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z);

        RewardedInterstitialAdLoadConfigBuilder withRewardData(RewardData rewardData);
    }

    public interface RewardedInterstitialAdShowConfigBuilder extends FullScreenAd.ShowConfigBuilder {
        @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
        RewardedInterstitialShowAdConfig build();

        RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i2);
    }

    public interface RewardedInterstitialLoadAdConfig extends InterfaceC1889Ad.LoadAdConfig {
    }

    public interface RewardedInterstitialShowAdConfig extends FullScreenAd.ShowAdConfig {
    }

    public RewardedInterstitialAd(Context context, String str) {
        this.mRewardedInterstitialAdApi = DynamicLoaderFactory.makeLoader(context).createRewardedInterstitialAd(context, str, this);
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public void destroy() {
        this.mRewardedInterstitialAdApi.destroy();
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public String getPlacementId() {
        return this.mRewardedInterstitialAdApi.getPlacementId();
    }

    public int getVideoDuration() {
        return this.mRewardedInterstitialAdApi.getVideoDuration();
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public boolean isAdInvalidated() {
        return this.mRewardedInterstitialAdApi.isAdInvalidated();
    }

    public boolean isAdLoaded() {
        return this.mRewardedInterstitialAdApi.isAdLoaded();
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public void loadAd() {
        this.mRewardedInterstitialAdApi.loadAd();
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mRewardedInterstitialAdApi.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.FullScreenAd
    public boolean show() {
        return this.mRewardedInterstitialAdApi.show();
    }

    @Override // com.facebook.ads.FullScreenAd
    public RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mRewardedInterstitialAdApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.FullScreenAd
    public RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return this.mRewardedInterstitialAdApi.buildShowAdConfig();
    }

    public void loadAd(RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        this.mRewardedInterstitialAdApi.loadAd(rewardedInterstitialLoadAdConfig);
    }

    public boolean show(RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        return this.mRewardedInterstitialAdApi.show(rewardedInterstitialShowAdConfig);
    }
}
