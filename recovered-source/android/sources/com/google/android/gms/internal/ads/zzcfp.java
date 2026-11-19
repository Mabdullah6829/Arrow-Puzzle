package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcfp implements zzbfr {

    /* JADX INFO: renamed from: t */
    public final com.google.android.gms.ads.internal.util.zzj f9927t;

    /* JADX INFO: renamed from: v */
    public final zzcfm f9929v;

    /* JADX INFO: renamed from: s */
    public final Object f9926s = new Object();

    /* JADX INFO: renamed from: w */
    public final HashSet f9930w = new HashSet();

    /* JADX INFO: renamed from: x */
    public final HashSet f9931x = new HashSet();

    /* JADX INFO: renamed from: y */
    public boolean f9932y = false;

    /* JADX INFO: renamed from: u */
    public final zzcfn f9928u = new zzcfn();

    public zzcfp(String str, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.f9929v = new zzcfm(str, zzjVar);
        this.f9927t = zzjVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5392a(zzcfe zzcfeVar) {
        synchronized (this.f9926s) {
            this.f9930w.add(zzcfeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    /* JADX INFO: renamed from: k0 */
    public final void mo2997k0(boolean z) {
        com.google.android.gms.ads.internal.util.zzj zzjVar = this.f9927t;
        zzcfm zzcfmVar = this.f9929v;
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            if (jCurrentTimeMillis - zzjVar.m3185k() > ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8038C1)).longValue()) {
                zzcfmVar.f9912d = -1;
            } else {
                zzcfmVar.f9912d = zzjVar.m3186l();
            }
            this.f9932y = true;
            return;
        }
        zzjVar.m3180e();
        synchronized (zzjVar.f3585a) {
            try {
                if (zzjVar.f3599o != jCurrentTimeMillis) {
                    zzjVar.f3599o = jCurrentTimeMillis;
                    SharedPreferences.Editor editor = zzjVar.f3591g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", jCurrentTimeMillis);
                        zzjVar.f3591g.apply();
                    }
                    zzjVar.m3181f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = zzcfmVar.f9912d;
        zzjVar.m3180e();
        synchronized (zzjVar.f3585a) {
            try {
                if (zzjVar.f3601q == i2) {
                    return;
                }
                zzjVar.f3601q = i2;
                SharedPreferences.Editor editor2 = zzjVar.f3591g;
                if (editor2 != null) {
                    editor2.putInt("request_in_session_count", i2);
                    zzjVar.f3591g.apply();
                }
                zzjVar.m3181f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
