package androidx.datastore.core;

import p062g0.InterfaceC6348c;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.DataMigrationInitializer$Companion", m12159f = "DataMigrationInitializer.kt", m12160l = {42, 57}, m12161m = "runMigrations")
public final class DataMigrationInitializer$Companion$runMigrations$1<T> extends AbstractC6373c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataMigrationInitializer.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.this$0 = companion;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runMigrations(null, null, this);
    }
}
