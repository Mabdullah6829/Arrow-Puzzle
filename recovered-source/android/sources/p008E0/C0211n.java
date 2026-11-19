package p008E0;

import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p066i0.InterfaceC6374d;

/* JADX INFO: renamed from: E0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0211n implements InterfaceC6348c, InterfaceC6374d {

    /* JADX INFO: renamed from: s */
    public final InterfaceC6348c f417s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC6353h f418t;

    public C0211n(InterfaceC6348c interfaceC6348c, InterfaceC6353h interfaceC6353h) {
        this.f417s = interfaceC6348c;
        this.f418t = interfaceC6353h;
    }

    @Override // p066i0.InterfaceC6374d
    public final InterfaceC6374d getCallerFrame() {
        InterfaceC6348c interfaceC6348c = this.f417s;
        if (interfaceC6348c instanceof InterfaceC6374d) {
            return (InterfaceC6374d) interfaceC6348c;
        }
        return null;
    }

    @Override // p062g0.InterfaceC6348c
    public final InterfaceC6353h getContext() {
        return this.f418t;
    }

    @Override // p062g0.InterfaceC6348c
    public final void resumeWith(Object obj) {
        this.f417s.resumeWith(obj);
    }
}
