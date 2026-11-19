package p034T;

import p001B.AbstractC0076b;
import p030R.EnumC0578r;

/* JADX INFO: renamed from: T.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0634A0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1396s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0637B0 f1397t;

    public /* synthetic */ RunnableC0634A0(C0637B0 c0637b0, int i2) {
        this.f1396s = i2;
        this.f1397t = c0637b0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1396s) {
            case 0:
                C0637B0 c0637b0 = this.f1397t;
                C0643D0 c0643d0 = (C0643D0) c0637b0.f1403u;
                c0643d0.f1425n = null;
                if (c0643d0.f1435x == null) {
                    C0804y0 c0804y0 = c0643d0.f1432u;
                    C0804y0 c0804y1 = (C0804y0) c0637b0.f1402t;
                    if (c0804y0 == c0804y1) {
                        c0643d0.f1433v = c0804y1;
                        C0643D0 c0643d1 = (C0643D0) this.f1397t.f1403u;
                        c0643d1.f1432u = null;
                        C0643D0.m1484f(c0643d1, EnumC0578r.f1233t);
                    }
                } else {
                    AbstractC0076b.m139n(c0643d0.f1433v == null, "Unexpected non-null activeTransport");
                    C0637B0 c0637b1 = this.f1397t;
                    ((C0804y0) c0637b1.f1402t).mo1563b(((C0643D0) c0637b1.f1403u).f1435x);
                }
                break;
            default:
                C0637B0 c0637b2 = this.f1397t;
                ((C0643D0) c0637b2.f1403u).f1430s.remove((C0804y0) c0637b2.f1402t);
                if (((C0643D0) this.f1397t.f1403u).f1434w.f1238a == EnumC0578r.f1236w && ((C0643D0) this.f1397t.f1403u).f1430s.isEmpty()) {
                    C0643D0 c0643d2 = (C0643D0) this.f1397t.f1403u;
                    c0643d2.f1422k.execute(new RunnableC0791u0(c0643d2, 2));
                    break;
                }
                break;
        }
    }
}
