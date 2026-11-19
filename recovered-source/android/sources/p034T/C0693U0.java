package p034T;

import java.util.concurrent.ScheduledExecutorService;
import p001B.AbstractC0076b;
import p030R.AbstractC0522D;
import p030R.AbstractC0536S;
import p030R.AbstractC0558h;
import p030R.C0533O;
import p030R.EnumC0578r;
import p030R.ExecutorC0517A0;
import p030R.RunnableC0591x0;

/* JADX INFO: renamed from: T.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0693U0 extends AbstractC0558h {

    /* JADX INFO: renamed from: d */
    public C0742i f1585d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0720c1 f1586e;

    public C0693U0(C0720c1 c0720c1) {
        this.f1586e = c0720c1;
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: a */
    public final AbstractC0522D mo1295a(C0533O c0533o) {
        C0720c1 c0720c1 = this.f1586e;
        c0720c1.f1785m.m1237d();
        AbstractC0076b.m139n(!c0720c1.f1752I, "Channel is being terminated");
        return new C0716b1(c0720c1, c0533o);
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: b */
    public final AbstractC0558h mo1296b() {
        return this.f1586e.f1758O;
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService mo1297c() {
        return this.f1586e.f1779g;
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: d */
    public final ExecutorC0517A0 mo1298d() {
        return this.f1586e.f1785m;
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: j */
    public final void mo1303j() {
        ExecutorC0517A0 executorC0517A0 = this.f1586e.f1785m;
        executorC0517A0.m1237d();
        executorC0517A0.execute(new RunnableC0681Q(this, 4));
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: k */
    public final void mo1304k(EnumC0578r enumC0578r, AbstractC0536S abstractC0536S) {
        ExecutorC0517A0 executorC0517A0 = this.f1586e.f1785m;
        executorC0517A0.m1237d();
        AbstractC0076b.m133h(enumC0578r, "newState");
        AbstractC0076b.m133h(abstractC0536S, "newPicker");
        executorC0517A0.execute(new RunnableC0591x0(this, abstractC0536S, enumC0578r, 4));
    }
}
