package p034T;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Executor;
import p001B.AbstractC0076b;
import p006D0.C0177l;
import p030R.AbstractC0520C;
import p030R.AbstractC0522D;
import p030R.AbstractC0527I;
import p030R.AbstractC0560i;
import p030R.AbstractC0562j;
import p030R.C0554f;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;
import p030R.C0586v;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0687S0 extends AbstractC0520C {

    /* JADX INFO: renamed from: a */
    public final AbstractC0527I f1567a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0522D f1568b;

    /* JADX INFO: renamed from: c */
    public final Executor f1569c;

    /* JADX INFO: renamed from: d */
    public final C0567l0 f1570d;

    /* JADX INFO: renamed from: e */
    public final C0586v f1571e;

    /* JADX INFO: renamed from: f */
    public C0556g f1572f;

    /* JADX INFO: renamed from: g */
    public AbstractC0562j f1573g;

    public C0687S0(AbstractC0527I abstractC0527I, C0699W0 c0699w0, Executor executor, C0567l0 c0567l0, C0556g c0556g) {
        this.f1567a = abstractC0527I;
        this.f1568b = c0699w0;
        this.f1570d = c0567l0;
        Executor executor2 = c0556g.f1176b;
        executor = executor2 != null ? executor2 : executor;
        this.f1569c = executor;
        C0554f c0554fM1289b = C0556g.m1289b(c0556g);
        c0554fM1289b.f1166b = executor;
        this.f1572f = new C0556g(c0554fM1289b);
        this.f1571e = C0586v.m1342b();
    }

    @Override // p030R.AbstractC0520C, p030R.AbstractC0562j
    public final void cancel(String str, Throwable th) {
        AbstractC0562j abstractC0562j = this.f1573g;
        if (abstractC0562j != null) {
            abstractC0562j.cancel(str, th);
        }
    }

    @Override // p030R.AbstractC0520C
    public final AbstractC0562j delegate() {
        return this.f1573g;
    }

    @Override // p030R.AbstractC0520C, p030R.AbstractC0562j
    public final void start(AbstractC0560i abstractC0560i, C0559h0 c0559h0) {
        C0556g c0556g = this.f1572f;
        C0567l0 c0567l0 = this.f1570d;
        AbstractC0076b.m133h(c0567l0, FirebaseAnalytics.Param.METHOD);
        AbstractC0076b.m133h(c0559h0, "headers");
        AbstractC0076b.m133h(c0556g, "callOptions");
        C0177l c0177lMo1252a = this.f1567a.mo1252a();
        C0589w0 c0589w0 = (C0589w0) c0177lMo1252a.f333u;
        if (!c0589w0.m1352e()) {
            this.f1569c.execute(new C0678P(this, abstractC0560i, AbstractC0759m0.m1627h(c0589w0)));
            this.f1573g = C0720c1.f1743k0;
            return;
        }
        C0744i1 c0744i1 = (C0744i1) c0177lMo1252a.f332t;
        C0736g1 c0736g1 = (C0736g1) c0744i1.f1892b.get(c0567l0.f1201b);
        if (c0736g1 == null) {
            c0736g1 = (C0736g1) c0744i1.f1893c.get(c0567l0.f1202c);
        }
        if (c0736g1 == null) {
            c0736g1 = c0744i1.f1891a;
        }
        if (c0736g1 != null) {
            this.f1572f = this.f1572f.m1291c(C0736g1.f1873g, c0736g1);
        }
        AbstractC0562j abstractC0562jMo1245k = this.f1568b.mo1245k(c0567l0, this.f1572f);
        this.f1573g = abstractC0562jMo1245k;
        abstractC0562jMo1245k.start(abstractC0560i, c0559h0);
    }
}
