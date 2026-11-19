package com.google.firebase.sessions.api;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.sessions.FirebaseSessions;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p057d0.C6289k;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseSessionsDependencies {
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();
    private static final Map<SessionSubscriber.Name, Dependency> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    private FirebaseSessionsDependencies() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void addDependency(SessionSubscriber.Name subscriberName) {
        AbstractC6452k.m12181e(subscriberName, "subscriberName");
        Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
        if (dependencies2.containsKey(subscriberName)) {
            Log.d(FirebaseSessions.TAG, "Dependency " + subscriberName + " already added.");
            return;
        }
        AbstractC6452k.m12180d(dependencies2, "dependencies");
        dependencies2.put(subscriberName, new Dependency(new CountDownLatch(1), null, 2, 0 == true ? 1 : 0));
        Log.d(FirebaseSessions.TAG, "Dependency to " + subscriberName + " added.");
    }

    private final Dependency getDependency(SessionSubscriber.Name name) {
        Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
        AbstractC6452k.m12180d(dependencies2, "dependencies");
        Dependency dependency = dependencies2.get(name);
        if (dependency != null) {
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6289k getRegisteredSubscribers$lambda$2$lambda$1(Dependency dependency) throws InterruptedException {
        dependency.getLatch().await();
        return C6289k.f24318a;
    }

    public static final void register(SessionSubscriber subscriber) {
        AbstractC6452k.m12181e(subscriber, "subscriber");
        SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        Dependency dependency = INSTANCE.getDependency(sessionSubscriberName);
        if (dependency.getSubscriber() != null) {
            Log.d(FirebaseSessions.TAG, "Subscriber " + sessionSubscriberName + " already registered.");
            return;
        }
        dependency.setSubscriber(subscriber);
        Log.d(FirebaseSessions.TAG, "Subscriber " + sessionSubscriberName + " registered.");
        dependency.getLatch().countDown();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    /* JADX WARN: Code duplicated, block: B:19:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009e -> B:21:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(p062g0.InterfaceC6348c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L13
            r0 = r10
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            h0.a r1 = p064h0.EnumC6363a.f24419s
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r2 = r0.L$4
            java.lang.Object r4 = r0.L$3
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.L$2
            com.google.firebase.sessions.api.SessionSubscriber$Name r5 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r5
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$0
            java.util.Map r7 = (java.util.Map) r7
            p011H.AbstractC0243G.m377o(r10)
            goto L9f
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L41:
            p011H.AbstractC0243G.m377o(r10)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r10 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.AbstractC6452k.m12180d(r10, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r10.size()
            int r4 = p058e0.AbstractC6318z.m12126t(r4)
            r2.<init>(r4)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r6 = r10
            r4 = r2
        L62:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto Laa
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r2 = r10.getKey()
            java.lang.Object r5 = r10.getKey()
            com.google.firebase.sessions.api.SessionSubscriber$Name r5 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r5
            java.lang.Object r10 = r10.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r10 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r10
            com.google.firebase.sessions.api.a r7 = new com.google.firebase.sessions.api.a
            r7.<init>(r10)
            r0.L$0 = r4
            r0.L$1 = r6
            r0.L$2 = r5
            r0.L$3 = r4
            r0.L$4 = r2
            r0.label = r3
            A0.V r10 = new A0.V
            r8 = 0
            r10.<init>(r7, r8)
            g0.i r7 = p062g0.C6354i.f24409s
            java.lang.Object r10 = p000A0.AbstractC0069y.m119r(r10, r7, r0)
            if (r10 != r1) goto L9e
            return r1
        L9e:
            r7 = r4
        L9f:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r10 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
            com.google.firebase.sessions.api.SessionSubscriber r10 = r10.getSubscriber$com_google_firebase_firebase_sessions(r5)
            r4.put(r2, r10)
            r4 = r7
            goto L62
        Laa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(g0.c):java.lang.Object");
    }

    @VisibleForTesting
    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(SessionSubscriber.Name subscriberName) {
        AbstractC6452k.m12181e(subscriberName, "subscriberName");
        SessionSubscriber subscriber = getDependency(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    @VisibleForTesting
    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }

    public static final class Dependency {
        private final CountDownLatch latch;
        private SessionSubscriber subscriber;

        public Dependency(CountDownLatch latch, SessionSubscriber sessionSubscriber) {
            AbstractC6452k.m12181e(latch, "latch");
            this.latch = latch;
            this.subscriber = sessionSubscriber;
        }

        public static /* synthetic */ Dependency copy$default(Dependency dependency, CountDownLatch countDownLatch, SessionSubscriber sessionSubscriber, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                countDownLatch = dependency.latch;
            }
            if ((i2 & 2) != 0) {
                sessionSubscriber = dependency.subscriber;
            }
            return dependency.copy(countDownLatch, sessionSubscriber);
        }

        public final CountDownLatch component1() {
            return this.latch;
        }

        public final SessionSubscriber component2() {
            return this.subscriber;
        }

        public final Dependency copy(CountDownLatch latch, SessionSubscriber sessionSubscriber) {
            AbstractC6452k.m12181e(latch, "latch");
            return new Dependency(latch, sessionSubscriber);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) obj;
            return AbstractC6452k.m12177a(this.latch, dependency.latch) && AbstractC6452k.m12177a(this.subscriber, dependency.subscriber);
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public int hashCode() {
            int iHashCode = this.latch.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.subscriber;
            return iHashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public final void setSubscriber(SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }

        public String toString() {
            return "Dependency(latch=" + this.latch + ", subscriber=" + this.subscriber + ')';
        }

        public /* synthetic */ Dependency(CountDownLatch countDownLatch, SessionSubscriber sessionSubscriber, int i2, AbstractC6447f abstractC6447f) {
            this(countDownLatch, (i2 & 2) != 0 ? null : sessionSubscriber);
        }
    }
}
