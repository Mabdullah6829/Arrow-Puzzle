package p034T;

import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.AbstractC0536S;
import p030R.C0534P;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0788t1 extends AbstractC0536S {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2045a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f2046b;

    public C0788t1(C0534P c0534p) {
        AbstractC0076b.m133h(c0534p, "result");
        this.f2046b = c0534p;
    }

    @Override // p030R.AbstractC0536S
    /* JADX INFO: renamed from: a */
    public final C0534P mo1262a(C0641C1 c0641c1) {
        switch (this.f2045a) {
            case 0:
                return (C0534P) this.f2046b;
            default:
                return C0534P.m1260a((C0589w0) this.f2046b);
        }
    }

    public String toString() {
        switch (this.f2045a) {
            case 0:
                C0087m c0087m = new C0087m(C0788t1.class.getSimpleName());
                c0087m.m158b((C0534P) this.f2046b, "result");
                return c0087m.toString();
            default:
                return super.toString();
        }
    }

    public C0788t1(C0589w0 c0589w0) {
        this.f2046b = c0589w0;
    }
}
