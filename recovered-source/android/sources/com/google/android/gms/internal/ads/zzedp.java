package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzedp extends RewardedInterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f13697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzedw f13698b;

    public zzedp(zzedw zzedwVar, String str) {
        this.f13697a = str;
        Objects.requireNonNull(zzedwVar);
        this.f13698b = zzedwVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo2731a(LoadAdError loadAdError) {
        this.f13698b.m6180l4(zzedw.m6178o4(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2732b(Object obj) {
        String str = this.f13697a;
        this.f13698b.m6179k4((RewardedInterstitialAd) obj, str);
    }
}
