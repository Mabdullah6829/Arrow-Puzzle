package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import kotlin.jvm.internal.AbstractC6452k;
import p062g0.InterfaceC6348c;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {
    private final InterfaceC6498l produceNewData;

    public ReplaceFileCorruptionHandler(InterfaceC6498l produceNewData) {
        AbstractC6452k.m12181e(produceNewData, "produceNewData");
        this.produceNewData = produceNewData;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, InterfaceC6348c interfaceC6348c) {
        return this.produceNewData.invoke(corruptionException);
    }
}
