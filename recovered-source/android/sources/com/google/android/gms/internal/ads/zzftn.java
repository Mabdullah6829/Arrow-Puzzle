package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftn {

    /* JADX INFO: renamed from: a */
    public final zzdzt f16499a;

    public zzftn(zzdzt zzdztVar) {
        this.f16499a = zzdztVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6678a(int i2, long j2, zzftu zzftuVar, String str) {
        zzdzs zzdzsVarM6111a = this.f16499a.m6111a();
        zzdzsVarM6111a.m6107b("action", "start_preload");
        zzdzsVarM6111a.m6107b("sp_ts", Long.toString(j2));
        zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, zzftuVar.m6694a());
        zzdzsVarM6111a.m6107b("ad_unit_id", zzftuVar.f16520a);
        zzdzsVarM6111a.m6107b("pid", zzftuVar.f16522c);
        zzdzsVarM6111a.m6107b("max_ads", Integer.toString(i2));
        zzdzsVarM6111a.m6107b("pv", str);
        zzdzsVarM6111a.m6108c();
    }

    /* JADX INFO: renamed from: b */
    public final void m6679b(EnumMap enumMap, long j2) {
        zzdzs zzdzsVarM6111a = this.f16499a.m6111a();
        zzdzsVarM6111a.m6107b("action", "start_preload");
        zzdzsVarM6111a.m6107b("sp_ts", Long.toString(j2));
        zzdzsVarM6111a.m6107b("pv", "1");
        for (AdFormat adFormat : enumMap.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzdzsVarM6111a.m6107b(strValueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(adFormat)).intValue()));
        }
        zzdzsVarM6111a.m6108c();
    }

    /* JADX INFO: renamed from: c */
    public final void m6680c(int i2, int i3, long j2, Long l2, String str, zzftu zzftuVar, String str2) {
        zzdzs zzdzsVarM6111a = this.f16499a.m6111a();
        zzdzsVarM6111a.m6107b("plaac_ts", Long.toString(j2));
        zzdzsVarM6111a.m6107b("max_ads", Integer.toString(i2));
        zzdzsVarM6111a.m6107b("cache_size", Integer.toString(i3));
        zzdzsVarM6111a.m6107b("action", "is_ad_available");
        if (zzftuVar != null) {
            zzdzsVarM6111a.m6107b("ad_unit_id", zzftuVar.f16520a);
            zzdzsVarM6111a.m6107b("pid", zzftuVar.f16522c);
            zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, zzftuVar.m6694a());
        }
        if (l2 != null) {
            zzdzsVarM6111a.m6107b("plaay_ts", Long.toString(l2.longValue()));
        }
        if (str != null) {
            zzdzsVarM6111a.m6107b("gqi", str);
        }
        zzdzsVarM6111a.m6107b("pv", str2);
        zzdzsVarM6111a.m6108c();
    }

    /* JADX INFO: renamed from: d */
    public final void m6681d(long j2, int i2, int i3, String str, zzftu zzftuVar, String str2) {
        zzdzs zzdzsVarM6111a = this.f16499a.m6111a();
        zzdzsVarM6111a.m6107b("ppla_ts", Long.toString(j2));
        zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, zzftuVar.m6694a());
        zzdzsVarM6111a.m6107b("ad_unit_id", zzftuVar.f16520a);
        zzdzsVarM6111a.m6107b("pid", zzftuVar.f16522c);
        zzdzsVarM6111a.m6107b("max_ads", Integer.toString(i2));
        zzdzsVarM6111a.m6107b("cache_size", Integer.toString(i3));
        zzdzsVarM6111a.m6107b("action", "poll_ad");
        if (str != null) {
            zzdzsVarM6111a.m6107b("gqi", str);
        }
        zzdzsVarM6111a.m6107b("pv", str2);
        zzdzsVarM6111a.m6108c();
    }

    /* JADX INFO: renamed from: e */
    public final void m6682e(long j2, long j3, long j4, long j5, long j6) {
        zzdzs zzdzsVarM6111a = this.f16499a.m6111a();
        zzdzsVarM6111a.m6107b("action", "iic");
        zzdzsVarM6111a.m6107b("pat", Long.toString(j2));
        zzdzsVarM6111a.m6107b("bot", Long.toString(j3));
        zzdzsVarM6111a.m6107b("cim", Long.toString(j4));
        zzdzsVarM6111a.m6107b("mbot", Long.toString(j5));
        zzdzsVarM6111a.m6107b("mim", Long.toString(j6));
        zzdzsVarM6111a.m6108c();
    }

    /* JADX INFO: renamed from: f */
    public final void m6683f(String str, long j2, String str2, String str3, AdFormat adFormat, int i2, int i3, int i4) {
        zzdzs zzdzsVarM6111a = this.f16499a.m6111a();
        zzdzsVarM6111a.m6107b("action", str);
        zzdzsVarM6111a.m6107b("pat", Long.toString(j2));
        zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdzsVarM6111a.m6107b("max_ads", Integer.toString(i2));
        zzdzsVarM6111a.m6107b("cache_size", Integer.toString(i3));
        zzdzsVarM6111a.m6107b("pas", Integer.toString(i4));
        zzdzsVarM6111a.m6107b("pv", "2");
        zzdzsVarM6111a.m6107b("ad_unit_id", str3);
        zzdzsVarM6111a.m6107b("pid", str2);
        zzdzsVarM6111a.m6108c();
    }

    /* JADX INFO: renamed from: g */
    public final void m6684g(String str, String str2, long j2, int i2, int i3, String str3, zzftu zzftuVar, String str4) {
        zzdzs zzdzsVarM6111a = this.f16499a.m6111a();
        zzdzsVarM6111a.m6107b(str2, Long.toString(j2));
        if (zzftuVar != null) {
            zzdzsVarM6111a.m6107b("ad_unit_id", zzftuVar.f16520a);
            zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, zzftuVar.m6694a());
            zzdzsVarM6111a.m6107b("pid", zzftuVar.f16522c);
        }
        zzdzsVarM6111a.m6107b("action", str);
        if (str3 != null) {
            zzdzsVarM6111a.m6107b("gqi", str3);
        }
        if (i2 >= 0) {
            zzdzsVarM6111a.m6107b("max_ads", Integer.toString(i2));
        }
        if (i3 >= 0) {
            zzdzsVarM6111a.m6107b("cache_size", Integer.toString(i3));
        }
        zzdzsVarM6111a.m6107b("pv", str4);
        zzdzsVarM6111a.m6108c();
    }

    /* JADX INFO: renamed from: h */
    public final void m6685h(String str, long j2, String str2, String str3, AdFormat adFormat, int i2, int i3, int i4, int i5, int i6) {
        zzdzs zzdzsVarM6111a = this.f16499a.m6111a();
        zzdzsVarM6111a.m6107b("action", str);
        zzdzsVarM6111a.m6107b("pat", Long.toString(j2));
        zzdzsVarM6111a.m6107b("pid", str2);
        zzdzsVarM6111a.m6107b("ad_unit_id", str3);
        zzdzsVarM6111a.m6107b("max_ads", Integer.toString(i2));
        zzdzsVarM6111a.m6107b("cache_size", Integer.toString(i3));
        zzdzsVarM6111a.m6107b("tpcnt", Integer.toString(i5));
        zzdzsVarM6111a.m6107b("mpl", Integer.toString(i6));
        if (adFormat != null) {
            zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i4 > 0) {
            zzdzsVarM6111a.m6107b("nptr", Integer.toString(i4));
        }
        zzdzsVarM6111a.m6108c();
    }
}
