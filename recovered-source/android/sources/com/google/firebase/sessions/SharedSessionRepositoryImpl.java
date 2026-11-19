package com.google.firebase.sessions;

import android.util.Log;
import androidx.constraintlayout.widget.C1137R;
import androidx.datastore.core.DataStore;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p000A0.InterfaceC0066v;
import p006D0.C0177l;
import p006D0.InterfaceC0171f;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p068j0.InterfaceC6418a;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;
import p092z0.C6583a;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedSessionRepositoryImpl implements SharedSessionRepository {
    private final InterfaceC6353h backgroundDispatcher;
    private boolean isInForeground;
    public SessionData localSessionData;
    private boolean pendingForegroundCheck;
    private NotificationType previousNotificationType;
    private String previousSessionId;
    private final ProcessDataManager processDataManager;
    private final DataStore<SessionData> sessionDataStore;
    private final SessionFirelogPublisher sessionFirelogPublisher;
    private final SessionGenerator sessionGenerator;
    private final SessionsSettings sessionsSettings;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", m12159f = "SharedSessionRepository.kt", m12160l = {96}, m12161m = "invokeSuspend")
    public static final class C60391 extends AbstractC6379i implements InterfaceC6502p {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1, reason: invalid class name */
        @InterfaceC6375e(m12158c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", m12159f = "SharedSessionRepository.kt", m12160l = {94}, m12161m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC6379i implements InterfaceC6503q {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, InterfaceC6348c interfaceC6348c) {
                super(3, interfaceC6348c);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // p078p0.InterfaceC6503q
            public final Object invoke(InterfaceC0171f interfaceC0171f, Throwable th, InterfaceC6348c interfaceC6348c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC6348c);
                anonymousClass1.L$0 = interfaceC0171f;
                anonymousClass1.L$1 = th;
                return anonymousClass1.invokeSuspend(C6289k.f24318a);
            }

            @Override // p066i0.AbstractC6371a
            public final Object invokeSuspend(Object obj) throws Throwable {
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                int i2 = this.label;
                if (i2 == 0) {
                    AbstractC0243G.m377o(obj);
                    InterfaceC0171f interfaceC0171f = (InterfaceC0171f) this.L$0;
                    Throwable th = (Throwable) this.L$1;
                    SessionData sessionData = new SessionData(this.this$0.sessionGenerator.generateNewSession(null), (Time) null, (Map) null, 4, (AbstractC6447f) null);
                    Log.d(FirebaseSessions.TAG, "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + sessionData.getSessionDetails().getSessionId());
                    this.L$0 = null;
                    this.label = 1;
                    if (interfaceC0171f.emit(sessionData, this) == enumC6363a) {
                        return enumC6363a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0243G.m377o(obj);
                }
                return C6289k.f24318a;
            }
        }

        public C60391(InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return SharedSessionRepositoryImpl.this.new C60391(interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C60391) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                C0177l c0177l = new C0177l(SharedSessionRepositoryImpl.this.sessionDataStore.getData(), new AnonymousClass1(SharedSessionRepositoryImpl.this, null), 1);
                final SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                InterfaceC0171f interfaceC0171f = new InterfaceC0171f() { // from class: com.google.firebase.sessions.SharedSessionRepositoryImpl.1.2
                    @Override // p006D0.InterfaceC0171f
                    public final Object emit(SessionData sessionData, InterfaceC6348c interfaceC6348c) throws Throwable {
                        sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(sessionData);
                        if (sharedSessionRepositoryImpl.pendingForegroundCheck) {
                            sharedSessionRepositoryImpl.pendingForegroundCheck = false;
                            sharedSessionRepositoryImpl.appForeground();
                        }
                        Object objNotifySubscribers = sharedSessionRepositoryImpl.notifySubscribers(sessionData.getSessionDetails().getSessionId(), NotificationType.GENERAL, interfaceC6348c);
                        return objNotifySubscribers == EnumC6363a.f24419s ? objNotifySubscribers : C6289k.f24318a;
                    }
                };
                this.label = 1;
                if (c0177l.collect(interfaceC0171f, this) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        }
    }

    public enum NotificationType {
        GENERAL,
        FALLBACK;

        private static final /* synthetic */ InterfaceC6418a $ENTRIES = AbstractC0243G.m373k(values());

        public static InterfaceC6418a getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationType.values().length];
            try {
                iArr[NotificationType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationType.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", m12159f = "SharedSessionRepository.kt", m12160l = {C1137R.styleable.ConstraintSet_polarRelativeTo}, m12161m = "invokeSuspend")
    public static final class C60401 extends AbstractC6379i implements InterfaceC6502p {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1, reason: invalid class name */
        @InterfaceC6375e(m12158c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", m12159f = "SharedSessionRepository.kt", m12160l = {}, m12161m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC6379i implements InterfaceC6502p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, InterfaceC6348c interfaceC6348c) {
                super(2, interfaceC6348c);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // p066i0.AbstractC6371a
            public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC6348c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p078p0.InterfaceC6502p
            public final Object invoke(SessionData sessionData, InterfaceC6348c interfaceC6348c) {
                return ((AnonymousClass1) create(sessionData, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
            }

            @Override // p066i0.AbstractC6371a
            public final Object invokeSuspend(Object obj) throws Throwable {
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
                return SessionData.copy$default((SessionData) this.L$0, null, this.this$0.timeProvider.currentTime(), null, 5, null);
            }
        }

        public C60401(InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return SharedSessionRepositoryImpl.this.new C60401(interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C60401) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    AbstractC0243G.m377o(obj);
                    DataStore dataStore = SharedSessionRepositoryImpl.this.sessionDataStore;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(SharedSessionRepositoryImpl.this, null);
                    this.label = 1;
                    if (dataStore.updateData(anonymousClass1, this) == enumC6363a) {
                        return enumC6363a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0243G.m377o(obj);
                }
            } catch (Exception e) {
                Log.d(FirebaseSessions.TAG, "App backgrounded, failed to update data. Message: " + e.getMessage());
                SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(SessionData.copy$default(sharedSessionRepositoryImpl.getLocalSessionData$com_google_firebase_firebase_sessions(), null, SharedSessionRepositoryImpl.this.timeProvider.currentTime(), null, 5, null));
            }
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", m12159f = "SharedSessionRepository.kt", m12160l = {142, 193}, m12161m = "invokeSuspend")
    public static final class C60411 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ SessionData $sessionData;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1, reason: invalid class name */
        @InterfaceC6375e(m12158c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", m12159f = "SharedSessionRepository.kt", m12160l = {}, m12161m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC6379i implements InterfaceC6502p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, InterfaceC6348c interfaceC6348c) {
                super(2, interfaceC6348c);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // p066i0.AbstractC6371a
            public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC6348c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p078p0.InterfaceC6502p
            public final Object invoke(SessionData sessionData, InterfaceC6348c interfaceC6348c) {
                return ((AnonymousClass1) create(sessionData, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
            }

            @Override // p066i0.AbstractC6371a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Map<String, ProcessData> mapUpdateProcessDataMap;
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
                SessionData sessionData = (SessionData) this.L$0;
                boolean zIsSessionExpired = this.this$0.isSessionExpired(sessionData);
                boolean zIsColdStart = this.this$0.isColdStart(sessionData);
                boolean zIsMyProcessStale = this.this$0.isMyProcessStale(sessionData);
                if (zIsColdStart) {
                    mapUpdateProcessDataMap = this.this$0.processDataManager.generateProcessDataMap();
                } else {
                    mapUpdateProcessDataMap = zIsMyProcessStale ? this.this$0.processDataManager.updateProcessDataMap(sessionData.getProcessDataMap()) : sessionData.getProcessDataMap();
                }
                SessionDetails sessionDetails = zIsColdStart ? null : sessionData.getSessionDetails();
                if (!zIsSessionExpired && !zIsColdStart) {
                    return zIsMyProcessStale ? SessionData.copy$default(sessionData, null, null, this.this$0.processDataManager.updateProcessDataMap(mapUpdateProcessDataMap), 3, null) : sessionData;
                }
                SessionDetails sessionDetailsGenerateNewSession = this.this$0.sessionGenerator.generateNewSession(sessionDetails);
                this.this$0.sessionFirelogPublisher.mayLogSession(sessionDetailsGenerateNewSession);
                this.this$0.processDataManager.onSessionGenerated();
                return sessionData.copy(sessionDetailsGenerateNewSession, null, mapUpdateProcessDataMap);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60411(SessionData sessionData, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$sessionData = sessionData;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return SharedSessionRepositoryImpl.this.new C60411(this.$sessionData, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C60411) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            if (r10.updateData(r0, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
        
            if (r10.notifySubscribers(r0, r3, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
        
            return r1;
         */
        @Override // p066i0.AbstractC6371a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                h0.a r1 = p064h0.EnumC6363a.f24419s
                int r0 = r9.label
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L21
                if (r0 == r3) goto L19
                if (r0 != r2) goto L11
                p011H.AbstractC0243G.m377o(r10)
                goto L95
            L11:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L19:
                p011H.AbstractC0243G.m377o(r10)     // Catch: java.lang.Exception -> L1e
                goto L95
            L1e:
                r0 = move-exception
                r10 = r0
                goto L3b
            L21:
                p011H.AbstractC0243G.m377o(r10)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this     // Catch: java.lang.Exception -> L1e
                androidx.datastore.core.DataStore r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionDataStore$p(r10)     // Catch: java.lang.Exception -> L1e
                com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1 r0 = new com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1     // Catch: java.lang.Exception -> L1e
                com.google.firebase.sessions.SharedSessionRepositoryImpl r4 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this     // Catch: java.lang.Exception -> L1e
                r5 = 0
                r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L1e
                r9.label = r3     // Catch: java.lang.Exception -> L1e
                java.lang.Object r10 = r10.updateData(r0, r9)     // Catch: java.lang.Exception -> L1e
                if (r10 != r1) goto L95
                goto L94
            L3b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r3 = "App foregrounded, failed to update data. Message: "
                r0.<init>(r3)
                java.lang.String r10 = r10.getMessage()
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                java.lang.String r0 = "FirebaseSessions"
                android.util.Log.d(r0, r10)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionData r0 = r9.$sessionData
                boolean r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$isSessionExpired(r10, r0)
                if (r10 == 0) goto L95
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionGenerator r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionGenerator$p(r10)
                com.google.firebase.sessions.SessionData r0 = r9.$sessionData
                com.google.firebase.sessions.SessionDetails r0 = r0.getSessionDetails()
                com.google.firebase.sessions.SessionDetails r4 = r10.generateNewSession(r0)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionData r3 = r9.$sessionData
                r7 = 4
                r8 = 0
                r5 = 0
                r6 = 0
                com.google.firebase.sessions.SessionData r0 = com.google.firebase.sessions.SessionData.copy$default(r3, r4, r5, r6, r7, r8)
                r10.setLocalSessionData$com_google_firebase_firebase_sessions(r0)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionFirelogPublisher r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionFirelogPublisher$p(r10)
                r10.mayLogSession(r4)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                java.lang.String r0 = r4.getSessionId()
                com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType r3 = com.google.firebase.sessions.SharedSessionRepositoryImpl.NotificationType.FALLBACK
                r9.label = r2
                java.lang.Object r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$notifySubscribers(r10, r0, r3, r9)
                if (r10 != r1) goto L95
            L94:
                return r1
            L95:
                d0.k r10 = p057d0.C6289k.f24318a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.C60411.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$notifySubscribers$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", m12159f = "SharedSessionRepository.kt", m12160l = {206}, m12161m = "notifySubscribers")
    public static final class C60421 extends AbstractC6373c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C60421(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedSessionRepositoryImpl.this.notifySubscribers(null, null, this);
        }
    }

    public SharedSessionRepositoryImpl(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, DataStore<SessionData> sessionDataStore, ProcessDataManager processDataManager, @Background InterfaceC6353h backgroundDispatcher) {
        AbstractC6452k.m12181e(sessionsSettings, "sessionsSettings");
        AbstractC6452k.m12181e(sessionGenerator, "sessionGenerator");
        AbstractC6452k.m12181e(sessionFirelogPublisher, "sessionFirelogPublisher");
        AbstractC6452k.m12181e(timeProvider, "timeProvider");
        AbstractC6452k.m12181e(sessionDataStore, "sessionDataStore");
        AbstractC6452k.m12181e(processDataManager, "processDataManager");
        AbstractC6452k.m12181e(backgroundDispatcher, "backgroundDispatcher");
        this.sessionsSettings = sessionsSettings;
        this.sessionGenerator = sessionGenerator;
        this.sessionFirelogPublisher = sessionFirelogPublisher;
        this.timeProvider = timeProvider;
        this.sessionDataStore = sessionDataStore;
        this.processDataManager = processDataManager;
        this.backgroundDispatcher = backgroundDispatcher;
        this.previousNotificationType = NotificationType.GENERAL;
        this.previousSessionId = "";
        AbstractC0069y.m111j(AbstractC0069y.m102a(backgroundDispatcher), null, new C60391(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isColdStart(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        if (processDataMap == null) {
            Log.d(FirebaseSessions.TAG, "No process data map");
            return true;
        }
        boolean zIsColdStart = this.processDataManager.isColdStart(processDataMap);
        if (zIsColdStart) {
            Log.d(FirebaseSessions.TAG, "Cold app start detected");
        }
        return zIsColdStart;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMyProcessStale(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        if (processDataMap == null) {
            Log.d(FirebaseSessions.TAG, "No process data for " + this.processDataManager.getMyProcessName());
            return true;
        }
        boolean zIsMyProcessStale = this.processDataManager.isMyProcessStale(processDataMap);
        if (zIsMyProcessStale) {
            Log.d(FirebaseSessions.TAG, "Process " + this.processDataManager.getMyProcessName() + " is stale");
        }
        return zIsMyProcessStale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSessionExpired(SessionData sessionData) {
        Time backgroundTime = sessionData.getBackgroundTime();
        if (backgroundTime == null) {
            Log.d(FirebaseSessions.TAG, "Session " + sessionData.getSessionDetails().getSessionId() + " has not backgrounded yet");
            return false;
        }
        boolean z = C6583a.m12238c(this.timeProvider.currentTime().m12335minus5sfh64U(backgroundTime), this.sessionsSettings.m12339getSessionRestartTimeoutUwyO8pc()) > 0;
        if (z) {
            Log.d(FirebaseSessions.TAG, "Session " + sessionData.getSessionDetails().getSessionId() + " is expired");
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object notifySubscribers(String str, NotificationType notificationType, InterfaceC6348c interfaceC6348c) throws Throwable {
        C60421 c60421;
        String str2;
        if (interfaceC6348c instanceof C60421) {
            c60421 = (C60421) interfaceC6348c;
            int i2 = c60421.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c60421.label = i2 - Integer.MIN_VALUE;
            } else {
                c60421 = new C60421(interfaceC6348c);
            }
        } else {
            c60421 = new C60421(interfaceC6348c);
        }
        Object registeredSubscribers$com_google_firebase_firebase_sessions = c60421.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c60421.label;
        C6289k c6289k = C6289k.f24318a;
        if (i3 == 0) {
            AbstractC0243G.m377o(registeredSubscribers$com_google_firebase_firebase_sessions);
            this.previousNotificationType = notificationType;
            if (AbstractC6452k.m12177a(this.previousSessionId, str)) {
                return c6289k;
            }
            this.previousSessionId = str;
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            c60421.L$0 = str;
            c60421.L$1 = notificationType;
            c60421.label = 1;
            registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(c60421);
            if (registeredSubscribers$com_google_firebase_firebase_sessions == enumC6363a) {
                return enumC6363a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            notificationType = (NotificationType) c60421.L$1;
            str = (String) c60421.L$0;
            AbstractC0243G.m377o(registeredSubscribers$com_google_firebase_firebase_sessions);
        }
        for (SessionSubscriber sessionSubscriber : ((Map) registeredSubscribers$com_google_firebase_firebase_sessions).values()) {
            sessionSubscriber.onSessionChanged(new SessionSubscriber.SessionDetails(str));
            int i4 = WhenMappings.$EnumSwitchMapping$0[notificationType.ordinal()];
            if (i4 == 1) {
                str2 = "Notified " + sessionSubscriber.getSessionSubscriberName() + " of new session " + str;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "Notified " + sessionSubscriber.getSessionSubscriberName() + " of new fallback session " + str;
            }
            Log.d(FirebaseSessions.TAG, str2);
        }
        return c6289k;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public void appBackground() {
        this.isInForeground = false;
        if (this.localSessionData == null) {
            Log.d(FirebaseSessions.TAG, "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d(FirebaseSessions.TAG, "App backgrounded on " + this.processDataManager.getMyProcessName());
        AbstractC0069y.m111j(AbstractC0069y.m102a(this.backgroundDispatcher), null, new C60401(null), 3);
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public void appForeground() {
        this.isInForeground = true;
        if (this.localSessionData == null) {
            this.pendingForegroundCheck = true;
            Log.d(FirebaseSessions.TAG, "App foregrounded, but local SessionData not initialized");
            return;
        }
        SessionData localSessionData$com_google_firebase_firebase_sessions = getLocalSessionData$com_google_firebase_firebase_sessions();
        Log.d(FirebaseSessions.TAG, "App foregrounded on " + this.processDataManager.getMyProcessName());
        if (isSessionExpired(localSessionData$com_google_firebase_firebase_sessions) || isMyProcessStale(localSessionData$com_google_firebase_firebase_sessions)) {
            AbstractC0069y.m111j(AbstractC0069y.m102a(this.backgroundDispatcher), null, new C60411(localSessionData$com_google_firebase_firebase_sessions, null), 3);
        }
    }

    public final SessionData getLocalSessionData$com_google_firebase_firebase_sessions() {
        SessionData sessionData = this.localSessionData;
        if (sessionData != null) {
            return sessionData;
        }
        AbstractC6452k.m12185i("localSessionData");
        throw null;
    }

    /* JADX INFO: renamed from: getPreviousNotificationType$com_google_firebase_firebase_sessions */
    public final NotificationType m11642xf2d03053() {
        return this.previousNotificationType;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public boolean isInForeground() {
        return this.isInForeground;
    }

    public final void setLocalSessionData$com_google_firebase_firebase_sessions(SessionData sessionData) {
        AbstractC6452k.m12181e(sessionData, "<set-?>");
        this.localSessionData = sessionData;
    }

    /* JADX INFO: renamed from: setPreviousNotificationType$com_google_firebase_firebase_sessions */
    public final void m11643x97c9d05f(NotificationType notificationType) {
        AbstractC6452k.m12181e(notificationType, "<set-?>");
        this.previousNotificationType = notificationType;
    }
}
