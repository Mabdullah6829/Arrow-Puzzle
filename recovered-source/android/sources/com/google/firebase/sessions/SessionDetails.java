package com.google.firebase.sessions;

import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p018K0.InterfaceC0325a;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0455a;
import p025O0.AbstractC0486k;
import p025O0.AbstractC0491p;
import p029Q0.C0512l;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionDetails {
    public static final Companion Companion = new Companion(null);
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;
    private final long sessionStartTimestampUs;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0325a serializer() {
            return SessionDetails$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }
    }

    public /* synthetic */ SessionDetails(int i2, String str, String str2, int i3, long j2, AbstractC0491p abstractC0491p) {
        if (15 != (i2 & 15)) {
            AbstractC0486k.m1177d(i2, 15, SessionDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i3;
        this.sessionStartTimestampUs = j2;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, String str2, int i2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sessionDetails.sessionId;
        }
        if ((i3 & 2) != 0) {
            str2 = sessionDetails.firstSessionId;
        }
        if ((i3 & 4) != 0) {
            i2 = sessionDetails.sessionIndex;
        }
        if ((i3 & 8) != 0) {
            j2 = sessionDetails.sessionStartTimestampUs;
        }
        int i4 = i2;
        return sessionDetails.copy(str, str2, i4, j2);
    }

    public static final void write$Self$com_google_firebase_firebase_sessions(SessionDetails sessionDetails, InterfaceC0455a interfaceC0455a, InterfaceC0339d interfaceC0339d) {
        C0512l c0512l = (C0512l) interfaceC0455a;
        c0512l.m1213o(interfaceC0339d, 0, sessionDetails.sessionId);
        c0512l.m1213o(interfaceC0339d, 1, sessionDetails.firstSessionId);
        int i2 = sessionDetails.sessionIndex;
        c0512l.m1210l(interfaceC0339d, 2);
        c0512l.mo963i(i2);
        c0512l.m1211m(interfaceC0339d, 3, sessionDetails.sessionStartTimestampUs);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.firstSessionId;
    }

    public final int component3() {
        return this.sessionIndex;
    }

    public final long component4() {
        return this.sessionStartTimestampUs;
    }

    public final SessionDetails copy(String sessionId, String firstSessionId, int i2, long j2) {
        AbstractC6452k.m12181e(sessionId, "sessionId");
        AbstractC6452k.m12181e(firstSessionId, "firstSessionId");
        return new SessionDetails(sessionId, firstSessionId, i2, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) obj;
        return AbstractC6452k.m12177a(this.sessionId, sessionDetails.sessionId) && AbstractC6452k.m12177a(this.firstSessionId, sessionDetails.firstSessionId) && this.sessionIndex == sessionDetails.sessionIndex && this.sessionStartTimestampUs == sessionDetails.sessionStartTimestampUs;
    }

    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public int hashCode() {
        return Long.hashCode(this.sessionStartTimestampUs) + ((Integer.hashCode(this.sessionIndex) + ((this.firstSessionId.hashCode() + (this.sessionId.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", sessionStartTimestampUs=" + this.sessionStartTimestampUs + ')';
    }

    public SessionDetails(String sessionId, String firstSessionId, int i2, long j2) {
        AbstractC6452k.m12181e(sessionId, "sessionId");
        AbstractC6452k.m12181e(firstSessionId, "firstSessionId");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i2;
        this.sessionStartTimestampUs = j2;
    }
}
