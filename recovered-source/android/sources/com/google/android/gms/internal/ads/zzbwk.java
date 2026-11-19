package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.C5133a;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwk extends zzbvl {

    /* JADX INFO: renamed from: s */
    public final MediationExtrasReceiver f9457s;

    /* JADX INFO: renamed from: t */
    public zzbwm f9458t;

    /* JADX INFO: renamed from: u */
    public zzcch f9459u;

    /* JADX INFO: renamed from: v */
    public IObjectWrapper f9460v;

    public zzbwk(Adapter adapter) {
        this.f9457s = adapter;
    }

    /* JADX INFO: renamed from: m4 */
    public static final boolean m5229m4(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.f3232x) {
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        return com.google.android.gms.ads.internal.util.client.zzf.m3042s();
    }

    /* JADX INFO: renamed from: n4 */
    public static final String m5230n4(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        String str2 = zzmVar.f3218M;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: A2 */
    public final void mo5158A2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, zzcch zzcchVar, String str) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f9460v = iObjectWrapper;
            this.f9459u = zzcchVar;
            zzcchVar.mo5319R0(new ObjectWrapper(mediationExtrasReceiver));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: B */
    public final zzbvy mo5159B() {
        zzbwm zzbwmVar;
        C5133a c5133a;
        if (!(this.f9457s instanceof MediationNativeAdapter) || (zzbwmVar = this.f9458t) == null || (c5133a = zzbwmVar.f9462b) == null) {
            return null;
        }
        return new zzbwq(c5133a);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: J */
    public final zzbvs mo5160J() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: K */
    public final zzbvv mo5161K() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: L */
    public final zzbxx mo5162L() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            return null;
        }
        ((Adapter) mediationExtrasReceiver).getVersionInfo().getClass();
        return new zzbxx(0, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: L0 */
    public final void mo5163L0(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        m5233o4(zzmVar, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: M */
    public final zzbvu mo5164M() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: Q */
    public final void mo5165Q() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: Q1 */
    public final void mo5166Q1(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvp zzbvpVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Requesting rewarded interstitial ad from adapter.");
        try {
            zzbwi zzbwiVar = new zzbwi(this, zzbvpVar);
            m5231k4(str, zzmVar, null);
            m5232l4(zzmVar);
            m5229m4(zzmVar);
            m5230n4(zzmVar, str);
            ((Adapter) mediationExtrasReceiver).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration(), zzbwiVar);
        } catch (Exception e) {
            zzbvg.m5156a(iObjectWrapper, e, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: U */
    public final zzbxx mo5167U() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            return null;
        }
        ((Adapter) mediationExtrasReceiver).getSDKVersionInfo().getClass();
        return new zzbxx(0, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: V3 */
    public final void mo5168V3(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        boolean z = mediationExtrasReceiver instanceof MediationInterstitialAdapter;
        if (!z && !(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC0271e0.m413u(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Requesting interstitial ad from adapter.");
        if (!z) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    zzbwf zzbwfVar = new zzbwf(this, zzbvpVar);
                    m5231k4(str, zzmVar, str2);
                    m5232l4(zzmVar);
                    m5229m4(zzmVar);
                    m5230n4(zzmVar, str);
                    ((Adapter) mediationExtrasReceiver).loadInterstitialAd(new MediationInterstitialAdConfiguration(), zzbwfVar);
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
                    zzbvg.m5156a(iObjectWrapper, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) mediationExtrasReceiver;
            List list = zzmVar.f3231w;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j2 = zzmVar.f3228t;
            if (j2 != -1) {
                new Date(j2);
            }
            boolean zM5229m4 = m5229m4(zzmVar);
            int i2 = zzmVar.f3233y;
            boolean z2 = zzmVar.f3215J;
            m5230n4(zzmVar, str);
            zzbwb zzbwbVar = new zzbwb(hashSet, zM5229m4, i2, z2);
            Bundle bundle = zzmVar.f3210E;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.m3697u0(iObjectWrapper), new zzbwm(zzbvpVar), m5231k4(str, zzmVar, str2), zzbwbVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th2);
            zzbvg.m5156a(iObjectWrapper, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: W */
    public final void mo5169W(IObjectWrapper iObjectWrapper) {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof OnContextChangedListener) {
            ((OnContextChangedListener) mediationExtrasReceiver).m3303a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: a2 */
    public final void mo5170a2(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Show rewarded ad from adapter.");
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: b */
    public final IObjectWrapper mo5171b() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof MediationBannerAdapter) {
            try {
                return new ObjectWrapper(((MediationBannerAdapter) mediationExtrasReceiver).getBannerView());
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
                throw new RemoteException();
            }
        }
        if (mediationExtrasReceiver instanceof Adapter) {
            return new ObjectWrapper(null);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        AbstractC0271e0.m413u(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: b2 */
    public final void mo5172b2(boolean z) {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) mediationExtrasReceiver).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.m3068a(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: c4 */
    public final void mo5173c4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvp zzbvpVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Requesting rewarded ad from adapter.");
        try {
            zzbwi zzbwiVar = new zzbwi(this, zzbvpVar);
            m5231k4(str, zzmVar, null);
            m5232l4(zzmVar);
            m5229m4(zzmVar);
            m5230n4(zzmVar, str);
            ((Adapter) mediationExtrasReceiver).loadRewardedAd(new MediationRewardedAdConfiguration(), zzbwiVar);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            zzbvg.m5156a(iObjectWrapper, e, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: e */
    public final void mo5174e() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onResume();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: f */
    public final boolean mo5175f() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f9459u != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: k1 */
    public final void mo5176k1(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if ((mediationExtrasReceiver instanceof Adapter) || (mediationExtrasReceiver instanceof MediationInterstitialAdapter)) {
            if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
                zzh();
                return;
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Show interstitial ad from adapter.");
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        AbstractC0271e0.m413u(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: k2 */
    public final void mo5177k2(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Show app open ad from adapter.");
            com.google.android.gms.ads.internal.util.client.zzo.m3070c("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        throw new RemoteException();
    }

    /* JADX INFO: renamed from: k4 */
    public final Bundle m5231k4(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f9457s instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.f3233y);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
            throw new RemoteException();
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m5232l4(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle = zzmVar.f3210E;
        if (bundle == null || bundle.getBundle(this.f9457s.getClass().getName()) == null) {
            new Bundle();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m5233o4(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof Adapter) {
            mo5173c4(this.f9460v, zzmVar, str, new zzbwn((Adapter) mediationExtrasReceiver, this.f9459u));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: p2 */
    public final void mo5178p2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar, zzbma zzbmaVar, ArrayList arrayList) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        boolean z = mediationExtrasReceiver instanceof MediationNativeAdapter;
        if (!z && !(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC0271e0.m413u(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Requesting native ad from adapter.");
        if (z) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) mediationExtrasReceiver;
                List list = zzmVar.f3231w;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j2 = zzmVar.f3228t;
                if (j2 != -1) {
                    new Date(j2);
                }
                boolean zM5229m4 = m5229m4(zzmVar);
                int i2 = zzmVar.f3233y;
                boolean z2 = zzmVar.f3215J;
                m5230n4(zzmVar, str);
                zzbwp zzbwpVar = new zzbwp(hashSet, zM5229m4, i2, zzbmaVar, arrayList, z2);
                Bundle bundle = zzmVar.f3210E;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f9458t = new zzbwm(zzbvpVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.m3697u0(iObjectWrapper), this.f9458t, m5231k4(str, zzmVar, str2), zzbwpVar, bundle2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
                zzbvg.m5156a(iObjectWrapper, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (mediationExtrasReceiver instanceof Adapter) {
            try {
                zzbwh zzbwhVar = new zzbwh(this, zzbvpVar);
                m5231k4(str, zzmVar, str2);
                m5232l4(zzmVar);
                m5229m4(zzmVar);
                m5230n4(zzmVar, str);
                ((Adapter) mediationExtrasReceiver).loadNativeAdMapper(new MediationNativeAdConfiguration(), zzbwhVar);
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th2);
                zzbvg.m5156a(iObjectWrapper, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    zzbwg zzbwgVar = new zzbwg(this, zzbvpVar);
                    m5231k4(str, zzmVar, str2);
                    m5232l4(zzmVar);
                    m5229m4(zzmVar);
                    m5230n4(zzmVar, str);
                    ((Adapter) mediationExtrasReceiver).loadNativeAd(new MediationNativeAdConfiguration(), zzbwgVar);
                } catch (Throwable th3) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th3);
                    zzbvg.m5156a(iObjectWrapper, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: r3 */
    public final void mo5179r3(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) mediationExtrasReceiver;
            zzbwc zzbwcVar = new zzbwc(this, zzbvpVar, adapter);
            m5231k4(str, zzmVar, str2);
            m5232l4(zzmVar);
            m5229m4(zzmVar);
            m5230n4(zzmVar, str);
            int i2 = zzrVar.f3261w;
            int i3 = zzrVar.f3258t;
            AdSize adSize = new AdSize(i2, i3);
            adSize.f2962g = true;
            adSize.f2963h = i3;
            zzbwcVar.mo3278a(new AdError(7, adapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            zzbvg.m5156a(iObjectWrapper, e, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: s */
    public final boolean mo5180s() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: s2 */
    public final void mo5181s2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvp zzbvpVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Requesting app open ad from adapter.");
        try {
            zzbwj zzbwjVar = new zzbwj(this, zzbvpVar);
            m5231k4(str, zzmVar, null);
            m5232l4(zzmVar);
            m5229m4(zzmVar);
            m5230n4(zzmVar, str);
            ((Adapter) mediationExtrasReceiver).loadAppOpenAd(new MediationAppOpenAdConfiguration(), zzbwjVar);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            zzbvg.m5156a(iObjectWrapper, e, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: t */
    public final com.google.android.gms.ads.internal.client.zzea mo5182t() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: v1 */
    public final void mo5183v1(IObjectWrapper iObjectWrapper, zzbsa zzbsaVar, ArrayList arrayList) throws RemoteException {
        byte b;
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            throw new RemoteException();
        }
        try {
            zzbwd zzbwdVar = new zzbwd(this, zzbsaVar);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                switch (((zzbsg) obj).f9313s) {
                    case "banner":
                        b = 0;
                        break;
                    case "native":
                        b = 4;
                        break;
                    case "rewarded":
                        b = 2;
                        break;
                    case "interstitial":
                        b = 1;
                        break;
                    case "app_open":
                        b = 5;
                        break;
                    case "app_open_ad":
                        b = 6;
                        break;
                    case "rewarded_interstitial":
                        b = 3;
                        break;
                    default:
                        b = -1;
                        break;
                }
                AdFormat adFormat = AdFormat.APP_OPEN_AD;
                switch (b) {
                    case 0:
                        adFormat = AdFormat.BANNER;
                        break;
                    case 1:
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    case 2:
                        adFormat = AdFormat.REWARDED;
                        break;
                    case 3:
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    case 4:
                        adFormat = AdFormat.NATIVE;
                        break;
                    case 5:
                        break;
                    case 6:
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8670nd)).booleanValue()) {
                            break;
                        }
                    default:
                        adFormat = null;
                        break;
                }
                if (adFormat != null) {
                    arrayList2.add(new MediationConfiguration());
                }
            }
            ((Adapter) mediationExtrasReceiver).initialize((Context) ObjectWrapper.m3697u0(iObjectWrapper), zzbwdVar, arrayList2);
        } catch (Throwable th) {
            zzbvg.m5156a(iObjectWrapper, th, "adapter.initialize");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: w0 */
    public final void mo5184w0(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        AdSize adSize;
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        boolean z = mediationExtrasReceiver instanceof MediationBannerAdapter;
        if (!z && !(mediationExtrasReceiver instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = mediationExtrasReceiver.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC0271e0.m413u(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Requesting banner ad from adapter.");
        boolean z2 = zzrVar.f3254F;
        int i2 = zzrVar.f3258t;
        int i3 = zzrVar.f3261w;
        if (z2) {
            AdSize adSize2 = new AdSize(i3, i2);
            adSize2.f2960e = true;
            adSize2.f2961f = i2;
            adSize = adSize2;
        } else {
            adSize = new AdSize(i3, i2, zzrVar.f3257s);
        }
        if (!z) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    zzbwe zzbweVar = new zzbwe(this, zzbvpVar);
                    m5231k4(str, zzmVar, str2);
                    m5232l4(zzmVar);
                    m5229m4(zzmVar);
                    m5230n4(zzmVar, str);
                    ((Adapter) mediationExtrasReceiver).loadBannerAd(new MediationBannerAdConfiguration(), zzbweVar);
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
                    zzbvg.m5156a(iObjectWrapper, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) mediationExtrasReceiver;
            List list = zzmVar.f3231w;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j2 = zzmVar.f3228t;
            if (j2 != -1) {
                new Date(j2);
            }
            boolean zM5229m4 = m5229m4(zzmVar);
            int i4 = zzmVar.f3233y;
            boolean z3 = zzmVar.f3215J;
            m5230n4(zzmVar, str);
            zzbwb zzbwbVar = new zzbwb(hashSet, zM5229m4, i4, z3);
            Bundle bundle = zzmVar.f3210E;
            mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.m3697u0(iObjectWrapper), new zzbwm(zzbvpVar), m5231k4(str, zzmVar, str2), adSize, zzbwbVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th2);
            zzbvg.m5156a(iObjectWrapper, th2, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    /* JADX INFO: renamed from: w2 */
    public final void mo5185w2(IObjectWrapper iObjectWrapper, zzcch zzcchVar, List list) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzh() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) mediationExtrasReceiver).showInterstitial();
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = mediationExtrasReceiver.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzi() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onDestroy();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzl() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f9457s;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onPause();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("", th);
                throw new RemoteException();
            }
        }
    }

    public zzbwk(MediationAdapter mediationAdapter) {
        this.f9457s = mediationAdapter;
    }
}
