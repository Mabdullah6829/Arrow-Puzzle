package com.google.firebase.crashlytics.internal.metadata;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p058e0.C6314v;

/* JADX INFO: loaded from: classes2.dex */
public final class EventMetadata {
    private final Map<String, String> additionalCustomKeys;
    private final String sessionId;
    private final long timestamp;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventMetadata(String sessionId, long j2) {
        this(sessionId, j2, null, 4, null);
        AbstractC6452k.m12181e(sessionId, "sessionId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventMetadata copy$default(EventMetadata eventMetadata, String str, long j2, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eventMetadata.sessionId;
        }
        if ((i2 & 2) != 0) {
            j2 = eventMetadata.timestamp;
        }
        if ((i2 & 4) != 0) {
            map = eventMetadata.additionalCustomKeys;
        }
        return eventMetadata.copy(str, j2, map);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final Map<String, String> component3() {
        return this.additionalCustomKeys;
    }

    public final EventMetadata copy(String sessionId, long j2, Map<String, String> additionalCustomKeys) {
        AbstractC6452k.m12181e(sessionId, "sessionId");
        AbstractC6452k.m12181e(additionalCustomKeys, "additionalCustomKeys");
        return new EventMetadata(sessionId, j2, additionalCustomKeys);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) obj;
        return AbstractC6452k.m12177a(this.sessionId, eventMetadata.sessionId) && this.timestamp == eventMetadata.timestamp && AbstractC6452k.m12177a(this.additionalCustomKeys, eventMetadata.additionalCustomKeys);
    }

    public final Map<String, String> getAdditionalCustomKeys() {
        return this.additionalCustomKeys;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.additionalCustomKeys.hashCode() + ((Long.hashCode(this.timestamp) + (this.sessionId.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.sessionId + ", timestamp=" + this.timestamp + ", additionalCustomKeys=" + this.additionalCustomKeys + ')';
    }

    public EventMetadata(String sessionId, long j2, Map<String, String> additionalCustomKeys) {
        AbstractC6452k.m12181e(sessionId, "sessionId");
        AbstractC6452k.m12181e(additionalCustomKeys, "additionalCustomKeys");
        this.sessionId = sessionId;
        this.timestamp = j2;
        this.additionalCustomKeys = additionalCustomKeys;
    }

    public /* synthetic */ EventMetadata(String str, long j2, Map map, int i2, AbstractC6447f abstractC6447f) {
        this(str, j2, (i2 & 4) != 0 ? C6314v.f24339s : map);
    }
}
