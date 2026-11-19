package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqo implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final Object f9282a = new Object();

    /* JADX INFO: renamed from: b */
    public final HashMap f9283b = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.f9282a) {
            try {
                zzbqn zzbqnVar = (zzbqn) this.f9283b.remove(str);
                if (zzbqnVar == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                    sb.append("Received result for unexpected method invocation: ");
                    sb.append(str);
                    String string = sb.toString();
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f(string);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + strConcat.length());
                    sb2.append(str3);
                    sb2.append(strConcat);
                    zzbqnVar.mo5113m(sb2.toString());
                    return;
                }
                if (str5 == null) {
                    zzbqnVar.mo5114n(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.m3152m()) {
                        String string2 = jSONObject.toString(2);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 13);
                        sb3.append("Result GMSG: ");
                        sb3.append(string2);
                        com.google.android.gms.ads.internal.util.zze.m3150k(sb3.toString());
                    }
                    zzbqnVar.mo5114n(jSONObject);
                } catch (JSONException e) {
                    zzbqnVar.mo5113m(e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5115b(String str, zzbqn zzbqnVar) {
        synchronized (this.f9282a) {
            this.f9283b.put(str, zzbqnVar);
        }
    }
}
