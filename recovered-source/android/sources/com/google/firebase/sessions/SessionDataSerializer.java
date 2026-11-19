package com.google.firebase.sessions;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p027P0.C0495b;
import p037U0.AbstractC0846b;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p091y0.AbstractC6571a;
import p091y0.AbstractC6582l;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionDataSerializer implements Serializer<SessionData> {
    private final SessionGenerator sessionGenerator;

    public SessionDataSerializer(SessionGenerator sessionGenerator) {
        AbstractC6452k.m12181e(sessionGenerator, "sessionGenerator");
        this.sessionGenerator = sessionGenerator;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, InterfaceC6348c interfaceC6348c) throws CorruptionException {
        try {
            C0495b c0495b = C0495b.f1044d;
            String strM12232q = AbstractC6582l.m12232q(AbstractC0846b.m1754m(inputStream));
            c0495b.getClass();
            return (SessionData) c0495b.m1182a(SessionData.Companion.serializer(), strM12232q);
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session data", e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public SessionData getDefaultValue() {
        return new SessionData(this.sessionGenerator.generateNewSession(null), (Time) null, (Map) null, 6, (AbstractC6447f) null);
    }

    @Override // androidx.datastore.core.Serializer
    public Object writeTo(SessionData sessionData, OutputStream outputStream, InterfaceC6348c interfaceC6348c) throws IOException {
        byte[] bytes = C0495b.f1044d.m1183b(SessionData.Companion.serializer(), sessionData).getBytes(AbstractC6571a.f24799a);
        AbstractC6452k.m12180d(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return C6289k.f24318a;
    }
}
