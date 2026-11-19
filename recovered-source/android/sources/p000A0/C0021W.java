package p000A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: A0.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0021W extends AbstractC0026a0 {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23x = AtomicIntegerFieldUpdater.newUpdater(C0021W.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: w */
    public final C0024Z f24w;

    public C0021W(C0024Z c0024z) {
        this.f24w = c0024z;
    }

    @Override // p000A0.AbstractC0026a0
    /* JADX INFO: renamed from: j */
    public final boolean mo26j() {
        return true;
    }

    @Override // p000A0.AbstractC0026a0
    /* JADX INFO: renamed from: k */
    public final void mo27k(Throwable th) {
        if (f23x.compareAndSet(this, 0, 1)) {
            this.f24w.invoke(th);
        }
    }
}
