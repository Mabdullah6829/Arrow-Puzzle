package p000A0;

import p010F0.AbstractC0215a;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: A0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0036f0 extends C0002C {

    /* JADX INFO: renamed from: v */
    public final InterfaceC6348c f45v;

    public C0036f0(InterfaceC6353h interfaceC6353h, InterfaceC6502p interfaceC6502p) {
        super(interfaceC6353h, false);
        this.f45v = AbstractC0878a.m1798g(this, this, interfaceC6502p);
    }

    @Override // p000A0.C0034e0
    /* JADX INFO: renamed from: J */
    public final void mo53J() {
        try {
            AbstractC0215a.m302h(AbstractC0878a.m1802m(this.f45v), C6289k.f24318a);
        } catch (Throwable th) {
            resumeWith(AbstractC0243G.m372j(th));
            throw th;
        }
    }
}
