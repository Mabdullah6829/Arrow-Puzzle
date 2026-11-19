package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0015P;
import p000A0.AbstractC0063t;
import p000A0.ExecutorC0006G;
import p012H0.C0302e;
import p012H0.C0309l;
import p012H0.ExecutorC0301d;

/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundQueue {
    public static final Companion Companion = new Companion(0 == true ? 1 : 0);
    private static final Executor executor;
    private static final int maxParallelism;
    private State state = new State.Submitting();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final int getMaxParallelism() {
            return BackgroundQueue.maxParallelism;
        }

        private Companion() {
        }
    }

    public interface State {

        public static final class Draining implements State {
            public static final Draining INSTANCE = new Draining();

            private Draining() {
            }
        }

        public static final class Submitting implements State {
            private final Semaphore completedTasks = new Semaphore(0);
            private int taskCount;

            public final Semaphore getCompletedTasks() {
                return this.completedTasks;
            }

            public final int getTaskCount() {
                return this.taskCount;
            }

            public final void setTaskCount(int i2) {
                this.taskCount = i2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Executor executorC0006G;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iAvailableProcessors < 2) {
            iAvailableProcessors = 2;
        }
        maxParallelism = iAvailableProcessors;
        C0302e c0302e = AbstractC0007H.f4a;
        ExecutorC0301d.f608s.getClass();
        AbstractC0063t abstractC0063tLimitedParallelism = C0309l.f622s.limitedParallelism(iAvailableProcessors, "firestore.BackgroundQueue");
        AbstractC0015P abstractC0015P = abstractC0063tLimitedParallelism instanceof AbstractC0015P ? (AbstractC0015P) abstractC0063tLimitedParallelism : null;
        if (abstractC0015P == null || (executorC0006G = abstractC0015P.mo25j()) == null) {
            executorC0006G = new ExecutorC0006G(abstractC0063tLimitedParallelism);
        }
        executor = executorC0006G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submit$lambda$1(Runnable runnable, State state) {
        try {
            runnable.run();
        } finally {
            ((State.Submitting) state).getCompletedTasks().release();
        }
    }

    public final void drain() throws InterruptedException {
        State state = this.state;
        if (!(state instanceof State.Submitting)) {
            throw new IllegalStateException("drain() may not be called more than once");
        }
        this.state = State.Draining.INSTANCE;
        State.Submitting submitting = (State.Submitting) state;
        submitting.getCompletedTasks().acquire(submitting.getTaskCount());
    }

    public final void submit(Runnable runnable) {
        AbstractC6452k.m12181e(runnable, "runnable");
        State state = this.state;
        if (!(state instanceof State.Submitting)) {
            throw new IllegalStateException("submit() may not be called after drain()");
        }
        State.Submitting submitting = (State.Submitting) state;
        submitting.setTaskCount(submitting.getTaskCount() + 1);
        executor.execute(new RunnableC5980e(1, runnable, state));
    }
}
