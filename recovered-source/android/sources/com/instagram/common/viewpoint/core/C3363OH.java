package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC1889Ad;
import com.facebook.ads.InterstitialAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.OH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3363OH implements InterstitialAdListener {
    public final /* synthetic */ AbstractC4669jd A00;
    public final /* synthetic */ C4611if A01;

    public C3363OH(C4611if c4611if, AbstractC4669jd abstractC4669jd) {
        this.A01 = c4611if;
        this.A00 = abstractC4669jd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC1889Ad interfaceC1889Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC1889Ad interfaceC1889Ad) {
        this.A01.A00.A07.onAdLoaded(this.A01.A00.A08.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC1889Ad interfaceC1889Ad, AdError adError) {
        this.A01.A00.A01 = null;
        this.A00.A2J(false);
        this.A01.A00.A07.onAdLoaded(this.A01.A00.A08.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(InterfaceC1889Ad interfaceC1889Ad) {
        this.A01.A00.A04 = false;
        if (this.A01.A00.A03 != null) {
            this.A01.A00.A03.A0S(new C4613ih(this));
            this.A01.A00.A03.A0N();
            this.A01.A00.A03.A0K();
            this.A01.A00.A03 = null;
        }
        this.A01.A00.A07.onInterstitialDismissed(this.A01.A00.A08.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(InterfaceC1889Ad interfaceC1889Ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC1889Ad interfaceC1889Ad) {
    }
}
