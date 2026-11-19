package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcuj implements zzbui {

    /* JADX INFO: renamed from: a */
    public final Context f11482a;

    /* JADX INFO: renamed from: b */
    public final zzbeu f11483b;

    /* JADX INFO: renamed from: c */
    public final PowerManager f11484c;

    public zzcuj(Context context, zzbeu zzbeuVar) {
        this.f11482a = context;
        this.f11483b = zzbeuVar;
        this.f11484c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject mo5147a(zzcum zzcumVar) throws JSONException {
        boolean z;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbew zzbewVar = zzcumVar.f11493e;
        if (zzbewVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzbeu zzbeuVar = this.f11483b;
            if (zzbeuVar.f7693b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z2 = zzbewVar.f7698a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", zzbeuVar.f7695d).put("activeViewJSON", zzbeuVar.f7693b).put("timestamp", zzcumVar.f11491c).put("adFormat", zzbeuVar.f7692a).put("hashCode", zzbeuVar.f7694c).put("isMraid", false).put("isStopped", false).put("isPaused", zzcumVar.f11490b).put("isNative", zzbeuVar.f7696e).put("isScreenOn", this.f11484c.isInteractive());
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            com.google.android.gms.ads.internal.util.zzaa zzaaVar = zztVar.f3709i;
            synchronized (zzaaVar) {
                z = zzaaVar.f3451a;
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appMuted", z).put("appVolume", zztVar.f3709i.m3087a());
            Context context = this.f11482a;
            jSONObjectPut2.put("deviceVolume", com.google.android.gms.ads.internal.util.zzaa.m3086b(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut3 = jSONObject3.put("windowVisibility", zzbewVar.f7699b).put("isAttachedToWindow", z2);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzbewVar.f7700c;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzbewVar.f7701d;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzbewVar.f7702e;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", zzbewVar.f7703f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzbewVar.f7704g;
            JSONObject jSONObjectPut7 = jSONObjectPut6.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", zzbewVar.f7705h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzbewVar.f7706i;
            jSONObjectPut7.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", zzcumVar.f11489a);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8390X1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbewVar.f7708k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcumVar.f11492d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
