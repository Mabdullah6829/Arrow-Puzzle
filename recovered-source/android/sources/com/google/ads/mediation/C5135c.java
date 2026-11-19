package com.google.ads.mediation;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: renamed from: com.google.ads.mediation.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5135c extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final AbstractAdViewAdapter f2917a;

    /* JADX INFO: renamed from: b */
    public final MediationInterstitialListener f2918b;

    public C5135c(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f2917a = abstractAdViewAdapter;
        this.f2918b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo2731a(LoadAdError loadAdError) {
        this.f2918b.mo3287b(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2732b(Object obj) {
        InterstitialAd interstitialAd = (InterstitialAd) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f2917a;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd;
        MediationInterstitialListener mediationInterstitialListener = this.f2918b;
        interstitialAd.mo3275c(new C5136d(abstractAdViewAdapter, mediationInterstitialListener));
        mediationInterstitialListener.mo3291n();
    }
}
