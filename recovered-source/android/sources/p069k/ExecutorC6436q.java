package p069k;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p011H.RunnableC0269d0;

/* JADX INFO: renamed from: k.q */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC6436q implements Executor {

    /* JADX INFO: renamed from: s */
    public final Executor f24612s;

    public ExecutorC6436q(ExecutorService executorService) {
        this.f24612s = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f24612s.execute(new RunnableC0269d0(1, runnable));
    }
}
