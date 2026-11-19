package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public interface Serializer<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, InterfaceC6348c interfaceC6348c);

    Object writeTo(T t, OutputStream outputStream, InterfaceC6348c interfaceC6348c);
}
