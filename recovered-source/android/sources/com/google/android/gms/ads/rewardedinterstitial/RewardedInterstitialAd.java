package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcdj;

/* JADX INFO: loaded from: classes.dex */
public abstract class RewardedInterstitialAd {
    /* JADX INFO: renamed from: b */
    public static void m3364b(final Context context, final String str, final AdRequest adRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        Preconditions.m3545i(context, "Context cannot be null.");
        Preconditions.m3545i(str, "AdUnitId cannot be null.");
        Preconditions.m3545i(adRequest, "AdRequest cannot be null.");
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        zzbix.m5032a(context);
        if (((Boolean) zzbkv.f9049k.m5057c()).booleanValue()) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback2 = rewardedInterstitialAdLoadCallback;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new zzcdj(context2, str).m5348d(adRequest2.f2945a, rewardedInterstitialAdLoadCallback2);
                        } catch (IllegalStateException e) {
                            zzcaf.m5286c(context2).mo5291a("RewardedInterstitialAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        new zzcdj(context, str).m5348d(adRequest.f2945a, rewardedInterstitialAdLoadCallback);
    }

    /* JADX INFO: renamed from: a */
    public abstract ResponseInfo mo3365a();

    /* JADX INFO: renamed from: c */
    public abstract void mo3366c(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);
}
