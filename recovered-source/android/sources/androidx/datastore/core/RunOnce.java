package androidx.datastore.core;

import p000A0.C0034e0;
import p000A0.C0051n;
import p000A0.InterfaceC0018T;
import p000A0.InterfaceC0049m;
import p011H.AbstractC0243G;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
public abstract class RunOnce {
    private final InterfaceC0049m didRun;
    private final InterfaceC0312a runMutex = new C0315d();

    /* JADX INFO: renamed from: androidx.datastore.core.RunOnce$runIfNeeded$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.RunOnce", m12159f = "DataStoreImpl.kt", m12160l = {544, 497}, m12161m = "runIfNeeded")
    public static final class C13341 extends AbstractC6373c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13341(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RunOnce.this.runIfNeeded(this);
        }
    }

    public RunOnce() {
        C0051n c0051n = new C0051n(true);
        c0051n.m47B(null);
        this.didRun = c0051n;
    }

    public final Object awaitComplete(InterfaceC6348c interfaceC6348c) {
        Object objM95Q = ((C0051n) this.didRun).m95Q(interfaceC6348c);
        return objM95Q == EnumC6363a.f24419s ? objM95Q : C6289k.f24318a;
    }

    public abstract Object doRun(InterfaceC6348c interfaceC6348c);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object runIfNeeded(InterfaceC6348c interfaceC6348c) throws Throwable {
        C13341 c13341;
        RunOnce runOnce;
        InterfaceC0312a interfaceC0312a;
        InterfaceC0312a interfaceC0312a2;
        Throwable th;
        RunOnce runOnce2;
        if (interfaceC6348c instanceof C13341) {
            c13341 = (C13341) interfaceC6348c;
            int i2 = c13341.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13341.label = i2 - Integer.MIN_VALUE;
            } else {
                c13341 = new C13341(interfaceC6348c);
            }
        } else {
            c13341 = new C13341(interfaceC6348c);
        }
        Object obj = c13341.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c13341.label;
        C6289k c6289k = C6289k.f24318a;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj);
                C0034e0 c0034e0 = (C0034e0) this.didRun;
                c0034e0.getClass();
                if (!(C0034e0.f43s.get(c0034e0) instanceof InterfaceC0018T)) {
                    return c6289k;
                }
                InterfaceC0312a interfaceC0312a3 = this.runMutex;
                c13341.L$0 = this;
                c13341.L$1 = interfaceC0312a3;
                c13341.label = 1;
                C0315d c0315d = (C0315d) interfaceC0312a3;
                if (c0315d.m462d(c13341) != enumC6363a) {
                    runOnce = this;
                    interfaceC0312a = c0315d;
                }
                return enumC6363a;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC0312a2 = (InterfaceC0312a) c13341.L$1;
                runOnce2 = (RunOnce) c13341.L$0;
                try {
                    AbstractC0243G.m377o(obj);
                    interfaceC0312a2 = interfaceC0312a2;
                    ((C0051n) runOnce2.didRun).m50E(c6289k);
                    ((C0315d) interfaceC0312a2).m464f(null);
                    return c6289k;
                } catch (Throwable th2) {
                    th = th2;
                    ((C0315d) interfaceC0312a2).m464f(null);
                    throw th;
                }
            }
            InterfaceC0312a interfaceC0312a4 = (InterfaceC0312a) c13341.L$1;
            runOnce = (RunOnce) c13341.L$0;
            AbstractC0243G.m377o(obj);
            interfaceC0312a = interfaceC0312a4;
            C0034e0 c0034e1 = (C0034e0) runOnce.didRun;
            c0034e1.getClass();
            if (!(C0034e0.f43s.get(c0034e1) instanceof InterfaceC0018T)) {
                ((C0315d) interfaceC0312a).m464f(null);
                return c6289k;
            }
            c13341.L$0 = runOnce;
            c13341.L$1 = interfaceC0312a;
            c13341.label = 2;
            if (runOnce.doRun(c13341) != enumC6363a) {
                interfaceC0312a2 = interfaceC0312a;
                runOnce2 = runOnce;
                ((C0051n) runOnce2.didRun).m50E(c6289k);
                ((C0315d) interfaceC0312a2).m464f(null);
                return c6289k;
            }
            return enumC6363a;
        } catch (Throwable th3) {
            interfaceC0312a2 = interfaceC0312a;
            th = th3;
            ((C0315d) interfaceC0312a2).m464f(null);
            throw th;
        }
    }
}
