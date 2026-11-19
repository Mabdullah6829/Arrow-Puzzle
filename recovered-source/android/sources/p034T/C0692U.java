package p034T;

import p030R.AbstractC0570n;
import p030R.C0586v;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0692U extends C0707Z {

    /* JADX INFO: renamed from: j */
    public final C0641C1 f1581j;

    /* JADX INFO: renamed from: k */
    public final C0586v f1582k = C0586v.m1342b();

    /* JADX INFO: renamed from: l */
    public final AbstractC0570n[] f1583l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0695V f1584m;

    public C0692U(C0695V c0695v, C0641C1 c0641c1, AbstractC0570n[] abstractC0570nArr) {
        this.f1584m = c0695v;
        this.f1581j = c0641c1;
        this.f1583l = abstractC0570nArr;
    }

    @Override // p034T.C0707Z, p034T.InterfaceC0806z
    /* JADX INFO: renamed from: e */
    public final void mo1543e(C0783s0 c0783s0) {
        if (Boolean.TRUE.equals(this.f1581j.f1406a.f1180f)) {
            c0783s0.f2033b.add("wait_for_ready");
        }
        super.mo1543e(c0783s0);
    }

    @Override // p034T.C0707Z, p034T.InterfaceC0806z
    /* JADX INFO: renamed from: j */
    public final void mo1548j(C0589w0 c0589w0) {
        super.mo1548j(c0589w0);
        synchronized (this.f1584m.f1590b) {
            try {
                C0695V c0695v = this.f1584m;
                if (c0695v.f1595g != null) {
                    boolean zRemove = c0695v.f1597i.remove(this);
                    if (!this.f1584m.m1566g() && zRemove) {
                        C0695V c0695v2 = this.f1584m;
                        c0695v2.f1592d.m1235b(c0695v2.f1594f);
                        C0695V c0695v3 = this.f1584m;
                        if (c0695v3.f1598j != null) {
                            c0695v3.f1592d.m1235b(c0695v3.f1595g);
                            this.f1584m.f1595g = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1584m.f1592d.m1234a();
    }

    @Override // p034T.C0707Z
    /* JADX INFO: renamed from: q */
    public final void mo1561q(C0589w0 c0589w0) {
        for (AbstractC0570n abstractC0570n : this.f1583l) {
            abstractC0570n.mo1333m(c0589w0);
        }
    }
}
