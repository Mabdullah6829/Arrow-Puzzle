package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p018K0.InterfaceC0325a;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0455a;
import p025O0.AbstractC0486k;
import p025O0.AbstractC0491p;
import p025O0.C0476a;
import p025O0.C0478c;
import p025O0.C0481f;
import p025O0.C0484i;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionConfigs {
    public static final Companion Companion = new Companion(null);
    private final Integer cacheDurationSeconds;
    private final Long cacheUpdatedTimeSeconds;
    private final Double sessionSamplingRate;
    private final Integer sessionTimeoutSeconds;
    private final Boolean sessionsEnabled;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0325a serializer() {
            return SessionConfigs$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }
    }

    public /* synthetic */ SessionConfigs(int i2, Boolean bool, Double d, Integer num, Integer num2, Long l2, AbstractC0491p abstractC0491p) {
        if (31 != (i2 & 31)) {
            AbstractC0486k.m1177d(i2, 31, SessionConfigs$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l2;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d, Integer num, Integer num2, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = sessionConfigs.sessionsEnabled;
        }
        if ((i2 & 2) != 0) {
            d = sessionConfigs.sessionSamplingRate;
        }
        if ((i2 & 4) != 0) {
            num = sessionConfigs.sessionTimeoutSeconds;
        }
        if ((i2 & 8) != 0) {
            num2 = sessionConfigs.cacheDurationSeconds;
        }
        if ((i2 & 16) != 0) {
            l2 = sessionConfigs.cacheUpdatedTimeSeconds;
        }
        Long l3 = l2;
        Integer num3 = num;
        return sessionConfigs.copy(bool, d, num3, num2, l3);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(SessionConfigs sessionConfigs, InterfaceC0455a interfaceC0455a, InterfaceC0339d interfaceC0339d) {
        interfaceC0455a.mo949h(interfaceC0339d, 0, C0476a.f1001a, sessionConfigs.sessionsEnabled);
        interfaceC0455a.mo949h(interfaceC0339d, 1, C0478c.f1003a, sessionConfigs.sessionSamplingRate);
        C0481f c0481f = C0481f.f1010a;
        interfaceC0455a.mo949h(interfaceC0339d, 2, c0481f, sessionConfigs.sessionTimeoutSeconds);
        interfaceC0455a.mo949h(interfaceC0339d, 3, c0481f, sessionConfigs.cacheDurationSeconds);
        interfaceC0455a.mo949h(interfaceC0339d, 4, C0484i.f1016a, sessionConfigs.cacheUpdatedTimeSeconds);
    }

    public final Boolean component1() {
        return this.sessionsEnabled;
    }

    public final Double component2() {
        return this.sessionSamplingRate;
    }

    public final Integer component3() {
        return this.sessionTimeoutSeconds;
    }

    public final Integer component4() {
        return this.cacheDurationSeconds;
    }

    public final Long component5() {
        return this.cacheUpdatedTimeSeconds;
    }

    public final SessionConfigs copy(Boolean bool, Double d, Integer num, Integer num2, Long l2) {
        return new SessionConfigs(bool, d, num, num2, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        return AbstractC6452k.m12177a(this.sessionsEnabled, sessionConfigs.sessionsEnabled) && AbstractC6452k.m12177a(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && AbstractC6452k.m12177a(this.sessionTimeoutSeconds, sessionConfigs.sessionTimeoutSeconds) && AbstractC6452k.m12177a(this.cacheDurationSeconds, sessionConfigs.cacheDurationSeconds) && AbstractC6452k.m12177a(this.cacheUpdatedTimeSeconds, sessionConfigs.cacheUpdatedTimeSeconds);
    }

    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    public int hashCode() {
        Boolean bool = this.sessionsEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.sessionTimeoutSeconds;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDurationSeconds;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.cacheUpdatedTimeSeconds;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.sessionsEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionTimeoutSeconds=" + this.sessionTimeoutSeconds + ", cacheDurationSeconds=" + this.cacheDurationSeconds + ", cacheUpdatedTimeSeconds=" + this.cacheUpdatedTimeSeconds + ')';
    }

    public SessionConfigs(Boolean bool, Double d, Integer num, Integer num2, Long l2) {
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l2;
    }
}
