package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p000A0.InterfaceC0066v;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {
    public static final Companion Companion = new Companion(null);
    private static final double randomValueForSampling = Math.random();
    private final InterfaceC6353h backgroundDispatcher;
    private final EventGDTLoggerInterface eventGDTLogger;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final SessionsSettings sessionSettings;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", m12159f = "SessionFirelogPublisher.kt", m12160l = {70, 71, 77}, m12161m = "invokeSuspend")
    public static final class C60371 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ SessionDetails $sessionDetails;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60371(SessionDetails sessionDetails, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$sessionDetails = sessionDetails;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return SessionFirelogPublisherImpl.this.new C60371(this.$sessionDetails, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C60371) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0094  */
        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InstallationId installationId;
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
            SessionEvents sessionEvents;
            FirebaseApp firebaseApp;
            SessionDetails sessionDetails;
            SessionsSettings sessionsSettings;
            Object registeredSubscribers$com_google_firebase_firebase_sessions;
            FirebaseApp firebaseApp2;
            SessionDetails sessionDetails2;
            SessionEvents sessionEvents2;
            SessionsSettings sessionsSettings2;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = SessionFirelogPublisherImpl.this;
                this.label = 1;
                obj = sessionFirelogPublisherImpl2.shouldLogSession(this);
                if (obj != enumC6363a) {
                }
                return enumC6363a;
            }
            if (i2 == 1) {
                AbstractC0243G.m377o(obj);
            } else {
                if (i2 == 2) {
                    AbstractC0243G.m377o(obj);
                    installationId = (InstallationId) obj;
                    sessionFirelogPublisherImpl = SessionFirelogPublisherImpl.this;
                    sessionEvents = SessionEvents.INSTANCE;
                    firebaseApp = sessionFirelogPublisherImpl.firebaseApp;
                    sessionDetails = this.$sessionDetails;
                    sessionsSettings = SessionFirelogPublisherImpl.this.sessionSettings;
                    FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                    this.L$0 = installationId;
                    this.L$1 = sessionFirelogPublisherImpl;
                    this.L$2 = sessionEvents;
                    this.L$3 = firebaseApp;
                    this.L$4 = sessionDetails;
                    this.L$5 = sessionsSettings;
                    this.label = 3;
                    registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                    if (registeredSubscribers$com_google_firebase_firebase_sessions != enumC6363a) {
                        firebaseApp2 = firebaseApp;
                        obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                        sessionDetails2 = sessionDetails;
                        sessionEvents2 = sessionEvents;
                        sessionsSettings2 = sessionsSettings;
                    }
                    return enumC6363a;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SessionsSettings sessionsSettings3 = (SessionsSettings) this.L$5;
                SessionDetails sessionDetails3 = (SessionDetails) this.L$4;
                FirebaseApp firebaseApp3 = (FirebaseApp) this.L$3;
                SessionEvents sessionEvents3 = (SessionEvents) this.L$2;
                sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) this.L$1;
                installationId = (InstallationId) this.L$0;
                AbstractC0243G.m377o(obj);
                sessionsSettings2 = sessionsSettings3;
                sessionEvents2 = sessionEvents3;
                sessionDetails2 = sessionDetails3;
                firebaseApp2 = firebaseApp3;
            }
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = sessionFirelogPublisherImpl;
            Map<SessionSubscriber.Name, ? extends SessionSubscriber> map = (Map) obj;
            InstallationId installationId2 = installationId;
            sessionFirelogPublisherImpl3.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp2, sessionDetails2, sessionsSettings2, map, installationId2.getFid(), installationId2.getAuthToken()));
            return C6289k.f24318a;
            if (((Boolean) obj).booleanValue()) {
                InstallationId.Companion companion = InstallationId.Companion;
                FirebaseInstallationsApi firebaseInstallationsApi = SessionFirelogPublisherImpl.this.firebaseInstallations;
                this.label = 2;
                obj = companion.create(firebaseInstallationsApi, this);
                if (obj != enumC6363a) {
                    installationId = (InstallationId) obj;
                    sessionFirelogPublisherImpl = SessionFirelogPublisherImpl.this;
                    sessionEvents = SessionEvents.INSTANCE;
                    firebaseApp = sessionFirelogPublisherImpl.firebaseApp;
                    sessionDetails = this.$sessionDetails;
                    sessionsSettings = SessionFirelogPublisherImpl.this.sessionSettings;
                    FirebaseSessionsDependencies firebaseSessionsDependencies2 = FirebaseSessionsDependencies.INSTANCE;
                    this.L$0 = installationId;
                    this.L$1 = sessionFirelogPublisherImpl;
                    this.L$2 = sessionEvents;
                    this.L$3 = firebaseApp;
                    this.L$4 = sessionDetails;
                    this.L$5 = sessionsSettings;
                    this.label = 3;
                    registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies2.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                    if (registeredSubscribers$com_google_firebase_firebase_sessions != enumC6363a) {
                        firebaseApp2 = firebaseApp;
                        obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                        sessionDetails2 = sessionDetails;
                        sessionEvents2 = sessionEvents;
                        sessionsSettings2 = sessionsSettings;
                        SessionFirelogPublisherImpl sessionFirelogPublisherImpl4 = sessionFirelogPublisherImpl;
                        Map<SessionSubscriber.Name, ? extends SessionSubscriber> map2 = (Map) obj;
                        InstallationId installationId3 = installationId;
                        sessionFirelogPublisherImpl4.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp2, sessionDetails2, sessionsSettings2, map2, installationId3.getFid(), installationId3.getAuthToken()));
                    }
                }
                return enumC6363a;
            }
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m12159f = "SessionFirelogPublisher.kt", m12160l = {98, 104}, m12161m = "shouldLogSession")
    public static final class C60381 extends AbstractC6373c {
        int label;
        /* synthetic */ Object result;

        public C60381(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionFirelogPublisherImpl.this.shouldLogSession(this);
        }
    }

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallations, SessionsSettings sessionSettings, EventGDTLoggerInterface eventGDTLogger, @Background InterfaceC6353h backgroundDispatcher) {
        AbstractC6452k.m12181e(firebaseApp, "firebaseApp");
        AbstractC6452k.m12181e(firebaseInstallations, "firebaseInstallations");
        AbstractC6452k.m12181e(sessionSettings, "sessionSettings");
        AbstractC6452k.m12181e(eventGDTLogger, "eventGDTLogger");
        AbstractC6452k.m12181e(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
            Log.d(FirebaseSessions.TAG, "Successfully logged Session Start event.");
        } catch (RuntimeException e) {
            Log.e(FirebaseSessions.TAG, "Error logging Session Start event to DataTransport: ", e);
        }
    }

    private final boolean shouldCollectEvents() {
        return randomValueForSampling <= this.sessionSettings.getSamplingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r7.updateSettings(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shouldLogSession(p062g0.InterfaceC6348c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl.C60381
            if (r0 == 0) goto L13
            r0 = r7
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl.C60381) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h0.a r1 = p064h0.EnumC6363a.f24419s
            int r2 = r0.label
            r3 = 2
            r4 = 1
            java.lang.String r5 = "FirebaseSessions"
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p011H.AbstractC0243G.m377o(r7)
            goto L76
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            p011H.AbstractC0243G.m377o(r7)
            goto L46
        L38:
            p011H.AbstractC0243G.m377o(r7)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r7 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
            r0.label = r4
            java.lang.Object r7 = r7.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r0)
            if (r7 != r1) goto L46
            goto L75
        L46:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            if (r7 == 0) goto L55
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L55
            goto L97
        L55:
            java.util.Iterator r7 = r7.iterator()
        L59:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L97
            java.lang.Object r2 = r7.next()
            com.google.firebase.sessions.api.SessionSubscriber r2 = (com.google.firebase.sessions.api.SessionSubscriber) r2
            boolean r2 = r2.isDataCollectionEnabled()
            if (r2 == 0) goto L59
            com.google.firebase.sessions.settings.SessionsSettings r7 = r6.sessionSettings
            r0.label = r3
            java.lang.Object r7 = r7.updateSettings(r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            com.google.firebase.sessions.settings.SessionsSettings r7 = r6.sessionSettings
            boolean r7 = r7.getSessionsEnabled()
            if (r7 != 0) goto L86
            java.lang.String r7 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r5, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L86:
            boolean r7 = r6.shouldCollectEvents()
            if (r7 != 0) goto L94
            java.lang.String r7 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r5, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L94:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L97:
            java.lang.String r7 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r5, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.shouldLogSession(g0.c):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void mayLogSession(SessionDetails sessionDetails) {
        AbstractC6452k.m12181e(sessionDetails, "sessionDetails");
        AbstractC0069y.m111j(AbstractC0069y.m102a(this.backgroundDispatcher), null, new C60371(sessionDetails, null), 3);
    }
}
