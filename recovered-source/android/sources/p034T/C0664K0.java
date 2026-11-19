package p034T;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p001B.AbstractC0076b;
import p001B.C0092r;
import p001B.C0096v;

/* JADX INFO: renamed from: T.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0664K0 {

    /* JADX INFO: renamed from: k */
    public static final long f1484k = TimeUnit.SECONDS.toNanos(10);

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f1485a;

    /* JADX INFO: renamed from: b */
    public final C0096v f1486b;

    /* JADX INFO: renamed from: c */
    public final C0092r f1487c;

    /* JADX INFO: renamed from: d */
    public int f1488d;

    /* JADX INFO: renamed from: e */
    public ScheduledFuture f1489e;

    /* JADX INFO: renamed from: f */
    public ScheduledFuture f1490f;

    /* JADX INFO: renamed from: g */
    public final RunnableC0667L0 f1491g;

    /* JADX INFO: renamed from: h */
    public final RunnableC0667L0 f1492h;

    /* JADX INFO: renamed from: i */
    public final long f1493i;

    /* JADX INFO: renamed from: j */
    public final long f1494j;

    static {
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public C0664K0(C0092r c0092r, ScheduledExecutorService scheduledExecutorService, long j2, long j3) {
        C0096v c0096v = new C0096v();
        this.f1488d = 1;
        this.f1491g = new RunnableC0667L0(new RunnableC0658I0(this, 0));
        this.f1492h = new RunnableC0667L0(new RunnableC0658I0(this, 1));
        this.f1487c = c0092r;
        AbstractC0076b.m133h(scheduledExecutorService, "scheduler");
        this.f1485a = scheduledExecutorService;
        this.f1486b = c0096v;
        this.f1493i = j2;
        this.f1494j = j3;
        c0096v.f139b = false;
        c0096v.m169b();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m1521a() {
        try {
            C0096v c0096v = this.f1486b;
            c0096v.f139b = false;
            c0096v.m169b();
            int i2 = this.f1488d;
            if (i2 == 2) {
                this.f1488d = 3;
            } else if (i2 == 4 || i2 == 5) {
                ScheduledFuture scheduledFuture = this.f1489e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f1488d == 5) {
                    this.f1488d = 1;
                } else {
                    this.f1488d = 2;
                    AbstractC0076b.m139n(this.f1490f == null, "There should be no outstanding pingFuture");
                    this.f1490f = this.f1485a.schedule(this.f1492h, this.f1493i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m1522b() {
        try {
            int i2 = this.f1488d;
            if (i2 == 1) {
                this.f1488d = 2;
                if (this.f1490f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f1485a;
                    RunnableC0667L0 runnableC0667L0 = this.f1492h;
                    long j2 = this.f1493i;
                    C0096v c0096v = this.f1486b;
                    this.f1490f = scheduledExecutorService.schedule(runnableC0667L0, j2 - c0096v.m168a(), TimeUnit.NANOSECONDS);
                }
            } else if (i2 == 5) {
                this.f1488d = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
