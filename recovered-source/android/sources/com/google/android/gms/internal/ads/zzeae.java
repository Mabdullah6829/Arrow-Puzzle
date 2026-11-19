package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeae {

    /* JADX INFO: renamed from: e */
    public final String f13460e;

    /* JADX INFO: renamed from: f */
    public final zzdzy f13461f;

    /* JADX INFO: renamed from: b */
    public final ArrayList f13457b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f13458c = false;

    /* JADX INFO: renamed from: d */
    public boolean f13459d = false;

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.zzj f13456a = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g();

    public zzeae(zzdzy zzdzyVar, String str) {
        this.f13460e = str;
        this.f13461f = zzdzyVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6129a(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8107G2)).booleanValue()) {
            HashMap mapM6133e = m6133e();
            mapM6133e.put("action", "adapter_init_started");
            mapM6133e.put("ancn", str);
            this.f13457b.add(mapM6133e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6130b(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8107G2)).booleanValue()) {
            HashMap mapM6133e = m6133e();
            mapM6133e.put("action", "adapter_init_finished");
            mapM6133e.put("ancn", str);
            this.f13457b.add(mapM6133e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6131c(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8107G2)).booleanValue()) {
            HashMap mapM6133e = m6133e();
            mapM6133e.put("action", "adapter_init_finished");
            mapM6133e.put("ancn", str);
            mapM6133e.put("rqe", str2);
            this.f13457b.add(mapM6133e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m6132d() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8107G2)).booleanValue() && !this.f13458c) {
            HashMap mapM6133e = m6133e();
            mapM6133e.put("action", "init_started");
            this.f13457b.add(mapM6133e);
            this.f13458c = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final HashMap m6133e() {
        zzdzy zzdzyVar = this.f13461f;
        zzdzyVar.getClass();
        HashMap map = new HashMap(zzdzyVar.f13443a);
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        map.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        map.put("tid", this.f13456a.mo3172s() ? "" : this.f13460e);
        return map;
    }
}
