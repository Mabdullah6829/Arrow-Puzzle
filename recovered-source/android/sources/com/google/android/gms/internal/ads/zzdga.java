package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdga extends zzdix {

    /* JADX INFO: renamed from: A */
    public boolean f12143A;

    /* JADX INFO: renamed from: B */
    public ScheduledFuture f12144B;

    /* JADX INFO: renamed from: C */
    public ScheduledFuture f12145C;

    /* JADX INFO: renamed from: t */
    public final ScheduledExecutorService f12146t;

    /* JADX INFO: renamed from: u */
    public final Clock f12147u;

    /* JADX INFO: renamed from: v */
    public final zzdzt f12148v;

    /* JADX INFO: renamed from: w */
    public long f12149w;

    /* JADX INFO: renamed from: x */
    public long f12150x;

    /* JADX INFO: renamed from: y */
    public long f12151y;

    /* JADX INFO: renamed from: z */
    public long f12152z;

    public zzdga(ScheduledExecutorService scheduledExecutorService, Clock clock, zzdzt zzdztVar) {
        super(Collections.EMPTY_SET);
        this.f12149w = -1L;
        this.f12150x = -1L;
        this.f12151y = -1L;
        this.f12152z = -1L;
        this.f12143A = false;
        this.f12146t = scheduledExecutorService;
        this.f12147u = clock;
        this.f12148v = zzdztVar;
    }

    /* JADX INFO: renamed from: K0 */
    public final synchronized void m5916K0(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        if (i2 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i2);
            if (this.f12143A) {
                long j2 = this.f12151y;
                if (j2 <= 0 || millis >= j2) {
                    millis = j2;
                }
                this.f12151y = millis;
                return;
            }
            long jMo3639a = this.f12147u.mo3639a();
            zzbio zzbioVar = zzbix.f8170Je;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                long j3 = this.f12149w;
                if (jMo3639a >= j3 || j3 - jMo3639a > millis) {
                    m5918M0(millis);
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8554gf)).booleanValue()) {
                        zzdzs zzdzsVarM6111a = this.f12148v.m6111a();
                        zzdzsVarM6111a.m6107b("action", "rtnc");
                        zzdzsVarM6111a.m6110e();
                    }
                }
            } else {
                long j4 = this.f12149w;
                if (jMo3639a > j4 || j4 - jMo3639a > millis) {
                    m5918M0(millis);
                }
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final synchronized void m5917L0(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        if (i2 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i2);
            if (this.f12143A) {
                long j2 = this.f12152z;
                if (j2 <= 0 || millis >= j2) {
                    millis = j2;
                }
                this.f12152z = millis;
                return;
            }
            long jMo3639a = this.f12147u.mo3639a();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8170Je)).booleanValue()) {
                if (jMo3639a == this.f12150x) {
                    com.google.android.gms.ads.internal.util.zze.m3150k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j3 = this.f12150x;
                if (jMo3639a >= j3 || j3 - jMo3639a > millis) {
                    m5919N0(millis);
                }
            } else {
                long j4 = this.f12150x;
                if (jMo3639a > j4 || j4 - jMo3639a > millis) {
                    m5919N0(millis);
                }
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final synchronized void m5918M0(long j2) {
        try {
            ScheduledFuture scheduledFuture = this.f12144B;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f12144B.cancel(false);
            }
            this.f12149w = this.f12147u.mo3639a() + j2;
            this.f12144B = this.f12146t.schedule(new zzdfy(this), j2, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final synchronized void m5919N0(long j2) {
        try {
            ScheduledFuture scheduledFuture = this.f12145C;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f12145C.cancel(false);
            }
            this.f12150x = this.f12147u.mo3639a() + j2;
            this.f12145C = this.f12146t.schedule(new zzdfz(this), j2, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        this.f12143A = false;
        m5918M0(0L);
    }
}
