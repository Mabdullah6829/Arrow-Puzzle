package p034T;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p001B.C0096v;
import p030R.ExecutorC0517A0;

/* JADX INFO: renamed from: T.J1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0662J1 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f1475a;

    /* JADX INFO: renamed from: b */
    public final ExecutorC0517A0 f1476b;

    /* JADX INFO: renamed from: c */
    public final RunnableC0676O0 f1477c;

    /* JADX INFO: renamed from: d */
    public final C0096v f1478d;

    /* JADX INFO: renamed from: e */
    public long f1479e;

    /* JADX INFO: renamed from: f */
    public boolean f1480f;

    /* JADX INFO: renamed from: g */
    public ScheduledFuture f1481g;

    public C0662J1(RunnableC0676O0 runnableC0676O0, ExecutorC0517A0 executorC0517A0, ScheduledExecutorService scheduledExecutorService, C0096v c0096v) {
        this.f1477c = runnableC0676O0;
        this.f1476b = executorC0517A0;
        this.f1475a = scheduledExecutorService;
        this.f1478d = c0096v;
        c0096v.m169b();
    }
}
