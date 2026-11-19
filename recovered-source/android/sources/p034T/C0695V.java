package p034T;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p001B.C0092r;
import p030R.AbstractC0536S;
import p030R.AbstractC0570n;
import p030R.C0529K;
import p030R.C0534P;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;
import p030R.C0586v;
import p030R.C0589w0;
import p030R.ExecutorC0517A0;

/* JADX INFO: renamed from: T.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0695V implements InterfaceC0752k1 {

    /* JADX INFO: renamed from: c */
    public final Executor f1591c;

    /* JADX INFO: renamed from: d */
    public final ExecutorC0517A0 f1592d;

    /* JADX INFO: renamed from: e */
    public RunnableC0689T f1593e;

    /* JADX INFO: renamed from: f */
    public RunnableC0689T f1594f;

    /* JADX INFO: renamed from: g */
    public RunnableC0689T f1595g;

    /* JADX INFO: renamed from: h */
    public C0092r f1596h;

    /* JADX INFO: renamed from: j */
    public C0589w0 f1598j;

    /* JADX INFO: renamed from: k */
    public AbstractC0536S f1599k;

    /* JADX INFO: renamed from: l */
    public long f1600l;

    /* JADX INFO: renamed from: a */
    public final C0529K f1589a = C0529K.m1254a(C0695V.class, null);

    /* JADX INFO: renamed from: b */
    public final Object f1590b = new Object();

    /* JADX INFO: renamed from: i */
    public Collection f1597i = new LinkedHashSet();

    public C0695V(Executor executor, ExecutorC0517A0 executorC0517A0) {
        this.f1591c = executor;
        this.f1592d = executorC0517A0;
    }

    @Override // p034T.InterfaceC0752k1
    /* JADX INFO: renamed from: a */
    public final Runnable mo1562a(InterfaceC0748j1 interfaceC0748j1) {
        C0092r c0092r = (C0092r) interfaceC0748j1;
        this.f1596h = c0092r;
        this.f1593e = new RunnableC0689T(c0092r, 0);
        this.f1594f = new RunnableC0689T(c0092r, 1);
        this.f1595g = new RunnableC0689T(c0092r, 2);
        return null;
    }

    @Override // p034T.InterfaceC0752k1
    /* JADX INFO: renamed from: b */
    public final void mo1563b(C0589w0 c0589w0) {
        RunnableC0689T runnableC0689T;
        synchronized (this.f1590b) {
            try {
                if (this.f1598j != null) {
                    return;
                }
                this.f1598j = c0589w0;
                this.f1592d.m1235b(new RunnableC0666L(5, this, c0589w0));
                if (!m1566g() && (runnableC0689T = this.f1595g) != null) {
                    this.f1592d.m1235b(runnableC0689T);
                    this.f1595g = null;
                }
                this.f1592d.m1234a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p034T.InterfaceC0639C
    /* JADX INFO: renamed from: c */
    public final InterfaceC0806z mo1483c(C0567l0 c0567l0, C0559h0 c0559h0, C0556g c0556g, AbstractC0570n[] abstractC0570nArr) {
        InterfaceC0806z c0731f0;
        try {
            C0641C1 c0641c1 = new C0641C1(c0567l0, c0559h0, c0556g);
            AbstractC0536S abstractC0536S = null;
            long j2 = -1;
            while (true) {
                synchronized (this.f1590b) {
                    C0589w0 c0589w0 = this.f1598j;
                    if (c0589w0 == null) {
                        AbstractC0536S abstractC0536S2 = this.f1599k;
                        if (abstractC0536S2 != null) {
                            if (abstractC0536S != null && j2 == this.f1600l) {
                                c0731f0 = m1565f(c0641c1, abstractC0570nArr);
                                break;
                            }
                            j2 = this.f1600l;
                            InterfaceC0639C interfaceC0639CM1625f = AbstractC0759m0.m1625f(abstractC0536S2.mo1262a(c0641c1), Boolean.TRUE.equals(c0556g.f1180f));
                            if (interfaceC0639CM1625f != null) {
                                c0731f0 = interfaceC0639CM1625f.mo1483c(c0641c1.f1408c, c0641c1.f1407b, c0641c1.f1406a, abstractC0570nArr);
                                break;
                            }
                            abstractC0536S = abstractC0536S2;
                        } else {
                            c0731f0 = m1565f(c0641c1, abstractC0570nArr);
                            break;
                        }
                    } else {
                        c0731f0 = new C0731f0(c0589w0, EnumC0633A.f1391s, abstractC0570nArr);
                        break;
                    }
                }
            }
            this.f1592d.m1234a();
            return c0731f0;
        } catch (Throwable th) {
            this.f1592d.m1234a();
            throw th;
        }
    }

    @Override // p030R.InterfaceC0528J
    /* JADX INFO: renamed from: d */
    public final C0529K mo1253d() {
        return this.f1589a;
    }

    @Override // p034T.InterfaceC0752k1
    /* JADX INFO: renamed from: e */
    public final void mo1564e(C0589w0 c0589w0) {
        Collection<C0692U> collection;
        RunnableC0689T runnableC0689T;
        mo1563b(c0589w0);
        synchronized (this.f1590b) {
            try {
                collection = this.f1597i;
                runnableC0689T = this.f1595g;
                this.f1595g = null;
                if (!collection.isEmpty()) {
                    this.f1597i = Collections.EMPTY_LIST;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnableC0689T != null) {
            for (C0692U c0692u : collection) {
                RunnableC0701X runnableC0701XM1581r = c0692u.m1581r(new C0731f0(c0589w0, EnumC0633A.f1392t, c0692u.f1583l));
                if (runnableC0701XM1581r != null) {
                    runnableC0701XM1581r.run();
                }
            }
            this.f1592d.execute(runnableC0689T);
        }
    }

    /* JADX INFO: renamed from: f */
    public final C0692U m1565f(C0641C1 c0641c1, AbstractC0570n[] abstractC0570nArr) {
        int size;
        C0692U c0692u = new C0692U(this, c0641c1, abstractC0570nArr);
        this.f1597i.add(c0692u);
        synchronized (this.f1590b) {
            size = this.f1597i.size();
        }
        if (size == 1) {
            this.f1592d.m1235b(this.f1593e);
        }
        for (AbstractC0570n abstractC0570n : abstractC0570nArr) {
            abstractC0570n.mo1321a();
        }
        return c0692u;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1566g() {
        boolean z;
        synchronized (this.f1590b) {
            z = !this.f1597i.isEmpty();
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public final void m1567h(AbstractC0536S abstractC0536S) {
        RunnableC0689T runnableC0689T;
        synchronized (this.f1590b) {
            this.f1599k = abstractC0536S;
            this.f1600l++;
            if (abstractC0536S != null && m1566g()) {
                ArrayList arrayList = new ArrayList(this.f1597i);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    C0692U c0692u = (C0692U) obj;
                    C0534P c0534pMo1262a = abstractC0536S.mo1262a(c0692u.f1581j);
                    C0556g c0556g = c0692u.f1581j.f1406a;
                    InterfaceC0639C interfaceC0639CM1625f = AbstractC0759m0.m1625f(c0534pMo1262a, Boolean.TRUE.equals(c0556g.f1180f));
                    if (interfaceC0639CM1625f != null) {
                        Executor executor = this.f1591c;
                        Executor executor2 = c0556g.f1176b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        C0586v c0586v = c0692u.f1582k;
                        C0586v c0586vM1343a = c0586v.m1343a();
                        try {
                            C0641C1 c0641c1 = c0692u.f1581j;
                            InterfaceC0806z interfaceC0806zMo1483c = interfaceC0639CM1625f.mo1483c(c0641c1.f1408c, c0641c1.f1407b, c0641c1.f1406a, c0692u.f1583l);
                            c0586v.m1344c(c0586vM1343a);
                            RunnableC0701X runnableC0701XM1581r = c0692u.m1581r(interfaceC0806zMo1483c);
                            if (runnableC0701XM1581r != null) {
                                executor.execute(runnableC0701XM1581r);
                            }
                            arrayList2.add(c0692u);
                        } catch (Throwable th) {
                            c0586v.m1344c(c0586vM1343a);
                            throw th;
                        }
                    }
                }
                synchronized (this.f1590b) {
                    try {
                        if (m1566g()) {
                            this.f1597i.removeAll(arrayList2);
                            if (this.f1597i.isEmpty()) {
                                this.f1597i = new LinkedHashSet();
                            }
                            if (!m1566g()) {
                                this.f1592d.m1235b(this.f1594f);
                                if (this.f1598j != null && (runnableC0689T = this.f1595g) != null) {
                                    this.f1592d.m1235b(runnableC0689T);
                                    this.f1595g = null;
                                }
                            }
                            this.f1592d.m1234a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
