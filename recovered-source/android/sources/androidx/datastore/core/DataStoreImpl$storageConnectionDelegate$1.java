package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl$storageConnectionDelegate$1 extends AbstractC6453l implements InterfaceC6487a {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$storageConnectionDelegate$1(DataStoreImpl<T> dataStoreImpl) {
        super(0);
        this.this$0 = dataStoreImpl;
    }

    @Override // p078p0.InterfaceC6487a
    public final StorageConnection<T> invoke() {
        return ((DataStoreImpl) this.this$0).storage.createConnection();
    }
}
