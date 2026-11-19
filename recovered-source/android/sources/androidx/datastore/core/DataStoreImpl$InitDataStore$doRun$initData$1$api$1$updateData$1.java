package androidx.datastore.core;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", m12159f = "DataStoreImpl.kt", m12160l = {544, 447, 449}, m12161m = "updateData")
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 extends AbstractC6373c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl$InitDataStore$doRun$initData$1$api$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.this$0 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateData(null, this);
    }
}
