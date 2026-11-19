package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbss extends AdManagerInterstitialAd {

    /* JADX INFO: renamed from: a */
    public final Context f9319a;

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.client.zzq f9320b;

    /* JADX INFO: renamed from: c */
    public final com.google.android.gms.ads.internal.client.zzbu f9321c;

    /* JADX INFO: renamed from: d */
    public final long f9322d;

    public zzbss(Context context, String str) {
        zzbvf zzbvfVar = new zzbvf();
        this.f9322d = System.currentTimeMillis();
        new AtomicLong();
        this.f9319a = context;
        new AtomicReference(str);
        this.f9320b = com.google.android.gms.ads.internal.client.zzq.f3248a;
        this.f9321c = com.google.android.gms.ads.internal.client.zzay.f3085g.f3087b.m2802b(context, new com.google.android.gms.ads.internal.client.zzr(), str, zzbvfVar);
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    /* JADX INFO: renamed from: a */
    public final ResponseInfo mo3274a() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVarMo2858r = null;
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.f9321c;
            if (zzbuVar != null) {
                zzdxVarMo2858r = zzbuVar.mo2858r();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
        return new ResponseInfo(zzdxVarMo2858r);
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    /* JADX INFO: renamed from: c */
    public final void mo3275c(FullScreenContentCallback fullScreenContentCallback) {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.f9321c;
            if (zzbuVar != null) {
                zzbuVar.mo2863z3(new com.google.android.gms.ads.internal.client.zzbb(fullScreenContentCallback));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    /* JADX INFO: renamed from: d */
    public final void mo3276d(boolean z) {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.f9321c;
            if (zzbuVar != null) {
                zzbuVar.mo2851Z0(z);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    /* JADX INFO: renamed from: e */
    public final void mo3277e(Activity activity) {
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.f9321c;
            if (zzbuVar != null) {
                zzbuVar.mo2844I3(new ObjectWrapper(activity));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5127f(com.google.android.gms.ads.internal.client.zzeh zzehVar, AdLoadCallback adLoadCallback) {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.f9321c;
            if (zzbuVar != null) {
                zzehVar.f3139n = this.f9322d;
                com.google.android.gms.ads.internal.client.zzq zzqVar = this.f9320b;
                Context context = this.f9319a;
                zzqVar.getClass();
                zzbuVar.mo2847U0(com.google.android.gms.ads.internal.client.zzq.m2979a(context, zzehVar), new com.google.android.gms.ads.internal.client.zzh(adLoadCallback, this));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            adLoadCallback.mo2731a(new LoadAdError(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
