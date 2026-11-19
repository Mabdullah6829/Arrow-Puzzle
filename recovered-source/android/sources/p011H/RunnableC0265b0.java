package p011H;

/* JADX INFO: renamed from: H.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0265b0 extends AbstractC0283l implements Runnable {

    /* JADX INFO: renamed from: z */
    public final Runnable f514z;

    public RunnableC0265b0(Runnable runnable) {
        runnable.getClass();
        this.f514z = runnable;
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: j */
    public final String mo342j() {
        return "task=[" + this.f514z + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f514z.run();
        } catch (Error | RuntimeException e) {
            m438m(e);
            throw e;
        }
    }
}
