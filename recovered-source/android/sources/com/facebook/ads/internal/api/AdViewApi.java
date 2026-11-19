package com.facebook.ads.internal.api;

import android.content.res.Configuration;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC1889Ad;

/* JADX INFO: loaded from: classes.dex */
public interface AdViewApi extends AdViewParentApi, InterfaceC1889Ad {
    AdView.AdViewLoadConfigBuilder buildLoadAdConfig();

    void loadAd(AdView.AdViewLoadConfig adViewLoadConfig);

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    void onConfigurationChanged(Configuration configuration);

    @Override // com.facebook.ads.InterfaceC1889Ad
    @Deprecated
    void setExtraHints(ExtraHints extraHints);
}
