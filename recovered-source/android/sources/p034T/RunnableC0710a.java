package p034T;

import p030R.C0559h0;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0710a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1661s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f1662t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f1663u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f1664v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f1665w;

    public /* synthetic */ RunnableC0710a(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f1661s = i2;
        this.f1665w = obj;
        this.f1662t = obj2;
        this.f1663u = obj3;
        this.f1664v = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1661s) {
            case 0:
                ((AbstractC0714b) this.f1665w).m1586b((C0589w0) this.f1662t, (EnumC0633A) this.f1663u, (C0559h0) this.f1664v);
                return;
            case 1:
                ((C0704Y) this.f1665w).f1624s.mo148a((C0589w0) this.f1662t, (EnumC0633A) this.f1663u, (C0559h0) this.f1664v);
                return;
            case 2:
                C0684R0 c0684r0 = (C0684R0) this.f1665w;
                c0684r0.f1562z = true;
                c0684r0.f1557u.mo148a((C0589w0) this.f1662t, (EnumC0633A) this.f1663u, (C0559h0) this.f1664v);
                return;
            default:
                synchronized (((C0773p2) this.f1665w)) {
                    try {
                        if (((C0765n2) this.f1662t).f1969b == 0) {
                            try {
                                ((InterfaceC0769o2) this.f1663u).mo1647d(this.f1664v);
                                ((C0773p2) this.f1665w).f2011a.remove((InterfaceC0769o2) this.f1663u);
                                if (((C0773p2) this.f1665w).f2011a.isEmpty()) {
                                    ((C0773p2) this.f1665w).f2013c.shutdown();
                                    ((C0773p2) this.f1665w).f2013c = null;
                                }
                            } catch (Throwable th) {
                                ((C0773p2) this.f1665w).f2011a.remove((InterfaceC0769o2) this.f1663u);
                                if (((C0773p2) this.f1665w).f2011a.isEmpty()) {
                                    ((C0773p2) this.f1665w).f2013c.shutdown();
                                    ((C0773p2) this.f1665w).f2013c = null;
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
