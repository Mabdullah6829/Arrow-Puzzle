package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: renamed from: com.google.ads.mediation.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5134b extends AdListener implements AppEventListener, zza {

    /* JADX INFO: renamed from: s */
    public final MediationBannerListener f2916s;

    public C5134b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f2916s = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: b */
    public final void mo2725b() {
        this.f2916s.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: c */
    public final void mo2726c(LoadAdError loadAdError) {
        this.f2916s.mo3285i(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: e */
    public final void mo2727e() {
        this.f2916s.mo3284g();
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: g */
    public final void mo2728g() {
        this.f2916s.mo3283e();
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    /* JADX INFO: renamed from: i */
    public final void mo2729i(String str, String str2) {
        this.f2916s.zza(str, str2);
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        this.f2916s.mo3286k();
    }
}
