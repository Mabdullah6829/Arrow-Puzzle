package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvd {

    /* JADX INFO: renamed from: a */
    public final List f9435a;

    public zzbvd(JSONObject jSONObject) throws JSONException {
        if (com.google.android.gms.ads.internal.util.client.zzo.m3077j(2)) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                zzbvc zzbvcVar = new zzbvc(jSONArray.getJSONObject(i3));
                "banner".equalsIgnoreCase(zzbvcVar.f9434c);
                arrayList.add(zzbvcVar);
                if (i2 < 0) {
                    Iterator it = zzbvcVar.f9432a.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i2 = i3;
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f9435a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            zzbve zzbveVar = com.google.android.gms.ads.internal.zzt.f3698C.f3722v;
            zzbve.m5151a(jSONObjectOptJSONObject, "click_urls");
            zzbve.m5151a(jSONObjectOptJSONObject, "imp_urls");
            zzbve.m5151a(jSONObjectOptJSONObject, "downloaded_imp_urls");
            zzbve.m5151a(jSONObjectOptJSONObject, "nofill_urls");
            zzbve.m5151a(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            zzcci.m5329w(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
