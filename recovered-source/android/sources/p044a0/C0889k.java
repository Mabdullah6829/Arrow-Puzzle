package p044a0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p001B.AbstractC0076b;
import p006D0.C0177l;
import p030R.C0580s;

/* JADX INFO: renamed from: a0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0889k {

    /* JADX INFO: renamed from: a */
    public C0893o f2490a;

    /* JADX INFO: renamed from: d */
    public Long f2493d;

    /* JADX INFO: renamed from: e */
    public int f2494e;

    /* JADX INFO: renamed from: b */
    public volatile C0177l f2491b = new C0177l(14);

    /* JADX INFO: renamed from: c */
    public C0177l f2492c = new C0177l(14);

    /* JADX INFO: renamed from: f */
    public final HashSet f2495f = new HashSet();

    public C0889k(C0893o c0893o) {
        this.f2490a = c0893o;
    }

    /* JADX INFO: renamed from: a */
    public final void m1811a(C0897s c0897s) {
        if (m1814d() && !c0897s.f2518c) {
            c0897s.m1817s();
        } else if (!m1814d() && c0897s.f2518c) {
            c0897s.f2518c = false;
            C0580s c0580s = c0897s.f2519d;
            if (c0580s != null) {
                c0897s.f2520e.mo1263a(c0580s);
                c0897s.f2521f.mo1300g("Subchannel unejected: {0}", new Object[]{c0897s}, 2);
            }
        }
        c0897s.f2517b = this;
        this.f2495f.add(c0897s);
    }

    /* JADX INFO: renamed from: b */
    public final void m1812b(long j2) {
        this.f2493d = Long.valueOf(j2);
        this.f2494e++;
        Iterator it = this.f2495f.iterator();
        while (it.hasNext()) {
            ((C0897s) it.next()).m1817s();
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m1813c() {
        return ((AtomicLong) this.f2492c.f332t).get() + ((AtomicLong) this.f2492c.f333u).get();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1814d() {
        return this.f2493d != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m1815e() {
        AbstractC0076b.m139n(this.f2493d != null, "not currently ejected");
        this.f2493d = null;
        for (C0897s c0897s : this.f2495f) {
            c0897s.f2518c = false;
            C0580s c0580s = c0897s.f2519d;
            if (c0580s != null) {
                c0897s.f2520e.mo1263a(c0580s);
                c0897s.f2521f.mo1300g("Subchannel unejected: {0}", new Object[]{c0897s}, 2);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f2495f + '}';
    }
}
