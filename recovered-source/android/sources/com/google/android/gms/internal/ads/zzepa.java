package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzepa implements zzema {
    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6284a(zzfky zzfkyVar, zzfkn zzfknVar) {
        JSONObject jSONObject = zzfknVar.f15958v;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzflg zzflgVar = zzfkyVar.f16005a.f15998a;
        zzflf zzflfVar = new zzflf();
        zzflfVar.f16027o.f15996a = zzflgVar.f16052p.f15997a;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflgVar.f16040d;
        zzflfVar.f16013a = zzmVar;
        zzflfVar.f16014b = zzflgVar.f16042f;
        zzflfVar.f16036x = zzflgVar.f16060x;
        String str = zzflgVar.f16043g;
        zzflfVar.f16015c = str;
        zzflfVar.f16016d = zzflgVar.f16037a;
        zzflfVar.f16018f = zzflgVar.f16044h;
        zzflfVar.f16019g = zzflgVar.f16045i;
        zzflfVar.f16020h = zzflgVar.f16046j;
        zzflfVar.f16021i = zzflgVar.f16047k;
        AdManagerAdViewOptions adManagerAdViewOptions = zzflgVar.f16049m;
        zzflfVar.f16022j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            zzflfVar.f16017e = adManagerAdViewOptions.f2995s;
        }
        PublisherAdViewOptions publisherAdViewOptions = zzflgVar.f16050n;
        zzflfVar.f16023k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            zzflfVar.f16017e = publisherAdViewOptions.f3010s;
            zzflfVar.f16024l = publisherAdViewOptions.f3011t;
        }
        zzflfVar.f16028p = zzflgVar.f16053q;
        zzflfVar.f16029q = zzflgVar.f16054r;
        zzflfVar.f16030r = zzflgVar.f16039c;
        zzflfVar.f16031s = zzflgVar.f16055s;
        zzflfVar.f16032t = zzflgVar.f16056t;
        zzflfVar.f16033u.set(zzflgVar.f16057u.get());
        zzflfVar.f16035w = zzflgVar.f16059w;
        zzflfVar.f16015c = strOptString;
        zzflfVar.f16034v = true;
        Bundle bundle = zzmVar.f3210E;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundle4.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundle4.putString("_ad", strOptString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfknVar.f15887D;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        zzflfVar.f16013a = new com.google.android.gms.ads.internal.client.zzm(zzmVar.f3227s, zzmVar.f3228t, bundle4, zzmVar.f3230v, zzmVar.f3231w, zzmVar.f3232x, zzmVar.f3233y, zzmVar.f3234z, zzmVar.f3206A, zzmVar.f3207B, zzmVar.f3208C, zzmVar.f3209D, bundle2, zzmVar.f3211F, zzmVar.f3212G, zzmVar.f3213H, zzmVar.f3214I, zzmVar.f3215J, zzmVar.f3216K, zzmVar.f3217L, zzmVar.f3218M, zzmVar.f3219N, zzmVar.f3220O, zzmVar.f3221P, zzmVar.f3222Q, zzmVar.f3223R, zzmVar.f3224S, zzmVar.f3225T);
        zzflfVar.f16035w = zzfknVar.f15896H0;
        zzflg zzflgVarM6485a = zzflfVar.m6485a();
        Bundle bundle5 = new Bundle();
        zzfkq zzfkqVar = zzfkyVar.f16006b.f16002b;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(zzfkqVar.f15972a));
        bundle6.putInt("refresh_interval", zzfkqVar.f15974c);
        bundle6.putString("gws_query_id", zzfkqVar.f15973b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", zzfknVar.f15960w);
        bundle7.putString("ad_source_name", zzfknVar.f15891F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(zzfknVar.f15920c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(zzfknVar.f15922d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfknVar.f15946p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(zzfknVar.f15940m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(zzfknVar.f15928g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(zzfknVar.f15930h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(zzfknVar.f15932i));
        bundle7.putString(FirebaseAnalytics.Param.TRANSACTION_ID, zzfknVar.f15934j);
        bundle7.putString("valid_from_timestamp", zzfknVar.f15936k);
        bundle7.putBoolean("is_closable_area_disabled", zzfknVar.f15905P);
        bundle7.putString("recursive_server_response_data", zzfknVar.f15945o0);
        bundle7.putBoolean("is_analytics_logging_enabled", zzfknVar.f15912W);
        zzcci zzcciVar = zzfknVar.f15938l;
        if (zzcciVar != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", zzcciVar.f9741t);
            bundle8.putString("rb_type", zzcciVar.f9740s);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return mo6305c(zzflgVarM6485a, bundle5, zzfknVar, zzfkyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: b */
    public final boolean mo6285b(zzfky zzfkyVar, zzfkn zzfknVar) {
        return !TextUtils.isEmpty(zzfknVar.f15958v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* JADX INFO: renamed from: c */
    public abstract zzfoz mo6305c(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar);
}
