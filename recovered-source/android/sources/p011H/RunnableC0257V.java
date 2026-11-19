package p011H;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: renamed from: H.V */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0257V extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: s */
    public final AbstractRunnableC0259X f507s;

    public RunnableC0257V(AbstractRunnableC0259X abstractRunnableC0259X) {
        this.f507s = abstractRunnableC0259X;
    }

    /* JADX INFO: renamed from: a */
    public static void m385a(RunnableC0257V runnableC0257V, Thread thread) {
        runnableC0257V.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f507s.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
