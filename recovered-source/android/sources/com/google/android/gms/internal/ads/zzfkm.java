package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkm {

    /* JADX INFO: renamed from: a */
    public final Clock f15876a;

    /* JADX INFO: renamed from: b */
    public final zzdzt f15877b;

    /* JADX INFO: renamed from: c */
    public final Object f15878c = new Object();

    /* JADX INFO: renamed from: e */
    public volatile int f15880e = 1;

    /* JADX INFO: renamed from: d */
    public volatile long f15879d = 0;

    public zzfkm(Clock clock, zzdzt zzdztVar) {
        this.f15876a = clock;
        this.f15877b = zzdztVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6478a(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8017Ae)).booleanValue()) {
            zzdzs zzdzsVarM6111a = this.f15877b.m6111a();
            zzdzsVarM6111a.m6107b("action", "mbs_state");
            zzdzsVarM6111a.m6107b("mbs_state", true != z ? "0" : "1");
            zzdzsVarM6111a.m6108c();
        }
        if (z) {
            m6480c(1, 2);
        } else {
            m6480c(2, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6479b() {
        long jCurrentTimeMillis = this.f15876a.currentTimeMillis();
        synchronized (this.f15878c) {
            try {
                if (this.f15880e == 3) {
                    if (this.f15879d + ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8298R6)).longValue() <= jCurrentTimeMillis) {
                        this.f15880e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6480c(int i2, int i3) {
        m6479b();
        Object obj = this.f15878c;
        long jCurrentTimeMillis = this.f15876a.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f15880e != i2) {
                    return;
                }
                this.f15880e = i3;
                if (this.f15880e == 3) {
                    this.f15879d = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
