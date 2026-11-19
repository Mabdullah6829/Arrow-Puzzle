package androidx.datastore.core;

import p062g0.InterfaceC6348c;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;

/* JADX INFO: loaded from: classes.dex */
public interface StorageConnection<T> extends Closeable {
    InterProcessCoordinator getCoordinator();

    <R> Object readScope(InterfaceC6503q interfaceC6503q, InterfaceC6348c interfaceC6348c);

    Object writeScope(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c);
}
