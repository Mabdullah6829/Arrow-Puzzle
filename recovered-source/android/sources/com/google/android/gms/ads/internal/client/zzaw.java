package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzf;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzcah;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzcet;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw {

    /* JADX INFO: renamed from: a */
    public final zzk f3077a;

    /* JADX INFO: renamed from: b */
    public final zzi f3078b;

    /* JADX INFO: renamed from: c */
    public final zzfc f3079c;

    /* JADX INFO: renamed from: d */
    public final zzboe f3080d;

    /* JADX INFO: renamed from: e */
    public final zzbzf f3081e;

    /* JADX INFO: renamed from: f */
    public zzcah f3082f;

    /* JADX INFO: renamed from: g */
    public final zzl f3083g;

    public zzaw(zzk zzkVar, zzi zziVar, zzfc zzfcVar, zzboe zzboeVar, zzbzf zzbzfVar, zzl zzlVar) {
        this.f3077a = zzkVar;
        this.f3078b = zziVar;
        this.f3079c = zzfcVar;
        this.f3080d = zzboeVar;
        this.f3081e = zzbzfVar;
        this.f3083g = zzlVar;
    }

    /* JADX INFO: renamed from: k */
    public static void m2800k(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay zzayVar = zzay.f3085g;
        zzayVar.f3086a.m3047l(context, zzayVar.f3089d.f3396s, bundle);
    }

    /* JADX INFO: renamed from: a */
    public final zzbu m2801a(Context context, zzr zzrVar, String str, zzbvj zzbvjVar) {
        return (zzbu) new zzam(this, context, zzrVar, str, zzbvjVar).m2811d(context, false);
    }

    /* JADX INFO: renamed from: b */
    public final zzbu m2802b(Context context, zzr zzrVar, String str, zzbvf zzbvfVar) {
        return (zzbu) new zzan(this, context, zzrVar, str, zzbvfVar).m2811d(context, false);
    }

    /* JADX INFO: renamed from: c */
    public final zzbq m2803c(Context context, String str, zzbvf zzbvfVar) {
        return (zzbq) new zzap(this, context, str, zzbvfVar).m2811d(context, false);
    }

    /* JADX INFO: renamed from: d */
    public final zzch m2804d(ContextWrapper contextWrapper, zzbvf zzbvfVar) {
        return (zzch) new zzar(this, contextWrapper, zzbvfVar).m2811d(contextWrapper, false);
    }

    /* JADX INFO: renamed from: e */
    public final zzbmp m2805e(Context context, NativeAdView nativeAdView, FrameLayout frameLayout) {
        return (zzbmp) new zzav(this, nativeAdView, frameLayout, context).m2811d(context, false);
    }

    /* JADX INFO: renamed from: f */
    public final zzccp m2806f(Context context, String str, zzbvf zzbvfVar) {
        return (zzccp) new zzaa(this, context, str, zzbvfVar).m2811d(context, false);
    }

    /* JADX INFO: renamed from: g */
    public final zzbzi m2807g(AdActivity adActivity) {
        zzac zzacVar = new zzac(this, adActivity);
        Intent intent = adActivity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("useClientJar flag not found in activity intent extras.");
        }
        return (zzbzi) zzacVar.m2811d(adActivity, booleanExtra);
    }

    /* JADX INFO: renamed from: h */
    public final zzdt m2808h(OutOfContextTestingActivity outOfContextTestingActivity, zzbvf zzbvfVar) {
        return (zzdt) new zzae(this, outOfContextTestingActivity, zzbvfVar).m2811d(outOfContextTestingActivity, false);
    }

    /* JADX INFO: renamed from: i */
    public final zzcet m2809i(Context context, zzbvf zzbvfVar) {
        return (zzcet) new zzag(this, context, zzbvfVar).m2811d(context, false);
    }

    /* JADX INFO: renamed from: j */
    public final zzbzb m2810j(Context context, zzbvf zzbvfVar) {
        return (zzbzb) new zzai(this, context, zzbvfVar).m2811d(context, false);
    }
}
