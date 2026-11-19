package com.google.firebase.firestore.remote;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.firestore.remote.Stream.StreamCallback;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.ExponentialBackoff;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Util;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p030R.AbstractC0553e0;
import p030R.AbstractC0562j;
import p030R.C0549c0;
import p030R.C0559h0;
import p030R.C0567l0;
import p030R.C0572o;
import p030R.C0589w0;
import p030R.EnumC0587v0;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractStream<ReqT, RespT, CallbackT extends Stream.StreamCallback> implements Stream<CallbackT> {
    private static final long BACKOFF_CLIENT_NETWORK_FAILURE_MAX_DELAY_MS;
    private static final double BACKOFF_FACTOR = 1.5d;
    private static final long BACKOFF_INITIAL_DELAY_MS;
    private static final long BACKOFF_MAX_DELAY_MS;
    private static final long HEALTHY_TIMEOUT_MS;
    private static final long IDLE_TIMEOUT_MS;
    final ExponentialBackoff backoff;
    private AbstractC0562j call;
    private final FirestoreChannel firestoreChannel;

    @Nullable
    private AsyncQueue.DelayedTask healthCheck;
    private final AsyncQueue.TimerId healthTimerId;

    @Nullable
    private AsyncQueue.DelayedTask idleTimer;
    private final AsyncQueue.TimerId idleTimerId;
    final CallbackT listener;
    private final C0567l0 methodDescriptor;
    private final AsyncQueue workerQueue;
    private Stream.State state = Stream.State.Initial;
    private long closeCount = 0;
    private final AbstractStream<ReqT, RespT, CallbackT>.IdleTimeoutRunnable idleTimeoutRunnable = new IdleTimeoutRunnable();

    public class CloseGuardedRunner {
        private final long initialCloseCount;

        public CloseGuardedRunner(long j2) {
            this.initialCloseCount = j2;
        }

        public void run(Runnable runnable) {
            AbstractStream.this.workerQueue.verifyIsCurrentThread();
            if (AbstractStream.this.closeCount == this.initialCloseCount) {
                runnable.run();
            } else {
                Logger.debug(AbstractStream.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    @VisibleForTesting
    public class IdleTimeoutRunnable implements Runnable {
        public IdleTimeoutRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractStream.this.handleIdleCloseTimer();
        }
    }

    public class StreamObserver implements IncomingStreamObserver<RespT> {
        private final AbstractStream<ReqT, RespT, CallbackT>.CloseGuardedRunner dispatcher;
        private int responseCount = 0;

        public StreamObserver(AbstractStream<ReqT, RespT, CallbackT>.CloseGuardedRunner closeGuardedRunner) {
            this.dispatcher = closeGuardedRunner;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClose$3(C0589w0 c0589w0) {
            if (c0589w0.m1352e()) {
                Logger.debug(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(AbstractStream.this)));
            } else {
                Logger.warn(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(AbstractStream.this)), c0589w0);
            }
            AbstractStream.this.handleServerClose(c0589w0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onHeaders$0(C0559h0 c0559h0) {
            Set<String> setUnmodifiableSet;
            if (Logger.isDebugEnabled()) {
                HashMap map = new HashMap();
                if (c0559h0.f1190b == 0) {
                    setUnmodifiableSet = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet(c0559h0.f1190b);
                    for (int i2 = 0; i2 < c0559h0.f1190b; i2++) {
                        hashSet.add(new String(c0559h0.m1309e(i2), 0));
                    }
                    setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                }
                for (String str : setUnmodifiableSet) {
                    if (Datastore.WHITE_LISTED_HEADERS.contains(str.toLowerCase(Locale.ENGLISH))) {
                        C0572o c0572o = C0559h0.f1187d;
                        BitSet bitSet = AbstractC0553e0.f1161d;
                        map.put(str, (String) c0559h0.m1307c(new C0549c0(str, c0572o)));
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                Logger.debug(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(AbstractStream.this)), map);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNext$1(int i2, Object obj) {
            if (Logger.isDebugEnabled()) {
                Logger.debug(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(AbstractStream.this)), Integer.valueOf(i2), obj);
            }
            if (i2 == 1) {
                AbstractStream.this.onFirst(obj);
            } else {
                AbstractStream.this.onNext(obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onOpen$2() {
            Logger.debug(AbstractStream.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(AbstractStream.this)));
            AbstractStream.this.onOpen();
        }

        @Override // com.google.firebase.firestore.remote.IncomingStreamObserver
        public void onClose(C0589w0 c0589w0) {
            this.dispatcher.run(new RunnableC5960c(1, this, c0589w0));
        }

        @Override // com.google.firebase.firestore.remote.IncomingStreamObserver
        public void onHeaders(C0559h0 c0559h0) {
            this.dispatcher.run(new RunnableC5960c(0, this, c0559h0));
        }

        @Override // com.google.firebase.firestore.remote.IncomingStreamObserver
        public void onNext(final RespT respt) {
            final int i2 = this.responseCount + 1;
            this.dispatcher.run(new Runnable() { // from class: com.google.firebase.firestore.remote.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23930s.lambda$onNext$1(i2, respt);
                }
            });
            this.responseCount = i2;
        }

        @Override // com.google.firebase.firestore.remote.IncomingStreamObserver
        public void onOpen() {
            this.dispatcher.run(new RunnableC5961d(this, 0));
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        BACKOFF_INITIAL_DELAY_MS = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        BACKOFF_MAX_DELAY_MS = timeUnit2.toMillis(1L);
        IDLE_TIMEOUT_MS = timeUnit2.toMillis(1L);
        HEALTHY_TIMEOUT_MS = timeUnit.toMillis(10L);
        BACKOFF_CLIENT_NETWORK_FAILURE_MAX_DELAY_MS = timeUnit.toMillis(10L);
    }

    public AbstractStream(FirestoreChannel firestoreChannel, C0567l0 c0567l0, AsyncQueue asyncQueue, AsyncQueue.TimerId timerId, AsyncQueue.TimerId timerId2, AsyncQueue.TimerId timerId3, CallbackT callbackt) {
        this.firestoreChannel = firestoreChannel;
        this.methodDescriptor = c0567l0;
        this.workerQueue = asyncQueue;
        this.idleTimerId = timerId2;
        this.healthTimerId = timerId3;
        this.listener = callbackt;
        this.backoff = new ExponentialBackoff(asyncQueue, timerId, BACKOFF_INITIAL_DELAY_MS, 1.5d, BACKOFF_MAX_DELAY_MS);
    }

    private void cancelHealthCheck() {
        AsyncQueue.DelayedTask delayedTask = this.healthCheck;
        if (delayedTask != null) {
            delayedTask.cancel();
            this.healthCheck = null;
        }
    }

    private void cancelIdleCheck() {
        AsyncQueue.DelayedTask delayedTask = this.idleTimer;
        if (delayedTask != null) {
            delayedTask.cancel();
            this.idleTimer = null;
        }
    }

    private void close(Stream.State state, C0589w0 c0589w0) {
        Assert.hardAssert(isStarted(), "Only started streams should be closed.", new Object[0]);
        Stream.State state2 = Stream.State.Error;
        Assert.hardAssert(state == state2 || c0589w0.m1352e(), "Can't provide an error when not in an error state.", new Object[0]);
        this.workerQueue.verifyIsCurrentThread();
        if (Datastore.isMissingSslCiphers(c0589w0)) {
            Util.crashMainThread(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", c0589w0.f1289c));
        }
        cancelIdleCheck();
        cancelHealthCheck();
        this.backoff.cancel();
        this.closeCount++;
        EnumC0587v0 enumC0587v0 = c0589w0.f1287a;
        if (enumC0587v0 == EnumC0587v0.OK) {
            this.backoff.reset();
        } else if (enumC0587v0 == EnumC0587v0.RESOURCE_EXHAUSTED) {
            Logger.debug(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.backoff.resetToMax();
        } else if (enumC0587v0 == EnumC0587v0.UNAUTHENTICATED && this.state != Stream.State.Healthy) {
            this.firestoreChannel.invalidateToken();
        } else if (enumC0587v0 == EnumC0587v0.UNAVAILABLE) {
            Throwable th = c0589w0.f1289c;
            if ((th instanceof UnknownHostException) || (th instanceof ConnectException)) {
                this.backoff.setTemporaryMaxDelay(BACKOFF_CLIENT_NETWORK_FAILURE_MAX_DELAY_MS);
            }
        }
        if (state != state2) {
            Logger.debug(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            tearDown();
        }
        if (this.call != null) {
            if (c0589w0.m1352e()) {
                Logger.debug(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                try {
                    this.call.halfClose();
                } catch (IllegalStateException e) {
                    Logger.debug(getClass().getSimpleName(), "(%x) Closing stream client-side result in exception: [%s]", Integer.valueOf(System.identityHashCode(this)), e);
                }
            }
            this.call = null;
        }
        this.state = state;
        this.listener.onClose(c0589w0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIdleCloseTimer() {
        if (isOpen()) {
            close(Stream.State.Initial, C0589w0.f1275e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onOpen$0() {
        if (isOpen()) {
            this.state = Stream.State.Healthy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performBackoff$1() {
        Stream.State state = this.state;
        Assert.hardAssert(state == Stream.State.Backoff, "State should still be backoff but was %s", state);
        this.state = Stream.State.Initial;
        start();
        Assert.hardAssert(isStarted(), "Stream should have started", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOpen() {
        this.state = Stream.State.Open;
        this.listener.onOpen();
        if (this.healthCheck == null) {
            this.healthCheck = this.workerQueue.enqueueAfterDelay(this.healthTimerId, HEALTHY_TIMEOUT_MS, new RunnableC5958a(this, 1));
        }
    }

    private void performBackoff() {
        Assert.hardAssert(this.state == Stream.State.Error, "Should only perform backoff in an error state", new Object[0]);
        this.state = Stream.State.Backoff;
        this.backoff.backoffAndRun(new RunnableC5958a(this, 0));
    }

    @VisibleForTesting
    public void handleServerClose(C0589w0 c0589w0) {
        Assert.hardAssert(isStarted(), "Can't handle server close on non-started stream!", new Object[0]);
        close(Stream.State.Error, c0589w0);
    }

    @Override // com.google.firebase.firestore.remote.Stream
    public void inhibitBackoff() {
        Assert.hardAssert(!isStarted(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.workerQueue.verifyIsCurrentThread();
        this.state = Stream.State.Initial;
        this.backoff.reset();
    }

    @Override // com.google.firebase.firestore.remote.Stream
    public boolean isOpen() {
        this.workerQueue.verifyIsCurrentThread();
        Stream.State state = this.state;
        return state == Stream.State.Open || state == Stream.State.Healthy;
    }

    @Override // com.google.firebase.firestore.remote.Stream
    public boolean isStarted() {
        this.workerQueue.verifyIsCurrentThread();
        Stream.State state = this.state;
        return state == Stream.State.Starting || state == Stream.State.Backoff || isOpen();
    }

    public void markIdle() {
        if (isOpen() && this.idleTimer == null) {
            this.idleTimer = this.workerQueue.enqueueAfterDelay(this.idleTimerId, IDLE_TIMEOUT_MS, this.idleTimeoutRunnable);
        }
    }

    public abstract void onFirst(RespT respt);

    public abstract void onNext(RespT respt);

    @Override // com.google.firebase.firestore.remote.Stream
    public void start() {
        this.workerQueue.verifyIsCurrentThread();
        Assert.hardAssert(this.call == null, "Last call still set", new Object[0]);
        Assert.hardAssert(this.idleTimer == null, "Idle timer still set", new Object[0]);
        Stream.State state = this.state;
        if (state == Stream.State.Error) {
            performBackoff();
            return;
        }
        Assert.hardAssert(state == Stream.State.Initial, "Already started", new Object[0]);
        this.call = this.firestoreChannel.runBidiStreamingRpc(this.methodDescriptor, new StreamObserver(new CloseGuardedRunner(this.closeCount)));
        this.state = Stream.State.Starting;
    }

    @Override // com.google.firebase.firestore.remote.Stream
    public void stop() {
        if (isStarted()) {
            close(Stream.State.Initial, C0589w0.f1275e);
        }
    }

    public void tearDown() {
    }

    public void writeRequest(ReqT reqt) {
        this.workerQueue.verifyIsCurrentThread();
        Logger.debug(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), reqt);
        cancelIdleCheck();
        this.call.sendMessage(reqt);
    }
}
