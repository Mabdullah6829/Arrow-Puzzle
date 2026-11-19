package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzedo extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f13695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzedw f13696b;

    public zzedo(zzedw zzedwVar, String str) {
        this.f13695a = str;
        Objects.requireNonNull(zzedwVar);
        this.f13696b = zzedwVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo2731a(LoadAdError loadAdError) {
        this.f13696b.m6180l4(zzedw.m6178o4(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2732b(Object obj) {
        String str = this.f13695a;
        this.f13696b.m6179k4((RewardedAd) obj, str);
    }
}
