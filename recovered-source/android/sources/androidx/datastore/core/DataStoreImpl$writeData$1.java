package androidx.datastore.core;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl", m12159f = "DataStoreImpl.kt", m12160l = {348}, m12161m = "writeData$datastore_core_release")
public final class DataStoreImpl$writeData$1 extends AbstractC6373c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$1(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.this$0 = dataStoreImpl;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeData$datastore_core_release(null, false, this);
    }
}
