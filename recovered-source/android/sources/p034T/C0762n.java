package p034T;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p006D0.C0177l;
import p030R.ExecutorC0517A0;
import p030R.RunnableC0595z0;

/* JADX INFO: renamed from: T.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0762n {

    /* JADX INFO: renamed from: e */
    public static final Logger f1957e = Logger.getLogger(C0762n.class.getName());

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f1958a;

    /* JADX INFO: renamed from: b */
    public final ExecutorC0517A0 f1959b;

    /* JADX INFO: renamed from: c */
    public C0727e0 f1960c;

    /* JADX INFO: renamed from: d */
    public C0177l f1961d;

    public C0762n(C0785s2 c0785s2, ScheduledExecutorServiceC0712a1 scheduledExecutorServiceC0712a1, ExecutorC0517A0 executorC0517A0) {
        this.f1958a = scheduledExecutorServiceC0712a1;
        this.f1959b = executorC0517A0;
    }

    /* JADX INFO: renamed from: a */
    public final void m1638a(RunnableC0681Q runnableC0681Q) {
        this.f1959b.m1237d();
        if (this.f1960c == null) {
            this.f1960c = C0785s2.m1660h();
        }
        C0177l c0177l = this.f1961d;
        if (c0177l != null) {
            RunnableC0595z0 runnableC0595z0 = (RunnableC0595z0) c0177l.f333u;
            if (!runnableC0595z0.f1310u && !runnableC0595z0.f1309t) {
                return;
            }
        }
        long jM1608a = this.f1960c.m1608a();
        this.f1961d = this.f1959b.m1236c(runnableC0681Q, jM1608a, TimeUnit.NANOSECONDS, this.f1958a);
        f1957e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jM1608a));
    }
}
