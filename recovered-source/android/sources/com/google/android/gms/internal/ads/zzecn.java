package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecn implements zzddc, zzdgf, zzder {

    /* JADX INFO: renamed from: C */
    public JSONObject f13589C;

    /* JADX INFO: renamed from: D */
    public JSONObject f13590D;

    /* JADX INFO: renamed from: E */
    public boolean f13591E;

    /* JADX INFO: renamed from: F */
    public boolean f13592F;

    /* JADX INFO: renamed from: G */
    public boolean f13593G;

    /* JADX INFO: renamed from: s */
    public final zzecz f13594s;

    /* JADX INFO: renamed from: t */
    public final String f13595t;

    /* JADX INFO: renamed from: u */
    public final String f13596u;

    /* JADX INFO: renamed from: x */
    public zzdcs f13599x;

    /* JADX INFO: renamed from: y */
    public com.google.android.gms.ads.internal.client.zze f13600y;

    /* JADX INFO: renamed from: z */
    public String f13601z = "";

    /* JADX INFO: renamed from: A */
    public String f13587A = "";

    /* JADX INFO: renamed from: B */
    public String f13588B = "";

    /* JADX INFO: renamed from: v */
    public int f13597v = 0;

    /* JADX INFO: renamed from: w */
    public zzecm f13598w = zzecm.f13583s;

    public zzecn(zzecz zzeczVar, zzflg zzflgVar, String str) {
        this.f13594s = zzeczVar;
        this.f13596u = str;
        this.f13595t = zzflgVar.f16043g;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m6156c(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.f3108u);
        jSONObject.put("errorCode", zzeVar.f3106s);
        jSONObject.put("errorDescription", zzeVar.f3107t);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.f3109v;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : m6156c(zzeVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    /* JADX INFO: renamed from: U */
    public final void mo5910U(zzcya zzcyaVar) {
        zzecz zzeczVar = this.f13594s;
        if (zzeczVar.m6167f()) {
            this.f13599x = zzcyaVar.f11764f;
            this.f13598w = zzecm.f13584t;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8149Ia)).booleanValue()) {
                zzeczVar.m6164c(this.f13595t, this);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m6157a() throws JSONException {
        JSONObject jSONObjectM6158b;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f13598w);
        jSONObject.put("format", zzfkn.m6481a(this.f13597v));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8149Ia)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f13591E);
            if (this.f13591E) {
                jSONObject.put("shown", this.f13592F);
            }
        }
        zzdcs zzdcsVar = this.f13599x;
        if (zzdcsVar != null) {
            jSONObjectM6158b = m6158b(zzdcsVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.f13600y;
            JSONObject jSONObjectM6158b2 = null;
            if (zzeVar != null && (iBinder = zzeVar.f3110w) != null) {
                zzdcs zzdcsVar2 = (zzdcs) iBinder;
                jSONObjectM6158b2 = m6158b(zzdcsVar2);
                if (zzdcsVar2.f12050w.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m6156c(this.f13600y));
                    jSONObjectM6158b2.put("errors", jSONArray);
                }
            }
            jSONObjectM6158b = jSONObjectM6158b2;
        }
        jSONObject.put("responseInfo", jSONObjectM6158b);
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m6158b(zzdcs zzdcsVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzdcsVar.f12046s);
        jSONObject.put("responseSecsSinceEpoch", zzdcsVar.f12051x);
        jSONObject.put("responseId", zzdcsVar.f12047t);
        zzbio zzbioVar = zzbix.f8030Ba;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            String str = zzdcsVar.f12052y;
            if (!TextUtils.isEmpty(str)) {
                String strValueOf = String.valueOf(str);
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Bidding data: ".concat(strValueOf));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f13601z)) {
            jSONObject.put("adRequestUrl", this.f13601z);
        }
        if (!TextUtils.isEmpty(this.f13587A)) {
            jSONObject.put("postBody", this.f13587A);
        }
        if (!TextUtils.isEmpty(this.f13588B)) {
            jSONObject.put("adResponseBody", this.f13588B);
        }
        Object obj = this.f13589C;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f13590D;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8081Ea)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f13593G);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzv zzvVar : zzdcsVar.f12050w) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.f3269s);
            jSONObject2.put("latencyMillis", zzvVar.f3270t);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8047Ca)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a.m3049n(zzvVar.f3272v));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.f3271u;
            jSONObject2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, zzeVar == null ? null : m6156c(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: s */
    public final void mo5866s(zzfky zzfkyVar) {
        zzecz zzeczVar = this.f13594s;
        if (zzeczVar.m6167f()) {
            zzfkx zzfkxVar = zzfkyVar.f16006b;
            List list = zzfkxVar.f16001a;
            if (!list.isEmpty()) {
                this.f13597v = ((zzfkn) list.get(0)).f15918b;
            }
            zzfkq zzfkqVar = zzfkxVar.f16002b;
            String str = zzfkqVar.f15983l;
            if (!TextUtils.isEmpty(str)) {
                this.f13601z = str;
            }
            String str2 = zzfkqVar.f15984m;
            if (!TextUtils.isEmpty(str2)) {
                this.f13587A = str2;
            }
            JSONObject jSONObject = zzfkqVar.f15987p;
            if (jSONObject.length() > 0) {
                this.f13590D = jSONObject;
            }
            zzbio zzbioVar = zzbix.f8081Ea;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                if (zzeczVar.f13652w >= ((Long) zzbaVar.f3098c.m5030a(zzbix.f8098Fa)).longValue()) {
                    this.f13593G = true;
                    return;
                }
                String str3 = zzfkqVar.f15985n;
                if (!TextUtils.isEmpty(str3)) {
                    this.f13588B = str3;
                }
                JSONObject jSONObject2 = zzfkqVar.f15986o;
                if (jSONObject2.length() > 0) {
                    this.f13589C = jSONObject2;
                }
                JSONObject jSONObject3 = this.f13589C;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f13588B)) {
                    length += this.f13588B.length();
                }
                long j2 = length;
                synchronized (zzeczVar) {
                    zzeczVar.f13652w += j2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    /* JADX INFO: renamed from: v */
    public final void mo5830v(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzecz zzeczVar = this.f13594s;
        if (zzeczVar.m6167f()) {
            this.f13598w = zzecm.f13585u;
            this.f13600y = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8149Ia)).booleanValue()) {
                zzeczVar.m6164c(this.f13595t, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: z */
    public final void mo5867z(zzcbk zzcbkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8149Ia)).booleanValue()) {
            return;
        }
        zzecz zzeczVar = this.f13594s;
        if (zzeczVar.m6167f()) {
            zzeczVar.m6164c(this.f13595t, this);
        }
    }
}
