package androidx.datastore.core.okio;

import p033S0.InterfaceC0614h;
import p033S0.InterfaceC0615i;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public interface OkioSerializer<T> {
    T getDefaultValue();

    Object readFrom(InterfaceC0615i interfaceC0615i, InterfaceC6348c interfaceC6348c);

    Object writeTo(T t, InterfaceC0614h interfaceC0614h, InterfaceC6348c interfaceC6348c);
}
