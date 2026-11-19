package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxp {

    /* JADX INFO: renamed from: b */
    public JSONObject f13257b;

    /* JADX INFO: renamed from: c */
    public final Executor f13258c;

    /* JADX INFO: renamed from: d */
    public boolean f13259d;

    /* JADX INFO: renamed from: e */
    public JSONObject f13260e;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f13256a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f13261f = new AtomicBoolean(false);

    public zzdxp(Executor executor) {
        this.f13258c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6084a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f13259d = true;
            zzcff zzcffVarZzi = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi();
            if (zzcffVarZzi != null && (jSONObject = zzcffVarZzi.f9879g) != null) {
                this.f13257b = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8377W4)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f13260e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                ConcurrentHashMap concurrentHashMap = this.f13256a;
                                if (concurrentHashMap.containsKey(strOptString2)) {
                                    map = (Map) concurrentHashMap.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                                    concurrentHashMap.put(strOptString2, concurrentHashMap2);
                                    map = concurrentHashMap2;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
