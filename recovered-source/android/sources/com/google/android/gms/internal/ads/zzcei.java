package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcei {
    /* JADX INFO: renamed from: a */
    public static String m5373a(String str, Context context, boolean z, HashMap map) {
        String strM5364d;
        zzbio zzbioVar = zzbix.f8389X0;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue() && !z) {
            return str;
        }
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zzceg zzcegVar = zztVar.f3725y;
        com.google.android.gms.ads.internal.util.zzs zzsVar = zztVar.f3703c;
        zzceg zzcegVar2 = zztVar.f3725y;
        if (!zzcegVar.m5361a(context) || TextUtils.isEmpty(str) || (strM5364d = zzcegVar2.m5364d(context)) == null) {
            return str;
        }
        String str2 = (String) zzbivVar2.m5030a(zzbix.f8275Q0);
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8258P0)).booleanValue() && str.contains(str2)) {
            if (zzsVar.m3234H(str)) {
                Map map2 = (Map) map.get("_ac");
                zzcegVar2.getClass();
                zzcegVar2.m5366h(context, "_ac", strM5364d, zzceg.m5359f(map2));
                return m5375c(context, str).replace(str2, strM5364d);
            }
            if (!zzsVar.m3235I(str)) {
                return str;
            }
            Map map3 = (Map) map.get("_ai");
            zzcegVar2.getClass();
            zzcegVar2.m5366h(context, "_ai", strM5364d, zzceg.m5359f(map3));
            return m5375c(context, str).replace(str2, strM5364d);
        }
        if (str.contains("fbs_aeid") || ((Boolean) zzbivVar2.m5030a(zzbix.f8241O0)).booleanValue()) {
            return str;
        }
        if (zzsVar.m3234H(str)) {
            Map map4 = (Map) map.get("_ac");
            zzcegVar2.getClass();
            zzcegVar2.m5366h(context, "_ac", strM5364d, zzceg.m5359f(map4));
            return m5374b(m5375c(context, str), "fbs_aeid", strM5364d).toString();
        }
        if (!zzsVar.m3235I(str)) {
            return str;
        }
        Map map5 = (Map) map.get("_ai");
        zzcegVar2.getClass();
        zzcegVar2.m5366h(context, "_ai", strM5364d, zzceg.m5359f(map5));
        return m5374b(m5375c(context, str), "fbs_aeid", strM5364d).toString();
    }

    /* JADX INFO: renamed from: b */
    public static Uri m5374b(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i2 = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i2));
        AbstractC0271e0.m413u(sb, str2, "=", str3, "&");
        sb.append(str.substring(i2));
        return Uri.parse(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static String m5375c(Context context, String str) {
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        String strM5362b = zztVar.f3725y.m5362b(context);
        String strM5363c = zztVar.f3725y.m5363c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strM5362b)) {
            str = m5374b(str, "gmp_app_id", strM5362b).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strM5363c)) ? str : m5374b(str, "fbs_aiid", strM5363c).toString();
    }
}
