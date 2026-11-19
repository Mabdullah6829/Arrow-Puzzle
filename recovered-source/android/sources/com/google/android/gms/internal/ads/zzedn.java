package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzedn extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f13693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzedw f13694b;

    public zzedn(zzedw zzedwVar, String str) {
        this.f13693a = str;
        Objects.requireNonNull(zzedwVar);
        this.f13694b = zzedwVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo2731a(LoadAdError loadAdError) {
        this.f13694b.m6180l4(zzedw.m6178o4(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2732b(Object obj) {
        String str = this.f13693a;
        this.f13694b.m6179k4((InterstitialAd) obj, str);
    }
}
