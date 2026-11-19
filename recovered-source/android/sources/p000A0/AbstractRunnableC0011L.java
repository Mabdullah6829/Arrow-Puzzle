package p000A0;

import p001B.C0084j;
import p010F0.C0235u;

/* JADX INFO: renamed from: A0.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0011L implements Runnable, Comparable, InterfaceC0008I {
    private volatile Object _heap;

    /* JADX INFO: renamed from: s */
    public long f8s;

    /* JADX INFO: renamed from: t */
    public int f9t;

    /* JADX INFO: renamed from: c */
    public final int m12c(long j2, C0012M c0012m, AbstractC0013N abstractC0013N) {
        synchronized (this) {
            if (this._heap == AbstractC0069y.f87b) {
                return 2;
            }
            synchronized (c0012m) {
                try {
                    AbstractRunnableC0011L[] abstractRunnableC0011LArr = c0012m.f470a;
                    AbstractRunnableC0011L abstractRunnableC0011L = abstractRunnableC0011LArr != null ? abstractRunnableC0011LArr[0] : null;
                    if (AbstractC0013N.f13y.get(abstractC0013N) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC0011L == null) {
                        c0012m.f10c = j2;
                    } else {
                        long j3 = abstractRunnableC0011L.f8s;
                        if (j3 - j2 < 0) {
                            j2 = j3;
                        }
                        if (j2 - c0012m.f10c > 0) {
                            c0012m.f10c = j2;
                        }
                    }
                    long j4 = this.f8s;
                    long j5 = c0012m.f10c;
                    if (j4 - j5 < 0) {
                        this.f8s = j5;
                    }
                    c0012m.m331a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j2 = this.f8s - ((AbstractRunnableC0011L) obj).f8s;
        if (j2 > 0) {
            return 1;
        }
        return j2 < 0 ? -1 : 0;
    }

    @Override // p000A0.InterfaceC0008I
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0084j c0084j = AbstractC0069y.f87b;
                if (obj == c0084j) {
                    return;
                }
                C0012M c0012m = obj instanceof C0012M ? (C0012M) obj : null;
                if (c0012m != null) {
                    synchronized (c0012m) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C0235u ? (C0235u) obj2 : null) != null) {
                            c0012m.m332b(this.f9t);
                        }
                    }
                }
                this._heap = c0084j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13e(C0012M c0012m) {
        if (this._heap == AbstractC0069y.f87b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c0012m;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f8s + ']';
    }
}
