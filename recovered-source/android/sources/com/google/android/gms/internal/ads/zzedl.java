package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzedl extends AppOpenAd.AppOpenAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f13688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzedw f13689b;

    public zzedl(zzedw zzedwVar, String str) {
        this.f13688a = str;
        Objects.requireNonNull(zzedwVar);
        this.f13689b = zzedwVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo2731a(LoadAdError loadAdError) {
        this.f13689b.m6180l4(zzedw.m6178o4(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2732b(Object obj) {
        String str = this.f13688a;
        this.f13689b.m6179k4((AppOpenAd) obj, str);
    }
}
