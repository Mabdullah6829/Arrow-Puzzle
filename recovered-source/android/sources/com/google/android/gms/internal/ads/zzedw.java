package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedw extends com.google.android.gms.ads.internal.client.zzds {

    /* JADX INFO: renamed from: s */
    public final HashMap f13706s = new HashMap();

    /* JADX INFO: renamed from: t */
    public final Context f13707t;

    /* JADX INFO: renamed from: u */
    public final WeakReference f13708u;

    /* JADX INFO: renamed from: v */
    public final zzedk f13709v;

    /* JADX INFO: renamed from: w */
    public final zzhcp f13710w;

    /* JADX INFO: renamed from: x */
    public zzecz f13711x;

    public zzedw(Context context, WeakReference weakReference, zzedk zzedkVar, zzhcp zzhcpVar) {
        this.f13707t = context;
        this.f13708u = weakReference;
        this.f13709v = zzedkVar;
        this.f13710w = zzhcpVar;
    }

    /* JADX INFO: renamed from: o4 */
    public static String m6178o4(Object obj) {
        ResponseInfo responseInfoMo3307c;
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        if (obj instanceof LoadAdError) {
            responseInfoMo3307c = ((LoadAdError) obj).f2968e;
        } else if (obj instanceof AppOpenAd) {
            responseInfoMo3307c = ((AppOpenAd) obj).mo2766a();
        } else if (obj instanceof InterstitialAd) {
            responseInfoMo3307c = ((InterstitialAd) obj).mo3274a();
        } else if (obj instanceof RewardedAd) {
            responseInfoMo3307c = ((RewardedAd) obj).mo3361a();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfoMo3307c = ((RewardedInterstitialAd) obj).mo3365a();
        } else if (obj instanceof AdView) {
            responseInfoMo3307c = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfoMo3307c = ((NativeAd) obj).mo3307c();
        }
        if (responseInfoMo3307c == null || (zzdxVar = responseInfoMo3307c.f2979a) == null) {
            return "";
        }
        try {
            return zzdxVar.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    /* JADX INFO: renamed from: N2 */
    public final void mo2915N2(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.m3697u0(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.m3697u0(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap map = this.f13706s;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            AdView adView = (AdView) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            zzedy.m6184b(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(adView);
            adView.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            zzedy.m6184b(nativeAdView, -1, -1);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            zzedy.m6184b(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources resourcesM5383c = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5383c();
            linearLayout2.addView(zzedy.m6183a(context, resourcesM5383c == null ? "Headline" : resourcesM5383c.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String strMo3306b = nativeAd.mo3306b();
            if (strMo3306b == null) {
                strMo3306b = "";
            }
            View viewM6183a = zzedy.m6183a(context, strMo3306b, android.R.style.TextAppearance.Medium, ViewCompat.MEASURED_STATE_MASK, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(viewM6183a);
            linearLayout2.addView(viewM6183a);
            linearLayout2.addView(zzedy.m6183a(context, resourcesM5383c == null ? "Body" : resourcesM5383c.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String strMo3305a = nativeAd.mo3305a();
            if (strMo3305a == null) {
                strMo3305a = "";
            }
            View viewM6183a2 = zzedy.m6183a(context, strMo3305a, android.R.style.TextAppearance.Medium, ViewCompat.MEASURED_STATE_MASK, 12.0f, "body_tag");
            nativeAdView.setBodyView(viewM6183a2);
            linearLayout2.addView(viewM6183a2);
            linearLayout2.addView(zzedy.m6183a(context, resourcesM5383c == null ? "Media View" : resourcesM5383c.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final synchronized void m6179k4(Object obj, String str) {
        this.f13706s.put(str, obj);
        m6180l4(m6178o4(obj));
    }

    /* JADX INFO: renamed from: l4 */
    public final synchronized void m6180l4(String str) {
        try {
            zzcgd zzcgdVarM6165d = this.f13711x.m6165d(str);
            zzedr zzedrVar = new zzedr(this);
            zzcgdVarM6165d.addListener(new zzhcd(zzcgdVarM6165d, zzedrVar), this.f13710w);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OutOfContextTester.setAdAsOutOfContext", e);
            this.f13709v.m6176c();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final synchronized void m6181m4(String str) {
        try {
            zzcgd zzcgdVarM6165d = this.f13711x.m6165d(str);
            zzeds zzedsVar = new zzeds(this);
            zzcgdVarM6165d.addListener(new zzhcd(zzcgdVarM6165d, zzedsVar), this.f13710w);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OutOfContextTester.setAdAsShown", e);
            this.f13709v.m6176c();
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final Context m6182n4() {
        Context context = (Context) this.f13708u.get();
        return context == null ? this.f13707t : context;
    }
}
