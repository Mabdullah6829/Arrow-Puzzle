package p044a0;

import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.AbstractC0536S;
import p030R.AbstractC0538U;
import p030R.AbstractC0539V;
import p030R.C0535Q;
import p030R.C0589w0;
import p030R.EnumC0578r;
import p034T.C0746j;

/* JADX INFO: renamed from: a0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0883e extends AbstractC0538U {

    /* JADX INFO: renamed from: o */
    public static final C0746j f2464o = new C0746j(1);

    /* JADX INFO: renamed from: f */
    public final C0881c f2465f;

    /* JADX INFO: renamed from: g */
    public final AbstractC0879a f2466g;

    /* JADX INFO: renamed from: h */
    public AbstractC0539V f2467h;

    /* JADX INFO: renamed from: i */
    public AbstractC0538U f2468i;

    /* JADX INFO: renamed from: j */
    public AbstractC0539V f2469j;

    /* JADX INFO: renamed from: k */
    public AbstractC0538U f2470k;

    /* JADX INFO: renamed from: l */
    public EnumC0578r f2471l;

    /* JADX INFO: renamed from: m */
    public AbstractC0536S f2472m;

    /* JADX INFO: renamed from: n */
    public boolean f2473n;

    public C0883e(AbstractC0879a abstractC0879a) {
        C0881c c0881c = new C0881c(this);
        this.f2465f = c0881c;
        this.f2468i = c0881c;
        this.f2470k = c0881c;
        this.f2466g = abstractC0879a;
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: b */
    public final boolean mo1265b() {
        return m1808g().mo1265b();
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: c */
    public final void mo1266c(C0589w0 c0589w0) {
        m1808g().mo1266c(c0589w0);
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: d */
    public final void mo1267d(C0535Q c0535q) {
        m1808g().mo1267d(c0535q);
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: e */
    public final void mo1268e() {
        m1808g().mo1268e();
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: f */
    public final void mo1269f() {
        this.f2470k.mo1269f();
        this.f2468i.mo1269f();
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0538U m1808g() {
        AbstractC0538U abstractC0538U = this.f2470k;
        return abstractC0538U == this.f2465f ? this.f2468i : abstractC0538U;
    }

    /* JADX INFO: renamed from: h */
    public final void m1809h() {
        this.f2466g.mo1304k(this.f2471l, this.f2472m);
        this.f2468i.mo1269f();
        this.f2468i = this.f2470k;
        this.f2467h = this.f2469j;
        this.f2470k = this.f2465f;
        this.f2469j = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m1810i(AbstractC0539V abstractC0539V) {
        AbstractC0076b.m133h(abstractC0539V, "newBalancerFactory");
        if (abstractC0539V.equals(this.f2469j)) {
            return;
        }
        this.f2470k.mo1269f();
        this.f2470k = this.f2465f;
        this.f2469j = null;
        this.f2471l = EnumC0578r.f1232s;
        this.f2472m = f2464o;
        if (abstractC0539V.equals(this.f2467h)) {
            return;
        }
        C0882d c0882d = new C0882d(this);
        AbstractC0538U abstractC0538UMo1271b = abstractC0539V.mo1271b(c0882d);
        c0882d.f2462e = abstractC0538UMo1271b;
        this.f2470k = abstractC0538UMo1271b;
        this.f2469j = abstractC0539V;
        if (this.f2473n) {
            return;
        }
        m1809h();
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(m1808g(), "delegate");
        return c0087mM143s.toString();
    }
}
