package p030R;

/* JADX INFO: renamed from: R.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0593y0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ RunnableC0595z0 f1300s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ RunnableC0591x0 f1301t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ long f1302u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ ExecutorC0517A0 f1303v;

    public RunnableC0593y0(ExecutorC0517A0 executorC0517A0, RunnableC0595z0 runnableC0595z0, RunnableC0591x0 runnableC0591x0, long j2) {
        this.f1303v = executorC0517A0;
        this.f1300s = runnableC0595z0;
        this.f1301t = runnableC0591x0;
        this.f1302u = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1303v.execute(this.f1300s);
    }

    public final String toString() {
        return this.f1301t.toString() + "(scheduled in SynchronizationContext with delay of " + this.f1302u + ")";
    }
}
