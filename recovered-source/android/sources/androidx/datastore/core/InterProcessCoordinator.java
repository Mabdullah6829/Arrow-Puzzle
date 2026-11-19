package androidx.datastore.core;

import p006D0.InterfaceC0170e;
import p062g0.InterfaceC6348c;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public interface InterProcessCoordinator {
    InterfaceC0170e getUpdateNotifications();

    Object getVersion(InterfaceC6348c interfaceC6348c);

    Object incrementAndGetVersion(InterfaceC6348c interfaceC6348c);

    <T> Object lock(InterfaceC6498l interfaceC6498l, InterfaceC6348c interfaceC6348c);

    <T> Object tryLock(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c);
}
