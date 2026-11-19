package p034T;

import p001B.AbstractC0076b;
import p036U.C0829j;
import p049b0.AbstractC1886b;
import p049b0.C1885a;

/* JADX INFO: renamed from: T.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0726e implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1834s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f1835t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f1836u;

    public /* synthetic */ RunnableC0726e(Object obj, int i2, int i3) {
        this.f1834s = i3;
        this.f1836u = obj;
        this.f1835t = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1834s) {
            case 0:
                AbstractC0714b abstractC0714b = (AbstractC0714b) this.f1836u;
                try {
                    AbstractC1886b.m2715c();
                    try {
                        C1885a c1885a = AbstractC1886b.f2862a;
                        c1885a.getClass();
                        C0760m1 c0760m1 = abstractC0714b.f1673a;
                        int i2 = this.f1835t;
                        c0760m1.getClass();
                        AbstractC0076b.m131f(i2 > 0, "numMessages must be > 0");
                        if (!c0760m1.isClosed()) {
                            c0760m1.f1941E += (long) i2;
                            c0760m1.m1628c();
                            break;
                        }
                        c1885a.getClass();
                        return;
                    } catch (Throwable th) {
                        try {
                            AbstractC1886b.f2862a.getClass();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    ((C0829j) abstractC0714b).m1712m(th3);
                    return;
                }
            default:
                ((C0705Y0) this.f1836u).f1633f.request(this.f1835t);
                return;
        }
    }
}
