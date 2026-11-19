package p034T;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.InterfaceC0097w;
import p006D0.C0177l;
import p030R.AbstractC0522D;
import p030R.AbstractC0558h;
import p030R.C0525G;
import p030R.C0526H;
import p030R.C0529K;
import p030R.C0533O;
import p030R.C0546b;
import p030R.EnumC0524F;
import p030R.ExecutorC0517A0;
import p030R.InterfaceC0537T;

/* JADX INFO: renamed from: T.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0716b1 extends AbstractC0522D {

    /* JADX INFO: renamed from: a */
    public final C0533O f1689a;

    /* JADX INFO: renamed from: b */
    public final C0529K f1690b;

    /* JADX INFO: renamed from: c */
    public final C0778r f1691c;

    /* JADX INFO: renamed from: d */
    public final C0786t f1692d;

    /* JADX INFO: renamed from: e */
    public List f1693e;

    /* JADX INFO: renamed from: f */
    public C0643D0 f1694f;

    /* JADX INFO: renamed from: g */
    public boolean f1695g;

    /* JADX INFO: renamed from: h */
    public boolean f1696h;

    /* JADX INFO: renamed from: i */
    public C0177l f1697i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0720c1 f1698j;

    public C0716b1(C0720c1 c0720c1, C0533O c0533o) {
        this.f1698j = c0720c1;
        List list = c0533o.f1132b;
        this.f1693e = list;
        Logger logger = C0720c1.f1736d0;
        this.f1689a = c0533o;
        C0529K c0529k = new C0529K("Subchannel", c0720c1.f1792t.f1654b, C0529K.f1123d.incrementAndGet());
        this.f1690b = c0529k;
        C0785s2 c0785s2 = c0720c1.f1784l;
        C0786t c0786t = new C0786t(c0529k, c0785s2.m1661e(), "Subchannel for " + list);
        this.f1692d = c0786t;
        this.f1691c = new C0778r(c0786t, c0785s2);
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: g */
    public final List mo1241g() {
        this.f1698j.f1785m.m1237d();
        AbstractC0076b.m139n(this.f1695g, "not started");
        return this.f1693e;
    }

    @Override // p030R.AbstractC0522D
    public final C0546b getAttributes() {
        return this.f1689a.f1133c;
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: h */
    public final AbstractC0558h mo1242h() {
        return this.f1691c;
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: i */
    public final Object mo1243i() {
        AbstractC0076b.m139n(this.f1695g, "Subchannel is not started");
        return this.f1694f;
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: m */
    public final void mo1247m() {
        this.f1698j.f1785m.m1237d();
        AbstractC0076b.m139n(this.f1695g, "not started");
        C0643D0 c0643d0 = this.f1694f;
        if (c0643d0.f1433v != null) {
            return;
        }
        c0643d0.f1422k.execute(new RunnableC0791u0(c0643d0, 1));
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: n */
    public final void mo1248n() {
        C0177l c0177l;
        C0720c1 c0720c1 = this.f1698j;
        c0720c1.f1785m.m1237d();
        if (this.f1694f == null) {
            this.f1696h = true;
            return;
        }
        if (!this.f1696h) {
            this.f1696h = true;
        } else {
            if (!c0720c1.f1752I || (c0177l = this.f1697i) == null) {
                return;
            }
            c0177l.m271c();
            this.f1697i = null;
        }
        if (!c0720c1.f1752I) {
            this.f1697i = c0720c1.f1785m.m1236c(new RunnableC0667L0(new RunnableC0681Q(this, 5)), 5L, TimeUnit.SECONDS, c0720c1.f1778f.f2014s.f2189v);
        } else {
            C0643D0 c0643d0 = this.f1694f;
            c0643d0.f1422k.execute(new RunnableC0795v0(c0643d0, C0720c1.f1739g0, 0));
        }
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: p */
    public final void mo1250p(InterfaceC0537T interfaceC0537T) {
        C0720c1 c0720c1 = this.f1698j;
        c0720c1.f1785m.m1237d();
        AbstractC0076b.m139n(!this.f1695g, "already started");
        AbstractC0076b.m139n(!this.f1696h, "already shutdown");
        AbstractC0076b.m139n(!c0720c1.f1752I, "Channel is being terminated");
        this.f1695g = true;
        List list = this.f1689a.f1132b;
        String str = c0720c1.f1792t.f1654b;
        C0785s2 c0785s2 = c0720c1.f1791s;
        C0774q c0774q = c0720c1.f1778f;
        ScheduledExecutorService scheduledExecutorService = c0774q.f2014s.f2189v;
        InterfaceC0097w interfaceC0097w = c0720c1.f1788p;
        ExecutorC0517A0 executorC0517A0 = c0720c1.f1785m;
        C0793u2 c0793u2 = new C0793u2(3, this, interfaceC0537T);
        C0526H c0526h = c0720c1.f1759P;
        c0720c1.f1755L.getClass();
        C0643D0 c0643d0 = new C0643D0(list, str, c0785s2, c0774q, scheduledExecutorService, interfaceC0097w, executorC0517A0, c0793u2, c0526h, new C0742i(), this.f1692d, this.f1690b, this.f1691c, c0720c1.f1793u);
        c0720c1.f1757N.m1663b(new C0525G("Child Subchannel started", EnumC0524F.f1109s, c0720c1.f1784l.m1661e(), c0643d0));
        this.f1694f = c0643d0;
        c0720c1.f1744A.add(c0643d0);
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: q */
    public final void mo1251q(List list) {
        this.f1698j.f1785m.m1237d();
        this.f1693e = list;
        C0643D0 c0643d0 = this.f1694f;
        c0643d0.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0076b.m133h(it.next(), "newAddressGroups contains null entry");
        }
        AbstractC0076b.m131f(!list.isEmpty(), "newAddressGroups is empty");
        c0643d0.f1422k.execute(new RunnableC0666L(14, c0643d0, Collections.unmodifiableList(new ArrayList(list))));
    }

    public final String toString() {
        return this.f1690b.toString();
    }
}
