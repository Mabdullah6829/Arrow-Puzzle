package p010F0;

import p000A0.AbstractC0025a;
import p000A0.AbstractC0069y;
import p043a.AbstractC0878a;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p066i0.InterfaceC6374d;

/* JADX INFO: renamed from: F0.q */
/* JADX INFO: loaded from: classes.dex */
public class C0231q extends AbstractC0025a implements InterfaceC6374d {

    /* JADX INFO: renamed from: v */
    public final InterfaceC6348c f464v;

    public C0231q(InterfaceC6348c interfaceC6348c, InterfaceC6353h interfaceC6353h) {
        super(interfaceC6353h, true);
        this.f464v = interfaceC6348c;
    }

    @Override // p000A0.C0034e0
    /* JADX INFO: renamed from: D */
    public final boolean mo49D() {
        return true;
    }

    @Override // p066i0.InterfaceC6374d
    public final InterfaceC6374d getCallerFrame() {
        InterfaceC6348c interfaceC6348c = this.f464v;
        if (interfaceC6348c instanceof InterfaceC6374d) {
            return (InterfaceC6374d) interfaceC6348c;
        }
        return null;
    }

    @Override // p000A0.C0034e0
    /* JADX INFO: renamed from: k */
    public void mo2k(Object obj) {
        AbstractC0215a.m302h(AbstractC0878a.m1802m(this.f464v), AbstractC0069y.m113l(obj));
    }

    @Override // p000A0.C0034e0
    /* JADX INFO: renamed from: l */
    public void mo3l(Object obj) {
        this.f464v.resumeWith(AbstractC0069y.m113l(obj));
    }
}
