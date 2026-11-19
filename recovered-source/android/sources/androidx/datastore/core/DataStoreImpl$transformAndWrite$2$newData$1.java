package androidx.datastore.core;

import p000A0.InterfaceC0066v;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", m12159f = "DataStoreImpl.kt", m12160l = {331}, m12161m = "invokeSuspend")
public final class DataStoreImpl$transformAndWrite$2$newData$1 extends AbstractC6379i implements InterfaceC6502p {
    final /* synthetic */ Data<T> $curData;
    final /* synthetic */ InterfaceC6502p $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$transformAndWrite$2$newData$1(InterfaceC6502p interfaceC6502p, Data<T> data, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.$transform = interfaceC6502p;
        this.$curData = data;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        return new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, this.$curData, interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
        return ((DataStoreImpl$transformAndWrite$2$newData$1) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            return obj;
        }
        AbstractC0243G.m377o(obj);
        InterfaceC6502p interfaceC6502p = this.$transform;
        Object value = this.$curData.getValue();
        this.label = 1;
        Object objInvoke = interfaceC6502p.invoke(value, this);
        return objInvoke == enumC6363a ? enumC6363a : objInvoke;
    }
}
