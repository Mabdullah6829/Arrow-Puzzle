package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
public final class NoOpCorruptionHandler<T> implements CorruptionHandler<T> {
    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, InterfaceC6348c interfaceC6348c) throws CorruptionException {
        throw corruptionException;
    }
}
