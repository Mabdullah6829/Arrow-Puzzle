package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.C5133a;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwm implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {

    /* JADX INFO: renamed from: a */
    public final zzbvp f9461a;

    /* JADX INFO: renamed from: b */
    public C5133a f9462b;

    /* JADX INFO: renamed from: c */
    public zzbnd f9463c;

    public zzbwm(zzbvp zzbvpVar) {
        this.f9461a = zzbvpVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    /* JADX INFO: renamed from: a */
    public final void mo3292a() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdClosed.");
        try {
            this.f9461a.mo5194b();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    /* JADX INFO: renamed from: b */
    public final void mo3287b(AdError adError) {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        int i2 = adError.f2928a;
        String str = adError.f2929b;
        String str2 = adError.f2930c;
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i2);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        com.google.android.gms.ads.internal.util.client.zzo.m3068a(sb.toString());
        try {
            this.f9461a.mo5187C0(adError.m2745a());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    /* JADX INFO: renamed from: c */
    public final void mo3288c() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error 0.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a(sb.toString());
        try {
            this.f9461a.mo5202p(0);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    /* JADX INFO: renamed from: d */
    public final void mo3289d() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdClosed.");
        try {
            this.f9461a.mo5194b();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    /* JADX INFO: renamed from: e */
    public final void mo3283e() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdOpened.");
        try {
            this.f9461a.zzi();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    /* JADX INFO: renamed from: f */
    public final void mo3293f(MediationNativeAdapter mediationNativeAdapter, C5133a c5133a) {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdLoaded.");
        this.f9462b = c5133a;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            new VideoController().m2761b(new zzbvz());
        }
        try {
            this.f9461a.zzj();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    /* JADX INFO: renamed from: g */
    public final void mo3284g() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdLoaded.");
        try {
            this.f9461a.zzj();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    /* JADX INFO: renamed from: h */
    public final void mo3294h() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        C5133a c5133a = this.f9462b;
        if (this.f9463c == null) {
            if (c5133a == null) {
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", null);
                return;
            } else if (!c5133a.f3743m) {
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdImpression.");
        try {
            this.f9461a.zzk();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    /* JADX INFO: renamed from: i */
    public final void mo3285i(AdError adError) {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        int i2 = adError.f2928a;
        String str = adError.f2929b;
        String str2 = adError.f2930c;
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i2);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        com.google.android.gms.ads.internal.util.client.zzo.m3068a(sb.toString());
        try {
            this.f9461a.mo5187C0(adError.m2745a());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    /* JADX INFO: renamed from: j */
    public final void mo3295j() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdOpened.");
        try {
            this.f9461a.zzi();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    /* JADX INFO: renamed from: k */
    public final void mo3286k() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdClicked.");
        try {
            this.f9461a.mo5192a();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    /* JADX INFO: renamed from: l */
    public final void mo3290l() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdOpened.");
        try {
            this.f9461a.zzi();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    /* JADX INFO: renamed from: m */
    public final void mo3296m(zzbnd zzbndVar, String str) {
        try {
            this.f9461a.mo5199h1(zzbndVar.f9186a, str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    /* JADX INFO: renamed from: n */
    public final void mo3291n() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdLoaded.");
        try {
            this.f9461a.zzj();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    /* JADX INFO: renamed from: o */
    public final void mo3297o() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        C5133a c5133a = this.f9462b;
        if (this.f9463c == null) {
            if (c5133a == null) {
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", null);
                return;
            } else if (!c5133a.f3744n) {
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdClicked.");
        try {
            this.f9461a.mo5192a();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed() {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdClosed.");
        try {
            this.f9461a.mo5194b();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    /* JADX INFO: renamed from: p */
    public final void mo3298p(zzbnd zzbndVar) {
        String strZzh;
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        try {
            strZzh = zzbndVar.f9186a.zzh();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            strZzh = null;
        }
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAdLoaded with template id ".concat(String.valueOf(strZzh)));
        this.f9463c = zzbndVar;
        try {
            this.f9461a.zzj();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    /* JADX INFO: renamed from: q */
    public final void mo3299q(AdError adError) {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        int i2 = adError.f2928a;
        String str = adError.f2929b;
        String str2 = adError.f2930c;
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i2);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        com.google.android.gms.ads.internal.util.client.zzo.m3068a(sb.toString());
        try {
            this.f9461a.mo5187C0(adError.m2745a());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zza(String str, String str2) {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Adapter called onAppEvent.");
        try {
            this.f9461a.mo5186B3(str, str2);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }
}
