package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvc {

    /* JADX INFO: renamed from: a */
    public final List f9432a;

    /* JADX INFO: renamed from: b */
    public final String f9433b;

    /* JADX INFO: renamed from: c */
    public final String f9434c;

    public zzbvc(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        this.f9432a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        zzbve zzbveVar = com.google.android.gms.ads.internal.zzt.f3698C.f3722v;
        zzbve.m5151a(jSONObject, "clickurl");
        zzbve.m5151a(jSONObject, "imp_urls");
        zzbve.m5151a(jSONObject, "downloaded_imp_urls");
        zzbve.m5151a(jSONObject, "fill_urls");
        zzbve.m5151a(jSONObject, "video_start_urls");
        zzbve.m5151a(jSONObject, "video_complete_urls");
        zzbve.m5151a(jSONObject, "video_reward_urls");
        jSONObject.optString(FirebaseAnalytics.Param.TRANSACTION_ID);
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            zzbve.m5151a(jSONObjectOptJSONObject, "manual_impression_urls");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f9433b = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        zzbve.m5151a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.f9434c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
