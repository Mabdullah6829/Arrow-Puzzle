package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zzfwi {

    /* JADX INFO: renamed from: a */
    public final String f16702a;

    /* JADX INFO: renamed from: c */
    public long f16704c = System.nanoTime();

    /* JADX INFO: renamed from: d */
    public int f16705d = 1;

    /* JADX INFO: renamed from: b */
    public zzfxk f16703b = new zzfxk(null);

    public zzfwi(String str) {
        this.f16702a = str;
    }

    /* JADX INFO: renamed from: a */
    public void mo6741a() {
    }

    /* JADX INFO: renamed from: b */
    public void mo6742b() {
        this.f16703b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final WebView m6743c() {
        return (WebView) this.f16703b.get();
    }

    /* JADX INFO: renamed from: d */
    public void mo6744d(zzfuy zzfuyVar, zzfuw zzfuwVar) {
        m6745e(zzfuyVar, zzfuwVar, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m6745e(zzfuy zzfuyVar, zzfuw zzfuwVar, JSONObject jSONObject) {
        String str = zzfuyVar.f16619g;
        JSONObject jSONObject2 = new JSONObject();
        zzfwo.m6748b(jSONObject2, "environment", "app");
        zzfwo.m6748b(jSONObject2, "adSessionType", zzfuwVar.f16608g);
        JSONObject jSONObject3 = new JSONObject();
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        zzfwo.m6748b(jSONObject3, "deviceType", AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str3).length()), str2, "; ", str3));
        zzfwo.m6748b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfwo.m6748b(jSONObject3, "os", "Android");
        zzfwo.m6748b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = zzfwn.f16711a;
        zzfva zzfvaVar = zzfva.OTHER;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                zzfvaVar = zzfva.MOBILE;
            } else if (currentModeType == 4) {
                zzfvaVar = zzfva.CTV;
            }
        }
        zzfwo.m6748b(jSONObject2, "deviceCategory", zzfvaVar.f16630s);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfwo.m6748b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfvi zzfviVar = zzfuwVar.f16602a;
        zzfwo.m6748b(jSONObject4, "partnerName", zzfviVar.f16653a);
        zzfwo.m6748b(jSONObject4, "partnerVersion", zzfviVar.f16654b);
        zzfwo.m6748b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfwo.m6748b(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfwo.m6748b(jSONObject5, "appId", zzfvx.f16683b.f16684a.getApplicationContext().getPackageName());
        zzfwo.m6748b(jSONObject2, "app", jSONObject5);
        String str4 = zzfuwVar.f16607f;
        if (str4 != null) {
            zzfwo.m6748b(jSONObject2, "contentUrl", str4);
        }
        String str5 = zzfuwVar.f16606e;
        if (str5 != null) {
            zzfwo.m6748b(jSONObject2, "customReferenceData", str5);
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList(zzfuwVar.f16604c).iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfvz.f16687a.m6735a(m6743c(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public final void m6746f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfwo.m6748b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfvz.f16687a.m6735a(m6743c(), "setLastActivity", jSONObject);
    }
}
