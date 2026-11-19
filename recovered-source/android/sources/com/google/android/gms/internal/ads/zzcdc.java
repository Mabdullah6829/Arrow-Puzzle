package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdc extends zzccv {

    /* JADX INFO: renamed from: s */
    public final RewardedAdLoadCallback f9756s;

    /* JADX INFO: renamed from: t */
    public final zzccy f9757t;

    public zzcdc(RewardedAdLoadCallback rewardedAdLoadCallback, zzccy zzccyVar) {
        this.f9756s = rewardedAdLoadCallback;
        this.f9757t = zzccyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: a */
    public final void mo5338a() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f9756s;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.mo2732b(this.f9757t);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: o */
    public final void mo5339o(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: q */
    public final void mo5340q(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f9756s;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.mo2731a(zzeVar.m2925H());
        }
    }
}
