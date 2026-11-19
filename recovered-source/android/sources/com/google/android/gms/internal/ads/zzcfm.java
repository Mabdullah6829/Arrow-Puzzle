package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcfm {

    /* JADX INFO: renamed from: h */
    public final String f9916h;

    /* JADX INFO: renamed from: i */
    public final com.google.android.gms.ads.internal.util.zzj f9917i;

    /* JADX INFO: renamed from: a */
    public long f9909a = -1;

    /* JADX INFO: renamed from: b */
    public long f9910b = -1;

    /* JADX INFO: renamed from: c */
    public int f9911c = -1;

    /* JADX INFO: renamed from: d */
    public int f9912d = -1;

    /* JADX INFO: renamed from: e */
    public long f9913e = 0;

    /* JADX INFO: renamed from: f */
    public final Object f9914f = new Object();

    /* JADX INFO: renamed from: g */
    public final Object f9915g = new Object();

    /* JADX INFO: renamed from: j */
    public int f9918j = 0;

    /* JADX INFO: renamed from: k */
    public int f9919k = 0;

    /* JADX INFO: renamed from: l */
    public int f9920l = 0;

    /* JADX INFO: renamed from: m */
    public int f9921m = 0;

    /* JADX INFO: renamed from: n */
    public final HashMap f9922n = new HashMap();

    /* JADX INFO: renamed from: o */
    public final HashMap f9923o = new HashMap();

    public zzcfm(String str, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.f9916h = str;
        this.f9917i = zzjVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5390a(com.google.android.gms.ads.internal.client.zzm zzmVar, long j2) {
        long j3;
        Bundle bundle;
        synchronized (this.f9914f) {
            try {
                com.google.android.gms.ads.internal.util.zzj zzjVar = this.f9917i;
                long jM3185k = zzjVar.m3185k();
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f9910b == -1) {
                    if (jCurrentTimeMillis - jM3185k > ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8038C1)).longValue()) {
                        this.f9912d = -1;
                    } else {
                        this.f9912d = zzjVar.m3186l();
                    }
                    this.f9910b = j2;
                    this.f9909a = j2;
                } else {
                    this.f9909a = j2;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8814w4)).booleanValue() || (bundle = zzmVar.f3229u) == null || bundle.getInt("gw", 2) != 1) {
                    this.f9911c++;
                    int i2 = this.f9912d + 1;
                    this.f9912d = i2;
                    if (i2 == 0) {
                        this.f9913e = 0L;
                        zzjVar.m3187m(jCurrentTimeMillis);
                    } else {
                        zzjVar.m3180e();
                        synchronized (zzjVar.f3585a) {
                            j3 = zzjVar.f3600p;
                        }
                        this.f9913e = jCurrentTimeMillis - j3;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5391b() {
        if (((Boolean) zzble.f9120a.m5057c()).booleanValue()) {
            synchronized (this.f9914f) {
                this.f9911c--;
                this.f9912d--;
            }
        }
    }
}
