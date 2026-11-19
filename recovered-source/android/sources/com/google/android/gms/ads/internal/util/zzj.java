package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzhbb;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzj implements zzg {

    /* JADX INFO: renamed from: b */
    public boolean f3586b;

    /* JADX INFO: renamed from: d */
    public ListenableFuture f3588d;

    /* JADX INFO: renamed from: f */
    public SharedPreferences f3590f;

    /* JADX INFO: renamed from: g */
    public SharedPreferences.Editor f3591g;

    /* JADX INFO: renamed from: i */
    public String f3593i;

    /* JADX INFO: renamed from: j */
    public String f3594j;

    /* JADX INFO: renamed from: a */
    public final Object f3585a = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayList f3587c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public zzbfx f3589e = null;

    /* JADX INFO: renamed from: h */
    public boolean f3592h = true;

    /* JADX INFO: renamed from: k */
    public boolean f3595k = true;

    /* JADX INFO: renamed from: l */
    public String f3596l = "-1";

    /* JADX INFO: renamed from: m */
    public int f3597m = -1;

    /* JADX INFO: renamed from: n */
    public zzcff f3598n = new zzcff("", 0);

    /* JADX INFO: renamed from: o */
    public long f3599o = 0;

    /* JADX INFO: renamed from: p */
    public long f3600p = 0;

    /* JADX INFO: renamed from: q */
    public int f3601q = -1;

    /* JADX INFO: renamed from: r */
    public int f3602r = 0;

    /* JADX INFO: renamed from: s */
    public Set f3603s = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: t */
    public JSONObject f3604t = new JSONObject();

    /* JADX INFO: renamed from: u */
    public boolean f3605u = true;

    /* JADX INFO: renamed from: v */
    public boolean f3606v = true;

    /* JADX INFO: renamed from: w */
    public String f3607w = null;

    /* JADX INFO: renamed from: x */
    public String f3608x = "";

    /* JADX INFO: renamed from: y */
    public boolean f3609y = false;

    /* JADX INFO: renamed from: z */
    public String f3610z = "";

    /* JADX INFO: renamed from: A */
    public String f3578A = "{}";

    /* JADX INFO: renamed from: B */
    public int f3579B = -1;

    /* JADX INFO: renamed from: C */
    public int f3580C = -1;

    /* JADX INFO: renamed from: D */
    public long f3581D = 0;

    /* JADX INFO: renamed from: E */
    public boolean f3582E = false;

    /* JADX INFO: renamed from: F */
    public int f3583F = 0;

    /* JADX INFO: renamed from: G */
    public int f3584G = 0;

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: K */
    public final boolean mo3154K() {
        boolean z;
        m3180e();
        synchronized (this.f3585a) {
            z = this.f3582E;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: L */
    public final void mo3155L(boolean z) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (this.f3606v == z) {
                    return;
                }
                this.f3606v = z;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: N */
    public final int mo3156N() {
        int i2;
        m3180e();
        synchronized (this.f3585a) {
            i2 = this.f3584G;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: S */
    public final void mo3157S(boolean z) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (z == this.f3595k) {
                    return;
                }
                this.f3595k = z;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: T */
    public final int mo3158T() {
        int i2;
        m3180e();
        synchronized (this.f3585a) {
            i2 = this.f3583F;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: X */
    public final void mo3159X() {
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (this.f3582E) {
                    return;
                }
                this.f3582E = true;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putBoolean("is_install_referrer_reported", true);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: Y */
    public final void mo3160Y(String str) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                this.f3596l = str;
                if (this.f3591g != null) {
                    if (str.equals("-1")) {
                        this.f3591g.remove("IABTCF_TCString");
                    } else {
                        this.f3591g.putString("IABTCF_TCString", str);
                    }
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: Z */
    public final void mo3161Z(int i2) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (this.f3583F == i2) {
                    return;
                }
                this.f3583F = i2;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putInt("total_inflight_ad_limit", i2);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3177a(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8871za)).booleanValue()) {
            m3180e();
            synchronized (this.f3585a) {
                try {
                    if (this.f3609y == z) {
                        return;
                    }
                    this.f3609y = z;
                    SharedPreferences.Editor editor = this.f3591g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.f3591g.apply();
                    }
                    m3181f();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: a0 */
    public final void mo3162a0(int i2) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                this.f3597m = i2;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    if (i2 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i2);
                    }
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3178b(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8871za)).booleanValue()) {
            m3180e();
            synchronized (this.f3585a) {
                try {
                    if (this.f3610z.equals(str)) {
                        return;
                    }
                    this.f3610z = str;
                    SharedPreferences.Editor editor = this.f3591g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f3591g.apply();
                    }
                    m3181f();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: b0 */
    public final void mo3163b0(String str, String str2, boolean z) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                JSONArray jSONArrayOptJSONArray = this.f3604t.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        if (!z || !jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            length = i2;
                            break;
                        }
                        return;
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z);
                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    jSONArrayOptJSONArray.put(length, jSONObject);
                    this.f3604t.put(str, jSONArrayOptJSONArray);
                } catch (JSONException e) {
                    int i3 = zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not update native advanced settings", e);
                }
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f3604t.toString());
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: c */
    public final int mo3164c() {
        int i2;
        m3180e();
        synchronized (this.f3585a) {
            i2 = this.f3602r;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: c0 */
    public final void mo3165c0(int i2) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (this.f3584G == i2) {
                    return;
                }
                this.f3584G = i2;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putInt("default_queue_capacity", i2);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3179d(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8234Na)).booleanValue()) {
            m3180e();
            synchronized (this.f3585a) {
                try {
                    if (this.f3578A.equals(str)) {
                        return;
                    }
                    this.f3578A = str;
                    SharedPreferences.Editor editor = this.f3591g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f3591g.apply();
                    }
                    m3181f();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: d0 */
    public final void mo3166d0(boolean z) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (this.f3605u == z) {
                    return;
                }
                this.f3605u = z;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3180e() {
        ListenableFuture listenableFuture = this.f3588d;
        if (listenableFuture == null || listenableFuture.isDone()) {
            return;
        }
        try {
            this.f3588d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            int i2 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            int i3 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            int i4 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            int i5 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: e0 */
    public final void mo3167e0(long j2) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (this.f3581D == j2) {
                    return;
                }
                this.f3581D = j2;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j2);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3181f() {
        zzcfy.f9946a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzj zzjVar = this.f3575s;
                if (zzjVar.f3586b) {
                    if (!(zzjVar.m3183i() && zzjVar.m3184j()) && ((Boolean) zzbko.f8992b.m5057c()).booleanValue()) {
                        synchronized (zzjVar.f3585a) {
                            try {
                                if (Looper.getMainLooper() == null) {
                                    return;
                                }
                                if (zzjVar.f3589e == null) {
                                    zzjVar.f3589e = new zzbfx();
                                }
                                zzbfx zzbfxVar = zzjVar.f3589e;
                                synchronized (zzbfxVar.f7794u) {
                                    try {
                                        if (zzbfxVar.f7792s) {
                                            int i2 = zze.f3574b;
                                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Content hash thread already started, quitting...");
                                        } else {
                                            zzbfxVar.f7792s = true;
                                            zzbfxVar.start();
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                int i3 = zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3072e("start fetching content...");
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: f0 */
    public final void mo3168f0(int i2) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (this.f3580C == i2) {
                    return;
                }
                this.f3580C = i2;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i2);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3182g(final Context context) {
        synchronized (this.f3585a) {
            try {
                if (this.f3590f != null) {
                    return;
                }
                this.f3588d = ((zzhbb) zzcfy.f9946a).submit(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzj zzjVar = this.f3576s;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        try {
                            synchronized (zzjVar.f3585a) {
                                try {
                                    zzjVar.f3590f = sharedPreferences;
                                    zzjVar.f3591g = editorEdit;
                                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                                    zzjVar.f3592h = zzjVar.f3590f.getBoolean("use_https", zzjVar.f3592h);
                                    zzjVar.f3605u = zzjVar.f3590f.getBoolean("content_url_opted_out", zzjVar.f3605u);
                                    zzjVar.f3593i = zzjVar.f3590f.getString("content_url_hashes", zzjVar.f3593i);
                                    zzjVar.f3595k = zzjVar.f3590f.getBoolean("gad_idless", zzjVar.f3595k);
                                    zzjVar.f3606v = zzjVar.f3590f.getBoolean("content_vertical_opted_out", zzjVar.f3606v);
                                    zzjVar.f3594j = zzjVar.f3590f.getString("content_vertical_hashes", zzjVar.f3594j);
                                    zzjVar.f3602r = zzjVar.f3590f.getInt("version_code", zzjVar.f3602r);
                                    if (((Boolean) zzbkp.f9003g.m5057c()).booleanValue() && com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.f8000j) {
                                        zzjVar.f3598n = new zzcff("", 0L);
                                    } else {
                                        zzjVar.f3598n = new zzcff(zzjVar.f3590f.getString("app_settings_json", zzjVar.f3598n.f9877e), zzjVar.f3590f.getLong("app_settings_last_update_ms", zzjVar.f3598n.f9878f));
                                    }
                                    zzjVar.f3599o = zzjVar.f3590f.getLong("app_last_background_time_ms", zzjVar.f3599o);
                                    zzjVar.f3601q = zzjVar.f3590f.getInt("request_in_session_count", zzjVar.f3601q);
                                    zzjVar.f3600p = zzjVar.f3590f.getLong("first_ad_req_time_ms", zzjVar.f3600p);
                                    zzjVar.f3603s = zzjVar.f3590f.getStringSet("never_pool_slots", zzjVar.f3603s);
                                    zzjVar.f3607w = zzjVar.f3590f.getString("display_cutout", zzjVar.f3607w);
                                    zzjVar.f3579B = zzjVar.f3590f.getInt("app_measurement_npa", zzjVar.f3579B);
                                    zzjVar.f3580C = zzjVar.f3590f.getInt("sd_app_measure_npa", zzjVar.f3580C);
                                    zzjVar.f3581D = zzjVar.f3590f.getLong("sd_app_measure_npa_ts", zzjVar.f3581D);
                                    zzjVar.f3608x = zzjVar.f3590f.getString("inspector_info", zzjVar.f3608x);
                                    zzjVar.f3609y = zzjVar.f3590f.getBoolean("linked_device", zzjVar.f3609y);
                                    zzjVar.f3610z = zzjVar.f3590f.getString("linked_ad_unit", zzjVar.f3610z);
                                    zzjVar.f3578A = zzjVar.f3590f.getString("inspector_ui_storage", zzjVar.f3578A);
                                    zzjVar.f3596l = zzjVar.f3590f.getString("IABTCF_TCString", zzjVar.f3596l);
                                    zzjVar.f3597m = zzjVar.f3590f.getInt("gad_has_consent_for_cookies", zzjVar.f3597m);
                                    zzjVar.f3582E = zzjVar.f3590f.getBoolean("is_install_referrer_reported", zzjVar.f3582E);
                                    zzjVar.f3583F = zzjVar.f3590f.getInt("total_inflight_ad_limit", zzjVar.f3583F);
                                    zzjVar.f3584G = zzjVar.f3590f.getInt("default_queue_capacity", zzjVar.f3584G);
                                    try {
                                        zzjVar.f3604t = new JSONObject(zzjVar.f3590f.getString("native_advanced_settings", "{}"));
                                    } catch (JSONException e) {
                                        int i2 = zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not convert native advanced settings to json object", e);
                                    }
                                    zzjVar.m3181f();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th2);
                            zze.m3151l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
                        }
                    }
                });
                this.f3586b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: h */
    public final JSONObject mo3169h() {
        JSONObject jSONObject;
        m3180e();
        synchronized (this.f3585a) {
            jSONObject = this.f3604t;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3183i() {
        boolean z;
        m3180e();
        synchronized (this.f3585a) {
            z = this.f3605u;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3184j() {
        boolean z;
        m3180e();
        synchronized (this.f3585a) {
            z = this.f3606v;
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final long m3185k() {
        long j2;
        m3180e();
        synchronized (this.f3585a) {
            j2 = this.f3599o;
        }
        return j2;
    }

    /* JADX INFO: renamed from: l */
    public final int m3186l() {
        int i2;
        m3180e();
        synchronized (this.f3585a) {
            i2 = this.f3601q;
        }
        return i2;
    }

    /* JADX INFO: renamed from: m */
    public final void m3187m(long j2) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (this.f3600p == j2) {
                    return;
                }
                this.f3600p = j2;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j2);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final String m3188n() {
        String str;
        m3180e();
        synchronized (this.f3585a) {
            str = this.f3607w;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: o */
    public final void mo3170o(int i2) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (this.f3602r == i2) {
                    return;
                }
                this.f3602r = i2;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putInt("version_code", i2);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m3189p(String str) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (TextUtils.equals(this.f3607w, str)) {
                    return;
                }
                this.f3607w = str;
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3190q(boolean z) {
        m3180e();
        synchronized (this.f3585a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8303Rb)).longValue();
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z);
                    this.f3591g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: r */
    public final void mo3171r() {
        m3180e();
        synchronized (this.f3585a) {
            try {
                this.f3604t = new JSONObject();
                SharedPreferences.Editor editor = this.f3591g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f3591g.apply();
                }
                m3181f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: s */
    public final boolean mo3172s() {
        boolean z;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8489d1)).booleanValue()) {
            return false;
        }
        m3180e();
        synchronized (this.f3585a) {
            z = this.f3595k;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: t */
    public final String mo3173t() {
        m3180e();
        return this.f3596l;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: w */
    public final long mo3174w() {
        long j2;
        m3180e();
        synchronized (this.f3585a) {
            j2 = this.f3581D;
        }
        return j2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: x */
    public final boolean mo3175x() {
        m3180e();
        synchronized (this.f3585a) {
            try {
                SharedPreferences sharedPreferences = this.f3590f;
                boolean z = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f3590f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f3595k) {
                    z = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    /* JADX INFO: renamed from: y */
    public final int mo3176y() {
        m3180e();
        return this.f3597m;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcff zzi() {
        zzcff zzcffVar;
        m3180e();
        synchronized (this.f3585a) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8518ed)).booleanValue() && this.f3598n.m5378a()) {
                    ArrayList arrayList = this.f3587c;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((Runnable) obj).run();
                    }
                }
                zzcffVar = this.f3598n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcffVar;
    }
}
