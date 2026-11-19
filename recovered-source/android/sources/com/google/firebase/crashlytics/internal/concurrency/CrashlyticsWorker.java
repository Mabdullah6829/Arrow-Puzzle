package com.google.firebase.crashlytics.internal.concurrency;

import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.state.C1106a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.LoadBundleTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class CrashlyticsWorker implements Executor {
    private final ExecutorService executor;
    private final Object tailLock = new Object();
    private Task<?> tail = Tasks.m10776f(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.executor = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$await$6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$0(Callable callable, Task task) {
        return Tasks.m10776f(callable.call());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$1(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.m10776f(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$2(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$3(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTaskOnSuccess$4(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTaskOnSuccess$5(SuccessContinuation successContinuation, Task task) {
        if (task.isSuccessful()) {
            return successContinuation.then(task.getResult());
        }
        return task.getException() != null ? Tasks.m10775e(task.getException()) : Tasks.m10774d();
    }

    @VisibleForTesting
    public void await() throws InterruptedException {
        Tasks.m10772b(submit(new RunnableC5655b(0)), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.executor.execute(runnable);
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public <T> Task<T> submit(Callable<T> callable) {
        LoadBundleTask loadBundleTask;
        synchronized (this.tailLock) {
            loadBundleTask = (Task<T>) this.tail.continueWithTask(this.executor, new C5654a(callable, 0));
            this.tail = loadBundleTask;
        }
        return loadBundleTask;
    }

    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
        LoadBundleTask loadBundleTask;
        synchronized (this.tailLock) {
            loadBundleTask = (Task<T>) this.tail.continueWithTask(this.executor, new C5654a(callable, 1));
            this.tail = loadBundleTask;
        }
        return loadBundleTask;
    }

    public <T, R> Task<R> submitTaskOnSuccess(Callable<Task<T>> callable, SuccessContinuation<T, R> successContinuation) {
        Task taskContinueWithTask;
        synchronized (this.tailLock) {
            taskContinueWithTask = this.tail.continueWithTask(this.executor, new C5654a(callable, 3)).continueWithTask(this.executor, new C1106a(successContinuation, 11));
            this.tail = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public Task<Void> submit(Runnable runnable) {
        Task<Void> taskContinueWithTask;
        synchronized (this.tailLock) {
            taskContinueWithTask = this.tail.continueWithTask(this.executor, new C1106a(runnable, 10));
            this.tail = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public <T, R> Task<R> submitTask(Callable<Task<T>> callable, Continuation<T, Task<R>> continuation) {
        Task taskContinueWithTask;
        synchronized (this.tailLock) {
            taskContinueWithTask = this.tail.continueWithTask(this.executor, new C5654a(callable, 2)).continueWithTask(this.executor, continuation);
            this.tail = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }
}
