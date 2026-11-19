package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl$coordinator$2 extends AbstractC6453l implements InterfaceC6487a {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$coordinator$2(DataStoreImpl<T> dataStoreImpl) {
        super(0);
        this.this$0 = dataStoreImpl;
    }

    @Override // p078p0.InterfaceC6487a
    public final InterProcessCoordinator invoke() {
        return this.this$0.getStorageConnection$datastore_core_release().getCoordinator();
    }
}
