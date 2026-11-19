package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p000A0.InterfaceC0066v;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseSessions {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "FirebaseSessions";
    private final FirebaseApp firebaseApp;
    private final SessionsSettings settings;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.FirebaseSessions$1", m12159f = "FirebaseSessions.kt", m12160l = {51, 55}, m12161m = "invokeSuspend")
    public static final class C60301 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ SessionsActivityLifecycleCallbacks $sessionsActivityLifecycleCallbacks;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60301(SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$sessionsActivityLifecycleCallbacks = sessionsActivityLifecycleCallbacks;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks, String str, FirebaseOptions firebaseOptions) {
            Log.w(FirebaseSessions.TAG, "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            sessionsActivityLifecycleCallbacks.onAppDelete();
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return FirebaseSessions.this.new C60301(this.$sessionsActivityLifecycleCallbacks, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C60301) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        
            if (r6.updateSettings(r5) == r0) goto L25;
         */
        @Override // p066i0.AbstractC6371a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                h0.a r0 = p064h0.EnumC6363a.f24419s
                int r1 = r5.label
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                p011H.AbstractC0243G.m377o(r6)
                goto L60
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                p011H.AbstractC0243G.m377o(r6)
                goto L2c
            L1e:
                p011H.AbstractC0243G.m377o(r6)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r6 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r5.label = r4
                java.lang.Object r6 = r6.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r5)
                if (r6 != r0) goto L2c
                goto L5f
            L2c:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                if (r6 == 0) goto L3b
                boolean r1 = r6.isEmpty()
                if (r1 == 0) goto L3b
                goto L89
            L3b:
                java.util.Iterator r6 = r6.iterator()
            L3f:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L89
                java.lang.Object r1 = r6.next()
                com.google.firebase.sessions.api.SessionSubscriber r1 = (com.google.firebase.sessions.api.SessionSubscriber) r1
                boolean r1 = r1.isDataCollectionEnabled()
                if (r1 == 0) goto L3f
                com.google.firebase.sessions.FirebaseSessions r6 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.settings.SessionsSettings r6 = com.google.firebase.sessions.FirebaseSessions.access$getSettings$p(r6)
                r5.label = r3
                java.lang.Object r6 = r6.updateSettings(r5)
                if (r6 != r0) goto L60
            L5f:
                return r0
            L60:
                com.google.firebase.sessions.FirebaseSessions r6 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.settings.SessionsSettings r6 = com.google.firebase.sessions.FirebaseSessions.access$getSettings$p(r6)
                boolean r6 = r6.getSessionsEnabled()
                if (r6 != 0) goto L78
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r6 = android.util.Log.d(r2, r6)
                java.lang.Integer r0 = new java.lang.Integer
                r0.<init>(r6)
                goto L94
            L78:
                com.google.firebase.sessions.FirebaseSessions r6 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.FirebaseApp r6 = com.google.firebase.sessions.FirebaseSessions.access$getFirebaseApp$p(r6)
                com.google.firebase.sessions.SessionsActivityLifecycleCallbacks r0 = r5.$sessionsActivityLifecycleCallbacks
                com.google.firebase.sessions.b r1 = new com.google.firebase.sessions.b
                r1.<init>()
                r6.addLifecycleEventListener(r1)
                goto L94
            L89:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                int r6 = android.util.Log.d(r2, r6)
                java.lang.Integer r0 = new java.lang.Integer
                r0.<init>(r6)
            L94:
                d0.k r6 = p057d0.C6289k.f24318a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.C60301.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final FirebaseSessions getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessions.class);
            AbstractC6452k.m12180d(obj, "get(...)");
            return (FirebaseSessions) obj;
        }

        private Companion() {
        }
    }

    public FirebaseSessions(FirebaseApp firebaseApp, SessionsSettings settings, @Background InterfaceC6353h backgroundDispatcher, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        AbstractC6452k.m12181e(firebaseApp, "firebaseApp");
        AbstractC6452k.m12181e(settings, "settings");
        AbstractC6452k.m12181e(backgroundDispatcher, "backgroundDispatcher");
        AbstractC6452k.m12181e(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.firebaseApp = firebaseApp;
        this.settings = settings;
        Log.d(TAG, "Initializing Firebase Sessions 3.0.6.");
        Context applicationContext = firebaseApp.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            AbstractC0069y.m111j(AbstractC0069y.m102a(backgroundDispatcher), null, new C60301(sessionsActivityLifecycleCallbacks, null), 3);
        } else {
            Log.e(TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
