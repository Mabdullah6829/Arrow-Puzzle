package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbpd implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(zzclbVar.getContext()).edit();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                editorEdit.remove(jSONArray.getString(i2));
            }
            editorEdit.apply();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("GMSG clear local storage keys handler", e);
        }
    }
}
