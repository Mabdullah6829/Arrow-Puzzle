package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface zzbsu extends zzbtf, zzbst {
    @Override // com.google.android.gms.internal.ads.zzbst
    /* JADX INFO: renamed from: a */
    default void mo5128a(JSONObject jSONObject, String str) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String string2 = sb.toString();
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Dispatching AFMA event: ".concat(string2));
        zza(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    /* JADX INFO: renamed from: b */
    default void mo5129b(String str, Map map) {
        try {
            mo5128a(com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a.m3048m(map), str);
        } catch (JSONException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    /* JADX INFO: renamed from: d */
    default void mo5130d(String str, String str2) {
        zza(AbstractC1456a.m2451r(new StringBuilder(AbstractC1456a.m2438e(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    /* JADX INFO: renamed from: j */
    default void mo5131j(JSONObject jSONObject, String str) {
        mo5130d(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    void zza(String str);
}
