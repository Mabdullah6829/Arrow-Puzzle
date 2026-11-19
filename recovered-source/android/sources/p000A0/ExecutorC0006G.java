package p000A0;

import java.util.concurrent.Executor;
import p062g0.C6354i;

/* JADX INFO: renamed from: A0.G */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0006G implements Executor {

    /* JADX INFO: renamed from: s */
    public final AbstractC0063t f3s;

    public ExecutorC0006G(AbstractC0063t abstractC0063t) {
        this.f3s = abstractC0063t;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC0063t abstractC0063t = this.f3s;
        C6354i c6354i = C6354i.f24409s;
        if (abstractC0063t.isDispatchNeeded(c6354i)) {
            abstractC0063t.dispatch(c6354i, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f3s.toString();
    }
}
