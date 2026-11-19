package androidx.datastore.core;

import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m12159f = "DataMigrationInitializer.kt", m12160l = {45}, m12161m = "invokeSuspend")
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends AbstractC6379i implements InterfaceC6498l {
    final /* synthetic */ DataMigration<T> $migration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration<T> dataMigration, InterfaceC6348c interfaceC6348c) {
        super(1, interfaceC6348c);
        this.$migration = dataMigration;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(InterfaceC6348c interfaceC6348c) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6498l
    public final Object invoke(InterfaceC6348c interfaceC6348c) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC0243G.m377o(obj);
            DataMigration<T> dataMigration = this.$migration;
            this.label = 1;
            if (dataMigration.cleanUp(this) == enumC6363a) {
                return enumC6363a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
        }
        return C6289k.f24318a;
    }
}
