package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.arch.core.executor.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1058a implements Executor {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2591s;

    public /* synthetic */ ExecutorC1058a(int i2) {
        this.f2591s = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2591s) {
            case 0:
                ArchTaskExecutor.lambda$static$0(runnable);
                break;
            case 1:
                ArchTaskExecutor.lambda$static$1(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
