package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p078p0.InterfaceC6487a;
import p091y0.AbstractC6574d;

/* JADX INFO: loaded from: classes2.dex */
public final class CrashlyticsWorkers {
    public static final Companion Companion = new Companion(null);
    private static boolean enforcement;
    public final CrashlyticsWorker common;
    public final CrashlyticsWorker dataCollect;
    public final CrashlyticsWorker diskWrite;
    public final CrashlyticsWorker network;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkBackgroundThread$lambda$2() {
            return AbstractC0271e0.m401i(new StringBuilder("Must be called on a background thread, was called on "), CrashlyticsWorkers.Companion.getThreadName(), '.');
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkBlockingThread$lambda$1() {
            return AbstractC0271e0.m401i(new StringBuilder("Must be called on a blocking thread, was called on "), CrashlyticsWorkers.Companion.getThreadName(), '.');
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkNotMainThread$lambda$0() {
            return AbstractC0271e0.m401i(new StringBuilder("Must not be called on a main thread, was called on "), CrashlyticsWorkers.Companion.getThreadName(), '.');
        }

        private final void checkThread(InterfaceC6487a interfaceC6487a, InterfaceC6487a interfaceC6487a2) {
            if (((Boolean) interfaceC6487a.invoke()).booleanValue()) {
                return;
            }
            Logger.getLogger().m11167d((String) interfaceC6487a2.invoke());
            getEnforcement();
        }

        public static /* synthetic */ void getEnforcement$annotations() {
        }

        private final String getThreadName() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBackgroundThread() {
            String threadName = getThreadName();
            AbstractC6452k.m12180d(threadName, "<get-threadName>(...)");
            return AbstractC6574d.m12226v(threadName, "Firebase Background Thread #");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBlockingThread() {
            String threadName = getThreadName();
            AbstractC6452k.m12180d(threadName, "<get-threadName>(...)");
            return AbstractC6574d.m12226v(threadName, "Firebase Blocking Thread #");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isNotMainThread() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void checkBackgroundThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBackgroundThread$1(this), new C5656c(0));
        }

        public final void checkBlockingThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBlockingThread$1(this), new C5656c(2));
        }

        public final void checkNotMainThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkNotMainThread$1(this), new C5656c(1));
        }

        public final boolean getEnforcement() {
            return CrashlyticsWorkers.enforcement;
        }

        public final void setEnforcement(boolean z) {
            CrashlyticsWorkers.enforcement = z;
        }

        private Companion() {
        }
    }

    public CrashlyticsWorkers(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        AbstractC6452k.m12181e(backgroundExecutorService, "backgroundExecutorService");
        AbstractC6452k.m12181e(blockingExecutorService, "blockingExecutorService");
        this.common = new CrashlyticsWorker(backgroundExecutorService);
        this.diskWrite = new CrashlyticsWorker(backgroundExecutorService);
        this.dataCollect = new CrashlyticsWorker(backgroundExecutorService);
        this.network = new CrashlyticsWorker(blockingExecutorService);
    }

    public static final void checkBackgroundThread() {
        Companion.checkBackgroundThread();
    }

    public static final void checkBlockingThread() {
        Companion.checkBlockingThread();
    }

    public static final void checkNotMainThread() {
        Companion.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return Companion.getEnforcement();
    }

    public static final void setEnforcement(boolean z) {
        Companion.setEnforcement(z);
    }
}
