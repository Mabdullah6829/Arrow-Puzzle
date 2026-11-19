package p034T;

import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.AbstractC0522D;
import p030R.AbstractC0558h;
import p030R.C0544a;
import p030R.ExecutorC0517A0;

/* JADX INFO: renamed from: T.e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0729e2 extends AbstractC0522D {

    /* JADX INFO: renamed from: d */
    public static final C0544a f1849d = new C0544a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: a */
    public final AbstractC0522D f1850a;

    /* JADX INFO: renamed from: b */
    public final C0762n f1851b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC0517A0 f1852c;

    public C0729e2(C0719c0 c0719c0, C0762n c0762n, ExecutorC0517A0 executorC0517A0) {
        this.f1850a = c0719c0;
        this.f1851b = c0762n;
        this.f1852c = executorC0517A0;
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: j */
    public String mo1244j() {
        return this.f1850a.mo1244j();
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: l */
    public final void mo1246l() {
        this.f1850a.mo1246l();
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: n */
    public final void mo1248n() {
        this.f1850a.mo1248n();
        C0762n c0762n = this.f1851b;
        ExecutorC0517A0 executorC0517A0 = c0762n.f1959b;
        executorC0517A0.m1237d();
        executorC0517A0.execute(new RunnableC0758m(c0762n, 0));
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: o */
    public final void mo1249o(AbstractC0558h abstractC0558h) {
        this.f1850a.mo1249o(new C0725d2(this, abstractC0558h));
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1850a, "delegate");
        return c0087mM143s.toString();
    }
}
