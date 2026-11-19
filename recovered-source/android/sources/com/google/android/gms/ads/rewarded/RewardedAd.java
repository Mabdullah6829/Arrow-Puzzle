package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import com.google.ads.mediation.C5136d;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccy;

/* JADX INFO: loaded from: classes.dex */
public abstract class RewardedAd {
    /* JADX INFO: renamed from: b */
    public static void m3360b(final Context context, final String str, final AdRequest adRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.m3545i(context, "Context cannot be null.");
        Preconditions.m3545i(str, "AdUnitId cannot be null.");
        Preconditions.m3545i(adRequest, "AdRequest cannot be null.");
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        zzbix.m5032a(context);
        if (((Boolean) zzbkv.f9049k.m5057c()).booleanValue()) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        RewardedAdLoadCallback rewardedAdLoadCallback2 = rewardedAdLoadCallback;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new zzccy(context2, str).m5341e(adRequest2.f2945a, rewardedAdLoadCallback2);
                        } catch (IllegalStateException e) {
                            zzcaf.m5286c(context2).mo5291a("RewardedAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        zzo.m3068a("Loading on UI thread");
        new zzccy(context, str).m5341e(adRequest.f2945a, rewardedAdLoadCallback);
    }

    /* JADX INFO: renamed from: a */
    public abstract ResponseInfo mo3361a();

    /* JADX INFO: renamed from: c */
    public abstract void mo3362c(C5136d c5136d);

    /* JADX INFO: renamed from: d */
    public abstract void mo3363d(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);
}
