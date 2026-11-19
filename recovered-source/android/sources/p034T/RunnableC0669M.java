package p034T;

import p001B.C0096v;

/* JADX INFO: renamed from: T.M */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0669M implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1505s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean f1506t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f1507u;

    public /* synthetic */ RunnableC0669M(Object obj, boolean z, int i2) {
        this.f1505s = i2;
        this.f1507u = obj;
        this.f1506t = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1505s) {
            case 0:
                ((C0705Y0) this.f1507u).f1633f.setMessageCompression(this.f1506t);
                break;
            case 1:
                ((C0707Z) this.f1507u).f1646c.mo1540b(this.f1506t);
                break;
            default:
                C0719c0 c0719c0 = (C0719c0) ((RunnableC0666L) this.f1507u).f1496t;
                if (this.f1506t) {
                    c0719c0.f1729l = true;
                    if (c0719c0.f1726i > 0) {
                        C0096v c0096v = c0719c0.f1728k;
                        c0096v.f139b = false;
                        c0096v.m169b();
                    }
                }
                c0719c0.f1734q = false;
                break;
        }
    }
}
