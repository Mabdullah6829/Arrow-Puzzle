package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdj extends RewardedInterstitialAd {

    /* JADX INFO: renamed from: a */
    public final zzccp f9766a;

    /* JADX INFO: renamed from: b */
    public final Context f9767b;

    /* JADX INFO: renamed from: c */
    public final zzcdh f9768c;

    /* JADX INFO: renamed from: d */
    public final long f9769d = System.currentTimeMillis();

    public zzcdj(Context context, String str) {
        new AtomicLong();
        this.f9767b = context.getApplicationContext();
        this.f9766a = com.google.android.gms.ads.internal.client.zzay.f3085g.f3087b.m2806f(context, str, new zzbvf());
        this.f9768c = new zzcdh();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    /* JADX INFO: renamed from: a */
    public final ResponseInfo mo3365a() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVarMo2967e = null;
        try {
            zzccp zzccpVar = this.f9766a;
            if (zzccpVar != null) {
                zzdxVarMo2967e = zzccpVar.mo2967e();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
        return new ResponseInfo(zzdxVarMo2967e);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    /* JADX INFO: renamed from: c */
    public final void mo3366c(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzcdh zzcdhVar = this.f9768c;
        zzcdhVar.f9763t = onUserEarnedRewardListener;
        try {
            zzccp zzccpVar = this.f9766a;
            if (zzccpVar != null) {
                zzccpVar.mo2974u1(zzcdhVar);
                zzccpVar.mo2971n2(new ObjectWrapper(activity));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5348d(com.google.android.gms.ads.internal.client.zzeh zzehVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            zzccp zzccpVar = this.f9766a;
            if (zzccpVar != null) {
                zzehVar.f3139n = this.f9769d;
                com.google.android.gms.ads.internal.client.zzq zzqVar = com.google.android.gms.ads.internal.client.zzq.f3248a;
                Context context = this.f9767b;
                zzqVar.getClass();
                zzccpVar.mo2973t1(com.google.android.gms.ads.internal.client.zzq.m2979a(context, zzehVar), new zzcdi(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }
}
