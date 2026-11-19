package p034T;

import java.util.concurrent.TimeUnit;
import p001B.C0096v;

/* JADX INFO: renamed from: T.I1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0659I1 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1470s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0662J1 f1471t;

    public /* synthetic */ RunnableC0659I1(C0662J1 c0662j1, int i2) {
        this.f1470s = i2;
        this.f1471t = c0662j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1470s) {
            case 0:
                C0662J1 c0662j1 = this.f1471t;
                if (!c0662j1.f1480f) {
                    c0662j1.f1481g = null;
                } else {
                    C0096v c0096v = c0662j1.f1478d;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jM168a = c0662j1.f1479e - c0096v.m168a();
                    if (jM168a <= 0) {
                        c0662j1.f1480f = false;
                        c0662j1.f1481g = null;
                        c0662j1.f1477c.run();
                    } else {
                        c0662j1.f1481g = c0662j1.f1475a.schedule(new RunnableC0659I1(c0662j1, 1), jM168a, timeUnit);
                    }
                }
                break;
            default:
                C0662J1 c0662j2 = this.f1471t;
                c0662j2.f1476b.execute(new RunnableC0659I1(c0662j2, 0));
                break;
        }
    }
}
