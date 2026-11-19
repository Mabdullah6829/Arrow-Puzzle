package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzcaf;
import p061g.C6343h;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppOpenAd {

    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* JADX INFO: renamed from: b */
    public static void m2765b(final Context context, final String str, final AdRequest adRequest, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.m3545i(context, "Context cannot be null.");
        Preconditions.m3545i(str, "adUnitId cannot be null.");
        Preconditions.m3545i(adRequest, "AdRequest cannot be null.");
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        zzbix.m5032a(context);
        if (((Boolean) zzbkv.f9042d.m5057c()).booleanValue()) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback2 = appOpenAdLoadCallback;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new zzbgy(context2, str, adRequest2.f2945a, appOpenAdLoadCallback2).m4880a();
                        } catch (IllegalStateException e) {
                            zzcaf.m5286c(context2).mo5291a("AppOpenAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        new zzbgy(context, str, adRequest.f2945a, appOpenAdLoadCallback).m4880a();
    }

    /* JADX INFO: renamed from: a */
    public abstract ResponseInfo mo2766a();

    /* JADX INFO: renamed from: c */
    public abstract void mo2767c(C6343h c6343h);

    /* JADX INFO: renamed from: d */
    public abstract void mo2768d(Activity activity);
}
