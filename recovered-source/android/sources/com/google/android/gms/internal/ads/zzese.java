package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzese {

    /* JADX INFO: renamed from: a */
    public final HashMap f14764a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f14765b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f14766c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f14767d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f14768e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Executor f14769f;

    /* JADX INFO: renamed from: g */
    public JSONObject f14770g;

    public zzese(Executor executor) {
        this.f14769f = executor;
    }

    /* JADX INFO: renamed from: j */
    public static final Bundle m6323j(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized zzgww m6324a(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi().f9877e) && (map = (Map) this.f14766c.get(str)) != null) {
                List<zzesg> list = (List) map.get(str2);
                if (list == null) {
                    String strM6085a = zzdxr.m6085a(this.f14770g, str2, str);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8686oc)).booleanValue()) {
                        strM6085a = strM6085a.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strM6085a);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (zzesg zzesgVar : list) {
                        String str3 = zzesgVar.f14771a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(zzesgVar.f14772b);
                    }
                    return zzgww.m7229a(map2);
                }
            }
            return zzgyt.f18367y;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6325b(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap map = this.f14764a;
            if (!map.containsKey(str)) {
                map.put(str, new zzesg(new Bundle(), str));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6326c() {
        this.f14765b.clear();
        this.f14764a.clear();
        this.f14768e.clear();
        this.f14767d.clear();
        m6329f();
        m6327d();
        m6328e();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m6327d() {
        JSONObject jSONObject;
        if (!((Boolean) zzbld.f9118g.m5057c()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8744s2)).booleanValue() && (jSONObject = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi().f9879g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        Bundle bundleM6323j = m6323j(jSONObject2.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject2.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f14765b.put(strOptString, new zzesi(strOptString, zOptBoolean2, zOptBoolean, true, bundleM6323j));
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.m3151l("Malformed config loading JSON.", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6328e() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) zzbld.f9113b.m5057c()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8761t2)).booleanValue() && (jSONObject = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi().f9879g) != null) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String strOptString = jSONObject2.optString("adapter_class_name");
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("permission_set");
                            if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i3);
                                    boolean zOptBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                    boolean zOptBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                    boolean zOptBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                    String strOptString2 = jSONObject3.optString("platform");
                                    zzesi zzesiVar = new zzesi(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                    if (strOptString2.equals("ADMOB")) {
                                        this.f14767d.put(strOptString, zzesiVar);
                                    } else if (strOptString2.equals("AD_MANAGER")) {
                                        this.f14768e.put(strOptString, zzesiVar);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.m3151l("Malformed config loading JSON.", e);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m6329f() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi().f9879g;
            if (jSONObject != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f14770g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i2);
                            String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8686oc)).booleanValue() ? jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", "");
                            String strOptString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                    arrayList.addAll(m6330g(jSONArrayOptJSONArray.getJSONObject(i3)));
                                }
                            }
                            m6331h(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.m3151l("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized ArrayList m6330g(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleM6323j = m6323j(jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i2, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str = (String) arrayList2.get(i3);
                        m6325b(str);
                        if (((zzesg) this.f14764a.get(str)) != null) {
                            arrayList.add(new zzesg(bundleM6323j, str));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m6331h(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap map = this.f14766c;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List arrayList2 = (List) map2.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.addAll(arrayList);
            map2.put(str2, arrayList2);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized zzgww m6332i(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi().f9877e)) {
                zzbio zzbioVar = zzbix.f8492d4;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                boolean zMatches = Pattern.matches((String) zzbaVar.f3098c.m5030a(zzbioVar), str);
                boolean zMatches2 = Pattern.matches((String) zzbaVar.f3098c.m5030a(zzbix.f8509e4), str);
                if (zMatches) {
                    map = new HashMap(this.f14768e);
                } else if (zMatches2) {
                    map = new HashMap(this.f14767d);
                }
                return zzgww.m7229a(map);
            }
            return zzgyt.f18367y;
        } catch (Throwable th) {
            throw th;
        }
    }
}
