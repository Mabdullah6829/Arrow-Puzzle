package com.google.android.gms.internal.ads;

import androidx.constraintlayout.motion.widget.Key;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zzbyn {

    /* JADX INFO: renamed from: a */
    public final zzclb f9552a;

    /* JADX INFO: renamed from: b */
    public final String f9553b;

    public zzbyn(zzclb zzclbVar, String str) {
        this.f9552a = zzclbVar;
        this.f9553b = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m5262b(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.f9553b);
            zzclb zzclbVar = this.f9552a;
            if (zzclbVar != null) {
                zzclbVar.mo5128a(jSONObjectPut, "onError");
            }
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while dispatching error event.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5263c(int i2, int i3, int i4, int i5) {
        try {
            this.f9552a.mo5128a(new JSONObject().put("x", i2).put("y", i3).put("width", i4).put("height", i5), "onSizeChanged");
        } catch (JSONException e) {
            int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while dispatching size change.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5264d(String str) {
        try {
            this.f9552a.mo5128a(new JSONObject().put("state", str), "onStateChanged");
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while dispatching state change.", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5265e(int i2, int i3, int i4, int i5, float f2, int i6) {
        try {
            this.f9552a.mo5128a(new JSONObject().put("width", i2).put("height", i3).put("maxSizeWidth", i4).put("maxSizeHeight", i5).put("density", f2).put(Key.ROTATION, i6), "onScreenInfoChanged");
        } catch (JSONException e) {
            int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while obtaining screen information.", e);
        }
    }
}
