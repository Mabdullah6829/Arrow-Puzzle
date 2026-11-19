package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzeim implements zzbui {
    @Override // com.google.android.gms.internal.ads.zzbui
    /* JADX INFO: renamed from: a */
    public final JSONObject mo5147a(Object obj) throws JSONException {
        zzein zzeinVar = (zzein) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8064Da)).booleanValue()) {
            zzcbm zzcbmVar = zzeinVar.f13970c;
            jSONObject2.put("ad_request_url", zzcbmVar.f9695f);
            jSONObject2.put("ad_request_post_body", zzcbmVar.f9692c);
        }
        zzcbm zzcbmVar2 = zzeinVar.f13970c;
        jSONObject2.put("base_url", zzcbmVar2.f9691b);
        jSONObject2.put("signals", zzeinVar.f13969b);
        zzeit zzeitVar = zzeinVar.f13968a;
        jSONObject3.put("body", zzeitVar.f13991c);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a.m3048m(zzeitVar.f13990b));
        jSONObject3.put("response_code", zzeitVar.f13989a);
        jSONObject3.put("latency", zzeitVar.f13992d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcbmVar2.f9697h);
        return jSONObject;
    }
}
