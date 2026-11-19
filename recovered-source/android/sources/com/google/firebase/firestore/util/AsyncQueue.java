package com.google.firebase.firestore.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.utils.C1110a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.RunnableC5651h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncQueue {
    private final ArrayList<TimerId> timerIdsToSkip = new ArrayList<>();
    private final ArrayList<DelayedTask> delayedTasks = new ArrayList<>();
    private final SynchronizedShutdownAwareExecutor executor = new SynchronizedShutdownAwareExecutor();

    public class DelayedTask {
        private ScheduledFuture scheduledFuture;
        private final long targetTimeMs;
        private final Runnable task;
        private final TimerId timerId;

        /* JADX INFO: Access modifiers changed from: private */
        public void handleDelayElapsed() {
            AsyncQueue.this.verifyIsCurrentThread();
            if (this.scheduledFuture != null) {
                markDone();
                this.task.run();
            }
        }

        private void markDone() {
            Assert.hardAssert(this.scheduledFuture != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.scheduledFuture = null;
            AsyncQueue.this.removeDelayedTask(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start(long j2) {
            this.scheduledFuture = AsyncQueue.this.executor.schedule(new RunnableC5977b(this, 1), j2, TimeUnit.MILLISECONDS);
        }

        public void cancel() {
            AsyncQueue.this.verifyIsCurrentThread();
            ScheduledFuture scheduledFuture = this.scheduledFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                markDone();
            }
        }

        public void skipDelay() {
            handleDelayElapsed();
        }

        private DelayedTask(TimerId timerId, long j2, Runnable runnable) {
            this.timerId = timerId;
            this.targetTimeMs = j2;
            this.task = runnable;
        }
    }

    public class SynchronizedShutdownAwareExecutor implements Executor {
        private final ScheduledThreadPoolExecutor internalExecutor;
        private boolean isShuttingDown;
        private final Thread thread;

        /* JADX INFO: renamed from: com.google.firebase.firestore.util.AsyncQueue$SynchronizedShutdownAwareExecutor$1 */
        public class C59731 extends ScheduledThreadPoolExecutor implements AutoCloseable {
            final /* synthetic */ AsyncQueue val$this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C59731(int i2, ThreadFactory threadFactory, AsyncQueue asyncQueue) {
                super(i2, threadFactory);
                this.val$this$0 = asyncQueue;
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            public void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e) {
                        th = e.getCause();
                    }
                }
                if (th != null) {
                    AsyncQueue.this.panic(th);
                }
            }

            @Override // java.lang.AutoCloseable
            public final /* synthetic */ void close() {
                boolean zIsTerminated;
                if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
                    return;
                }
                shutdown();
                boolean z = false;
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        public class DelayedStartFactory implements Runnable, ThreadFactory {
            private Runnable delegate;
            private final CountDownLatch latch;

            private DelayedStartFactory() {
                this.latch = new CountDownLatch(1);
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(@NonNull Runnable runnable) {
                Assert.hardAssert(this.delegate == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.delegate = runnable;
                this.latch.countDown();
                return SynchronizedShutdownAwareExecutor.this.thread;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.latch.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.delegate.run();
            }
        }

        public SynchronizedShutdownAwareExecutor() {
            DelayedStartFactory delayedStartFactory = new DelayedStartFactory();
            Thread threadNewThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(delayedStartFactory);
            this.thread = threadNewThread;
            threadNewThread.setName("FirestoreWorker");
            threadNewThread.setDaemon(true);
            threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.google.firebase.firestore.util.d
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    this.f23967a.lambda$new$0(thread, th);
                }
            });
            C59731 c59731 = new C59731(1, delayedStartFactory, AsyncQueue.this);
            this.internalExecutor = c59731;
            c59731.setKeepAliveTime(3L, TimeUnit.SECONDS);
            this.isShuttingDown = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized Task<Void> executeAndInitiateShutdown(Runnable runnable) {
            if (!isShuttingDown()) {
                Task<Void> taskExecuteAndReportResult = executeAndReportResult(new CallableC5978c(0, runnable));
                this.isShuttingDown = true;
                return taskExecuteAndReportResult;
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.m10768b(null);
            return taskCompletionSource.f23216a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <T> Task<T> executeAndReportResult(Callable<T> callable) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                execute(new RunnableC5980e(0, taskCompletionSource, callable));
            } catch (RejectedExecutionException unused) {
                Logger.warn("AsyncQueue", "Refused to enqueue task after panic", new Object[0]);
            }
            return taskCompletionSource.f23216a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean isShuttingDown() {
            return this.isShuttingDown;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void lambda$executeAndInitiateShutdown$2(Runnable runnable) {
            runnable.run();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$executeAndReportResult$1(TaskCompletionSource taskCompletionSource, Callable callable) {
            try {
                taskCompletionSource.m10768b(callable.call());
            } catch (Exception e) {
                taskCompletionSource.m10767a(e);
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(Thread thread, Throwable th) {
            AsyncQueue.this.panic(th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.isShuttingDown) {
                return null;
            }
            return this.internalExecutor.schedule(runnable, j2, timeUnit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCorePoolSize(int i2) {
            this.internalExecutor.setCorePoolSize(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void shutdownNow() {
            this.internalExecutor.shutdownNow();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            if (!this.isShuttingDown) {
                this.internalExecutor.execute(runnable);
            }
        }

        public void executeEvenAfterShutdown(Runnable runnable) {
            try {
                this.internalExecutor.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Logger.warn("AsyncQueue", "Refused to enqueue task after panic", new Object[0]);
            }
        }
    }

    public enum TimerId {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    public static <TResult> Task<TResult> callTask(Executor executor, Callable<Task<TResult>> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new RunnableC5651h(callable, executor, taskCompletionSource, 7));
        return taskCompletionSource.f23216a;
    }

    private DelayedTask createAndScheduleDelayedTask(TimerId timerId, long j2, Runnable runnable) {
        DelayedTask delayedTask = new DelayedTask(timerId, System.currentTimeMillis() + j2, runnable);
        delayedTask.start(j2);
        return delayedTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$callTask$0(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.m10768b(task.getResult());
            return null;
        }
        taskCompletionSource.m10767a(task.getException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$callTask$1(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: com.google.firebase.firestore.util.a
                @Override // com.google.android.gms.tasks.Continuation
                /* JADX INFO: renamed from: a */
                public final Object mo170a(Task task) {
                    return AsyncQueue.lambda$callTask$0(taskCompletionSource, task);
                }
            });
        } catch (Exception e) {
            taskCompletionSource.m10767a(e);
        } catch (Throwable th) {
            taskCompletionSource.m10767a(new IllegalStateException("Unhandled throwable in callTask.", th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$enqueue$2(Runnable runnable) {
        runnable.run();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$panic$3(Throwable th) {
        if (!(th instanceof OutOfMemoryError)) {
            throw new RuntimeException("Internal error in Cloud Firestore (26.3.0).", th);
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (26.3.0) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
        outOfMemoryError.initCause(th);
        throw outOfMemoryError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$runDelayedTasksUntil$5(DelayedTask delayedTask, DelayedTask delayedTask2) {
        return Long.compare(delayedTask.targetTimeMs, delayedTask2.targetTimeMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runDelayedTasksUntil$6(TimerId timerId) {
        int i2 = 0;
        Assert.hardAssert(timerId == TimerId.ALL || containsDelayedTask(timerId), "Attempted to run tasks until missing TimerId: %s", timerId);
        Collections.sort(this.delayedTasks, new C1110a(9));
        ArrayList arrayList = new ArrayList(this.delayedTasks);
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            DelayedTask delayedTask = (DelayedTask) obj;
            delayedTask.skipDelay();
            if (timerId != TimerId.ALL && delayedTask.timerId == timerId) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runSync$4(Runnable runnable, Throwable[] thArr, Semaphore semaphore) {
        try {
            runnable.run();
        } catch (Throwable th) {
            thArr[0] = th;
        }
        semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDelayedTask(DelayedTask delayedTask) {
        Assert.hardAssert(this.delayedTasks.remove(delayedTask), "Delayed task not found.", new Object[0]);
    }

    @VisibleForTesting
    public boolean containsDelayedTask(TimerId timerId) {
        ArrayList<DelayedTask> arrayList = this.delayedTasks;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            DelayedTask delayedTask = arrayList.get(i2);
            i2++;
            if (delayedTask.timerId == timerId) {
                return true;
            }
        }
        return false;
    }

    public <T> Task<T> enqueue(Callable<T> callable) {
        return this.executor.executeAndReportResult(callable);
    }

    public DelayedTask enqueueAfterDelay(TimerId timerId, long j2, Runnable runnable) {
        if (this.timerIdsToSkip.contains(timerId)) {
            j2 = 0;
        }
        DelayedTask delayedTaskCreateAndScheduleDelayedTask = createAndScheduleDelayedTask(timerId, j2, runnable);
        this.delayedTasks.add(delayedTaskCreateAndScheduleDelayedTask);
        return delayedTaskCreateAndScheduleDelayedTask;
    }

    public void enqueueAndForget(Runnable runnable) {
        enqueue(runnable);
    }

    public void enqueueAndForgetEvenAfterShutdown(Runnable runnable) {
        this.executor.executeEvenAfterShutdown(runnable);
    }

    public Task<Void> enqueueAndInitiateShutdown(Runnable runnable) {
        return this.executor.executeAndInitiateShutdown(runnable);
    }

    public Executor getExecutor() {
        return this.executor;
    }

    public boolean isShuttingDown() {
        return this.executor.isShuttingDown();
    }

    public void panic(Throwable th) {
        this.executor.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new RunnableC5977b(th, 0));
    }

    @VisibleForTesting
    public void runDelayedTasksUntil(TimerId timerId) throws InterruptedException {
        runSync(new RunnableC5980e(3, this, timerId));
    }

    @VisibleForTesting
    public void runSync(Runnable runnable) throws InterruptedException {
        Semaphore semaphore = new Semaphore(0);
        Throwable[] thArr = new Throwable[1];
        enqueueAndForget(new RunnableC5651h(runnable, thArr, semaphore, 6));
        semaphore.acquire(1);
        if (thArr[0] != null) {
            throw new RuntimeException("Synchronous task failed", thArr[0]);
        }
    }

    public void shutdown() {
        this.executor.setCorePoolSize(0);
    }

    @VisibleForTesting
    public void skipDelaysForTimerId(TimerId timerId) {
        this.timerIdsToSkip.add(timerId);
    }

    public void verifyIsCurrentThread() {
        Thread threadCurrentThread = Thread.currentThread();
        if (this.executor.thread != threadCurrentThread) {
            throw Assert.fail("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.executor.thread.getName(), Long.valueOf(this.executor.thread.getId()), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        }
    }

    public Task<Void> enqueue(Runnable runnable) {
        return enqueue(new CallableC5978c(1, runnable));
    }
}
