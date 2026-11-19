package p034T;

import java.io.IOException;
import p030R.C0586v;
import p036U.C0822c;

/* JADX INFO: renamed from: T.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0663K implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1482s;

    /* JADX INFO: renamed from: t */
    public final Object f1483t;

    public /* synthetic */ AbstractRunnableC0663K(Object obj, int i2) {
        this.f1482s = i2;
        this.f1483t = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1519a();

    /* JADX INFO: renamed from: b */
    public abstract void mo1520b();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1482s) {
            case 0:
                C0586v c0586v = (C0586v) this.f1483t;
                C0586v c0586vM1343a = c0586v.m1343a();
                try {
                    mo1520b();
                    return;
                } finally {
                    c0586v.m1344c(c0586vM1343a);
                }
            default:
                C0822c c0822c = (C0822c) this.f1483t;
                try {
                    if (c0822c.f2156A == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    mo1519a();
                    return;
                } catch (Exception e) {
                    c0822c.f2164v.m1726o(e);
                    return;
                }
        }
    }
}
