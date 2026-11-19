package p034T;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p001B.AbstractC0076b;
import p030R.AbstractC0522D;
import p030R.AbstractC0536S;
import p030R.AbstractC0538U;
import p030R.C0534P;
import p030R.ExecutorC0517A0;

/* JADX INFO: renamed from: T.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0792u1 extends AbstractC0536S {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2054a = 1;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f2055b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final Object f2056c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0538U f2057d;

    public C0792u1(C0799w1 c0799w1, C0799w1 c0799w2) {
        this.f2057d = c0799w1;
        this.f2056c = c0799w2;
    }

    @Override // p030R.AbstractC0536S
    /* JADX INFO: renamed from: a */
    public final C0534P mo1262a(C0641C1 c0641c1) {
        switch (this.f2054a) {
            case 0:
                if (this.f2055b.compareAndSet(false, true)) {
                    ExecutorC0517A0 executorC0517A0Mo1298d = ((C0799w1) this.f2057d).f2078f.mo1298d();
                    C0799w1 c0799w1 = (C0799w1) this.f2056c;
                    Objects.requireNonNull(c0799w1);
                    executorC0517A0Mo1298d.execute(new RunnableC0758m(c0799w1, 1));
                }
                break;
            default:
                if (this.f2055b.compareAndSet(false, true)) {
                    ((C0635A1) this.f2057d).f1398f.mo1298d().execute(new RunnableC0681Q(this, 7));
                }
                break;
        }
        return C0534P.f1135e;
    }

    public C0792u1(C0635A1 c0635a1, AbstractC0522D abstractC0522D) {
        this.f2057d = c0635a1;
        AbstractC0076b.m133h(abstractC0522D, "subchannel");
        this.f2056c = abstractC0522D;
    }
}
