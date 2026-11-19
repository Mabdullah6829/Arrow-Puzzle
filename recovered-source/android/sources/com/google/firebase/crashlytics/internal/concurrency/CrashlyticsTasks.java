package com.google.firebase.crashlytics.internal.concurrency;

import androidx.arch.core.executor.ExecutorC1058a;
import androidx.transition.C1750a;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class CrashlyticsTasks {
    private static final Executor DIRECT = new ExecutorC1058a(2);

    private CrashlyticsTasks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$race$0(TaskCompletionSource taskCompletionSource, AtomicBoolean atomicBoolean, CancellationTokenSource cancellationTokenSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.m10770d(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.m10769c(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.m10765a();
        }
        return Tasks.m10776f(null);
    }

    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.f23214a);
        C1750a c1750a = new C1750a(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 1);
        Executor executor = DIRECT;
        task.continueWithTask(executor, c1750a);
        task2.continueWithTask(executor, c1750a);
        return taskCompletionSource.f23216a;
    }
}
