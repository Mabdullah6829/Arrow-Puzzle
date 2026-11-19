package p000A0;

import p010F0.C0221g;

/* JADX INFO: renamed from: A0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0030c0 extends AbstractC0026a0 {

    /* JADX INFO: renamed from: w */
    public final C0034e0 f32w;

    /* JADX INFO: renamed from: x */
    public final C0032d0 f33x;

    /* JADX INFO: renamed from: y */
    public final C0047l f34y;

    /* JADX INFO: renamed from: z */
    public final Object f35z;

    public C0030c0(C0034e0 c0034e0, C0032d0 c0032d0, C0047l c0047l, Object obj) {
        this.f32w = c0034e0;
        this.f33x = c0032d0;
        this.f34y = c0047l;
        this.f35z = obj;
    }

    @Override // p000A0.AbstractC0026a0
    /* JADX INFO: renamed from: j */
    public final boolean mo26j() {
        return false;
    }

    @Override // p000A0.AbstractC0026a0
    /* JADX INFO: renamed from: k */
    public final void mo27k(Throwable th) {
        C0047l c0047l = this.f34y;
        C0047l c0047lM45G = C0034e0.m45G(c0047l);
        C0034e0 c0034e0 = this.f32w;
        C0032d0 c0032d0 = this.f33x;
        Object obj = this.f35z;
        if (c0047lM45G == null || !c0034e0.m58P(c0032d0, c0047lM45G, obj)) {
            c0032d0.f40s.m313a(new C0221g(2), 2);
            C0047l c0047lM45G2 = C0034e0.m45G(c0047l);
            if (c0047lM45G2 == null || !c0034e0.m58P(c0032d0, c0047lM45G2, obj)) {
                c0034e0.mo2k(c0034e0.m66t(c0032d0, obj));
            }
        }
    }
}
