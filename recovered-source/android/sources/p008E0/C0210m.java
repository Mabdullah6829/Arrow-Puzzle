package p008E0;

import p004C0.InterfaceC0152q;
import p004C0.InterfaceC0154s;
import p006D0.InterfaceC0171f;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;

/* JADX INFO: renamed from: E0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0210m implements InterfaceC0171f {

    /* JADX INFO: renamed from: s */
    public final InterfaceC0154s f416s;

    public C0210m(InterfaceC0152q interfaceC0152q) {
        this.f416s = interfaceC0152q;
    }

    @Override // p006D0.InterfaceC0171f
    public final Object emit(Object obj, InterfaceC6348c interfaceC6348c) {
        Object objMo228i = this.f416s.mo228i(interfaceC6348c, obj);
        return objMo228i == EnumC6363a.f24419s ? objMo228i : C6289k.f24318a;
    }
}
