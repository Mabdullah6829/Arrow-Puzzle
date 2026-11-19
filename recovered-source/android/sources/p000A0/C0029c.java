package p000A0;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC6452k;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: A0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0029c extends AbstractC0025a {

    /* JADX INFO: renamed from: v */
    public final Thread f30v;

    /* JADX INFO: renamed from: w */
    public final AbstractC0014O f31w;

    public C0029c(InterfaceC6353h interfaceC6353h, Thread thread, AbstractC0014O abstractC0014O) {
        super(interfaceC6353h, true);
        this.f30v = thread;
        this.f31w = abstractC0014O;
    }

    @Override // p000A0.C0034e0
    /* JADX INFO: renamed from: k */
    public final void mo2k(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f30v;
        if (AbstractC6452k.m12177a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
