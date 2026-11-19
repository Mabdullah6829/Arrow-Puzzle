package p044a0;

import java.util.List;
import p001B.AbstractC0076b;
import p030R.AbstractC0522D;
import p030R.AbstractC0536S;
import p030R.AbstractC0538U;
import p030R.AbstractC0558h;
import p030R.C0533O;
import p030R.C0594z;
import p030R.EnumC0578r;
import p034T.C0808z1;

/* JADX INFO: renamed from: a0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0882d extends AbstractC0879a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2461d = 0;

    /* JADX INFO: renamed from: e */
    public Object f2462e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0538U f2463f;

    public C0882d(C0883e c0883e) {
        this.f2463f = c0883e;
    }

    @Override // p044a0.AbstractC0879a, p030R.AbstractC0558h
    /* JADX INFO: renamed from: a */
    public AbstractC0522D mo1295a(C0533O c0533o) {
        switch (this.f2461d) {
            case 1:
                C0898t c0898t = (C0898t) this.f2463f;
                C0890l c0890l = c0898t.f2524f;
                C0897s c0897s = new C0897s(c0898t, c0533o, (C0886h) this.f2462e);
                List list = c0533o.f1132b;
                if (C0898t.m1818g(list)) {
                    if (c0890l.f2496H.containsKey(((C0594z) list.get(0)).f1305a.get(0))) {
                        C0889k c0889k = (C0889k) c0890l.f2496H.get(((C0594z) list.get(0)).f1305a.get(0));
                        c0889k.m1811a(c0897s);
                        if (c0889k.f2493d != null) {
                            c0897s.m1817s();
                        }
                    }
                }
                return c0897s;
            default:
                return super.mo1295a(c0533o);
        }
    }

    @Override // p044a0.AbstractC0879a, p030R.AbstractC0558h
    /* JADX INFO: renamed from: k */
    public final void mo1304k(EnumC0578r enumC0578r, AbstractC0536S abstractC0536S) {
        switch (this.f2461d) {
            case 0:
                AbstractC0538U abstractC0538U = (AbstractC0538U) this.f2462e;
                C0883e c0883e = (C0883e) this.f2463f;
                AbstractC0538U abstractC0538U2 = c0883e.f2470k;
                EnumC0578r enumC0578r2 = EnumC0578r.f1233t;
                if (abstractC0538U == abstractC0538U2) {
                    AbstractC0076b.m139n(c0883e.f2473n, "there's pending lb while current lb has been out of READY");
                    c0883e.f2471l = enumC0578r;
                    c0883e.f2472m = abstractC0536S;
                    if (enumC0578r == enumC0578r2) {
                        c0883e.m1809h();
                    }
                } else if (abstractC0538U == c0883e.f2468i) {
                    boolean z = enumC0578r == enumC0578r2;
                    c0883e.f2473n = z;
                    if (z || abstractC0538U2 == c0883e.f2465f) {
                        c0883e.f2466g.mo1304k(enumC0578r, abstractC0536S);
                    } else {
                        c0883e.m1809h();
                    }
                }
                break;
            default:
                ((C0886h) this.f2462e).mo1304k(enumC0578r, new C0808z1(abstractC0536S));
                break;
        }
    }

    @Override // p044a0.AbstractC0879a
    /* JADX INFO: renamed from: l */
    public final AbstractC0558h mo1806l() {
        switch (this.f2461d) {
            case 0:
                return ((C0883e) this.f2463f).f2466g;
            default:
                return (C0886h) this.f2462e;
        }
    }

    public C0882d(C0898t c0898t, AbstractC0558h abstractC0558h) {
        this.f2463f = c0898t;
        this.f2462e = new C0886h(abstractC0558h, 0);
    }
}
