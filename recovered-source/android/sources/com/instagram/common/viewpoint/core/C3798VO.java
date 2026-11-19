package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.VO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3798VO implements AdView.AdViewLoadConfigBuilder, AdView.AdViewLoadConfig {
    public String A00;
    public final C3567Rd A01;

    public C3798VO(C3567Rd c3567Rd) {
        this.A01 = c3567Rd;
    }

    public final String A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.InterfaceC1889Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfig build() {
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withAdListener(AdListener adListener) {
        this.A01.A0C(adListener);
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.InterfaceC1889Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withBid(String str) {
        this.A00 = str;
        return this;
    }
}
