package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import io.grpc.ManagedChannelProvider$ProviderNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p001B.AbstractC0076b;
import p030R.AbstractC0541X;
import p030R.AbstractC0542Y;
import p030R.AbstractC0543Z;
import p030R.AbstractC0552e;
import p030R.AbstractC0558h;
import p030R.AbstractC0562j;
import p030R.C0545a0;
import p030R.C0547b0;
import p030R.C0554f;
import p030R.C0556g;
import p030R.C0567l0;
import p030R.C0572o;
import p030R.EnumC0578r;
import p032S.C0600d;
import p036U.C0827h;
import p042Z.AbstractC0877b;
import p042Z.EnumC0876a;

/* JADX INFO: loaded from: classes2.dex */
public class GrpcCallProvider {
    private static final int CONNECTIVITY_ATTEMPT_TIMEOUT_MS = 15000;
    private static final String LOG_TAG = "GrpcCallProvider";
    private static Supplier<AbstractC0542Y> overrideChannelBuilderSupplier;
    private final AsyncQueue asyncQueue;
    private C0556g callOptions;
    private Task<AbstractC0541X> channelTask;
    private AsyncQueue.DelayedTask connectivityAttemptTimer;
    private final Context context;
    private final DatabaseInfo databaseInfo;
    private final AbstractC0552e firestoreHeaders;

    public GrpcCallProvider(AsyncQueue asyncQueue, Context context, DatabaseInfo databaseInfo, AbstractC0552e abstractC0552e) {
        this.asyncQueue = asyncQueue;
        this.context = context;
        this.databaseInfo = databaseInfo;
        this.firestoreHeaders = abstractC0552e;
        initChannelTask();
    }

    private void clearConnectivityAttemptTimer() {
        if (this.connectivityAttemptTimer != null) {
            Logger.debug(LOG_TAG, "Clearing the connectivityAttemptTimer", new Object[0]);
            this.connectivityAttemptTimer.cancel();
            this.connectivityAttemptTimer = null;
        }
    }

    private AbstractC0541X initChannel(Context context, DatabaseInfo databaseInfo) {
        C0547b0 c0547b0;
        List list;
        AbstractC0542Y abstractC0542Y;
        try {
            ProviderInstaller.m10756a(context);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IllegalStateException e) {
            Logger.warn(LOG_TAG, "Failed to update ssl context: %s", e);
        }
        Supplier<AbstractC0542Y> supplier = overrideChannelBuilderSupplier;
        if (supplier != null) {
            abstractC0542Y = supplier.get();
        } else {
            String host = databaseInfo.getHost();
            java.util.logging.Logger logger = C0547b0.f1156c;
            synchronized (C0547b0.class) {
                try {
                    if (C0547b0.f1157d == null) {
                        List<AbstractC0543Z> listM1294e = AbstractC0558h.m1294e(AbstractC0543Z.class, C0547b0.m1282a(), AbstractC0543Z.class.getClassLoader(), new C0572o(7));
                        C0547b0.f1157d = new C0547b0();
                        for (AbstractC0543Z abstractC0543Z : listM1294e) {
                            C0547b0.f1156c.fine("Service loader found " + abstractC0543Z);
                            C0547b0 c0547b1 = C0547b0.f1157d;
                            synchronized (c0547b1) {
                                abstractC0543Z.getClass();
                                c0547b1.f1158a.add(abstractC0543Z);
                            }
                        }
                        C0547b0 c0547b2 = C0547b0.f1157d;
                        synchronized (c0547b2) {
                            ArrayList arrayList = new ArrayList(c0547b2.f1158a);
                            Collections.sort(arrayList, Collections.reverseOrder(new C0545a0()));
                            c0547b2.f1159b = Collections.unmodifiableList(arrayList);
                        }
                    }
                    c0547b0 = C0547b0.f1157d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (c0547b0) {
                list = c0547b0.f1159b;
            }
            if ((list.isEmpty() ? null : (AbstractC0543Z) list.get(0)) == null) {
                throw new ManagedChannelProvider$ProviderNotFoundException("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
            }
            C0827h c0827h = new C0827h(host);
            if (!databaseInfo.isSslEnabled()) {
                c0827h.f2203g = 2;
            }
            abstractC0542Y = c0827h;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        abstractC0542Y.mo1238b();
        C0600d c0600d = new C0600d(abstractC0542Y);
        c0600d.f1321b = context;
        return c0600d.mo1232a();
    }

    private void initChannelTask() {
        this.channelTask = Tasks.m10773c(Executors.BACKGROUND_EXECUTOR, new Callable() { // from class: com.google.firebase.firestore.remote.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23948a.lambda$initChannelTask$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$createClientCall$0(C0567l0 c0567l0, Task task) {
        return Tasks.m10776f(((AbstractC0541X) task.getResult()).mo1245k(c0567l0, this.callOptions));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC0541X lambda$initChannelTask$6() {
        AbstractC0541X abstractC0541XInitChannel = initChannel(this.context, this.databaseInfo);
        this.asyncQueue.enqueueAndForget(new RunnableC5964g(this, abstractC0541XInitChannel, 4));
        C0556g c0556gM1291c = C0556g.f1174i.m1291c(AbstractC0877b.f2459a, EnumC0876a.f2457s);
        AbstractC0076b.m133h(abstractC0541XInitChannel, "channel");
        AbstractC0552e abstractC0552e = this.firestoreHeaders;
        C0554f c0554fM1289b = C0556g.m1289b(c0556gM1291c);
        c0554fM1289b.f1167c = abstractC0552e;
        C0556g c0556g = new C0556g(c0554fM1289b);
        Executor executor = this.asyncQueue.getExecutor();
        C0554f c0554fM1289b2 = C0556g.m1289b(c0556g);
        c0554fM1289b2.f1166b = executor;
        this.callOptions = new C0556g(c0554fM1289b2);
        Logger.debug(LOG_TAG, "Channel successfully reset.", new Object[0]);
        return abstractC0541XInitChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectivityStateChange$1(AbstractC0541X abstractC0541X) {
        Logger.debug(LOG_TAG, "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        clearConnectivityAttemptTimer();
        resetChannel(abstractC0541X);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectivityStateChange$3(AbstractC0541X abstractC0541X) {
        this.asyncQueue.enqueueAndForget(new RunnableC5964g(this, abstractC0541X, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetChannel$4(AbstractC0541X abstractC0541X) {
        abstractC0541X.mo1281w();
        initChannelTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onConnectivityStateChange, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$onConnectivityStateChange$2(AbstractC0541X abstractC0541X) {
        EnumC0578r enumC0578rMo1278t = abstractC0541X.mo1278t();
        Logger.debug(LOG_TAG, "Current gRPC connectivity state: " + enumC0578rMo1278t, new Object[0]);
        clearConnectivityAttemptTimer();
        if (enumC0578rMo1278t == EnumC0578r.f1232s) {
            Logger.debug(LOG_TAG, "Setting the connectivityAttemptTimer", new Object[0]);
            this.connectivityAttemptTimer = this.asyncQueue.enqueueAfterDelay(AsyncQueue.TimerId.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new RunnableC5964g(this, abstractC0541X, 0));
        }
        abstractC0541X.mo1279u(enumC0578rMo1278t, new RunnableC5964g(this, abstractC0541X, 1));
    }

    private void resetChannel(AbstractC0541X abstractC0541X) {
        this.asyncQueue.enqueueAndForget(new RunnableC5964g(this, abstractC0541X, 3));
    }

    public <ReqT, RespT> Task<AbstractC0562j> createClientCall(C0567l0 c0567l0) {
        return this.channelTask.continueWithTask(this.asyncQueue.getExecutor(), new C5962e(1, this, c0567l0));
    }

    public void shutdown() {
        try {
            AbstractC0541X abstractC0541X = (AbstractC0541X) Tasks.m10771a(this.channelTask);
            abstractC0541X.mo1280v();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (abstractC0541X.mo1276r(1L)) {
                    return;
                }
                Logger.debug("FirestoreChannel", "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                abstractC0541X.mo1281w();
                if (abstractC0541X.mo1276r(60L)) {
                    return;
                }
                Logger.warn("FirestoreChannel", "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
            } catch (InterruptedException unused) {
                abstractC0541X.mo1281w();
                Logger.warn("FirestoreChannel", "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException unused2) {
            Logger.warn("FirestoreChannel", "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            Logger.warn("FirestoreChannel", "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e);
        }
    }
}
