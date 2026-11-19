package p000A0;

import p062g0.InterfaceC6348c;

/* JADX INFO: renamed from: A0.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0028b0 extends C0039h {

    /* JADX INFO: renamed from: A */
    public final C0051n f29A;

    public C0028b0(InterfaceC6348c interfaceC6348c, C0051n c0051n) {
        super(1, interfaceC6348c);
        this.f29A = c0051n;
    }

    @Override // p000A0.C0039h
    /* JADX INFO: renamed from: p */
    public final Throwable mo39p(C0034e0 c0034e0) {
        Throwable thM42b;
        C0051n c0051n = this.f29A;
        c0051n.getClass();
        Object obj = C0034e0.f43s.get(c0051n);
        if (!(obj instanceof C0032d0) || (thM42b = ((C0032d0) obj).m42b()) == null) {
            return obj instanceof C0055p ? ((C0055p) obj).f68a : c0034e0.m67u();
        }
        return thM42b;
    }

    @Override // p000A0.C0039h
    /* JADX INFO: renamed from: x */
    public final String mo40x() {
        return "AwaitContinuation";
    }
}
