package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgl extends zzbgs {

    /* JADX INFO: renamed from: s */
    public final AppOpenAd.AppOpenAdLoadCallback f7826s;

    /* JADX INFO: renamed from: t */
    public final String f7827t;

    public zzbgl(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.f7826s = appOpenAdLoadCallback;
        this.f7827t = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    /* JADX INFO: renamed from: A */
    public final void mo4871A(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    /* JADX INFO: renamed from: S3 */
    public final void mo4872S3(zzbgq zzbgqVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f7826s;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.mo2732b(new zzbgm(zzbgqVar, this.f7827t));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    /* JADX INFO: renamed from: d0 */
    public final void mo4873d0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f7826s;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.mo2731a(zzeVar.m2925H());
        }
    }
}
