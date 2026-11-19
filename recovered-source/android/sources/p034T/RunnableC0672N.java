package p034T;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: T.N */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0672N implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1510s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0705Y0 f1511t;

    public /* synthetic */ RunnableC0672N(C0705Y0 c0705y0, int i2) {
        this.f1510s = i2;
        this.f1511t = c0705y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1510s) {
            case 0:
                this.f1511t.f1633f.halfClose();
                break;
            default:
                C0705Y0 c0705y0 = this.f1511t;
                C0708Z0 c0708z0 = c0705y0.f1641n;
                C0708Z0 c0708z1 = c0705y0.f1641n;
                LinkedHashSet linkedHashSet = c0708z0.f1656d.f1745B;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(c0705y0);
                    if (c0708z1.f1656d.f1745B.isEmpty()) {
                        C0720c1 c0720c1 = c0708z1.f1656d;
                        c0720c1.f1769Z.m1664a(c0720c1.f1746C, false);
                        C0720c1 c0720c2 = c0708z1.f1656d;
                        c0720c2.f1745B = null;
                        if (c0720c2.f1750G.get()) {
                            c0708z1.f1656d.f1749F.m1614a(C0720c1.f1739g0);
                        }
                    }
                }
                break;
        }
    }
}
