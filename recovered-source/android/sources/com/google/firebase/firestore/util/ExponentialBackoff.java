package com.google.firebase.firestore.util;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class ExponentialBackoff {
    public static final double DEFAULT_BACKOFF_FACTOR = 1.5d;
    public static final long DEFAULT_BACKOFF_INITIAL_DELAY_MS = 1000;
    public static final long DEFAULT_BACKOFF_MAX_DELAY_MS = 60000;
    private final double backoffFactor;
    private long currentBaseMs;
    private final long initialDelayMs;
    private long lastAttemptTime;
    private final long maxDelayMs;
    private long nextMaxDelayMs;
    private final AsyncQueue queue;
    private final AsyncQueue.TimerId timerId;
    private AsyncQueue.DelayedTask timerTask;

    public ExponentialBackoff(AsyncQueue asyncQueue, AsyncQueue.TimerId timerId, long j2, double d, long j3) {
        this.queue = asyncQueue;
        this.timerId = timerId;
        this.initialDelayMs = j2;
        this.backoffFactor = d;
        this.maxDelayMs = j3;
        this.nextMaxDelayMs = j3;
        this.lastAttemptTime = new Date().getTime();
        reset();
    }

    private long jitterDelayMs() {
        return (long) ((Math.random() - 0.5d) * this.currentBaseMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$backoffAndRun$0(Runnable runnable) {
        this.lastAttemptTime = new Date().getTime();
        runnable.run();
    }

    public void backoffAndRun(Runnable runnable) {
        cancel();
        long jJitterDelayMs = this.currentBaseMs + jitterDelayMs();
        long jMax = Math.max(0L, new Date().getTime() - this.lastAttemptTime);
        long jMax2 = Math.max(0L, jJitterDelayMs - jMax);
        if (this.currentBaseMs > 0) {
            Logger.debug(getClass().getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(jMax2), Long.valueOf(this.currentBaseMs), Long.valueOf(jJitterDelayMs), Long.valueOf(jMax));
        }
        this.timerTask = this.queue.enqueueAfterDelay(this.timerId, jMax2, new RunnableC5980e(4, this, runnable));
        long j2 = (long) (this.currentBaseMs * this.backoffFactor);
        this.currentBaseMs = j2;
        long j3 = this.initialDelayMs;
        if (j2 < j3) {
            this.currentBaseMs = j3;
        } else {
            long j4 = this.nextMaxDelayMs;
            if (j2 > j4) {
                this.currentBaseMs = j4;
            }
        }
        this.nextMaxDelayMs = this.maxDelayMs;
    }

    public void cancel() {
        AsyncQueue.DelayedTask delayedTask = this.timerTask;
        if (delayedTask != null) {
            delayedTask.cancel();
            this.timerTask = null;
        }
    }

    public void reset() {
        this.currentBaseMs = 0L;
    }

    public void resetToMax() {
        this.currentBaseMs = this.nextMaxDelayMs;
    }

    public void setTemporaryMaxDelay(long j2) {
        this.nextMaxDelayMs = j2;
    }

    public ExponentialBackoff(AsyncQueue asyncQueue, AsyncQueue.TimerId timerId) {
        this(asyncQueue, timerId, 1000L, 1.5d, DEFAULT_BACKOFF_MAX_DELAY_MS);
    }
}
