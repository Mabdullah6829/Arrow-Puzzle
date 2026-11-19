package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.ads.mediation.C5136d;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccy extends RewardedAd {

    /* JADX INFO: renamed from: a */
    public final zzccp f9743a;

    /* JADX INFO: renamed from: b */
    public final Context f9744b;

    /* JADX INFO: renamed from: c */
    public final zzcdh f9745c;

    /* JADX INFO: renamed from: d */
    public final long f9746d;

    public zzccy(Context context, String str) {
        zzccp zzccpVarM2806f = com.google.android.gms.ads.internal.client.zzay.f3085g.f3087b.m2806f(context, str, new zzbvf());
        this.f9746d = System.currentTimeMillis();
        new AtomicLong();
        this.f9744b = context.getApplicationContext();
        new AtomicReference(str);
        this.f9743a = zzccpVarM2806f;
        this.f9745c = new zzcdh();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    /* JADX INFO: renamed from: a */
    public final ResponseInfo mo3361a() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVarMo2967e = null;
        try {
            zzccp zzccpVar = this.f9743a;
            if (zzccpVar != null) {
                zzdxVarMo2967e = zzccpVar.mo2967e();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
        return new ResponseInfo(zzdxVarMo2967e);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    /* JADX INFO: renamed from: c */
    public final void mo3362c(C5136d c5136d) {
        this.f9745c.f9762s = c5136d;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    /* JADX INFO: renamed from: d */
    public final void mo3363d(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzcdh zzcdhVar = this.f9745c;
        zzcdhVar.f9763t = onUserEarnedRewardListener;
        try {
            zzccp zzccpVar = this.f9743a;
            if (zzccpVar != null) {
                zzccpVar.mo2974u1(zzcdhVar);
                zzccpVar.mo2971n2(new ObjectWrapper(activity));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5341e(com.google.android.gms.ads.internal.client.zzeh zzehVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzccp zzccpVar = this.f9743a;
            if (zzccpVar != null) {
                zzehVar.f3139n = this.f9746d;
                com.google.android.gms.ads.internal.client.zzq zzqVar = com.google.android.gms.ads.internal.client.zzq.f3248a;
                Context context = this.f9744b;
                zzqVar.getClass();
                zzccpVar.mo2964S1(com.google.android.gms.ads.internal.client.zzq.m2979a(context, zzehVar), new zzcdc(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }
}
