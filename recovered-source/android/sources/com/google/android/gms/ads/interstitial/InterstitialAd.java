package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzcaf;

/* JADX INFO: loaded from: classes.dex */
public abstract class InterstitialAd {
    /* JADX INFO: renamed from: b */
    public static void m3273b(final Context context, final String str, final AdRequest adRequest, final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        Preconditions.m3545i(context, "Context cannot be null.");
        Preconditions.m3545i(str, "AdUnitId cannot be null.");
        Preconditions.m3545i(adRequest, "AdRequest cannot be null.");
        Preconditions.m3545i(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        zzbix.m5032a(context);
        if (((Boolean) zzbkv.f9047i.m5057c()).booleanValue()) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterstitialAdLoadCallback interstitialAdLoadCallback2 = interstitialAdLoadCallback;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new zzbss(context2, str).m5127f(adRequest2.f2945a, interstitialAdLoadCallback2);
                        } catch (IllegalStateException e) {
                            zzcaf.m5286c(context2).mo5291a("InterstitialAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        new zzbss(context, str).m5127f(adRequest.f2945a, interstitialAdLoadCallback);
    }

    /* JADX INFO: renamed from: a */
    public abstract ResponseInfo mo3274a();

    /* JADX INFO: renamed from: c */
    public abstract void mo3275c(FullScreenContentCallback fullScreenContentCallback);

    /* JADX INFO: renamed from: d */
    public abstract void mo3276d(boolean z);

    /* JADX INFO: renamed from: e */
    public abstract void mo3277e(Activity activity);
}
