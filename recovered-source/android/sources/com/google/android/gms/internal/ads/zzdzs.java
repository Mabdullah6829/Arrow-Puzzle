package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzs {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f13422a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzdzt f13423b;

    public zzdzs(zzdzt zzdztVar) {
        this.f13423b = zzdztVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6106a(zzfkn zzfknVar) {
        m6107b("aai", zzfknVar.f15960w);
        m6107b("request_id", zzfknVar.f15943n0);
        m6107b(FirebaseAnalytics.Param.AD_FORMAT, zzfkn.m6481a(zzfknVar.f15918b));
    }

    /* JADX INFO: renamed from: b */
    public final void m6107b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f13422a.put(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final void m6108c() {
        this.f13423b.f13425b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdzs zzdzsVar = this.f13421s;
                zzdzsVar.f13423b.f13424a.m6127b(zzdzsVar.f13422a);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final com.google.android.gms.ads.internal.util.client.zzt m6109d() {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8171Jf)).booleanValue();
        com.google.android.gms.ads.internal.util.client.zzt zztVar = com.google.android.gms.ads.internal.util.client.zzt.f3438s;
        if (!zBooleanValue) {
            m6108c();
            return zztVar;
        }
        zzdzy zzdzyVar = this.f13423b.f13424a;
        zzdzyVar.getClass();
        ConcurrentHashMap concurrentHashMap = this.f13422a;
        if (concurrentHashMap.isEmpty()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Empty paramMap.");
            return zztVar;
        }
        String strM3355a = zzdzyVar.f13448f.m3355a(concurrentHashMap);
        com.google.android.gms.ads.internal.util.zze.m3150k(strM3355a);
        return zzdzyVar.f13446d.m3081a(null, strM3355a);
    }

    /* JADX INFO: renamed from: e */
    public final void m6110e() {
        this.f13423b.f13425b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdzs zzdzsVar = this.f13420s;
                zzdzsVar.f13423b.f13424a.m6128c(zzdzsVar.f13422a);
            }
        });
    }
}
