package com.google.firebase.sessions;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC6452k;
import p091y0.AbstractC6582l;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionGenerator {
    private final TimeProvider timeProvider;
    private final UuidGenerator uuidGenerator;

    public SessionGenerator(TimeProvider timeProvider, UuidGenerator uuidGenerator) {
        AbstractC6452k.m12181e(timeProvider, "timeProvider");
        AbstractC6452k.m12181e(uuidGenerator, "uuidGenerator");
        this.timeProvider = timeProvider;
        this.uuidGenerator = uuidGenerator;
    }

    private final String generateSessionId() {
        String string = this.uuidGenerator.next().toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        String lowerCase = AbstractC6582l.m12235t(string, "-", "").toLowerCase(Locale.ROOT);
        AbstractC6452k.m12180d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final SessionDetails generateNewSession(SessionDetails sessionDetails) {
        String firstSessionId;
        String strGenerateSessionId = generateSessionId();
        if (sessionDetails == null || (firstSessionId = sessionDetails.getFirstSessionId()) == null) {
            firstSessionId = strGenerateSessionId;
        }
        return new SessionDetails(strGenerateSessionId, firstSessionId, sessionDetails != null ? sessionDetails.getSessionIndex() + 1 : 0, this.timeProvider.currentTime().getUs());
    }
}
