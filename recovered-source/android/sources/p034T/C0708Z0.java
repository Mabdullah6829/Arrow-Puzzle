package p034T;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
import p001B.AbstractC0076b;
import p030R.AbstractC0522D;
import p030R.AbstractC0527I;
import p030R.AbstractC0562j;
import p030R.C0556g;
import p030R.C0567l0;
import p030R.C0586v;
import p030R.ExecutorC0517A0;

/* JADX INFO: renamed from: T.Z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0708Z0 extends AbstractC0522D {

    /* JADX INFO: renamed from: b */
    public final String f1654b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0720c1 f1656d;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f1653a = new AtomicReference(C0720c1.f1742j0);

    /* JADX INFO: renamed from: c */
    public final C0699W0 f1655c = new C0699W0(this);

    public C0708Z0(C0720c1 c0720c1, String str) {
        this.f1656d = c0720c1;
        AbstractC0076b.m133h(str, "authority");
        this.f1654b = str;
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: k */
    public final AbstractC0562j mo1245k(C0567l0 c0567l0, C0556g c0556g) {
        C0720c1 c0720c1 = this.f1656d;
        ExecutorC0517A0 executorC0517A0 = c0720c1.f1785m;
        AtomicReference atomicReference = this.f1653a;
        Object obj = atomicReference.get();
        C0673N0 c0673n0 = C0720c1.f1742j0;
        if (obj != c0673n0) {
            return m1582r(c0567l0, c0556g);
        }
        executorC0517A0.execute(new RunnableC0702X0(this, 2));
        if (atomicReference.get() != c0673n0) {
            return m1582r(c0567l0, c0556g);
        }
        if (c0720c1.f1750G.get()) {
            return new C0675O(2);
        }
        C0705Y0 c0705y0 = new C0705Y0(this, C0586v.m1342b(), c0567l0, c0556g);
        executorC0517A0.execute(new RunnableC0666L(this, c0705y0));
        return c0705y0;
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC0562j m1582r(C0567l0 c0567l0, C0556g c0556g) {
        AbstractC0527I abstractC0527I = (AbstractC0527I) this.f1653a.get();
        C0699W0 c0699w0 = this.f1655c;
        if (abstractC0527I == null) {
            return c0699w0.mo1245k(c0567l0, c0556g);
        }
        if (!(abstractC0527I instanceof C0740h1)) {
            return new C0687S0(abstractC0527I, c0699w0, this.f1656d.f1780h, c0567l0, c0556g);
        }
        C0744i1 c0744i1 = ((C0740h1) abstractC0527I).f1884b;
        C0736g1 c0736g1 = (C0736g1) c0744i1.f1892b.get(c0567l0.f1201b);
        if (c0736g1 == null) {
            c0736g1 = (C0736g1) c0744i1.f1893c.get(c0567l0.f1202c);
        }
        if (c0736g1 == null) {
            c0736g1 = c0744i1.f1891a;
        }
        if (c0736g1 != null) {
            c0556g = c0556g.m1291c(C0736g1.f1873g, c0736g1);
        }
        return c0699w0.mo1245k(c0567l0, c0556g);
    }

    /* JADX INFO: renamed from: s */
    public final void m1583s(AbstractC0527I abstractC0527I) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.f1653a;
        AbstractC0527I abstractC0527I2 = (AbstractC0527I) atomicReference.get();
        atomicReference.set(abstractC0527I);
        if (abstractC0527I2 != C0720c1.f1742j0 || (linkedHashSet = this.f1656d.f1745B) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((C0705Y0) it.next()).m1577d();
        }
    }
}
