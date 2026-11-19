package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxv extends zzbxh {

    /* JADX INFO: renamed from: t */
    public final RtbAdapter f9491t;

    public zzbxv(RtbAdapter rtbAdapter) {
        this.f9491t = rtbAdapter;
    }

    /* JADX INFO: renamed from: l4 */
    public static final void m5254l4(String str) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Server parameters: ".concat(String.valueOf(str)));
        try {
            new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            throw new RemoteException();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m5255m4(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.f3232x) {
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        com.google.android.gms.ads.internal.util.client.zzf.m3042s();
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m5256n4(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        String str2 = zzmVar.f3218M;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: I1 */
    public final void mo5239I1(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxf zzbxfVar, zzbvp zzbvpVar) throws RemoteException {
        try {
            zzbxu zzbxuVar = new zzbxu(this, zzbxfVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.f9491t;
            m5254l4(str2);
            m5257k4(zzmVar);
            m5255m4(zzmVar);
            m5256n4(zzmVar, str2);
            rtbAdapter.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration(), zzbxuVar);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Adapter failed to render rewarded interstitial ad.", th);
            zzbvg.m5156a(iObjectWrapper, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: I2 */
    public final void mo5240I2(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: T */
    public final boolean mo5241T(IObjectWrapper iObjectWrapper) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: Z2 */
    public final void mo5242Z2(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbww zzbwwVar, zzbvp zzbvpVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        try {
            zzbxn zzbxnVar = new zzbxn(this, zzbwwVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.f9491t;
            m5254l4(str2);
            m5257k4(zzmVar);
            m5255m4(zzmVar);
            m5256n4(zzmVar, str2);
            new AdSize(zzrVar.f3261w, zzrVar.f3258t, zzrVar.f3257s);
            rtbAdapter.loadRtbBannerAd(new MediationBannerAdConfiguration(), zzbxnVar);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Adapter failed to render banner ad.", th);
            zzbvg.m5156a(iObjectWrapper, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: Z3 */
    public final boolean mo5243Z3(ObjectWrapper objectWrapper) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: b */
    public final zzbxx mo5244b() {
        this.f9491t.getVersionInfo().getClass();
        return new zzbxx(0, 0, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: b4 */
    public final void mo5245b4(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbxl zzbxlVar) throws RemoteException {
        try {
            zzbxt zzbxtVar = new zzbxt(this, zzbxlVar);
            RtbAdapter rtbAdapter = this.f9491t;
            switch (str) {
                case "banner":
                case "interstitial":
                case "rewarded":
                case "rewarded_interstitial":
                case "native":
                case "app_open":
                    new ArrayList().add(new MediationConfiguration());
                    new AdSize(zzrVar.f3261w, zzrVar.f3258t, zzrVar.f3257s);
                    rtbAdapter.collectSignals(new RtbSignalData(), zzbxtVar);
                    return;
                case "app_open_ad":
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8670nd)).booleanValue()) {
                        new ArrayList().add(new MediationConfiguration());
                        new AdSize(zzrVar.f3261w, zzrVar.f3258t, zzrVar.f3257s);
                        rtbAdapter.collectSignals(new RtbSignalData(), zzbxtVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error generating signals for RTB", th);
            zzbvg.m5156a(iObjectWrapper, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: c */
    public final zzbxx mo5246c() {
        this.f9491t.getSDKVersionInfo().getClass();
        return new zzbxx(0, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: d1 */
    public final void mo5247d1(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, ObjectWrapper objectWrapper, zzbxc zzbxcVar, zzbvp zzbvpVar) throws RemoteException {
        mo5249k3(str, str2, zzmVar, objectWrapper, zzbxcVar, zzbvpVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: e3 */
    public final boolean mo5248e3(ObjectWrapper objectWrapper) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: k3 */
    public final void mo5249k3(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxc zzbxcVar, zzbvp zzbvpVar, zzbma zzbmaVar) throws RemoteException {
        RtbAdapter rtbAdapter = this.f9491t;
        try {
            zzbxq zzbxqVar = new zzbxq(this, zzbxcVar, zzbvpVar);
            m5254l4(str2);
            m5257k4(zzmVar);
            m5255m4(zzmVar);
            m5256n4(zzmVar, str2);
            rtbAdapter.loadRtbNativeAdMapper(new MediationNativeAdConfiguration(), zzbxqVar);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Adapter failed to render native ad.", th);
            zzbvg.m5156a(iObjectWrapper, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                zzbxr zzbxrVar = new zzbxr(this, zzbxcVar, zzbvpVar);
                m5254l4(str2);
                m5257k4(zzmVar);
                m5255m4(zzmVar);
                m5256n4(zzmVar, str2);
                rtbAdapter.loadRtbNativeAd(new MediationNativeAdConfiguration(), zzbxrVar);
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Adapter failed to render native ad.", th2);
                zzbvg.m5156a(iObjectWrapper, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5257k4(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle = zzmVar.f3210E;
        if (bundle == null || bundle.getBundle(this.f9491t.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: m2 */
    public final void mo5250m2(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwz zzbwzVar, zzbvp zzbvpVar) throws RemoteException {
        try {
            zzbxp zzbxpVar = new zzbxp(this, zzbwzVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.f9491t;
            m5254l4(str2);
            m5257k4(zzmVar);
            m5255m4(zzmVar);
            m5256n4(zzmVar, str2);
            rtbAdapter.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration(), zzbxpVar);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Adapter failed to render interstitial ad.", th);
            zzbvg.m5156a(iObjectWrapper, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: o3 */
    public final void mo5251o3(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbww zzbwwVar, zzbvp zzbvpVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        try {
            zzbxo zzbxoVar = new zzbxo(this, zzbwwVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.f9491t;
            m5254l4(str2);
            m5257k4(zzmVar);
            m5255m4(zzmVar);
            m5256n4(zzmVar, str2);
            new AdSize(zzrVar.f3261w, zzrVar.f3258t, zzrVar.f3257s);
            zzbxoVar.mo3278a(new AdError(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Adapter failed to render interscroller ad.", th);
            zzbvg.m5156a(iObjectWrapper, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: s3 */
    public final void mo5252s3(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxf zzbxfVar, zzbvp zzbvpVar) throws RemoteException {
        try {
            zzbxu zzbxuVar = new zzbxu(this, zzbxfVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.f9491t;
            m5254l4(str2);
            m5257k4(zzmVar);
            m5255m4(zzmVar);
            m5256n4(zzmVar, str2);
            rtbAdapter.loadRtbRewardedAd(new MediationRewardedAdConfiguration(), zzbxuVar);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Adapter failed to render rewarded ad.", th);
            zzbvg.m5156a(iObjectWrapper, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    /* JADX INFO: renamed from: t3 */
    public final void mo5253t3(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwt zzbwtVar, zzbvp zzbvpVar) throws RemoteException {
        try {
            zzbxs zzbxsVar = new zzbxs(this, zzbwtVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.f9491t;
            m5254l4(str2);
            m5257k4(zzmVar);
            m5255m4(zzmVar);
            m5256n4(zzmVar, str2);
            rtbAdapter.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration(), zzbxsVar);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Adapter failed to render app open ad.", th);
            zzbvg.m5156a(iObjectWrapper, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final com.google.android.gms.ads.internal.client.zzea zzh() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9491t;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
            }
        }
        return null;
    }
}
