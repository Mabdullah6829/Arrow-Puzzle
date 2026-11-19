package p016J0;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: J0.a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0323a implements Executor {

    /* JADX INFO: renamed from: s */
    public static final ExecutorC0323a f650s = new ExecutorC0323a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
