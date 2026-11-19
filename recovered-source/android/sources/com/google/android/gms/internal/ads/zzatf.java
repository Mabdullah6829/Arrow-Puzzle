package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatf extends Thread {

    /* JADX INFO: renamed from: s */
    public final BlockingQueue f6874s;

    /* JADX INFO: renamed from: t */
    public final zzate f6875t;

    /* JADX INFO: renamed from: u */
    public final zzasv f6876u;

    /* JADX INFO: renamed from: v */
    public volatile boolean f6877v = false;

    /* JADX INFO: renamed from: w */
    public final zzatc f6878w;

    public zzatf(PriorityBlockingQueue priorityBlockingQueue, zzaua zzauaVar, zzauh zzauhVar, zzatc zzatcVar) {
        this.f6874s = priorityBlockingQueue;
        this.f6875t = zzauaVar;
        this.f6876u = zzauhVar;
        this.f6878w = zzatcVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m4386a() {
        zzatc zzatcVar = this.f6878w;
        zzatl zzatlVar = (zzatl) this.f6874s.take();
        SystemClock.elapsedRealtime();
        zzatlVar.m4392e();
        try {
            try {
                zzatlVar.m4390b("network-queue-take");
                synchronized (zzatlVar.f6895w) {
                }
                TrafficStats.setThreadStatsTag(zzatlVar.f6894v);
                zzath zzathVarMo3107a = this.f6875t.mo3107a(zzatlVar);
                zzatlVar.m4390b("network-http-complete");
                if (zzathVarMo3107a.f6883e && zzatlVar.m4394i()) {
                    zzatlVar.m4391c("not-modified");
                    zzatlVar.m4396m();
                } else {
                    zzatr zzatrVarMo3115j = zzatlVar.mo3115j(zzathVarMo3107a);
                    zzatlVar.m4390b("network-parse-complete");
                    zzasu zzasuVar = zzatrVarMo3115j.f6911b;
                    if (zzasuVar != null) {
                        this.f6876u.mo4381H(zzatlVar.m4393f(), zzasuVar);
                        zzatlVar.m4390b("network-cache-written");
                    }
                    synchronized (zzatlVar.f6895w) {
                        zzatlVar.f6887A = true;
                    }
                    zzatcVar.m4385a(zzatlVar, zzatrVarMo3115j, null);
                    zzatlVar.m4395l(zzatrVarMo3115j);
                }
            } catch (zzatu e) {
                SystemClock.elapsedRealtime();
                zzatcVar.getClass();
                zzatlVar.m4390b("post-error");
                ((zzata) zzatcVar.f6871a).f6867s.post(new zzatb(zzatlVar, new zzatr(e), null));
                zzatlVar.m4396m();
            } catch (Exception e2) {
                Log.e("Volley", zzatx.m4405d("Unhandled exception %s", e2.toString()), e2);
                zzatu zzatuVar = new zzatu(e2);
                SystemClock.elapsedRealtime();
                zzatcVar.getClass();
                zzatlVar.m4390b("post-error");
                ((zzata) zzatcVar.f6871a).f6867s.post(new zzatb(zzatlVar, new zzatr(zzatuVar), null));
                zzatlVar.m4396m();
            }
            zzatlVar.m4392e();
        } catch (Throwable th) {
            zzatlVar.m4392e();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m4386a();
            } catch (InterruptedException unused) {
                if (this.f6877v) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzatx.m4404c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
