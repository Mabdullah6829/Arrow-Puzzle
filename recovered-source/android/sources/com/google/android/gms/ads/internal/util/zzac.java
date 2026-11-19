package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzgcv;
import com.google.android.gms.internal.ads.zzgcw;
import com.google.android.gms.internal.ads.zzgcx;
import com.google.android.gms.internal.ads.zzgtf;
import com.google.android.gms.internal.ads.zzgug;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzac {
    /* JADX INFO: renamed from: a */
    public static void m3088a(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8512e7)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzgcv zzgcvVarM6890f = zzgcv.m6890f(context);
            zzgcw zzgcwVarM6893f = zzgcw.m6893f(context);
            zzgcx zzgcxVarM6895a = zzgcx.m6895a(context);
            zzgcvVarM6890f.m6891g();
            zzgcvVarM6890f.m6892h();
            zzgcwVarM6893f.m6894g();
            zzgcxVarM6895a.m6896b();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("clearStorageOnIdlessMode", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m3089b(Context context, String str) {
        JSONArray jSONArray;
        int i2;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                int i3 = zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3069b("JSON parsing error", e);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i2 = 1;
            } else if (iOptInt != 1) {
                i2 = iOptInt != 2 ? 0 : 3;
            } else {
                i2 = 2;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i2 != 0) {
                List listM7147e = zzgug.m7143a(zzgtf.m7124c('/')).m7147e(strOptString2);
                if (listM7147e.size() > 2 || listM7147e.isEmpty()) {
                    obj = null;
                } else {
                    if (listM7147e.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listM7147e.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listM7147e.get(0), 0);
                        str2 = (String) listM7147e.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i5 = i2 - 1;
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }
}
