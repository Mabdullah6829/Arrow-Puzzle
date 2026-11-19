package p000A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: A0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0056p0 extends AbstractC0026a0 {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f69y = AtomicIntegerFieldUpdater.newUpdater(C0056p0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: w */
    public final Thread f70w = Thread.currentThread();

    /* JADX INFO: renamed from: x */
    public InterfaceC0008I f71x;

    /* JADX INFO: renamed from: m */
    public static void m98m(int i2) {
        throw new IllegalStateException(("Illegal state " + i2).toString());
    }

    @Override // p000A0.AbstractC0026a0
    /* JADX INFO: renamed from: j */
    public final boolean mo26j() {
        return true;
    }

    @Override // p000A0.AbstractC0026a0
    /* JADX INFO: renamed from: k */
    public final void mo27k(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f69y;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    return;
                }
                m98m(i2);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 2));
        this.f70w.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* JADX INFO: renamed from: l */
    public final void m99l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f69y;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m98m(i2);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, 1)) {
                InterfaceC0008I interfaceC0008I = this.f71x;
                if (interfaceC0008I != null) {
                    interfaceC0008I.dispose();
                    return;
                }
                return;
            }
        }
    }
}
