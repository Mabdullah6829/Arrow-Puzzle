package androidx.datastore;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p033S0.C0627u;
import p049b0.C1887c;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreSingletonDelegate$getValue$1$1 extends AbstractC6453l implements InterfaceC6487a {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ DataStoreSingletonDelegate<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSingletonDelegate$getValue$1$1(Context context, DataStoreSingletonDelegate<T> dataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = dataStoreSingletonDelegate;
    }

    @Override // p078p0.InterfaceC6487a
    public final C0627u invoke() {
        String str = C0627u.f1371t;
        Context applicationContext = this.$applicationContext;
        AbstractC6452k.m12180d(applicationContext, "applicationContext");
        String absolutePath = DataStoreFile.dataStoreFile(applicationContext, ((DataStoreSingletonDelegate) this.this$0).fileName).getAbsolutePath();
        AbstractC6452k.m12180d(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
        return C1887c.m2718e(absolutePath, false);
    }
}
