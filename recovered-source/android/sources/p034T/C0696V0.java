package p034T;

import p001B.AbstractC0076b;
import p030R.AbstractC0522D;
import p030R.AbstractC0558h;
import p030R.C0573o0;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0696V0 extends AbstractC0558h {

    /* JADX INFO: renamed from: d */
    public final C0693U0 f1601d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0522D f1602e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0720c1 f1603f;

    public C0696V0(C0720c1 c0720c1, C0693U0 c0693u0, C0729e2 c0729e2) {
        this.f1603f = c0720c1;
        this.f1601d = c0693u0;
        AbstractC0076b.m133h(c0729e2, "resolver");
        this.f1602e = c0729e2;
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: h */
    public final void mo1301h(C0589w0 c0589w0) {
        AbstractC0076b.m131f(!c0589w0.m1352e(), "the error status must not be OK");
        this.f1603f.f1785m.execute(new RunnableC0666L(16, this, c0589w0));
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: i */
    public final void mo1302i(C0573o0 c0573o0) {
        this.f1603f.f1785m.execute(new RunnableC0666L(17, this, c0573o0));
    }
}
