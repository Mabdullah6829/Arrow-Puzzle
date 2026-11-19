package p011H;

/* JADX INFO: renamed from: H.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0269d0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f525s;

    /* JADX INFO: renamed from: t */
    public final Runnable f526t;

    public /* synthetic */ RunnableC0269d0(int i2, Runnable runnable) {
        this.f525s = i2;
        this.f526t = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f525s) {
            case 0:
                this.f526t.run();
                break;
            default:
                try {
                    this.f526t.run();
                } catch (Exception e) {
                    AbstractC0242F.m351h("Executor", "Background execution failure.", e);
                    return;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f525s) {
            case 0:
                return this.f526t.toString();
            default:
                return super.toString();
        }
    }
}
