package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.firebase.messaging.Constants;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkc {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f8951a;

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzj f8952b;

    /* JADX INFO: renamed from: c */
    public final com.google.android.gms.ads.nonagon.signalgeneration.zza f8953c;

    /* JADX INFO: renamed from: d */
    public final zzdzy f8954d;

    /* JADX INFO: renamed from: e */
    public Runnable f8955e;

    /* JADX INFO: renamed from: f */
    public zzbjz f8956f;

    /* JADX INFO: renamed from: g */
    public CustomTabsSession f8957g;

    /* JADX INFO: renamed from: h */
    public String f8958h;

    /* JADX INFO: renamed from: i */
    public long f8959i = 0;

    /* JADX INFO: renamed from: j */
    public long f8960j;

    /* JADX INFO: renamed from: k */
    public JSONArray f8961k;

    /* JADX INFO: renamed from: l */
    public Context f8962l;

    public zzbkc(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar, com.google.android.gms.ads.nonagon.signalgeneration.zza zzaVar, zzdzy zzdzyVar) {
        this.f8951a = scheduledExecutorService;
        this.f8952b = zzjVar;
        this.f8953c = zzaVar;
        this.f8954d = zzdzyVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5049a(String str) {
        try {
            CustomTabsSession customTabsSession = this.f8957g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f8960j).toString());
            m5053e(jSONObject);
            if (((Boolean) zzblc.f9106c.m5057c()).booleanValue()) {
                jSONObject.put("as", this.f8953c.m3315b());
            }
            customTabsSession.postMessage(jSONObject.toString(), null);
            zzbka zzbkaVar = new zzbka(this, str);
            if (((Boolean) zzblc.f9108e.m5057c()).booleanValue()) {
                this.f8952b.m3334a(this.f8957g, zzbkaVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.m3358a(this.f8962l, new AdRequest((AdRequest.Builder) new AdRequest.Builder().m2741b(bundle)), zzbkaVar);
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error creating JSON: ", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m5050b(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzblc.f9108e.m5057c()).booleanValue() ? ((Long) zzblc.f9111h.m5057c()).longValue() : 0L);
        m5053e(jSONObject);
        if (((Boolean) zzblc.f9106c.m5057c()).booleanValue()) {
            jSONObject.put("as", this.f8953c.m3315b());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m5051c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzblc.f9108e.m5057c()).booleanValue() ? ((Long) zzblc.f9111h.m5057c()).longValue() : 0L);
        m5053e(jSONObject);
        if (((Boolean) zzblc.f9106c.m5057c()).booleanValue()) {
            jSONObject.put("as", this.f8953c.m3315b());
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(com.google.android.gms.internal.ads.zzbix.f8651mb)).booleanValue() != false) goto L23;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5052d() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbjz r0 = r5.f8956f
            if (r0 != 0) goto Lc
            int r0 = com.google.android.gms.ads.internal.util.zze.f3574b
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzo.m3070c(r0)
            return
        Lc:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f8921a
            boolean r0 = r0.get()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r5.f8958h
            if (r0 == 0) goto L71
            androidx.browser.customtabs.CustomTabsSession r0 = r5.f8957g
            if (r0 == 0) goto L71
            java.util.concurrent.ScheduledExecutorService r0 = r5.f8951a
            if (r0 == 0) goto L71
            long r1 = r5.f8959i
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2a
            goto L3c
        L2a:
            com.google.android.gms.ads.internal.zzt r1 = com.google.android.gms.ads.internal.zzt.f3698C
            com.google.android.gms.common.util.DefaultClock r1 = r1.f3711k
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r5.f8959i
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3c
            goto L4e
        L3c:
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.f8651mb
            com.google.android.gms.ads.internal.client.zzba r2 = com.google.android.gms.ads.internal.client.zzba.f3095e
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f3098c
            java.lang.Object r1 = r2.m5030a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L71
        L4e:
            androidx.browser.customtabs.CustomTabsSession r1 = r5.f8957g
            java.lang.String r2 = r5.f8958h
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.requestPostMessageChannel(r2)
            java.lang.Runnable r1 = r5.f8955e
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbix.f8668nb
            com.google.android.gms.ads.internal.client.zzba r3 = com.google.android.gms.ads.internal.client.zzba.f3095e
            com.google.android.gms.internal.ads.zzbiv r3 = r3.f3098c
            java.lang.Object r2 = r3.m5030a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L71:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.m3150k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkc.m5052d():void");
    }

    /* JADX INFO: renamed from: e */
    public final void m5053e(JSONObject jSONObject) {
        try {
            if (this.f8961k == null) {
                this.f8961k = new JSONArray((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8702pb));
            }
            jSONObject.put("eids", this.f8961k);
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error fetching the PACT active eids JSON: ", e);
        }
    }
}
