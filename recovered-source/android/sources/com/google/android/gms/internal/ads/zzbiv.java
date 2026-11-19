package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbiv implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g */
    public Context f7997g;

    /* JADX INFO: renamed from: a */
    public final Object f7991a = new Object();

    /* JADX INFO: renamed from: b */
    public final ConditionVariable f7992b = new ConditionVariable();

    /* JADX INFO: renamed from: c */
    public volatile boolean f7993c = false;

    /* JADX INFO: renamed from: d */
    public volatile boolean f7994d = false;

    /* JADX INFO: renamed from: e */
    public SharedPreferences f7995e = null;

    /* JADX INFO: renamed from: f */
    public Bundle f7996f = new Bundle();

    /* JADX INFO: renamed from: h */
    public JSONObject f7998h = new JSONObject();

    /* JADX INFO: renamed from: i */
    public boolean f7999i = false;

    /* JADX INFO: renamed from: j */
    public boolean f8000j = false;

    /* JADX INFO: renamed from: a */
    public final Object m5030a(final zzbio zzbioVar) {
        if (!this.f7992b.block(5000L)) {
            synchronized (this.f7991a) {
                try {
                    if (!this.f7994d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!this.f7993c || this.f7995e == null || this.f8000j) {
            synchronized (this.f7991a) {
                if (this.f7993c && this.f7995e != null && !this.f8000j) {
                }
                return zzbioVar.m5021e();
            }
        }
        int i2 = zzbioVar.f7979a;
        if (i2 != 2) {
            return (i2 == 1 && this.f7998h.has(zzbioVar.f7980b)) ? zzbioVar.mo5014c(this.f7998h) : zzbiz.m5034a(new zzguj() { // from class: com.google.android.gms.internal.ads.zzbiu
                @Override // com.google.android.gms.internal.ads.zzguj
                public final /* synthetic */ Object zza() {
                    return zzbioVar.mo5015d(this.f7989s.f7995e);
                }
            });
        }
        Bundle bundle = this.f7996f;
        return bundle == null ? zzbioVar.m5021e() : zzbioVar.mo5012a(bundle);
    }

    /* JADX INFO: renamed from: b */
    public final Object m5031b(zzbio zzbioVar) {
        return (this.f7993c || this.f7994d) ? m5030a(zzbioVar) : zzbioVar.m5021e();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!"flag_configuration".equals(str) || sharedPreferences == null) {
            return;
        }
        try {
            this.f7998h = new JSONObject((String) zzbiz.m5034a(new zzbis(sharedPreferences)));
        } catch (JSONException unused) {
        }
    }
}
