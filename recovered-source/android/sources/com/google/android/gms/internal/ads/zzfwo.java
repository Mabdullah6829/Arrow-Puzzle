package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfwo {

    /* JADX INFO: renamed from: a */
    public static WindowManager f16712a;

    /* JADX INFO: renamed from: b */
    public static final String[] f16713b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c */
    public static float f16714c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: a */
    public static JSONObject m6747a(int i2, int i3, int i4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i2 / f16714c);
            jSONObject.put("y", i3 / f16714c);
            jSONObject.put("width", i4 / f16714c);
            jSONObject.put("height", i5 / f16714c);
            return jSONObject;
        } catch (JSONException e) {
            zzfwp.m6752a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6748b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            StringBuilder sb = new StringBuilder(str.length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            zzfwp.m6752a(sb.toString(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6749c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m6750d(JSONObject jSONObject) {
        float f2;
        float f3;
        if (f16712a != null) {
            Point point = new Point(0, 0);
            f16712a.getDefaultDisplay().getRealSize(point);
            float f4 = point.x;
            float f5 = f16714c;
            f2 = f4 / f5;
            f3 = point.y / f5;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        try {
            jSONObject.put("width", f2);
            jSONObject.put("height", f3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6 A[LOOP:1: B:49:0x00c2->B:53:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00db A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static boolean m6751e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        int i2;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            for (int i3 = 0; i3 < 4; i3++) {
                String str = f16713b[i3];
                if (jSONObject.optDouble(str) == jSONObject2.optDouble(str)) {
                }
            }
            if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("isFriendlyObstructionFor");
                JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray != null) {
                    }
                    if (jSONArrayOptJSONArray != null) {
                        for (i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            if (m6751e(jSONArrayOptJSONArray.optJSONObject(i2), jSONArrayOptJSONArray2.optJSONObject(i2))) {
                            }
                        }
                        return true;
                    }
                    while (i2 < jSONArrayOptJSONArray.length()) {
                        if (m6751e(jSONArrayOptJSONArray.optJSONObject(i2), jSONArrayOptJSONArray2.optJSONObject(i2))) {
                        }
                    }
                    return true;
                }
                if ((jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) || (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray4 != null && jSONArrayOptJSONArray3.length() == jSONArrayOptJSONArray4.length())) {
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                        if (jSONArrayOptJSONArray3.optString(i4, "").equals(jSONArrayOptJSONArray4.optString(i4, ""))) {
                        }
                    }
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 == null) {
                        return true;
                    }
                    if ((jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 == null) || (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray.length() == jSONArrayOptJSONArray2.length())) {
                        while (i2 < jSONArrayOptJSONArray.length()) {
                            if (m6751e(jSONArrayOptJSONArray.optJSONObject(i2), jSONArrayOptJSONArray2.optJSONObject(i2))) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
