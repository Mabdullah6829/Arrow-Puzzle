package com.facebook.ads;

/* JADX INFO: loaded from: classes.dex */
public interface FullScreenAd extends InterfaceC1889Ad {

    public interface ShowAdConfig {
    }

    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    InterfaceC1889Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
