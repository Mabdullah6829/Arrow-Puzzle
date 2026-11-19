package p034T;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: T.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0741h2 extends AbstractC0761m2 {

    /* JADX INFO: renamed from: c */
    public final AtomicIntegerFieldUpdater f1885c;

    public C0741h2(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f1885c = atomicIntegerFieldUpdater;
    }

    @Override // p034T.AbstractC0761m2
    /* JADX INFO: renamed from: r */
    public final boolean mo1612r(ExecutorC0749j2 executorC0749j2) {
        return this.f1885c.compareAndSet(executorC0749j2, 0, -1);
    }

    @Override // p034T.AbstractC0761m2
    /* JADX INFO: renamed from: s */
    public final void mo1613s(ExecutorC0749j2 executorC0749j2) {
        this.f1885c.set(executorC0749j2, 0);
    }
}
