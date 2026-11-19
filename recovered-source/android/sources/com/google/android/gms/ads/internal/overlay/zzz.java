package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzgrg;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.android.gms.internal.ads.zzgsd;
import com.google.android.gms.internal.ads.zzgse;
import com.google.android.gms.internal.ads.zzgsf;
import com.google.android.gms.internal.ads.zzgss;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzz {

    /* JADX INFO: renamed from: f */
    public zzgsd f3395f;

    /* JADX INFO: renamed from: c */
    public zzclb f3392c = null;

    /* JADX INFO: renamed from: e */
    public boolean f3394e = false;

    /* JADX INFO: renamed from: a */
    public String f3390a = null;

    /* JADX INFO: renamed from: d */
    public zzgrg f3393d = null;

    /* JADX INFO: renamed from: b */
    public String f3391b = null;

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m3026a(Context context) {
        if (!zzgss.m7114a(context)) {
            return false;
        }
        try {
            this.f3393d = zzgrh.m7103a(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("LastMileDeliveryOverlay.bindLastMileDeliveryService", e);
        }
        if (this.f3393d == null) {
            this.f3394e = false;
            return false;
        }
        if (this.f3395f == null) {
            this.f3395f = new zzx(this);
        }
        this.f3394e = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m3027b(zzclb zzclbVar, zzgsa zzgsaVar) {
        if (zzclbVar == null) {
            m3028c("adWebview missing", "onLMDShow");
            return;
        }
        this.f3392c = zzclbVar;
        if (!this.f3394e && !m3026a(zzclbVar.getContext())) {
            m3028c("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8369Vc)).booleanValue()) {
            this.f3391b = zzgsaVar.mo7075b();
        }
        if (this.f3395f == null) {
            this.f3395f = new zzx(this);
        }
        zzgrg zzgrgVar = this.f3393d;
        if (zzgrgVar != null) {
            zzgrgVar.mo7102a(zzgsaVar, this.f3395f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3028c(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.m3150k(str);
        if (this.f3392c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            m3029d(map, "onError");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3029d(final HashMap map, final String str) {
        zzcfy.f9951f.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzclb zzclbVar = this.f3387s.f3392c;
                if (zzclbVar != null) {
                    zzclbVar.mo5129b(str, map);
                }
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final zzgsf m3030e() {
        zzgse zzgseVarM7107c = zzgsf.m7107c();
        if (!((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8369Vc)).booleanValue() || TextUtils.isEmpty(this.f3391b)) {
            String str = this.f3390a;
            if (str != null) {
                zzgseVarM7107c.mo7097a(str);
            } else {
                m3028c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgseVarM7107c.mo7098b(this.f3391b);
        }
        return zzgseVarM7107c.mo7099c();
    }
}
