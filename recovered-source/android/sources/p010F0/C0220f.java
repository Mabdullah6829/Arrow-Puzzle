package p010F0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p000A0.AbstractC0000A;
import p000A0.AbstractC0063t;
import p000A0.C0039h;
import p000A0.InterfaceC0003D;
import p000A0.RunnableC0046k0;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: F0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0220f extends AbstractC0063t implements InterfaceC0003D {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f439y = AtomicIntegerFieldUpdater.newUpdater(C0220f.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC0003D f440s;

    /* JADX INFO: renamed from: t */
    public final AbstractC0063t f441t;

    /* JADX INFO: renamed from: u */
    public final int f442u;

    /* JADX INFO: renamed from: v */
    public final String f443v;

    /* JADX INFO: renamed from: w */
    public final C0224j f444w;

    /* JADX INFO: renamed from: x */
    public final Object f445x;

    /* JADX WARN: Multi-variable type inference failed */
    public C0220f(AbstractC0063t abstractC0063t, int i2, String str) {
        InterfaceC0003D interfaceC0003D = abstractC0063t instanceof InterfaceC0003D ? (InterfaceC0003D) abstractC0063t : null;
        this.f440s = interfaceC0003D == null ? AbstractC0000A.f0a : interfaceC0003D;
        this.f441t = abstractC0063t;
        this.f442u = i2;
        this.f443v = str;
        this.f444w = new C0224j();
        this.f445x = new Object();
    }

    @Override // p000A0.AbstractC0063t
    public final void dispatch(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        Runnable runnableM311j;
        this.f444w.m317a(runnable);
        if (f439y.get(this) >= this.f442u || !m312l() || (runnableM311j = m311j()) == null) {
            return;
        }
        this.f441t.dispatch(this, new RunnableC0046k0(this, runnableM311j, 2, false));
    }

    @Override // p000A0.AbstractC0063t
    public final void dispatchYield(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        Runnable runnableM311j;
        this.f444w.m317a(runnable);
        if (f439y.get(this) >= this.f442u || !m312l() || (runnableM311j = m311j()) == null) {
            return;
        }
        this.f441t.dispatchYield(this, new RunnableC0046k0(this, runnableM311j, 2, false));
    }

    @Override // p000A0.InterfaceC0003D
    /* JADX INFO: renamed from: i */
    public final void mo1i(long j2, C0039h c0039h) {
        this.f440s.mo1i(j2, c0039h);
    }

    /* JADX INFO: renamed from: j */
    public final Runnable m311j() {
        while (true) {
            Runnable runnable = (Runnable) this.f444w.m320d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f445x) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f439y;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f444w.m319c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m312l() {
        synchronized (this.f445x) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f439y;
            if (atomicIntegerFieldUpdater.get(this) >= this.f442u) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // p000A0.AbstractC0063t
    public final AbstractC0063t limitedParallelism(int i2, String str) {
        AbstractC0215a.m295a(i2);
        if (i2 >= this.f442u) {
            return str != null ? new C0228n(this, str) : this;
        }
        return super.limitedParallelism(i2, str);
    }

    @Override // p000A0.AbstractC0063t
    public final String toString() {
        String str = this.f443v;
        if (str != null) {
            return str;
        }
        return this.f441t + ".limitedParallelism(" + this.f442u + ')';
    }
}
