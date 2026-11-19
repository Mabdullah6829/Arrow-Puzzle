package p011H;

import p043a.AbstractC0878a;

/* JADX INFO: renamed from: H.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C0280j extends AbstractC0878a {
    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: c */
    public final boolean mo418c(AbstractC0290s abstractC0290s, C0274g c0274g, C0274g c0274g2) {
        synchronized (abstractC0290s) {
            try {
                if (abstractC0290s.f568t != c0274g) {
                    return false;
                }
                abstractC0290s.f568t = c0274g2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: d */
    public final boolean mo419d(AbstractC0290s abstractC0290s, Object obj, Object obj2) {
        synchronized (abstractC0290s) {
            try {
                if (abstractC0290s.f567s != obj) {
                    return false;
                }
                abstractC0290s.f567s = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: e */
    public final boolean mo420e(AbstractC0290s abstractC0290s, C0289r c0289r, C0289r c0289r2) {
        synchronized (abstractC0290s) {
            try {
                if (abstractC0290s.f569u != c0289r) {
                    return false;
                }
                abstractC0290s.f569u = c0289r2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: i */
    public final C0274g mo421i(AbstractC0290s abstractC0290s) {
        C0274g c0274g;
        C0274g c0274g2 = C0274g.f535d;
        synchronized (abstractC0290s) {
            try {
                c0274g = abstractC0290s.f568t;
                if (c0274g != c0274g2) {
                    abstractC0290s.f568t = c0274g2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0274g;
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: j */
    public final C0289r mo422j(AbstractC0290s abstractC0290s) {
        C0289r c0289r;
        C0289r c0289r2 = C0289r.f560c;
        synchronized (abstractC0290s) {
            try {
                c0289r = abstractC0290s.f569u;
                if (c0289r != c0289r2) {
                    abstractC0290s.f569u = c0289r2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0289r;
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: p */
    public final void mo423p(C0289r c0289r, C0289r c0289r2) {
        c0289r.f562b = c0289r2;
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: q */
    public final void mo424q(C0289r c0289r, Thread thread) {
        c0289r.f561a = thread;
    }
}
