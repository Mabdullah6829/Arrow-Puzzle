package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdi extends zzccv {

    /* JADX INFO: renamed from: s */
    public final RewardedInterstitialAdLoadCallback f9764s;

    /* JADX INFO: renamed from: t */
    public final zzcdj f9765t;

    public zzcdi(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcdj zzcdjVar) {
        this.f9764s = rewardedInterstitialAdLoadCallback;
        this.f9765t = zzcdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: a */
    public final void mo5338a() {
        zzcdj zzcdjVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f9764s;
        if (rewardedInterstitialAdLoadCallback == null || (zzcdjVar = this.f9765t) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.mo2732b(zzcdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: o */
    public final void mo5339o(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: q */
    public final void mo5340q(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f9764s;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.mo2731a(zzeVar.m2925H());
        }
    }
}
