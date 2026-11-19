package p034T;

import p001B.AbstractC0076b;
import p001B.C0092r;

/* JADX INFO: renamed from: T.T */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0689T implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1574s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0092r f1575t;

    public /* synthetic */ RunnableC0689T(C0092r c0092r, int i2) {
        this.f1574s = i2;
        this.f1575t = c0092r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1574s) {
            case 0:
                this.f1575t.m166f(true);
                break;
            case 1:
                this.f1575t.m166f(false);
                break;
            default:
                C0720c1 c0720c1 = (C0720c1) this.f1575t.f130t;
                AbstractC0076b.m139n(c0720c1.f1750G.get(), "Channel must have been shut down");
                c0720c1.f1752I = true;
                c0720c1.m1606F(false);
                C0720c1.m1600y(c0720c1);
                C0720c1.m1601z(c0720c1);
                break;
        }
    }
}
