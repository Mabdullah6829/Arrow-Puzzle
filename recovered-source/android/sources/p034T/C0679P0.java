package p034T;

import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.AbstractC0536S;
import p030R.C0534P;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0679P0 extends AbstractC0536S {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1521a = 1;

    /* JADX INFO: renamed from: b */
    public final C0534P f1522b;

    public C0679P0(C0534P c0534p) {
        AbstractC0076b.m133h(c0534p, "result");
        this.f1522b = c0534p;
    }

    @Override // p030R.AbstractC0536S
    /* JADX INFO: renamed from: a */
    public final C0534P mo1262a(C0641C1 c0641c1) {
        switch (this.f1521a) {
            case 0:
                break;
        }
        return this.f1522b;
    }

    public final String toString() {
        switch (this.f1521a) {
            case 0:
                C0087m c0087m = new C0087m(C0679P0.class.getSimpleName());
                c0087m.m158b(this.f1522b, "panicPickResult");
                return c0087m.toString();
            default:
                return "FixedResultPicker(" + this.f1522b + ")";
        }
    }

    public C0679P0(Throwable th) {
        C0589w0 c0589w0M1353f = C0589w0.f1283m.m1354g("Panic! This is a bug!").m1353f(th);
        C0534P c0534p = C0534P.f1135e;
        AbstractC0076b.m131f(!c0589w0M1353f.m1352e(), "drop status shouldn't be OK");
        this.f1522b = new C0534P(null, null, c0589w0M1353f, true);
    }
}
