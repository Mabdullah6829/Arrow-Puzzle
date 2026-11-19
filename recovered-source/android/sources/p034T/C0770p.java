package p034T;

import androidx.core.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicInteger;
import p001B.AbstractC0076b;
import p001B.C0092r;
import p030R.AbstractC0552e;
import p030R.AbstractC0570n;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0770p extends AbstractC0739h0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0654H f1987a;

    /* JADX INFO: renamed from: c */
    public volatile C0589w0 f1989c;

    /* JADX INFO: renamed from: d */
    public C0589w0 f1990d;

    /* JADX INFO: renamed from: e */
    public C0589w0 f1991e;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0774q f1993g;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f1988b = new AtomicInteger(-2147483647);

    /* JADX INFO: renamed from: f */
    public final C0092r f1992f = new C0092r(this, 4);

    public C0770p(C0774q c0774q, InterfaceC0654H interfaceC0654H, String str) {
        this.f1993g = c0774q;
        AbstractC0076b.m133h(interfaceC0654H, "delegate");
        this.f1987a = interfaceC0654H;
    }

    /* JADX INFO: renamed from: g */
    public static void m1648g(C0770p c0770p) {
        synchronized (c0770p) {
            try {
                if (c0770p.f1988b.get() != 0) {
                    return;
                }
                C0589w0 c0589w0 = c0770p.f1990d;
                C0589w0 c0589w1 = c0770p.f1991e;
                c0770p.f1990d = null;
                c0770p.f1991e = null;
                if (c0589w0 != null) {
                    super.mo1563b(c0589w0);
                }
                if (c0589w1 != null) {
                    super.mo1564e(c0589w1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p034T.AbstractC0739h0, p034T.InterfaceC0752k1
    /* JADX INFO: renamed from: b */
    public final void mo1563b(C0589w0 c0589w0) {
        AbstractC0076b.m133h(c0589w0, NotificationCompat.CATEGORY_STATUS);
        synchronized (this) {
            try {
                if (this.f1988b.get() < 0) {
                    this.f1989c = c0589w0;
                    this.f1988b.addAndGet(Integer.MAX_VALUE);
                    if (this.f1988b.get() != 0) {
                        this.f1990d = c0589w0;
                    } else {
                        super.mo1563b(c0589w0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p034T.InterfaceC0639C
    /* JADX INFO: renamed from: c */
    public final InterfaceC0806z mo1483c(C0567l0 c0567l0, C0559h0 c0559h0, C0556g c0556g, AbstractC0570n[] abstractC0570nArr) {
        InterfaceC0806z interfaceC0806z;
        AbstractC0552e abstractC0552e = c0556g.f1177c;
        if (abstractC0552e == null) {
            abstractC0552e = null;
        }
        if (abstractC0552e == null) {
            return this.f1988b.get() >= 0 ? new C0731f0(this.f1989c, abstractC0570nArr) : this.f1987a.mo1483c(c0567l0, c0559h0, c0556g, abstractC0570nArr);
        }
        C0772p1 c0772p1 = new C0772p1(this.f1987a, c0567l0, c0559h0, c0556g, this.f1992f, abstractC0570nArr);
        if (this.f1988b.incrementAndGet() > 0) {
            C0770p c0770p = (C0770p) this.f1992f.f130t;
            if (c0770p.f1988b.decrementAndGet() == 0) {
                m1648g(c0770p);
            }
            return new C0731f0(this.f1989c, abstractC0570nArr);
        }
        try {
            abstractC0552e.applyRequestMetadata(new C0766o(), this.f1993g.f2015t, c0772p1);
        } catch (Throwable th) {
            c0772p1.mo1284b(C0589w0.f1280j.m1354g("Credentials should use fail() instead of throwing exceptions").m1353f(th));
        }
        synchronized (c0772p1.f2006h) {
            try {
                InterfaceC0806z interfaceC0806z2 = c0772p1.f2007i;
                interfaceC0806z = interfaceC0806z2;
                if (interfaceC0806z2 == null) {
                    C0707Z c0707z = new C0707Z();
                    c0772p1.f2009k = c0707z;
                    c0772p1.f2007i = c0707z;
                    interfaceC0806z = c0707z;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC0806z;
    }

    @Override // p034T.AbstractC0739h0, p034T.InterfaceC0752k1
    /* JADX INFO: renamed from: e */
    public final void mo1564e(C0589w0 c0589w0) {
        AbstractC0076b.m133h(c0589w0, NotificationCompat.CATEGORY_STATUS);
        synchronized (this) {
            try {
                if (this.f1988b.get() < 0) {
                    this.f1989c = c0589w0;
                    this.f1988b.addAndGet(Integer.MAX_VALUE);
                } else if (this.f1991e != null) {
                    return;
                }
                if (this.f1988b.get() != 0) {
                    this.f1991e = c0589w0;
                } else {
                    super.mo1564e(c0589w0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p034T.AbstractC0739h0
    /* JADX INFO: renamed from: f */
    public final InterfaceC0654H mo1611f() {
        return this.f1987a;
    }
}
