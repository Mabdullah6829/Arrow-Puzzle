package p034T;

import p030R.AbstractC0538U;
import p030R.EnumC0578r;

/* JADX INFO: renamed from: T.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0676O0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1514s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0720c1 f1515t;

    public /* synthetic */ RunnableC0676O0(C0720c1 c0720c1, int i2) {
        this.f1514s = i2;
        this.f1515t = c0720c1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1514s) {
            case 0:
                this.f1515t.m1602A(true);
                break;
            case 1:
                C0720c1 c0720c1 = this.f1515t;
                if (!c0720c1.f1750G.get() && c0720c1.f1796x != null) {
                    c0720c1.m1602A(false);
                    C0720c1.m1599x(c0720c1);
                    break;
                }
                break;
            case 2:
                this.f1515t.m1603B();
                if (this.f1515t.f1797y != null) {
                    this.f1515t.f1797y.getClass();
                }
                C0693U0 c0693u0 = this.f1515t.f1796x;
                if (c0693u0 != null) {
                    ((AbstractC0538U) c0693u0.f1585d.f1887t).mo1268e();
                }
                break;
            case 3:
                C0720c1 c0720c2 = this.f1515t;
                c0720c2.f1758O.mo1299f(2, "Entering SHUTDOWN state");
                c0720c2.f1790r.m1518b(EnumC0578r.f1236w);
                break;
            case 4:
                C0720c1 c0720c3 = this.f1515t;
                if (!c0720c3.f1751H) {
                    c0720c3.f1751H = true;
                    C0720c1.m1600y(c0720c3);
                    break;
                }
                break;
            default:
                C0720c1 c0720c4 = this.f1515t;
                if (c0720c4.f1796x != null) {
                    C0720c1.m1599x(c0720c4);
                    break;
                }
                break;
        }
    }
}
