package com.google.firebase.sessions.settings;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.LocalOverrideSettingsProvider;
import com.google.firebase.sessions.RemoteSettingsProvider;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.AbstractC0355G;
import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;
import p092z0.C6583a;
import p092z0.EnumC6585c;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionsSettings {
    public static final Companion Companion = new Companion(null);
    private final SettingsProvider localOverrideSettings;
    private final SettingsProvider remoteSettings;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final SessionsSettings getInstance() {
            return ((FirebaseSessionsComponent) FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessionsComponent.class)).getSessionsSettings();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.sessions.settings.SessionsSettings", m12159f = "SessionsSettings.kt", m12160l = {98, 99}, m12161m = "updateSettings")
    public static final class C60521 extends AbstractC6373c {
        int label;
        /* synthetic */ Object result;

        public C60521(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionsSettings.this.updateSettings(this);
        }
    }

    public SessionsSettings(@LocalOverrideSettingsProvider SettingsProvider localOverrideSettings, @RemoteSettingsProvider SettingsProvider remoteSettings) {
        AbstractC6452k.m12181e(localOverrideSettings, "localOverrideSettings");
        AbstractC6452k.m12181e(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private final boolean isValidSamplingRate(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    /* JADX INFO: renamed from: isValidSessionRestartTimeout-LRDsOJo, reason: not valid java name */
    private final boolean m12338isValidSessionRestartTimeoutLRDsOJo(long j2) {
        int i2 = C6583a.f24808v;
        return j2 > 0 && !C6583a.m12239e(j2);
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double dDoubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m12339getSessionRestartTimeoutUwyO8pc() {
        C6583a c6583aMo12337getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo12337getSessionRestartTimeoutFghU774();
        if (c6583aMo12337getSessionRestartTimeoutFghU774 != null) {
            long j2 = c6583aMo12337getSessionRestartTimeoutFghU774.f24809s;
            if (m12338isValidSessionRestartTimeoutLRDsOJo(j2)) {
                return j2;
            }
        }
        C6583a c6583aMo12337getSessionRestartTimeoutFghU775 = this.remoteSettings.mo12337getSessionRestartTimeoutFghU774();
        if (c6583aMo12337getSessionRestartTimeoutFghU775 != null) {
            long j3 = c6583aMo12337getSessionRestartTimeoutFghU775.f24809s;
            if (m12338isValidSessionRestartTimeoutLRDsOJo(j3)) {
                return j3;
            }
        }
        int i2 = C6583a.f24808v;
        return AbstractC0355G.m560n(30, EnumC6585c.MINUTES);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r6.updateSettings(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateSettings(p062g0.InterfaceC6348c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings.C60521
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings.C60521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h0.a r1 = p064h0.EnumC6363a.f24419s
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p011H.AbstractC0243G.m377o(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            p011H.AbstractC0243G.m377o(r6)
            goto L44
        L36:
            p011H.AbstractC0243G.m377o(r6)
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.localOverrideSettings
            r0.label = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.remoteSettings
            r0.label = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            d0.k r6 = p057d0.C6289k.f24318a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.updateSettings(g0.c):java.lang.Object");
    }
}
