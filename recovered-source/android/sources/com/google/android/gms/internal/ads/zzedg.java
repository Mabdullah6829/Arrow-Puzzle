package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedg implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final JSONObject f13675a = new JSONObject();

    /* JADX INFO: renamed from: b */
    public List f13676b;

    @VisibleForTesting
    public zzedg() {
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null && this.f13676b.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                JSONObject jSONObject = this.f13675a;
                if (obj == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, obj);
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e);
            }
        }
    }
}
