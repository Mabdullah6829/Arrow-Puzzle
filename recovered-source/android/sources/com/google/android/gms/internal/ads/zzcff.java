package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcff {

    /* JADX INFO: renamed from: d */
    public String f9876d;

    /* JADX INFO: renamed from: e */
    public String f9877e;

    /* JADX INFO: renamed from: f */
    public long f9878f;

    /* JADX INFO: renamed from: g */
    public JSONObject f9879g;

    /* JADX INFO: renamed from: h */
    public boolean f9880h;

    /* JADX INFO: renamed from: j */
    public boolean f9882j;

    /* JADX INFO: renamed from: a */
    public final ArrayList f9873a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f9874b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final HashMap f9875c = new HashMap();

    /* JADX INFO: renamed from: i */
    public final ArrayList f9881i = new ArrayList();

    public zzcff(String str, long j2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f9876d = "";
        this.f9880h = false;
        this.f9882j = false;
        this.f9877e = str;
        this.f9878f = j2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f9879g = new JSONObject(str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8501dd)).booleanValue() && m5378a()) {
                return;
            }
            if (this.f9879g.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                this.f9880h = false;
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("App settings could not be fetched successfully.");
                return;
            }
            this.f9880h = true;
            this.f9876d = this.f9879g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.f9879g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i3);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f9874b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f9875c.put(strOptString2, new zzbvd(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f9879g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                    this.f9873a.add(jSONArrayOptJSONArray3.optString(i4));
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8214M7)).booleanValue() && (jSONObjectOptJSONObject2 = this.f9879g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    this.f9881i.add(jSONArrayOptJSONArray.get(i5).toString());
                }
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8563h7)).booleanValue() || (jSONObjectOptJSONObject = this.f9879g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f9882j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AppSettings.parseAppSettingsJson", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5378a() {
        if (m5379b()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8459b5)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            zzdzt zzdztVar = zztVar.f3708h.f9897i;
            if (zzdztVar != null) {
                zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
                zzdzsVarM6111a.m6107b("action", "cld_reset");
                zzdzsVarM6111a.m6107b("cld_lut_ms", String.valueOf(this.f9878f));
                zztVar.f3711k.getClass();
                zzdzsVarM6111a.m6107b("event_timestamp", String.valueOf(System.currentTimeMillis()));
                zzdzsVarM6111a.m6107b("cld_ttl_sec", String.valueOf(m5380c()));
                zzdzsVarM6111a.m6108c();
            }
        }
        this.f9873a.clear();
        this.f9874b.clear();
        this.f9875c.clear();
        this.f9876d = "";
        this.f9877e = "";
        this.f9879g = null;
        this.f9880h = false;
        this.f9881i.clear();
        this.f9882j = false;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5379b() {
        if (TextUtils.isEmpty(this.f9877e) || this.f9879g == null) {
            return true;
        }
        long jM5380c = m5380c();
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jM5380c < 0) {
            return true;
        }
        long j2 = this.f9878f;
        return j2 <= jCurrentTimeMillis && TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j2) <= jM5380c;
    }

    /* JADX INFO: renamed from: c */
    public final long m5380c() {
        zzbio zzbioVar = zzbix.f8552gd;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        return (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8535fd)).booleanValue() || TextUtils.isEmpty(this.f9877e)) ? ((Long) zzbaVar.f3098c.m5030a(zzbioVar)).longValue() : this.f9879g.optLong("cache_ttl_sec", ((Long) zzbaVar.f3098c.m5030a(zzbioVar)).longValue());
    }
}
