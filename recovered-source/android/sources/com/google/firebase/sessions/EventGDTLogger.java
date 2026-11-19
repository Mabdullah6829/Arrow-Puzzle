package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.inject.Provider;
import com.google.gson.internal.C6086a;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p063h.C6355a;
import p063h.C6357c;
import p063h.EnumC6358d;
import p063h.InterfaceC6359e;
import p063h.InterfaceC6361g;
import p069k.C6438s;
import p091y0.AbstractC6571a;

/* JADX INFO: loaded from: classes2.dex */
public final class EventGDTLogger implements EventGDTLoggerInterface {
    private static final String AQS_LOG_SOURCE = "FIREBASE_APPQUALITY_SESSION";
    public static final Companion Companion = new Companion(null);
    private final Provider<InterfaceC6361g> transportFactoryProvider;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    public EventGDTLogger(Provider<InterfaceC6361g> transportFactoryProvider) {
        AbstractC6452k.m12181e(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] encode(SessionEvent sessionEvent) {
        String strEncode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(sessionEvent);
        AbstractC6452k.m12180d(strEncode, "encode(...)");
        Log.d(FirebaseSessions.TAG, "Session Event Type: " + sessionEvent.getEventType().name());
        byte[] bytes = strEncode.getBytes(AbstractC6571a.f24799a);
        AbstractC6452k.m12180d(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void log(SessionEvent sessionEvent) {
        AbstractC6452k.m12181e(sessionEvent, "sessionEvent");
        ((C6438s) this.transportFactoryProvider.get()).m12170a(AQS_LOG_SOURCE, new C6357c("json"), new InterfaceC6359e() { // from class: com.google.firebase.sessions.a
            @Override // p063h.InterfaceC6359e
            public final Object apply(Object obj) {
                return this.f24039s.encode((SessionEvent) obj);
            }
        }).m12171a(new C6355a(sessionEvent, EnumC6358d.f24415s, null), new C6086a(9));
    }
}
