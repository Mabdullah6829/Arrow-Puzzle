package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbql implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final zzedw f9280a;

    public zzbql(zzedw zzedwVar) {
        this.f9280a = zzedwVar;
    }

    /* JADX INFO: renamed from: b */
    public static final Bundle m5111b(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OutOfContextTestingGmsgHandler.generateNetworkExtras", e);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static final ArrayList m5112c(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            return arrayList;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e);
            return new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:185:0x0430  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        HashMap map2;
        Object obj2;
        AdRequest adRequest;
        AdSize adSize;
        zzbio zzbioVar = zzbix.f8149Ia;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            zzedx zzedxVar = new zzedx();
            String str = (String) map.get("adUnitId");
            if (!TextUtils.isEmpty(str)) {
                zzedxVar.f13716e = str;
            }
            String str2 = (String) map.get("format");
            if (!TextUtils.isEmpty(str2)) {
                zzedxVar.f13717f = str2;
            }
            byte b = 0;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8183Ka)).booleanValue()) {
                boolean z = map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1");
                zzedxVar.f13718g = z;
                if (z) {
                    AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
                    if (map.containsKey("keywords")) {
                        ArrayList arrayListM5112c = m5112c((String) map.get("keywords"), "keywords");
                        int size = arrayListM5112c.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj3 = arrayListM5112c.get(i2);
                            i2++;
                            builder.f2926a.f3112a.add((String) obj3);
                        }
                    }
                    builder.m2741b(m5111b(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                builder.m2740a(next, jSONObject.getString(next));
                            }
                        } catch (JSONException e) {
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OutOfContextTestingGmsgHandler.generateAdManagerAdRequest", e);
                        }
                    }
                    if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                        builder.m2743d((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        builder.m2744e(m5112c((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        builder.f2926a.f3121j = (String) map.get("requestAgent");
                    }
                    if (map.containsKey("publisherProvidedId")) {
                        builder.f2926a.f3120i = (String) map.get("publisherProvidedId");
                    }
                    if (map.containsKey("categoryExclusions")) {
                        ArrayList arrayListM5112c2 = m5112c((String) map.get("categoryExclusions"), "categoryExclusions");
                        int size2 = arrayListM5112c2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj4 = arrayListM5112c2.get(i3);
                            i3++;
                            builder.f2926a.f3117f.add((String) obj4);
                        }
                    }
                    adRequest = new AdManagerAdRequest(builder);
                } else {
                    AdRequest.Builder builder2 = new AdRequest.Builder();
                    if (map.containsKey("keywords")) {
                        ArrayList arrayListM5112c3 = m5112c((String) map.get("keywords"), "keywords");
                        int size3 = arrayListM5112c3.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Object obj5 = arrayListM5112c3.get(i4);
                            i4++;
                            builder2.f2926a.f3112a.add((String) obj5);
                        }
                    }
                    builder2.m2741b(m5111b(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys2 = jSONObject2.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                builder2.m2740a(next2, jSONObject2.getString(next2));
                            }
                        } catch (JSONException e2) {
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OutOfContextTestingGmsgHandler.generateAdMobAdRequest", e2);
                        }
                    }
                    if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                        builder2.m2743d((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        builder2.m2744e(m5112c((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        builder2.f2926a.f3121j = (String) map.get("requestAgent");
                    }
                    adRequest = new AdRequest(builder2);
                }
                zzedxVar.f13712a = adRequest;
                String str3 = (String) map.get("width");
                String str4 = (String) map.get("height");
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    adSize = AdSize.f2946i;
                } else {
                    try {
                        adSize = new AdSize(Integer.parseInt(str3), Integer.parseInt(str4));
                    } catch (NumberFormatException e3) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OutOfContextTestingGmsgHandler.generateAdSize", e3);
                        adSize = AdSize.f2946i;
                    }
                }
                zzedxVar.f13715d = adSize;
                if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                    VideoOptions.Builder builder3 = new VideoOptions.Builder();
                    if (map.containsKey("startMuted")) {
                        builder3.f2988a = ((String) map.get("startMuted")).equals("1");
                    }
                    if (map.containsKey("customControlsRequested")) {
                        builder3.f2989b = ((String) map.get("customControlsRequested")).equals("1");
                    }
                    if (map.containsKey("clickToExpandRequested")) {
                        builder3.f2990c = ((String) map.get("clickToExpandRequested")).equals("1");
                    }
                    zzedxVar.f13714c = new VideoOptions(builder3);
                }
                if (map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (zzedxVar.f13714c != null && zzedxVar.f13717f.equals("NATIVE"))) {
                    NativeAdOptions.Builder builder4 = new NativeAdOptions.Builder();
                    if (map.containsKey("disableImageLoading")) {
                        builder4.f3767a = ((String) map.get("disableImageLoading")).equals("1");
                    }
                    if (map.containsKey("mediaAspectRatio")) {
                        String str5 = (String) map.get("mediaAspectRatio");
                        if (!TextUtils.isEmpty(str5)) {
                            try {
                                builder4.f3768b = Integer.parseInt(str5);
                            } catch (NumberFormatException e4) {
                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio", e4);
                            }
                        }
                    }
                    if (map.containsKey("shouldRequestMultipleImages")) {
                        builder4.f3769c = ((String) map.get("shouldRequestMultipleImages")).equals("1");
                    }
                    if (map.containsKey("preferredAdChoicesPosition")) {
                        String str6 = (String) map.get("preferredAdChoicesPosition");
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                builder4.f3771e = Integer.parseInt(str6);
                            } catch (NumberFormatException e5) {
                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition", e5);
                            }
                        }
                    }
                    if (map.containsKey("customMuteThisAdRequested")) {
                        builder4.f3772f = ((String) map.get("customMuteThisAdRequested")).equals("1");
                    }
                    VideoOptions videoOptions = zzedxVar.f13714c;
                    if (videoOptions != null) {
                        builder4.f3770d = videoOptions;
                    }
                    zzedxVar.f13713b = new NativeAdOptions(builder4);
                }
            }
            String str7 = (String) map.get("action");
            if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(zzedxVar.f13716e)) {
                return;
            }
            if (!str7.equals("load") || TextUtils.isEmpty(zzedxVar.f13717f)) {
                if (str7.equals("show")) {
                    zzedw zzedwVar = this.f9280a;
                    String str8 = zzedxVar.f13716e;
                    synchronized (zzedwVar) {
                        try {
                            zzedk zzedkVar = zzedwVar.f13709v;
                            zzclb zzclbVar = zzedkVar.f13683v;
                            Activity activityZzj = (zzclbVar == null || zzclbVar.mo5576F()) ? null : zzedkVar.f13683v.zzj();
                            if (activityZzj != null && (obj2 = (map2 = zzedwVar.f13706s).get(str8)) != null) {
                                zzbio zzbioVar2 = zzbix.f8166Ja;
                                com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                                if (!((Boolean) zzbaVar2.f3098c.m5030a(zzbioVar2)).booleanValue() || (obj2 instanceof AppOpenAd) || (obj2 instanceof InterstitialAd) || (obj2 instanceof RewardedAd) || (obj2 instanceof RewardedInterstitialAd)) {
                                    map2.remove(str8);
                                }
                                zzedwVar.m6181m4(zzedw.m6178o4(obj2));
                                if (obj2 instanceof AppOpenAd) {
                                    ((AppOpenAd) obj2).mo2768d(activityZzj);
                                    return;
                                }
                                if (obj2 instanceof InterstitialAd) {
                                    ((InterstitialAd) obj2).mo3277e(activityZzj);
                                    return;
                                }
                                if (obj2 instanceof RewardedAd) {
                                    ((RewardedAd) obj2).mo3363d(activityZzj, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzedv
                                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                                        /* JADX INFO: renamed from: a */
                                        public final /* synthetic */ void mo162a() {
                                        }
                                    });
                                    return;
                                }
                                if (obj2 instanceof RewardedInterstitialAd) {
                                    ((RewardedInterstitialAd) obj2).mo3366c(activityZzj, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzedt
                                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                                        /* JADX INFO: renamed from: a */
                                        public final /* synthetic */ void mo162a() {
                                        }
                                    });
                                    return;
                                }
                                if (((Boolean) zzbaVar2.f3098c.m5030a(zzbioVar2)).booleanValue() && ((obj2 instanceof AdView) || (obj2 instanceof NativeAd))) {
                                    Intent intent = new Intent();
                                    Context contextM6182n4 = zzedwVar.m6182n4();
                                    intent.setClassName(contextM6182n4, "com.google.android.gms.ads.OutOfContextTestingActivity");
                                    intent.putExtra("adUnit", str8);
                                    com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                                    com.google.android.gms.ads.internal.util.zzs.m3220s(contextM6182n4, intent);
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return;
            }
            final zzedw zzedwVar2 = this.f9280a;
            synchronized (zzedwVar2) {
                try {
                    String str9 = zzedxVar.f13717f;
                    switch (str9.hashCode()) {
                        case -1999289321:
                            if (!str9.equals("NATIVE")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case -1372958932:
                            if (!str9.equals("INTERSTITIAL")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case -428325382:
                            if (!str9.equals("APP_OPEN_AD")) {
                                b = -1;
                            }
                            break;
                        case 543046670:
                            if (!str9.equals("REWARDED")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1854800829:
                            if (!str9.equals("REWARDED_INTERSTITIAL")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        case 1951953708:
                            if (!str9.equals("BANNER")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        String str10 = zzedxVar.f13716e;
                        AppOpenAd.m2765b(zzedwVar2.m6182n4(), str10, zzedxVar.f13712a, new zzedl(zzedwVar2, str10));
                        return;
                    }
                    if (b == 1) {
                        String str11 = zzedxVar.f13716e;
                        zzbio zzbioVar3 = zzbix.f8183Ka;
                        com.google.android.gms.ads.internal.client.zzba zzbaVar3 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                        BaseAdView adManagerAdView = (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue() && zzedxVar.f13718g) ? new AdManagerAdView(zzedwVar2.m6182n4()) : new AdView(zzedwVar2.m6182n4());
                        adManagerAdView.setAdSize(zzedxVar.f13715d);
                        adManagerAdView.setAdUnitId(str11);
                        adManagerAdView.setAdListener(new zzedm(zzedwVar2, str11, adManagerAdView));
                        VideoOptions videoOptions2 = zzedxVar.f13714c;
                        if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue() && zzedxVar.f13718g && videoOptions2 != null) {
                            ((AdManagerAdView) adManagerAdView).setVideoOptions(videoOptions2);
                        }
                        adManagerAdView.m2754b(zzedxVar.f13712a);
                        return;
                    }
                    if (b == 2) {
                        String str12 = zzedxVar.f13716e;
                        InterstitialAd.m3273b(zzedwVar2.m6182n4(), str12, zzedxVar.f13712a, new zzedn(zzedwVar2, str12));
                    } else {
                        if (b == 3) {
                            final String str13 = zzedxVar.f13716e;
                            AdLoader.Builder builder5 = new AdLoader.Builder(zzedwVar2.m6182n4(), str13);
                            try {
                                builder5.f2944b.mo2828C2(new zzbyx(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzedu
                                    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                                    /* JADX INFO: renamed from: a */
                                    public final /* synthetic */ void mo3309a(zzbys zzbysVar) {
                                        zzedwVar2.m6179k4(zzbysVar, str13);
                                    }
                                }));
                            } catch (RemoteException e6) {
                                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to add google native ad listener", e6);
                            }
                            builder5.m2750b(new zzedq(zzedwVar2));
                            NativeAdOptions nativeAdOptions = zzedxVar.f13713b;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8183Ka)).booleanValue() && nativeAdOptions != null) {
                                builder5.m2751c(nativeAdOptions);
                            }
                            builder5.m2749a().m2748a(zzedxVar.f13712a);
                            return;
                        }
                        if (b == 4) {
                            String str14 = zzedxVar.f13716e;
                            RewardedAd.m3360b(zzedwVar2.m6182n4(), str14, zzedxVar.f13712a, new zzedo(zzedwVar2, str14));
                        } else if (b == 5) {
                            String str15 = zzedxVar.f13716e;
                            RewardedInterstitialAd.m3364b(zzedwVar2.m6182n4(), str15, zzedxVar.f13712a, new zzedp(zzedwVar2, str15));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
