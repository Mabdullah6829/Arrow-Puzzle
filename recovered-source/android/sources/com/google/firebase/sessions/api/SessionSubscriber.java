package com.google.firebase.sessions.api;

import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p011H.AbstractC0271e0;
import p068j0.InterfaceC6418a;

/* JADX INFO: loaded from: classes2.dex */
public interface SessionSubscriber {

    public enum Name {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI;

        private static final /* synthetic */ InterfaceC6418a $ENTRIES = AbstractC0243G.m373k(values());

        public static InterfaceC6418a getEntries() {
            return $ENTRIES;
        }
    }

    public static final class SessionDetails {
        private final String sessionId;

        public SessionDetails(String sessionId) {
            AbstractC6452k.m12181e(sessionId, "sessionId");
            this.sessionId = sessionId;
        }

        public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = sessionDetails.sessionId;
            }
            return sessionDetails.copy(str);
        }

        public final String component1() {
            return this.sessionId;
        }

        public final SessionDetails copy(String sessionId) {
            AbstractC6452k.m12181e(sessionId, "sessionId");
            return new SessionDetails(sessionId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionDetails) && AbstractC6452k.m12177a(this.sessionId, ((SessionDetails) obj).sessionId);
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        public String toString() {
            return AbstractC0271e0.m401i(new StringBuilder("SessionDetails(sessionId="), this.sessionId, ')');
        }
    }

    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(SessionDetails sessionDetails);
}
