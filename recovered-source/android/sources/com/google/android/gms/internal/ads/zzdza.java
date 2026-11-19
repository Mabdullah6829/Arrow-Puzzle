package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.view.AbstractC1278q;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdza implements zzdgf, zzden, zzddc, zzdls {

    /* JADX INFO: renamed from: s */
    public final zzdzo f13322s;

    /* JADX INFO: renamed from: t */
    public final zzdzy f13323t;

    /* JADX INFO: renamed from: u */
    public final Context f13324u;

    public zzdza(zzdzo zzdzoVar, zzdzy zzdzyVar, Context context) {
        this.f13322s = zzdzoVar;
        this.f13323t = zzdzyVar;
        this.f13324u = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    /* JADX INFO: renamed from: a */
    public final void mo3343a(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        String str;
        zzbio zzbioVar = zzbix.f8282Q7;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            zzdzy zzdzyVar = this.f13323t;
            zzdzo zzdzoVar = this.f13322s;
            if (zzbcVar == null) {
                ConcurrentHashMap concurrentHashMap = zzdzoVar.f13407a;
                concurrentHashMap.put("action", "sgs");
                concurrentHashMap.put("request_id", "-1");
                zzdzyVar.m6127b(concurrentHashMap);
                return;
            }
            zzcbk zzcbkVar = zzbcVar.f3907c;
            if (zzcbkVar != null) {
                m6098b(zzcbkVar.f9681E, zzdzd.f13395d);
            }
            try {
                JSONObject jSONObject = new JSONObject(zzbcVar.f3906b);
                ConcurrentHashMap concurrentHashMap2 = zzdzoVar.f13407a;
                ConcurrentHashMap concurrentHashMap3 = zzdzoVar.f13407a;
                concurrentHashMap2.put("action", "sgs");
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8482cb)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error retrieving JSONObject from the requestJson, ", e);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap3.put("tpc", str);
                if (zzcbkVar != null) {
                    zzdzoVar.m6102a(zzcbkVar.f9682s);
                }
                zzdzoVar.m6105d();
                zzdzyVar.m6127b(concurrentHashMap3);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8351Ua)).booleanValue()) {
                    m6100e();
                }
            } catch (JSONException unused) {
                ConcurrentHashMap concurrentHashMap4 = zzdzoVar.f13407a;
                concurrentHashMap4.put("action", "sgf");
                concurrentHashMap4.put("sgf_reason", "request_invalid");
                zzdzyVar.m6127b(concurrentHashMap4);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6098b(Bundle bundle, zzgwt zzgwtVar) {
        zzbio zzbioVar = zzbix.f8158J2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() || bundle == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        bundle.putLong("public-api-callback", System.currentTimeMillis());
        zzdzo zzdzoVar = this.f13322s;
        zzdzoVar.getClass();
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8204Le)).booleanValue()) {
            zzdzoVar.m6103b("brr", true != zzdzoVar.f13409c.f16053q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            zzdzoVar.m6103b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgwtVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzdzd zzdzdVar = (zzdzd) zzgwtVar.get(i2);
            long j2 = bundle.getLong(zzdzdVar.f13398b.f13394s, -1L);
            long j3 = bundle.getLong(zzdzdVar.f13399c.f13394s, -1L);
            if (j2 > 0 && j3 > 0) {
                zzdzoVar.m6103b(zzdzdVar.f13397a, String.valueOf(j3 - j2));
            }
        }
        m6099d(bundle.getBundle("client_sig_latency_key"));
        m6099d(bundle.getBundle("gms_sig_latency_key"));
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final void mo5833c() {
        Bundle bundle;
        zzdzo zzdzoVar = this.f13322s;
        zzdzoVar.f13407a.put("action", "loaded");
        synchronized (zzdzoVar) {
            bundle = zzdzoVar.f13411e;
        }
        m6098b(bundle, zzdzd.f13396e);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8485ce)).booleanValue()) {
            zzdzoVar.f13407a.put("mafe", true != WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO) ? "0" : "1");
        }
        zzdzoVar.m6105d();
        this.f13323t.m6127b(zzdzoVar.f13407a);
    }

    /* JADX INFO: renamed from: d */
    public final void m6099d(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j2 = bundle.getLong(str);
            if (j2 >= 0) {
                this.f13322s.m6103b(str, String.valueOf(j2));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6100e() {
        List historicalProcessExitReasons;
        if (((Boolean) zzbld.f9115d.m5057c()).booleanValue() || com.google.android.gms.ads.internal.zzt.f3698C.f3708h.f9905q.getAndSet(true) || !PlatformVersion.m3654b()) {
            return;
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8367Va);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Context context = this.f13324u;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 1)) == null || historicalProcessExitReasons.isEmpty()) {
                return;
            }
            int reason = AbstractC1278q.m2395e(historicalProcessExitReasons.get(0)).getReason();
            zzgug zzgugVarM7145c = zzgug.m7143a(new zzgtb(',')).m7145c(zzgte.f18172u);
            for (String str2 : (zzgua) new zzgug(zzgugVarM7145c.f18199c, true, zzgugVarM7145c.f18197a).m7146d(str)) {
                try {
                    if (Integer.parseInt(str2) == reason) {
                        zzdzy zzdzyVar = this.f13323t;
                        zzdzyVar.getClass();
                        HashMap map = new HashMap(zzdzyVar.f13443a);
                        map.put("action", "aei");
                        map.put("aeir", String.valueOf(reason));
                        zzdzyVar.m6128c(map);
                        return;
                    }
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53);
                    sb.append("Invalid number format in appExitInfoReasonAllowlist: ");
                    sb.append(str2);
                    com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
                }
            }
        } catch (NoClassDefFoundError e) {
            e = e;
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        } catch (NoSuchMethodError e2) {
            e = e2;
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        } catch (RuntimeException e3) {
            e = e3;
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: s */
    public final void mo5866s(zzfky zzfkyVar) {
        zzdzo zzdzoVar = this.f13322s;
        zzdzoVar.getClass();
        zzfkx zzfkxVar = zzfkyVar.f16006b;
        List list = zzfkxVar.f16001a;
        if (!list.isEmpty()) {
            int i2 = ((zzfkn) list.get(0)).f15918b;
            zzdzoVar.m6103b(FirebaseAnalytics.Param.AD_FORMAT, zzfkn.m6481a(i2));
            if (i2 == 6) {
                zzdzoVar.f13407a.put("as", true != zzdzoVar.f13408b.f9932y ? "0" : "1");
            }
        }
        zzbio zzbioVar = zzbix.f8192L2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            zzdzoVar.m6103b("mwl", Integer.toString(list.size()));
        }
        zzdzoVar.m6103b("gqi", zzfkxVar.f16002b.f15973b);
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8319Sa)).booleanValue()) {
            m6100e();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    /* JADX INFO: renamed from: v */
    public final void mo5830v(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdzo zzdzoVar = this.f13322s;
        zzdzoVar.f13407a.put("action", "ftl");
        zzdzoVar.m6103b("ftl", String.valueOf(zzeVar.f3106s));
        zzdzoVar.m6103b("ed", zzeVar.f3108u);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8530f8)).booleanValue()) {
            zzdzoVar.m6103b("emsg", zzeVar.f3107t);
        }
        zzdzoVar.m6105d();
        this.f13323t.m6127b(zzdzoVar.f13407a);
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    /* JADX INFO: renamed from: y */
    public final void mo3344y(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8282Q7)).booleanValue()) {
            zzdzo zzdzoVar = this.f13322s;
            zzdzoVar.f13407a.put("action", "sgf");
            zzdzoVar.m6103b("sgf_reason", str);
            zzdzoVar.m6105d();
            this.f13323t.m6127b(zzdzoVar.f13407a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: z */
    public final void mo5867z(zzcbk zzcbkVar) {
        this.f13322s.m6102a(zzcbkVar.f9682s);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8335Ta)).booleanValue()) {
            m6100e();
        }
    }
}
