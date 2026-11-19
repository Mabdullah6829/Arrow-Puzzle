package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesh extends zzbxk {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f14773x = 0;

    /* JADX INFO: renamed from: s */
    public final zzbxi f14774s;

    /* JADX INFO: renamed from: t */
    public final zzcgd f14775t;

    /* JADX INFO: renamed from: u */
    public final JSONObject f14776u;

    /* JADX INFO: renamed from: v */
    public final long f14777v;

    /* JADX INFO: renamed from: w */
    public boolean f14778w;

    public zzesh(String str, zzbxi zzbxiVar, zzcgd zzcgdVar, long j2) {
        JSONObject jSONObject = new JSONObject();
        this.f14776u = jSONObject;
        this.f14778w = false;
        this.f14775t = zzcgdVar;
        this.f14774s = zzbxiVar;
        this.f14777v = j2;
        try {
            jSONObject.put("adapter_version", zzbxiVar.mo5244b().toString());
            jSONObject.put("sdk_version", zzbxiVar.mo5246c().toString());
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final synchronized void m6333k4(int i2, String str) {
        try {
            if (this.f14778w) {
                return;
            }
            try {
                JSONObject jSONObject = this.f14776u;
                jSONObject.put("signal_error", str);
                zzbio zzbioVar = zzbix.f8575i2;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f14777v);
                }
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8558h2)).booleanValue()) {
                    jSONObject.put("signal_error_code", i2);
                }
            } catch (JSONException unused) {
            }
            this.f14775t.m5397a(this.f14776u);
            this.f14778w = true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
