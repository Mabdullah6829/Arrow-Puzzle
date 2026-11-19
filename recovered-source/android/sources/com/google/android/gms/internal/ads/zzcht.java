package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcht {

    /* JADX INFO: renamed from: a */
    public final boolean f10080a;

    /* JADX INFO: renamed from: b */
    public final int f10081b;

    /* JADX INFO: renamed from: c */
    public final int f10082c;

    /* JADX INFO: renamed from: d */
    public final int f10083d;

    /* JADX INFO: renamed from: e */
    public final int f10084e;

    /* JADX INFO: renamed from: f */
    public final int f10085f;

    /* JADX INFO: renamed from: g */
    public final int f10086g;

    /* JADX INFO: renamed from: h */
    public final int f10087h;

    /* JADX INFO: renamed from: i */
    public final boolean f10088i;

    /* JADX INFO: renamed from: j */
    public final boolean f10089j;

    /* JADX INFO: renamed from: k */
    public final boolean f10090k;

    /* JADX INFO: renamed from: l */
    public final boolean f10091l;

    /* JADX INFO: renamed from: m */
    public final long f10092m;

    /* JADX INFO: renamed from: n */
    public final long f10093n;

    public zzcht(String str) {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f10080a = m5465a(jSONObject, "aggressive_media_codec_release", zzbix.f8742s0);
        this.f10081b = m5466b(jSONObject, "byte_buffer_precache_limit", zzbix.f8656n);
        this.f10082c = m5466b(jSONObject, "exo_cache_buffer_size", zzbix.f8002A);
        this.f10083d = m5466b(jSONObject, "exo_connect_timeout_millis", zzbix.f8588j);
        zzbio zzbioVar = zzbix.f8572i;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f10084e = m5466b(jSONObject, "exo_read_timeout_millis", zzbix.f8605k);
        this.f10085f = m5466b(jSONObject, "load_check_interval_bytes", zzbix.f8622l);
        this.f10086g = m5466b(jSONObject, "player_precache_limit", zzbix.f8639m);
        this.f10087h = m5466b(jSONObject, "socket_receive_buffer_size", zzbix.f8673o);
        this.f10088i = m5465a(jSONObject, "use_cache_data_source", zzbix.f8578i5);
        m5466b(jSONObject, "min_retry_count", zzbix.f8690p);
        this.f10089j = m5465a(jSONObject, "treat_load_exception_as_non_fatal", zzbix.f8724r);
        this.f10090k = m5465a(jSONObject, "enable_multiple_video_playback", zzbix.f8846y2);
        this.f10091l = m5465a(jSONObject, "use_range_http_data_source", zzbix.f8005A2);
        zzbio zzbioVar2 = zzbix.f8022B2;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbioVar2)).longValue();
            }
        } else {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbioVar2)).longValue();
        }
        this.f10092m = jLongValue;
        zzbio zzbioVar3 = zzbix.f8039C2;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
                jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbioVar3)).longValue();
            }
        } else {
            jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbioVar3)).longValue();
        }
        this.f10093n = jLongValue2;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5465a(JSONObject jSONObject, String str, zzbio zzbioVar) {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbioVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public static final int m5466b(JSONObject jSONObject, String str, zzbio zzbioVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbioVar)).intValue();
    }
}
