package p036U;

import p033S0.C0613g;
import p034T.AbstractRunnableC0663K;
import p049b0.AbstractC1886b;
import p049b0.C1885a;

/* JADX INFO: renamed from: U.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0820a extends AbstractRunnableC0663K {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f2152u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0822c f2153v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0820a(C0822c c0822c, int i2) {
        super(c0822c, 1);
        this.f2152u = i2;
        switch (i2) {
            case 1:
                this.f2153v = c0822c;
                super(c0822c, 1);
                AbstractC1886b.m2714b();
                break;
            default:
                this.f2153v = c0822c;
                AbstractC1886b.m2714b();
                break;
        }
    }

    @Override // p034T.AbstractRunnableC0663K
    /* JADX INFO: renamed from: a */
    public final void mo1519a() {
        C0822c c0822c;
        int i2;
        C0822c c0822c2;
        switch (this.f2152u) {
            case 0:
                C0613g c0613g = new C0613g();
                AbstractC1886b.m2715c();
                try {
                    C1885a c1885a = AbstractC1886b.f2862a;
                    c1885a.getClass();
                    synchronized (this.f2153v.f2161s) {
                        C0613g c0613g2 = this.f2153v.f2162t;
                        c0613g.mo1356s(c0613g2, c0613g2.m1390c());
                        c0822c = this.f2153v;
                        c0822c.f2166x = false;
                        i2 = c0822c.f2160E;
                        break;
                    }
                    c0822c.f2156A.mo1356s(c0613g, c0613g.f1342t);
                    synchronized (this.f2153v.f2161s) {
                        this.f2153v.f2160E -= i2;
                        break;
                    }
                    c1885a.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        AbstractC1886b.f2862a.getClass();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                C0613g c0613g3 = new C0613g();
                AbstractC1886b.m2715c();
                try {
                    C1885a c1885a2 = AbstractC1886b.f2862a;
                    c1885a2.getClass();
                    synchronized (this.f2153v.f2161s) {
                        C0613g c0613g4 = this.f2153v.f2162t;
                        c0613g3.mo1356s(c0613g4, c0613g4.f1342t);
                        c0822c2 = this.f2153v;
                        c0822c2.f2167y = false;
                        break;
                    }
                    c0822c2.f2156A.mo1356s(c0613g3, c0613g3.f1342t);
                    this.f2153v.f2156A.flush();
                    c1885a2.getClass();
                    return;
                } catch (Throwable th3) {
                    try {
                        AbstractC1886b.f2862a.getClass();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
