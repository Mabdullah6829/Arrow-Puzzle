package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6452k;
import p001B.C0092r;
import p006D0.InterfaceC0170e;
import p011H.AbstractC0243G;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessCoordinator implements InterProcessCoordinator {
    private final String filePath;
    private final InterfaceC0312a mutex;
    private final InterfaceC0170e updateNotifications;
    private final AtomicInt version;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessCoordinator$lock$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.SingleProcessCoordinator", m12159f = "SingleProcessCoordinator.kt", m12160l = {66, 41}, m12161m = "lock")
    public static final class C13371<T> extends AbstractC6373c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13371(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessCoordinator$tryLock$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.SingleProcessCoordinator", m12159f = "SingleProcessCoordinator.kt", m12160l = {50}, m12161m = "tryLock")
    public static final class C13381<T> extends AbstractC6373c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C13381(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.tryLock(null, this);
        }
    }

    public SingleProcessCoordinator(String filePath) {
        AbstractC6452k.m12181e(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = new C0315d();
        this.version = new AtomicInt(0);
        this.updateNotifications = new C0092r(new SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public InterfaceC0170e getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(InterfaceC6348c interfaceC6348c) {
        return new Integer(this.version.get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(InterfaceC6348c interfaceC6348c) {
        return new Integer(this.version.incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public <T> Object lock(InterfaceC6498l interfaceC6498l, InterfaceC6348c interfaceC6348c) throws Throwable {
        C13371 c13371;
        C0315d c0315d;
        InterfaceC0312a interfaceC0312a;
        Throwable th;
        InterfaceC0312a interfaceC0312a2;
        InterfaceC0312a interfaceC0312a3;
        if (interfaceC6348c instanceof C13371) {
            c13371 = (C13371) interfaceC6348c;
            int i2 = c13371.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13371.label = i2 - Integer.MIN_VALUE;
            } else {
                c13371 = new C13371(interfaceC6348c);
            }
        } else {
            c13371 = new C13371(interfaceC6348c);
        }
        Object obj = c13371.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c13371.label;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj);
                InterfaceC0312a interfaceC0312a4 = this.mutex;
                c13371.L$0 = interfaceC6498l;
                c13371.L$1 = interfaceC0312a4;
                c13371.label = 1;
                c0315d = (C0315d) interfaceC0312a4;
                if (c0315d.m462d(c13371) != enumC6363a) {
                }
                interfaceC0312a = c0315d;
                return enumC6363a;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC0312a2 = (InterfaceC0312a) c13371.L$0;
                try {
                    AbstractC0243G.m377o(obj);
                    interfaceC0312a3 = interfaceC0312a2;
                    ((C0315d) interfaceC0312a3).m464f(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    ((C0315d) interfaceC0312a2).m464f(null);
                    throw th;
                }
            }
            InterfaceC0312a interfaceC0312a5 = (InterfaceC0312a) c13371.L$1;
            InterfaceC6498l interfaceC6498l2 = (InterfaceC6498l) c13371.L$0;
            AbstractC0243G.m377o(obj);
            interfaceC0312a = interfaceC0312a5;
            interfaceC6498l = interfaceC6498l2;
            interfaceC0312a = c0315d;
            c13371.L$0 = interfaceC0312a;
            c13371.L$1 = null;
            c13371.label = 2;
            Object objInvoke = interfaceC6498l.invoke(c13371);
            if (objInvoke != enumC6363a) {
                InterfaceC0312a interfaceC0312a6 = interfaceC0312a;
                obj = objInvoke;
                interfaceC0312a3 = interfaceC0312a6;
                ((C0315d) interfaceC0312a3).m464f(null);
                return obj;
            }
            interfaceC0312a = c0315d;
            return enumC6363a;
        } catch (Throwable th3) {
            InterfaceC0312a interfaceC0312a7 = interfaceC0312a;
            th = th3;
            interfaceC0312a2 = interfaceC0312a7;
            ((C0315d) interfaceC0312a2).m464f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public <T> Object tryLock(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) throws Throwable {
        C13381 c13381;
        InterfaceC0312a interfaceC0312a;
        Throwable th;
        boolean z;
        if (interfaceC6348c instanceof C13381) {
            c13381 = (C13381) interfaceC6348c;
            int i2 = c13381.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13381.label = i2 - Integer.MIN_VALUE;
            } else {
                c13381 = new C13381(interfaceC6348c);
            }
        } else {
            c13381 = new C13381(interfaceC6348c);
        }
        Object obj = c13381.result;
        Object obj2 = EnumC6363a.f24419s;
        int i3 = c13381.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c13381.Z$0;
            interfaceC0312a = (InterfaceC0312a) c13381.L$0;
            try {
                AbstractC0243G.m377o(obj);
                if (z) {
                    ((C0315d) interfaceC0312a).m464f(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    ((C0315d) interfaceC0312a).m464f(null);
                }
                throw th;
            }
        }
        AbstractC0243G.m377o(obj);
        C0315d c0315d = (C0315d) this.mutex;
        boolean zM463e = c0315d.m463e(null);
        try {
            Object objValueOf = Boolean.valueOf(zM463e);
            c13381.L$0 = c0315d;
            c13381.Z$0 = zM463e;
            c13381.label = 1;
            Object objInvoke = interfaceC6502p.invoke(objValueOf, c13381);
            if (objInvoke == obj2) {
                return obj2;
            }
            interfaceC0312a = c0315d;
            obj = objInvoke;
            z = zM463e;
            if (z) {
                ((C0315d) interfaceC0312a).m464f(null);
            }
            return obj;
        } catch (Throwable th3) {
            interfaceC0312a = c0315d;
            th = th3;
            z = zM463e;
            if (z) {
                ((C0315d) interfaceC0312a).m464f(null);
            }
            throw th;
        }
    }
}
