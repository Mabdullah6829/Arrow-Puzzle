package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbio {

    /* JADX INFO: renamed from: a */
    public final int f7979a;

    /* JADX INFO: renamed from: b */
    public final String f7980b;

    /* JADX INFO: renamed from: c */
    public final Object f7981c;

    /* JADX INFO: renamed from: d */
    public final Object f7982d;

    public zzbio(int i2, String str, Object obj, Object obj2) {
        this.f7979a = i2;
        this.f7980b = str;
        this.f7981c = obj;
        this.f7982d = obj2;
        com.google.android.gms.ads.internal.client.zzba.f3095e.f3096a.f7983a.add(this);
    }

    /* JADX INFO: renamed from: g */
    public static zzbio m5016g(int i2, int i3, String str) {
        return new zzbik(1, str, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: h */
    public static zzbio m5017h(String str, long j2, long j3) {
        return new zzbil(1, str, Long.valueOf(j2), Long.valueOf(j3));
    }

    /* JADX INFO: renamed from: i */
    public static zzbio m5018i(String str, float f2, float f3) {
        return new zzbim(1, str, Float.valueOf(f2), Float.valueOf(f3));
    }

    /* JADX INFO: renamed from: j */
    public static void m5019j() {
        com.google.android.gms.ads.internal.client.zzba.f3095e.f3096a.f7984b.add(new zzbin(1, "gads:sdk_core_constants:experiment_id", null, null));
    }

    /* JADX INFO: renamed from: k */
    public static void m5020k() {
        com.google.android.gms.ads.internal.client.zzba.f3095e.f3096a.f7985c.add(new zzbin(1, "gads:sdk_core_constants_service:experiment_id", null, null));
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo5012a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    public abstract void mo5013b(SharedPreferences.Editor editor, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract Object mo5014c(JSONObject jSONObject);

    /* JADX INFO: renamed from: d */
    public abstract Object mo5015d(SharedPreferences sharedPreferences);

    /* JADX INFO: renamed from: e */
    public final Object m5021e() {
        return com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.f7999i ? this.f7982d : this.f7981c;
    }

    /* JADX INFO: renamed from: f */
    public final Object m5022f() {
        return com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(this);
    }
}
