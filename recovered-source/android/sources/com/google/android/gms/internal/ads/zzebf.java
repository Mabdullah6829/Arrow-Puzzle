package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzebf {

    /* JADX INFO: renamed from: a */
    public Long f13489a;

    /* JADX INFO: renamed from: b */
    public final String f13490b;

    /* JADX INFO: renamed from: c */
    public String f13491c;

    /* JADX INFO: renamed from: d */
    public Integer f13492d;

    /* JADX INFO: renamed from: e */
    public String f13493e;

    /* JADX INFO: renamed from: f */
    public Integer f13494f;

    public /* synthetic */ zzebf(String str) {
        this.f13490b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m6143a() {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8753sb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", this.f13489a);
            jSONObject.put("eventCategory", this.f13490b);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, this.f13491c);
            jSONObject.putOpt("errorCode", this.f13492d);
            jSONObject.putOpt("rewardType", this.f13493e);
            jSONObject.putOpt("rewardAmount", this.f13494f);
        } catch (JSONException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        int length = String.valueOf(str).length();
        return AbstractC1456a.m2451r(new StringBuilder(String.valueOf(string).length() + length + 14 + 2), str, "(\"h5adsEvent\",", string, ");");
    }
}
