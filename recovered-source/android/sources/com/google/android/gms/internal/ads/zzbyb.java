package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyb implements MediationInterstitialAdapter {

    /* JADX INFO: renamed from: a */
    public Activity f9498a;

    /* JADX INFO: renamed from: b */
    public MediationInterstitialListener f9499b;

    /* JADX INFO: renamed from: c */
    public Uri f9500c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f9499b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f9499b.mo3288c();
            return;
        }
        if (!zzbjy.m5047a(context)) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Default browser does not support custom tabs. Bailing out.");
            this.f9499b.mo3288c();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f9499b.mo3288c();
        } else {
            this.f9498a = (Activity) context;
            this.f9500c = Uri.parse(string);
            this.f9499b.mo3291n();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
        customTabsIntentBuild.intent.setData(this.f9500c);
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzbya(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.intent, null), null, new zzbxz(this), null, new VersionInfoParcel(0, 0, false), null, null, "")));
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zzcfj zzcfjVar = zztVar.f3708h.f9901m;
        zzcfjVar.getClass();
        zztVar.f3711k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzcfjVar.f9886a) {
            try {
                if (zzcfjVar.f9888c == 3) {
                    if (zzcfjVar.f9887b + ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8298R6)).longValue() <= jCurrentTimeMillis) {
                        zzcfjVar.f9888c = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zztVar.f3711k.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (zzcfjVar.f9886a) {
            try {
                if (zzcfjVar.f9888c != 2) {
                    return;
                }
                zzcfjVar.f9888c = 3;
                if (zzcfjVar.f9888c == 3) {
                    zzcfjVar.f9887b = jCurrentTimeMillis2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
