package p034T;

import p001B.AbstractC0076b;
import p001B.C0092r;
import p030R.AbstractC0548c;
import p030R.AbstractC0570n;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;
import p030R.C0586v;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0772p1 extends AbstractC0548c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0639C f1999a;

    /* JADX INFO: renamed from: b */
    public final C0567l0 f2000b;

    /* JADX INFO: renamed from: c */
    public final C0559h0 f2001c;

    /* JADX INFO: renamed from: d */
    public final C0556g f2002d;

    /* JADX INFO: renamed from: f */
    public final C0092r f2004f;

    /* JADX INFO: renamed from: g */
    public final AbstractC0570n[] f2005g;

    /* JADX INFO: renamed from: i */
    public InterfaceC0806z f2007i;

    /* JADX INFO: renamed from: j */
    public boolean f2008j;

    /* JADX INFO: renamed from: k */
    public C0707Z f2009k;

    /* JADX INFO: renamed from: h */
    public final Object f2006h = new Object();

    /* JADX INFO: renamed from: e */
    public final C0586v f2003e = C0586v.m1342b();

    public C0772p1(InterfaceC0639C interfaceC0639C, C0567l0 c0567l0, C0559h0 c0559h0, C0556g c0556g, C0092r c0092r, AbstractC0570n[] abstractC0570nArr) {
        this.f1999a = interfaceC0639C;
        this.f2000b = c0567l0;
        this.f2001c = c0559h0;
        this.f2002d = c0556g;
        this.f2004f = c0092r;
        this.f2005g = abstractC0570nArr;
    }

    @Override // p030R.AbstractC0548c
    /* JADX INFO: renamed from: a */
    public final void mo1283a(C0559h0 c0559h0) {
        AbstractC0076b.m139n(!this.f2008j, "apply() or fail() already called");
        C0559h0 c0559h1 = this.f2001c;
        c0559h1.m1308d(c0559h0);
        C0586v c0586v = this.f2003e;
        C0586v c0586vM1343a = c0586v.m1343a();
        try {
            InterfaceC0806z interfaceC0806zMo1483c = this.f1999a.mo1483c(this.f2000b, c0559h1, this.f2002d, this.f2005g);
            c0586v.m1344c(c0586vM1343a);
            m1651c(interfaceC0806zMo1483c);
        } catch (Throwable th) {
            c0586v.m1344c(c0586vM1343a);
            throw th;
        }
    }

    @Override // p030R.AbstractC0548c
    /* JADX INFO: renamed from: b */
    public final void mo1284b(C0589w0 c0589w0) {
        AbstractC0076b.m131f(!c0589w0.m1352e(), "Cannot fail with OK status");
        AbstractC0076b.m139n(!this.f2008j, "apply() or fail() already called");
        m1651c(new C0731f0(AbstractC0759m0.m1627h(c0589w0), EnumC0633A.f1391s, this.f2005g));
    }

    /* JADX INFO: renamed from: c */
    public final void m1651c(InterfaceC0806z interfaceC0806z) {
        boolean z;
        AbstractC0076b.m139n(!this.f2008j, "already finalized");
        this.f2008j = true;
        synchronized (this.f2006h) {
            try {
                if (this.f2007i == null) {
                    this.f2007i = interfaceC0806z;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            C0770p c0770p = (C0770p) this.f2004f.f130t;
            if (c0770p.f1988b.decrementAndGet() == 0) {
                C0770p.m1648g(c0770p);
                return;
            }
            return;
        }
        AbstractC0076b.m139n(this.f2009k != null, "delayedStream is null");
        RunnableC0701X runnableC0701XM1581r = this.f2009k.m1581r(interfaceC0806z);
        if (runnableC0701XM1581r != null) {
            runnableC0701XM1581r.run();
        }
        C0770p c0770p2 = (C0770p) this.f2004f.f130t;
        if (c0770p2.f1988b.decrementAndGet() == 0) {
            C0770p.m1648g(c0770p2);
        }
    }
}
