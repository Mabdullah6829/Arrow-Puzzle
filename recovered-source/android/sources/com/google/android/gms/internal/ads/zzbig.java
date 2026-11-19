package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbig implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final Object f7976a = new Object();

    /* JADX INFO: renamed from: b */
    public SharedPreferences f7977b = null;

    /* JADX INFO: renamed from: c */
    public JSONObject f7978c = new JSONObject();

    /* JADX INFO: renamed from: a */
    public final void m5009a(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        synchronized (this.f7976a) {
            try {
                if (this.f7977b != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                zzbiq zzbiqVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3097b;
                try {
                    sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                } catch (IllegalStateException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3074g("", e);
                    sharedPreferences = null;
                }
                this.f7977b = sharedPreferences;
                if (sharedPreferences != null) {
                    try {
                        this.f7978c = new JSONObject((String) zzbiz.m5034a(new zzbif(sharedPreferences)));
                    } catch (JSONException unused) {
                    }
                }
                if (!((Boolean) zzbkx.f9060b.m5057c()).booleanValue() && (sharedPreferences2 = this.f7977b) != null) {
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!"flag_configuration".equals(str) || sharedPreferences == null) {
            return;
        }
        try {
            this.f7978c = new JSONObject((String) zzbiz.m5034a(new zzbif(sharedPreferences)));
        } catch (JSONException unused) {
        }
    }
}
