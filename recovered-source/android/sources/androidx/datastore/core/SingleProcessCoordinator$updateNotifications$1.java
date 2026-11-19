package androidx.datastore.core;

import p006D0.InterfaceC0171f;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", m12159f = "SingleProcessCoordinator.kt", m12160l = {}, m12161m = "invokeSuspend")
public final class SingleProcessCoordinator$updateNotifications$1 extends AbstractC6379i implements InterfaceC6502p {
    int label;

    public SingleProcessCoordinator$updateNotifications$1(InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        return new SingleProcessCoordinator$updateNotifications$1(interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) {
        return ((SingleProcessCoordinator$updateNotifications$1) create(interfaceC0171f, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0243G.m377o(obj);
        return C6289k.f24318a;
    }
}
