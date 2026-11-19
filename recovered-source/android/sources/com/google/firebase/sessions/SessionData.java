package com.google.firebase.sessions;

import com.google.firebase.crashlytics.internal.concurrency.C5656c;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p018K0.InterfaceC0325a;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0455a;
import p025O0.AbstractC0486k;
import p025O0.AbstractC0491p;
import p025O0.C0483h;
import p025O0.C0492q;
import p029Q0.C0512l;
import p057d0.EnumC6282d;
import p057d0.InterfaceC6281c;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionData {
    private static final InterfaceC6281c[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final Time backgroundTime;
    private final Map<String, ProcessData> processDataMap;
    private final SessionDetails sessionDetails;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0325a serializer() {
            return SessionData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }
    }

    static {
        EnumC6282d[] enumC6282dArr = EnumC6282d.f24307s;
        $childSerializers = new InterfaceC6281c[]{null, null, AbstractC0242F.m356m(new C5656c(3))};
    }

    public /* synthetic */ SessionData(int i2, SessionDetails sessionDetails, Time time, Map map, AbstractC0491p abstractC0491p) {
        if (1 != (i2 & 1)) {
            AbstractC0486k.m1177d(i2, 1, SessionData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.sessionDetails = sessionDetails;
        if ((i2 & 2) == 0) {
            this.backgroundTime = null;
        } else {
            this.backgroundTime = time;
        }
        if ((i2 & 4) == 0) {
            this.processDataMap = null;
        } else {
            this.processDataMap = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0325a _childSerializers$_anonymous_() {
        C0492q c0492q = C0492q.f1040a;
        return new C0483h(ProcessData$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionData copy$default(SessionData sessionData, SessionDetails sessionDetails, Time time, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sessionDetails = sessionData.sessionDetails;
        }
        if ((i2 & 2) != 0) {
            time = sessionData.backgroundTime;
        }
        if ((i2 & 4) != 0) {
            map = sessionData.processDataMap;
        }
        return sessionData.copy(sessionDetails, time, map);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(SessionData sessionData, InterfaceC0455a interfaceC0455a, InterfaceC0339d interfaceC0339d) {
        InterfaceC6281c[] interfaceC6281cArr = $childSerializers;
        C0512l c0512l = (C0512l) interfaceC0455a;
        c0512l.m1212n(interfaceC0339d, 0, SessionDetails$$serializer.INSTANCE, sessionData.sessionDetails);
        if (c0512l.mo947b(interfaceC0339d) || sessionData.backgroundTime != null) {
            c0512l.mo949h(interfaceC0339d, 1, Time$$serializer.INSTANCE, sessionData.backgroundTime);
        }
        if (!c0512l.mo947b(interfaceC0339d) && sessionData.processDataMap == null) {
            return;
        }
        c0512l.mo949h(interfaceC0339d, 2, (InterfaceC0325a) interfaceC6281cArr[2].getValue(), sessionData.processDataMap);
    }

    public final SessionDetails component1() {
        return this.sessionDetails;
    }

    public final Time component2() {
        return this.backgroundTime;
    }

    public final Map<String, ProcessData> component3() {
        return this.processDataMap;
    }

    public final SessionData copy(SessionDetails sessionDetails, Time time, Map<String, ProcessData> map) {
        AbstractC6452k.m12181e(sessionDetails, "sessionDetails");
        return new SessionData(sessionDetails, time, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) obj;
        return AbstractC6452k.m12177a(this.sessionDetails, sessionData.sessionDetails) && AbstractC6452k.m12177a(this.backgroundTime, sessionData.backgroundTime) && AbstractC6452k.m12177a(this.processDataMap, sessionData.processDataMap);
    }

    public final Time getBackgroundTime() {
        return this.backgroundTime;
    }

    public final Map<String, ProcessData> getProcessDataMap() {
        return this.processDataMap;
    }

    public final SessionDetails getSessionDetails() {
        return this.sessionDetails;
    }

    public int hashCode() {
        int iHashCode = this.sessionDetails.hashCode() * 31;
        Time time = this.backgroundTime;
        int iHashCode2 = (iHashCode + (time == null ? 0 : time.hashCode())) * 31;
        Map<String, ProcessData> map = this.processDataMap;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "SessionData(sessionDetails=" + this.sessionDetails + ", backgroundTime=" + this.backgroundTime + ", processDataMap=" + this.processDataMap + ')';
    }

    public SessionData(SessionDetails sessionDetails, Time time, Map<String, ProcessData> map) {
        AbstractC6452k.m12181e(sessionDetails, "sessionDetails");
        this.sessionDetails = sessionDetails;
        this.backgroundTime = time;
        this.processDataMap = map;
    }

    public /* synthetic */ SessionData(SessionDetails sessionDetails, Time time, Map map, int i2, AbstractC6447f abstractC6447f) {
        this(sessionDetails, (i2 & 2) != 0 ? null : time, (i2 & 4) != 0 ? null : map);
    }
}
