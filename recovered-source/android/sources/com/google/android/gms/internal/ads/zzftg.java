package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftg {

    /* JADX INFO: renamed from: a */
    public final long f16476a;

    /* JADX INFO: renamed from: b */
    public final long f16477b;

    /* JADX INFO: renamed from: f */
    public final Clock f16481f;

    /* JADX INFO: renamed from: g */
    public final zzftn f16482g;

    /* JADX INFO: renamed from: h */
    public long f16483h;

    /* JADX INFO: renamed from: d */
    public long f16479d = 5;

    /* JADX INFO: renamed from: e */
    public long f16480e = 0;

    /* JADX INFO: renamed from: i */
    public final Random f16484i = new Random();

    /* JADX INFO: renamed from: c */
    public long f16478c = 0;

    public zzftg(long j2, long j3, Clock clock, zzftn zzftnVar) {
        this.f16476a = j2;
        this.f16477b = j3;
        this.f16482g = zzftnVar;
        this.f16481f = clock;
        m6664a();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6664a() {
        this.f16483h = this.f16476a;
        this.f16478c = 0L;
        this.f16480e = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m6665b() {
        long j2;
        long j3;
        double d = this.f16483h;
        double d2 = 0.2d * d;
        j2 = (long) (d + d2);
        j3 = (long) (d - d2);
        return j3 + ((long) (this.f16484i.nextDouble() * ((j2 - j3) + 1)));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6666c() {
        long jM6665b = m6665b();
        Clock clock = this.f16481f;
        this.f16480e = clock.currentTimeMillis() + jM6665b;
        double d = this.f16483h;
        long j2 = this.f16477b;
        this.f16483h = Math.min((long) (d + d), j2);
        this.f16478c++;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8206M)).booleanValue()) {
            this.f16482g.m6682e(clock.currentTimeMillis(), this.f16478c, this.f16483h, this.f16479d, j2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m6667d() {
        zzbio zzbioVar = zzbix.f8223N;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue() < 0) {
            return false;
        }
        return this.f16478c > Math.max(this.f16479d, (long) ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue()) && this.f16483h >= this.f16477b;
    }
}
