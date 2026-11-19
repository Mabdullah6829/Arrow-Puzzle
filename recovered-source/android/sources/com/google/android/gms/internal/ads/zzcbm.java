package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbm {

    /* JADX INFO: renamed from: a */
    public final List f9690a;

    /* JADX INFO: renamed from: b */
    public final String f9691b;

    /* JADX INFO: renamed from: c */
    public final String f9692c;

    /* JADX INFO: renamed from: d */
    public final boolean f9693d;

    /* JADX INFO: renamed from: e */
    public final boolean f9694e;

    /* JADX INFO: renamed from: f */
    public final String f9695f;

    /* JADX INFO: renamed from: g */
    public final int f9696g;

    /* JADX INFO: renamed from: h */
    public final JSONObject f9697h;

    /* JADX INFO: renamed from: i */
    public final String f9698i;

    /* JADX INFO: renamed from: j */
    public final long f9699j;

    /* JADX INFO: renamed from: k */
    public final long f9700k;

    /* JADX INFO: renamed from: l */
    public final boolean f9701l;

    /* JADX INFO: renamed from: m */
    public final String f9702m;

    public zzcbm(JSONObject jSONObject) {
        Long lValueOf;
        Long lValueOf2 = -1L;
        this.f9695f = jSONObject.optString("url");
        this.f9691b = jSONObject.optString("base_uri");
        this.f9692c = jSONObject.optString("post_parameters");
        this.f9693d = m5305a(jSONObject.optString("drt_include"));
        this.f9702m = jSONObject.optString(FirebaseAnalytics.Param.CONTENT_TYPE);
        this.f9701l = m5305a(jSONObject.optString("use_compression"));
        this.f9694e = m5305a(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f9690a = strOptString == null ? null : Arrays.asList(strOptString.split(","));
        this.f9696g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f9697h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f9698i = jSONObject.optString("pool_key");
        String strOptString2 = jSONObject.optString("start_time");
        if (TextUtils.isEmpty(strOptString2)) {
            lValueOf = lValueOf2;
        } else {
            try {
                lValueOf = Long.valueOf(strOptString2);
            } catch (NumberFormatException unused) {
                lValueOf = lValueOf2;
            }
        }
        this.f9699j = lValueOf.longValue();
        String strOptString3 = jSONObject.optString("end_time");
        if (!TextUtils.isEmpty(strOptString3)) {
            try {
                lValueOf2 = Long.valueOf(strOptString3);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f9700k = lValueOf2.longValue();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5305a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }
}
