package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasx extends Thread {

    /* JADX INFO: renamed from: y */
    public static final boolean f6856y = zzatx.f6920a;

    /* JADX INFO: renamed from: s */
    public final BlockingQueue f6857s;

    /* JADX INFO: renamed from: t */
    public final BlockingQueue f6858t;

    /* JADX INFO: renamed from: u */
    public final zzasv f6859u;

    /* JADX INFO: renamed from: v */
    public volatile boolean f6860v = false;

    /* JADX INFO: renamed from: w */
    public final zzaty f6861w;

    /* JADX INFO: renamed from: x */
    public final zzatc f6862x;

    public zzasx(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, zzauh zzauhVar, zzatc zzatcVar) {
        this.f6857s = priorityBlockingQueue;
        this.f6858t = priorityBlockingQueue2;
        this.f6859u = zzauhVar;
        this.f6862x = zzatcVar;
        this.f6861w = new zzaty(this, priorityBlockingQueue2, zzatcVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m4382a() {
        zzatc zzatcVar = this.f6862x;
        BlockingQueue blockingQueue = this.f6858t;
        zzaty zzatyVar = this.f6861w;
        zzatl zzatlVar = (zzatl) this.f6857s.take();
        zzatlVar.m4390b("cache-queue-take");
        zzatlVar.m4392e();
        try {
            synchronized (zzatlVar.f6895w) {
            }
            zzasv zzasvVar = this.f6859u;
            zzasu zzasuVarZza = zzasvVar.zza(zzatlVar.m4393f());
            if (zzasuVarZza == null) {
                zzatlVar.m4390b("cache-miss");
                if (!zzatyVar.m4406c(zzatlVar)) {
                    blockingQueue.put(zzatlVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzasuVarZza.f6850e < jCurrentTimeMillis) {
                    zzatlVar.m4390b("cache-hit-expired");
                    zzatlVar.f6888B = zzasuVarZza;
                    if (!zzatyVar.m4406c(zzatlVar)) {
                        blockingQueue.put(zzatlVar);
                    }
                } else {
                    zzatlVar.m4390b("cache-hit");
                    byte[] bArr = zzasuVarZza.f6846a;
                    Map map = zzasuVarZza.f6852g;
                    zzatr zzatrVarMo3115j = zzatlVar.mo3115j(new zzath(200, bArr, map, zzath.m4387a(map), false));
                    zzatlVar.m4390b("cache-hit-parsed");
                    if (!(zzatrVarMo3115j.f6912c == null)) {
                        zzatlVar.m4390b("cache-parsing-failed");
                        zzasvVar.mo4380G(zzatlVar.m4393f());
                        zzatlVar.f6888B = null;
                        if (!zzatyVar.m4406c(zzatlVar)) {
                            blockingQueue.put(zzatlVar);
                        }
                    } else if (zzasuVarZza.f6851f < jCurrentTimeMillis) {
                        zzatlVar.m4390b("cache-hit-refresh-needed");
                        zzatlVar.f6888B = zzasuVarZza;
                        zzatrVarMo3115j.f6913d = true;
                        if (zzatyVar.m4406c(zzatlVar)) {
                            zzatcVar.m4385a(zzatlVar, zzatrVarMo3115j, null);
                        } else {
                            zzatcVar.m4385a(zzatlVar, zzatrVarMo3115j, new zzasw(this, zzatlVar));
                        }
                    } else {
                        zzatcVar.m4385a(zzatlVar, zzatrVarMo3115j, null);
                    }
                }
            }
            zzatlVar.m4392e();
        } catch (Throwable th) {
            zzatlVar.m4392e();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f6856y) {
            zzatx.m4402a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f6859u.zzc();
        while (true) {
            try {
                m4382a();
            } catch (InterruptedException unused) {
                if (this.f6860v) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzatx.m4404c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
