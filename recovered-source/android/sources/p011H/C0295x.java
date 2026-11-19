package p011H;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: H.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C0295x extends AbstractC0242F {

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f576b;

    /* JADX INFO: renamed from: c */
    public final AtomicIntegerFieldUpdater f577c;

    public C0295x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(5);
        this.f576b = atomicReferenceFieldUpdater;
        this.f577c = atomicIntegerFieldUpdater;
    }

    @Override // p011H.AbstractC0242F
    /* JADX INFO: renamed from: e */
    public final void mo361e(C0241E c0241e, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f576b;
            if (atomicReferenceFieldUpdater.compareAndSet(c0241e, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(c0241e) == null);
    }

    @Override // p011H.AbstractC0242F
    /* JADX INFO: renamed from: g */
    public final int mo362g(C0241E c0241e) {
        return this.f577c.decrementAndGet(c0241e);
    }
}
