package androidx.datastore.core;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$InitDataStore", m12159f = "DataStoreImpl.kt", m12160l = {430, 434}, m12161m = "doRun")
public final class DataStoreImpl$InitDataStore$doRun$1 extends AbstractC6373c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$1(DataStoreImpl<T>.InitDataStore initDataStore, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.this$0 = initDataStore;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doRun(this);
    }
}
