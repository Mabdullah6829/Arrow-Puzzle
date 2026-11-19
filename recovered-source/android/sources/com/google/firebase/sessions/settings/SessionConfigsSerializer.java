package com.google.firebase.sessions.settings;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC6452k;
import p027P0.C0495b;
import p037U0.AbstractC0846b;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p091y0.AbstractC6571a;
import p091y0.AbstractC6582l;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionConfigsSerializer implements Serializer<SessionConfigs> {
    public static final SessionConfigsSerializer INSTANCE = new SessionConfigsSerializer();
    private static final SessionConfigs defaultValue = new SessionConfigs(null, null, null, null, null);

    private SessionConfigsSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, InterfaceC6348c interfaceC6348c) throws CorruptionException {
        try {
            C0495b c0495b = C0495b.f1044d;
            String strM12232q = AbstractC6582l.m12232q(AbstractC0846b.m1754m(inputStream));
            c0495b.getClass();
            return (SessionConfigs) c0495b.m1182a(SessionConfigs.Companion.serializer(), strM12232q);
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session configs", e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public SessionConfigs getDefaultValue() {
        return defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    public Object writeTo(SessionConfigs sessionConfigs, OutputStream outputStream, InterfaceC6348c interfaceC6348c) throws IOException {
        byte[] bytes = C0495b.f1044d.m1183b(SessionConfigs.Companion.serializer(), sessionConfigs).getBytes(AbstractC6571a.f24799a);
        AbstractC6452k.m12180d(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return C6289k.f24318a;
    }
}
