package p008E0;

import p062g0.InterfaceC6351f;
import p062g0.InterfaceC6352g;
import p062g0.InterfaceC6353h;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: E0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0202e implements InterfaceC6353h {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC6353h f404s;

    /* JADX INFO: renamed from: t */
    public final Throwable f405t;

    public C0202e(InterfaceC6353h interfaceC6353h, Throwable th) {
        this.f404s = interfaceC6353h;
        this.f405t = th;
    }

    @Override // p062g0.InterfaceC6353h
    public final Object fold(Object obj, InterfaceC6502p interfaceC6502p) {
        return this.f404s.fold(obj, interfaceC6502p);
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6351f get(InterfaceC6352g interfaceC6352g) {
        return this.f404s.get(interfaceC6352g);
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6353h minusKey(InterfaceC6352g interfaceC6352g) {
        return this.f404s.minusKey(interfaceC6352g);
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6353h plus(InterfaceC6353h interfaceC6353h) {
        return this.f404s.plus(interfaceC6353h);
    }
}
