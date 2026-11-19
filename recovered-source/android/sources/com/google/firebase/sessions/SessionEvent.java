package com.google.firebase.sessions;

import com.google.firebase.encoders.annotations.Encodable;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
@Encodable
public final class SessionEvent {
    private final ApplicationInfo applicationInfo;
    private final EventType eventType;
    private final SessionInfo sessionData;

    public SessionEvent(EventType eventType, SessionInfo sessionData, ApplicationInfo applicationInfo) {
        AbstractC6452k.m12181e(eventType, "eventType");
        AbstractC6452k.m12181e(sessionData, "sessionData");
        AbstractC6452k.m12181e(applicationInfo, "applicationInfo");
        this.eventType = eventType;
        this.sessionData = sessionData;
        this.applicationInfo = applicationInfo;
    }

    public static /* synthetic */ SessionEvent copy$default(SessionEvent sessionEvent, EventType eventType, SessionInfo sessionInfo, ApplicationInfo applicationInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eventType = sessionEvent.eventType;
        }
        if ((i2 & 2) != 0) {
            sessionInfo = sessionEvent.sessionData;
        }
        if ((i2 & 4) != 0) {
            applicationInfo = sessionEvent.applicationInfo;
        }
        return sessionEvent.copy(eventType, sessionInfo, applicationInfo);
    }

    public final EventType component1() {
        return this.eventType;
    }

    public final SessionInfo component2() {
        return this.sessionData;
    }

    public final ApplicationInfo component3() {
        return this.applicationInfo;
    }

    public final SessionEvent copy(EventType eventType, SessionInfo sessionData, ApplicationInfo applicationInfo) {
        AbstractC6452k.m12181e(eventType, "eventType");
        AbstractC6452k.m12181e(sessionData, "sessionData");
        AbstractC6452k.m12181e(applicationInfo, "applicationInfo");
        return new SessionEvent(eventType, sessionData, applicationInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionEvent)) {
            return false;
        }
        SessionEvent sessionEvent = (SessionEvent) obj;
        return this.eventType == sessionEvent.eventType && AbstractC6452k.m12177a(this.sessionData, sessionEvent.sessionData) && AbstractC6452k.m12177a(this.applicationInfo, sessionEvent.applicationInfo);
    }

    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    public final SessionInfo getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        return this.applicationInfo.hashCode() + ((this.sessionData.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.eventType + ", sessionData=" + this.sessionData + ", applicationInfo=" + this.applicationInfo + ')';
    }
}
