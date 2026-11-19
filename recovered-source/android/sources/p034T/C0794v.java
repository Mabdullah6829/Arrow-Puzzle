package p034T;

import p001B.C0086l;
import p030R.AbstractC0560i;
import p030R.C0559h0;
import p030R.C0589w0;
import p049b0.AbstractC1886b;
import p049b0.C1885a;

/* JADX INFO: renamed from: T.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0794v extends AbstractRunnableC0663K {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0589w0 f2062u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0559h0 f2063v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0086l f2064w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794v(C0086l c0086l, C0589w0 c0589w0, C0559h0 c0559h0) {
        super(((C0803y) c0086l.f114v).f2099e, 0);
        this.f2064w = c0086l;
        this.f2062u = c0589w0;
        this.f2063v = c0559h0;
    }

    @Override // p034T.AbstractRunnableC0663K
    /* JADX INFO: renamed from: b */
    public final void mo1520b() {
        AbstractC1886b.m2715c();
        try {
            AbstractC1886b.m2713a();
            C1885a c1885a = AbstractC1886b.f2862a;
            c1885a.getClass();
            m1667c();
            c1885a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1886b.f2862a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1667c() {
        C0589w0 c0589w0 = this.f2062u;
        C0559h0 c0559h0 = this.f2063v;
        C0589w0 c0589w1 = (C0589w0) this.f2064w.f113u;
        if (c0589w1 != null) {
            c0559h0 = new C0559h0();
            c0589w0 = c0589w1;
        }
        ((C0803y) this.f2064w.f114v).f2104j = true;
        try {
            ((AbstractC0560i) this.f2064w.f112t).onClose(c0589w0, c0559h0);
            ((C0803y) this.f2064w.f114v).m1674b();
            C0742i c0742i = ((C0803y) this.f2064w.f114v).f2098d;
            if (c0589w0.m1352e()) {
                ((InterfaceC0670M0) c0742i.f1888u).mo1516a();
            } else {
                ((InterfaceC0670M0) c0742i.f1889v).mo1516a();
            }
        } catch (Throwable th) {
            ((C0803y) this.f2064w.f114v).m1674b();
            C0742i c0742i2 = ((C0803y) this.f2064w.f114v).f2098d;
            if (c0589w0.m1352e()) {
                ((InterfaceC0670M0) c0742i2.f1888u).mo1516a();
            } else {
                ((InterfaceC0670M0) c0742i2.f1889v).mo1516a();
            }
            throw th;
        }
    }
}
