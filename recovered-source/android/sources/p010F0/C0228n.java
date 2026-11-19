package p010F0;

import p000A0.AbstractC0000A;
import p000A0.AbstractC0063t;
import p000A0.C0039h;
import p000A0.InterfaceC0003D;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: F0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0228n extends AbstractC0063t implements InterfaceC0003D {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC0003D f460s;

    /* JADX INFO: renamed from: t */
    public final AbstractC0063t f461t;

    /* JADX INFO: renamed from: u */
    public final String f462u;

    /* JADX WARN: Multi-variable type inference failed */
    public C0228n(AbstractC0063t abstractC0063t, String str) {
        InterfaceC0003D interfaceC0003D = abstractC0063t instanceof InterfaceC0003D ? (InterfaceC0003D) abstractC0063t : null;
        this.f460s = interfaceC0003D == null ? AbstractC0000A.f0a : interfaceC0003D;
        this.f461t = abstractC0063t;
        this.f462u = str;
    }

    @Override // p000A0.AbstractC0063t
    public final void dispatch(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        this.f461t.dispatch(interfaceC6353h, runnable);
    }

    @Override // p000A0.AbstractC0063t
    public final void dispatchYield(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        this.f461t.dispatchYield(interfaceC6353h, runnable);
    }

    @Override // p000A0.InterfaceC0003D
    /* JADX INFO: renamed from: i */
    public final void mo1i(long j2, C0039h c0039h) {
        this.f460s.mo1i(j2, c0039h);
    }

    @Override // p000A0.AbstractC0063t
    public final boolean isDispatchNeeded(InterfaceC6353h interfaceC6353h) {
        return this.f461t.isDispatchNeeded(interfaceC6353h);
    }

    @Override // p000A0.AbstractC0063t
    public final String toString() {
        return this.f462u;
    }
}
