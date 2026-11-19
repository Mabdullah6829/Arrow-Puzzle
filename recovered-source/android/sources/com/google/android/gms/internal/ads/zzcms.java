package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcms {

    /* JADX INFO: renamed from: a */
    public static final Pattern f10577a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* JADX INFO: renamed from: b */
    public static final Pattern f10578b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    /* JADX INFO: renamed from: a */
    public static String m5672a(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f10577a.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!f10578b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m5673b(zzfkn zzfknVar) {
        zzbio zzbioVar = zzbix.f8612k6;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && zzfknVar.f15909T) {
            zzflj zzfljVar = zzfknVar.f15911V;
            zzfljVar.getClass();
            if (zzfljVar.f16062a.optBoolean((String) zzbaVar.f3098c.m5030a(zzbix.f8646m6), true) && zzfknVar.f15918b != 4) {
                zzelr zzelrVar = zzfljVar.m6487a() == 1 ? zzelr.VIDEO : zzelr.HTML_DISPLAY;
                String str = zzfknVar.f15939l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", zzelrVar.f14164s);
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3074g("Unable to build OMID ENV JSON", e);
                }
            }
        }
        return null;
    }
}
