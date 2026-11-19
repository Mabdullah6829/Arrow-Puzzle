package p011H;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: H.Z */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC0261Z implements Executor {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Executor f510s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ AbstractC0248L f511t;

    public ExecutorC0261Z(Executor executor, AbstractC0248L abstractC0248L) {
        this.f510s = executor;
        this.f511t = abstractC0248L;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f510s.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f511t.m438m(e);
        }
    }
}
