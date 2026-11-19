package androidx.datastore.core;

import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public interface DataMigration<T> {
    Object cleanUp(InterfaceC6348c interfaceC6348c);

    Object migrate(T t, InterfaceC6348c interfaceC6348c);

    Object shouldMigrate(T t, InterfaceC6348c interfaceC6348c);
}
