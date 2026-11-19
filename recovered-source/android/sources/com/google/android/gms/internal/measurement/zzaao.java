package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class zzaao extends zzaag {

    /* JADX INFO: renamed from: c */
    public static final boolean f21865c;

    /* JADX INFO: renamed from: d */
    public static final boolean f21866d;

    /* JADX INFO: renamed from: e */
    public static final boolean f21867e;

    /* JADX INFO: renamed from: f */
    public static final AtomicReference f21868f;

    /* JADX INFO: renamed from: g */
    public static final AtomicLong f21869g;

    /* JADX INFO: renamed from: h */
    public static final ConcurrentLinkedQueue f21870h;

    /* JADX INFO: renamed from: b */
    public volatile zzzf f21871b;

    static {
        String str = Build.FINGERPRINT;
        f21865c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f21866d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f21867e = "eng".equals(str3) || "userdebug".equals(str3);
        f21868f = new AtomicReference();
        f21869g = new AtomicLong();
        f21870h = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: renamed from: e */
    public static void m9313e() {
        while (true) {
            zzaan zzaanVar = (zzaan) f21870h.poll();
            if (zzaanVar == null) {
                return;
            }
            f21869g.getAndDecrement();
            zzzf zzzfVar = zzaanVar.f21863a;
            zzxz zzxzVar = zzaanVar.f21864b;
            zzxy zzxyVar = zzxzVar.f23084c;
            if ((zzxyVar != null && Boolean.TRUE.equals(zzxyVar.mo10716d(zzxx.f23076g))) || zzzfVar.mo9314b(zzxzVar.f23082a)) {
                zzzfVar.mo9315c(zzxzVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    /* JADX INFO: renamed from: b */
    public final boolean mo9314b(Level level) {
        return this.f21871b == null || this.f21871b.mo9314b(level);
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    /* JADX INFO: renamed from: c */
    public final void mo9315c(zzxz zzxzVar) {
        if (this.f21871b != null) {
            this.f21871b.mo9315c(zzxzVar);
            return;
        }
        if (f21869g.incrementAndGet() > 20) {
            f21870h.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f21870h.offer(new zzaan(this, zzxzVar));
        if (this.f21871b != null) {
            m9313e();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaag, com.google.android.gms.internal.measurement.zzzf
    /* JADX INFO: renamed from: d */
    public final void mo9309d(RuntimeException runtimeException, zzxz zzxzVar) {
        if (this.f21871b != null) {
            this.f21871b.mo9309d(runtimeException, zzxzVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
