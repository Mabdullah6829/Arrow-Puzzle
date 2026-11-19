package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzedm extends AdListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f13690s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ BaseAdView f13691t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzedw f13692u;

    public zzedm(zzedw zzedwVar, String str, BaseAdView baseAdView) {
        this.f13690s = str;
        this.f13691t = baseAdView;
        Objects.requireNonNull(zzedwVar);
        this.f13692u = zzedwVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: c */
    public final void mo2726c(LoadAdError loadAdError) {
        this.f13692u.m6180l4(zzedw.m6178o4(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: e */
    public final void mo2727e() {
        String str = this.f13690s;
        this.f13692u.m6179k4(this.f13691t, str);
    }
}
