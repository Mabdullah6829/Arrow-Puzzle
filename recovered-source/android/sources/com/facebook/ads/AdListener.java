package com.facebook.ads;

/* JADX INFO: loaded from: classes.dex */
public interface AdListener {
    void onAdClicked(InterfaceC1889Ad interfaceC1889Ad);

    void onAdLoaded(InterfaceC1889Ad interfaceC1889Ad);

    void onError(InterfaceC1889Ad interfaceC1889Ad, AdError adError);

    void onLoggingImpression(InterfaceC1889Ad interfaceC1889Ad);
}
