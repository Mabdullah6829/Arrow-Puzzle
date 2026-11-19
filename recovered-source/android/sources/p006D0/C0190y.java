package p006D0;

import p004C0.EnumC0136a;
import p008E0.InterfaceC0203f;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;

/* JADX INFO: renamed from: D0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0190y implements InterfaceC0191z, InterfaceC0170e, InterfaceC0203f {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC0189x f377s;

    public C0190y(InterfaceC0189x interfaceC0189x) {
        this.f377s = interfaceC0189x;
    }

    @Override // p008E0.InterfaceC0203f
    /* JADX INFO: renamed from: b */
    public final InterfaceC0170e mo258b(InterfaceC6353h interfaceC6353h, int i2, EnumC0136a enumC0136a) {
        return AbstractC0163C.m264f(this, interfaceC6353h, i2, enumC0136a);
    }

    @Override // p006D0.InterfaceC0170e
    public final Object collect(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) throws Throwable {
        ((C0162B) this.f377s).collect(interfaceC0171f, interfaceC6348c);
        return EnumC6363a.f24419s;
    }
}
