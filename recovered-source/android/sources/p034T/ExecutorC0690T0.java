package p034T;

import java.util.concurrent.Executor;
import p001B.AbstractC0076b;
import p001B.C0092r;

/* JADX INFO: renamed from: T.T0 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0690T0 implements Executor {

    /* JADX INFO: renamed from: s */
    public final C0092r f1576s;

    /* JADX INFO: renamed from: t */
    public Executor f1577t;

    public ExecutorC0690T0(C0092r c0092r) {
        AbstractC0076b.m133h(c0092r, "executorPool");
        this.f1576s = c0092r;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        synchronized (this) {
            try {
                if (this.f1577t == null) {
                    Executor executor2 = (Executor) C0773p2.m1652a((InterfaceC0769o2) this.f1576s.f130t);
                    AbstractC0076b.m134i(executor2, "%s.getObject()", this.f1577t);
                    this.f1577t = executor2;
                }
                executor = this.f1577t;
            } catch (Throwable th) {
                throw th;
            }
        }
        executor.execute(runnable);
    }
}
