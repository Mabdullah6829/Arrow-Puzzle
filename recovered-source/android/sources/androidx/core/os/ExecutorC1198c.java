package androidx.core.os;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.core.os.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1198c implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
