package p034T;

import p030R.EnumC0578r;

/* JADX INFO: renamed from: T.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0791u0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2052s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0643D0 f2053t;

    public /* synthetic */ RunnableC0791u0(C0643D0 c0643d0, int i2) {
        this.f2052s = i2;
        this.f2053t = c0643d0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2052s) {
            case 0:
                C0643D0 c0643d0 = this.f2053t;
                c0643d0.f1427p = null;
                c0643d0.f1420i.mo1299f(2, "CONNECTING after backoff");
                C0643D0.m1484f(c0643d0, EnumC0578r.f1232s);
                C0643D0.m1485g(c0643d0);
                break;
            case 1:
                if (this.f2053t.f1434w.f1238a == EnumC0578r.f1235v) {
                    this.f2053t.f1420i.mo1299f(2, "CONNECTING as requested");
                    C0643D0.m1484f(this.f2053t, EnumC0578r.f1232s);
                    C0643D0.m1485g(this.f2053t);
                }
                break;
            default:
                C0643D0 c0643d1 = this.f2053t;
                c0643d1.f1420i.mo1299f(2, "Terminated");
                C0720c1 c0720c1 = ((C0716b1) c0643d1.f1415d.f2061u).f1698j;
                c0720c1.f1744A.remove(c0643d1);
                C0720c1.m1601z(c0720c1);
                break;
        }
    }
}
