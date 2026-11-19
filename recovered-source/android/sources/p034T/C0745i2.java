package p034T;

/* JADX INFO: renamed from: T.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0745i2 extends AbstractC0761m2 {
    @Override // p034T.AbstractC0761m2
    /* JADX INFO: renamed from: r */
    public final boolean mo1612r(ExecutorC0749j2 executorC0749j2) {
        synchronized (executorC0749j2) {
            try {
                if (executorC0749j2.f1902u != 0) {
                    return false;
                }
                executorC0749j2.f1902u = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p034T.AbstractC0761m2
    /* JADX INFO: renamed from: s */
    public final void mo1613s(ExecutorC0749j2 executorC0749j2) {
        synchronized (executorC0749j2) {
            executorC0749j2.f1902u = 0;
        }
    }
}
