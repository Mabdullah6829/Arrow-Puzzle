package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6453l;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl$writeActor$1 extends AbstractC6453l implements InterfaceC6498l {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeActor$1(DataStoreImpl<T> dataStoreImpl) {
        super(1);
        this.this$0 = dataStoreImpl;
    }

    @Override // p078p0.InterfaceC6498l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C6289k.f24318a;
    }

    public final void invoke(Throwable th) {
        if (th != null) {
            ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new Final(th));
        }
        if (((DataStoreImpl) this.this$0).storageConnectionDelegate.isInitialized()) {
            this.this$0.getStorageConnection$datastore_core_release().close();
        }
    }
}
