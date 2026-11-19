package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeuq implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final zzflg f14924a;

    /* JADX INFO: renamed from: b */
    public final long f14925b;

    /* JADX INFO: renamed from: c */
    public final long f14926c;

    public zzeuq(zzflg zzflgVar, long j2, long j3) {
        this.f14924a = zzflgVar;
        this.f14925b = j2;
        this.f14926c = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflg zzflgVar = this.f14924a;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflgVar.f16040d;
        int i2 = zzmVar.f3220O;
        Bundle bundle2 = zzmVar.f3229u;
        bundle.putInt("http_timeout_millis", i2);
        bundle.putString("slotname", zzflgVar.f16043g);
        int i3 = zzflgVar.f16052p.f15997a;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        if (i4 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i4 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j2 = this.f14925b;
        bundle.putLong("start_signals_timestamp", j2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8387We)).booleanValue()) {
            bundle.putLong("tsi", j2 - this.f14926c);
        }
        zzflv.m6496d(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        zzflv.m6494b(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j3 = zzmVar.f3228t;
        zzflv.m6494b(bundle, "cust_age", simpleDateFormat.format(new Date(j3)), j3 != -1);
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i5 = zzmVar.f3230v;
        zzflv.m6495c(bundle, "cust_gender", i5, i5 != -1);
        List list = zzmVar.f3231w;
        if (list != null) {
            bundle.putStringArrayList("kw", new ArrayList<>(list));
        }
        int i6 = zzmVar.f3233y;
        zzflv.m6495c(bundle, "tag_for_child_directed_treatment", i6, i6 != -1);
        if (zzmVar.f3232x) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.f3222Q);
        int i7 = zzmVar.f3227s;
        zzflv.m6495c(bundle, "d_imp_hdr", 1, i7 >= 2 && zzmVar.f3234z);
        String str = zzmVar.f3206A;
        zzflv.m6494b(bundle, "ppid", str, i7 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.f3208C;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        zzflv.m6497e("url", zzmVar.f3209D, bundle);
        List list2 = zzmVar.f3219N;
        if (list2 != null) {
            bundle.putStringArrayList("neighboring_content_urls", new ArrayList<>(list2));
        }
        Bundle bundle4 = zzmVar.f3211F;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        List list3 = zzmVar.f3212G;
        if (list3 != null) {
            bundle.putStringArrayList("category_exclusions", new ArrayList<>(list3));
        }
        zzflv.m6497e("request_agent", zzmVar.f3213H, bundle);
        zzflv.m6497e("request_pkg", zzmVar.f3214I, bundle);
        zzflv.m6496d(bundle, "is_designed_for_families", zzmVar.f3215J, i7 >= 7);
        if (i7 >= 8) {
            int i8 = zzmVar.f3217L;
            zzflv.m6495c(bundle, "tag_for_under_age_of_consent", i8, i8 != -1);
            zzflv.m6497e("max_ad_content_rating", zzmVar.f3218M, bundle);
        }
        int i9 = zzmVar.f3225T;
        zzflv.m6495c(bundle, "tfat", i9, i9 != -1);
        Bundle bundle5 = zzflgVar.f16041e;
        bundle.putInt("plcs", bundle5.getInt("plcs"));
        bundle.putInt("plbs", bundle5.getInt("plbs"));
        zzflv.m6497e("plid", bundle5.getString("plid"), bundle);
        zzflv.m6495c(bundle, "s2s_rr", 1, zzflgVar.f16058v && !(zzmVar.f3216K == null && zzmVar.f3221P == null));
    }
}
