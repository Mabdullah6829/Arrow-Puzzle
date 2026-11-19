package p012H0;

import java.util.concurrent.Executor;
import p000A0.AbstractC0015P;
import p000A0.AbstractC0063t;
import p010F0.AbstractC0215a;
import p010F0.AbstractC0234t;
import p062g0.C6354i;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: H0.d */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0301d extends AbstractC0015P implements Executor {

    /* JADX INFO: renamed from: s */
    public static final ExecutorC0301d f608s = new ExecutorC0301d();

    /* JADX INFO: renamed from: t */
    public static final AbstractC0063t f609t;

    static {
        C0309l c0309l = C0309l.f622s;
        int i2 = AbstractC0234t.f468a;
        if (64 >= i2) {
            i2 = 64;
        }
        f609t = AbstractC0063t.limitedParallelism$default(c0309l, AbstractC0215a.m304j(i2, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // p000A0.AbstractC0063t
    public final void dispatch(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        f609t.dispatch(interfaceC6353h, runnable);
    }

    @Override // p000A0.AbstractC0063t
    public final void dispatchYield(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        f609t.dispatchYield(interfaceC6353h, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(C6354i.f24409s, runnable);
    }

    @Override // p000A0.AbstractC0063t
    public final AbstractC0063t limitedParallelism(int i2, String str) {
        return C0309l.f622s.limitedParallelism(i2, str);
    }

    @Override // p000A0.AbstractC0063t
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p000A0.AbstractC0015P
    /* JADX INFO: renamed from: j */
    public final Executor mo25j() {
        return this;
    }
}
