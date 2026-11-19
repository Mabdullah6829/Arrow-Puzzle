package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzect {

    /* JADX INFO: renamed from: a */
    public final String f13609a;

    /* JADX INFO: renamed from: b */
    public final String f13610b;

    /* JADX INFO: renamed from: c */
    public final String f13611c;

    /* JADX INFO: renamed from: d */
    public final int f13612d;

    /* JADX INFO: renamed from: e */
    public final String f13613e;

    /* JADX INFO: renamed from: f */
    public final int f13614f;

    /* JADX INFO: renamed from: g */
    public final boolean f13615g;

    public zzect(String str, String str2, String str3, int i2, String str4, int i3, boolean z) {
        this.f13609a = str;
        this.f13610b = str2;
        this.f13611c = str3;
        this.f13612d = i2;
        this.f13613e = str4;
        this.f13614f = i3;
        this.f13615g = z;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m6159a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f13609a);
        jSONObject.put("version", this.f13611c);
        zzbio zzbioVar = zzbix.f8115Ga;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f13610b);
        }
        jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.f13612d);
        jSONObject.put("description", this.f13613e);
        jSONObject.put("initializationLatencyMillis", this.f13614f);
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8132Ha)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f13615g);
        }
        return jSONObject;
    }
}
