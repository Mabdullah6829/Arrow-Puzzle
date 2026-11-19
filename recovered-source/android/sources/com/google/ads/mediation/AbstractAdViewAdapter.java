package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbol;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdLoader adLoader;
    protected AdView mAdView;
    protected InterstitialAd mInterstitialAd;

    public AdRequest buildAdRequest(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Set setMo3282f = mediationAdRequest.mo3282f();
        zzeg zzegVar = builder.f2926a;
        if (setMo3282f != null) {
            Iterator it = setMo3282f.iterator();
            while (it.hasNext()) {
                zzegVar.f3112a.add((String) it.next());
            }
        }
        if (mediationAdRequest.mo3281e()) {
            zzf zzfVar = zzay.f3085g.f3086a;
            zzegVar.f3115d.add(zzf.m3034c(context));
        }
        if (mediationAdRequest.mo3279b() != -1) {
            zzegVar.f3122k = mediationAdRequest.mo3279b() != 1 ? 0 : 1;
        }
        zzegVar.f3123l = mediationAdRequest.mo3280d();
        builder.m2741b(buildExtrasBundle(bundle, bundle2));
        return new AdRequest(builder);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public InterstitialAd getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // com.google.android.gms.ads.mediation.zza
    public zzea getVideoController() {
        zzea zzeaVar;
        AdView adView = this.mAdView;
        if (adView == null) {
            return null;
        }
        VideoController videoController = adView.f2967s.f3145c;
        synchronized (videoController.f2982a) {
            zzeaVar = videoController.f2983b;
        }
        return zzeaVar;
    }

    public AdLoader.Builder newAdLoader(Context context, String str) {
        return new AdLoader.Builder(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.m2753a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.mo3276d(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.m2755c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.m2756d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new AdSize(adSize.f2956a, adSize.f2957b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new C5134b(this, mediationBannerListener));
        this.mAdView.m2754b(buildAdRequest(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        InterstitialAd.m3273b(context, getAdUnitId(bundle), buildAdRequest(context, mediationAdRequest, bundle2, bundle), new C5135c(this, mediationInterstitialListener));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        C5137e c5137e = new C5137e(this, mediationNativeListener);
        AdLoader.Builder builderNewAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        builderNewAdLoader.m2750b(c5137e);
        zzbq zzbqVar = builderNewAdLoader.f2944b;
        try {
            zzbqVar.mo2831t0(new zzbma(nativeMediationAdRequest.mo3302g()));
        } catch (RemoteException e) {
            zzo.m3074g("Failed to specify native ad options", e);
        }
        builderNewAdLoader.m2751c(nativeMediationAdRequest.mo3300a());
        if (nativeMediationAdRequest.mo3301c()) {
            try {
                zzbqVar.mo2828C2(new zzbol(c5137e));
            } catch (RemoteException e2) {
                zzo.m3074g("Failed to add google native ad listener", e2);
            }
        }
        if (nativeMediationAdRequest.zza()) {
            for (String str : nativeMediationAdRequest.zzb().keySet()) {
                zzboi zzboiVar = new zzboi(c5137e, true != ((Boolean) nativeMediationAdRequest.zzb().get(str)).booleanValue() ? null : c5137e);
                try {
                    zzbqVar.mo2829U3(str, zzboiVar.m5093a(), zzboiVar.m5094b());
                } catch (RemoteException e3) {
                    zzo.m3074g("Failed to add custom template ad listener", e3);
                }
            }
        }
        AdLoader adLoaderM2749a = builderNewAdLoader.m2749a();
        this.adLoader = adLoaderM2749a;
        adLoaderM2749a.m2748a(buildAdRequest(context, nativeMediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.mo3277e(null);
        }
    }
}
