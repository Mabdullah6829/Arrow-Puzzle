package androidx.datastore.core;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.MultiProcessCoordinator$Companion", m12159f = "MultiProcessCoordinator.android.kt", m12160l = {182}, m12161m = "getExclusiveFileLockWithRetryIfDeadlock")
public final class C1325xe413854a extends AbstractC6373c {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MultiProcessCoordinator.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325xe413854a(MultiProcessCoordinator.Companion companion, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.this$0 = companion;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getExclusiveFileLockWithRetryIfDeadlock(null, this);
    }
}
