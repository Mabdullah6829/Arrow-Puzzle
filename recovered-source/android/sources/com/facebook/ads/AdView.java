package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes.dex */
public class AdView extends RelativeLayout implements InterfaceC1889Ad {
    private final AdViewApi mAdViewApi;
    private final AdViewParentApi mAdViewParentApi;

    public interface AdViewLoadConfig extends InterfaceC1889Ad.LoadAdConfig {
    }

    public interface AdViewLoadConfigBuilder extends InterfaceC1889Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.InterfaceC1889Ad.LoadConfigBuilder
        AdViewLoadConfig build();

        AdViewLoadConfigBuilder withAdListener(AdListener adListener);

        @Override // com.facebook.ads.InterfaceC1889Ad.LoadConfigBuilder
        AdViewLoadConfigBuilder withBid(String str);
    }

    public AdView(Context context, String str, AdSize adSize) {
        super(context);
        AdViewParentApi adViewParentApi = new AdViewParentApi() { // from class: com.facebook.ads.AdView.1
            @Override // com.facebook.ads.internal.api.AdViewParentApi
            public void onConfigurationChanged(Configuration configuration) {
                AdView.super.onConfigurationChanged(configuration);
            }
        };
        this.mAdViewParentApi = adViewParentApi;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, adSize, adViewParentApi, this);
    }

    public AdViewLoadConfigBuilder buildLoadAdConfig() {
        return this.mAdViewApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public void destroy() {
        this.mAdViewApi.destroy();
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public String getPlacementId() {
        return this.mAdViewApi.getPlacementId();
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public boolean isAdInvalidated() {
        return this.mAdViewApi.isAdInvalidated();
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    public void loadAd() {
        this.mAdViewApi.loadAd();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.mAdViewApi.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.InterfaceC1889Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mAdViewApi.setExtraHints(extraHints);
    }

    public void loadAd(AdViewLoadConfig adViewLoadConfig) {
        this.mAdViewApi.loadAd(adViewLoadConfig);
    }

    public AdView(Context context, String str, String str2) {
        super(context);
        AdViewParentApi adViewParentApi = new AdViewParentApi() { // from class: com.facebook.ads.AdView.1
            @Override // com.facebook.ads.internal.api.AdViewParentApi
            public void onConfigurationChanged(Configuration configuration) {
                AdView.super.onConfigurationChanged(configuration);
            }
        };
        this.mAdViewParentApi = adViewParentApi;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, str2, adViewParentApi, this);
    }
}
