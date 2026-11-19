package p012H0;

import java.util.concurrent.Executor;
import p000A0.AbstractC0015P;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: H0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0305h extends AbstractC0015P {

    /* JADX INFO: renamed from: s */
    public ExecutorC0300c f612s;

    @Override // p000A0.AbstractC0063t
    public final void dispatch(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        ExecutorC0300c.m452h(this.f612s, runnable, 6);
    }

    @Override // p000A0.AbstractC0063t
    public final void dispatchYield(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        ExecutorC0300c.m452h(this.f612s, runnable, 2);
    }

    @Override // p000A0.AbstractC0015P
    /* JADX INFO: renamed from: j */
    public final Executor mo25j() {
        return this.f612s;
    }
}
