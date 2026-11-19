package p030R;

/* JADX INFO: renamed from: R.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0595z0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final Runnable f1308s;

    /* JADX INFO: renamed from: t */
    public boolean f1309t;

    /* JADX INFO: renamed from: u */
    public boolean f1310u;

    public RunnableC0595z0(Runnable runnable) {
        this.f1308s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1309t) {
            return;
        }
        this.f1310u = true;
        this.f1308s.run();
    }
}
