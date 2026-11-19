package p006D0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6462u;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p001B.C0084j;
import p004C0.EnumC0136a;
import p008E0.AbstractC0205h;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p078p0.InterfaceC6503q;

/* JADX INFO: renamed from: D0.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0163C {

    /* JADX INFO: renamed from: a */
    public static final C0084j f291a = new C0084j("NONE", 1);

    /* JADX INFO: renamed from: b */
    public static final C0084j f292b = new C0084j("PENDING", 1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m259a(C0165E c0165e, InterfaceC6503q interfaceC6503q, Throwable th, AbstractC6373c abstractC6373c) throws Throwable {
        C0173h c0173h;
        if (abstractC6373c instanceof C0173h) {
            c0173h = (C0173h) abstractC6373c;
            int i2 = c0173h.f317u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0173h.f317u = i2 - Integer.MIN_VALUE;
            } else {
                c0173h = new C0173h(abstractC6373c);
            }
        } else {
            c0173h = new C0173h(abstractC6373c);
        }
        Object obj = c0173h.f316t;
        Object obj2 = EnumC6363a.f24419s;
        int i3 = c0173h.f317u;
        try {
            if (i3 == 0) {
                AbstractC0243G.m377o(obj);
                c0173h.f315s = th;
                c0173h.f317u = 1;
                if (interfaceC6503q.invoke(c0165e, th, c0173h) == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = c0173h.f315s;
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC0878a.m1796b(th2, th);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (r6.m67u().equals(r5) == false) goto L42;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m260b(p006D0.InterfaceC0170e r4, p006D0.InterfaceC0171f r5, p066i0.AbstractC6373c r6) {
        /*
            boolean r0 = r6 instanceof p006D0.C0179n
            if (r0 == 0) goto L13
            r0 = r6
            D0.n r0 = (p006D0.C0179n) r0
            int r1 = r0.f341u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f341u = r1
            goto L18
        L13:
            D0.n r0 = new D0.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f340t
            h0.a r1 = p064h0.EnumC6363a.f24419s
            int r2 = r0.f341u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.u r4 = r0.f339s
            p011H.AbstractC0243G.m377o(r6)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r5 = move-exception
            goto L4f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            p011H.AbstractC0243G.m377o(r6)
            kotlin.jvm.internal.u r6 = new kotlin.jvm.internal.u
            r6.<init>()
            D0.p r2 = new D0.p     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.f339s = r6     // Catch: java.lang.Throwable -> L4d
            r0.f341u = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r4 = 0
            return r4
        L4d:
            r5 = move-exception
            r4 = r6
        L4f:
            java.lang.Object r4 = r4.f24636s
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5b
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L8c
        L5b:
            g0.h r6 = r0.getContext()
            A0.u r0 = p000A0.C0065u.f80t
            g0.f r6 = r6.get(r0)
            A0.X r6 = (p000A0.InterfaceC0022X) r6
            if (r6 == 0) goto L8d
            A0.e0 r6 = (p000A0.C0034e0) r6
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000A0.C0034e0.f43s
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof p000A0.C0055p
            if (r1 != 0) goto L81
            boolean r1 = r0 instanceof p000A0.C0032d0
            if (r1 == 0) goto L8d
            A0.d0 r0 = (p000A0.C0032d0) r0
            boolean r0 = r0.m43e()
            if (r0 == 0) goto L8d
        L81:
            java.util.concurrent.CancellationException r6 = r6.m67u()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L8c
            goto L8d
        L8c:
            throw r5
        L8d:
            if (r4 != 0) goto L90
            return r5
        L90:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L98
            p043a.AbstractC0878a.m1796b(r4, r5)
            throw r4
        L98:
            p043a.AbstractC0878a.m1796b(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p006D0.AbstractC0163C.m260b(D0.e, D0.f, i0.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r2.emit(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0094 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m261c(p006D0.InterfaceC0171f r8, p004C0.C0151p r9, boolean r10, p066i0.AbstractC6373c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p006D0.AbstractC0163C.m261c(D0.f, C0.p, boolean, i0.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m262d(InterfaceC0170e interfaceC0170e, AbstractC6373c abstractC6373c) throws Throwable {
        C0187v c0187v;
        C6462u c6462u;
        AbortFlowException e;
        C0186u c0186u;
        if (abstractC6373c instanceof C0187v) {
            c0187v = (C0187v) abstractC6373c;
            int i2 = c0187v.f372v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0187v.f372v = i2 - Integer.MIN_VALUE;
            } else {
                c0187v = new C0187v(abstractC6373c);
            }
        } else {
            c0187v = new C0187v(abstractC6373c);
        }
        Object obj = c0187v.f371u;
        Object obj2 = EnumC6363a.f24419s;
        int i3 = c0187v.f372v;
        C0084j c0084j = AbstractC0205h.f407a;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            C6462u c6462u2 = new C6462u();
            c6462u2.f24636s = c0084j;
            C0186u c0186u2 = new C0186u(c6462u2, 0);
            try {
                c0187v.f369s = c6462u2;
                c0187v.f370t = c0186u2;
                c0187v.f372v = 1;
                if (interfaceC0170e.collect(c0186u2, c0187v) == obj2) {
                    return obj2;
                }
                c6462u = c6462u2;
            } catch (AbortFlowException e2) {
                c6462u = c6462u2;
                e = e2;
                c0186u = c0186u2;
                if (e.f24639s != c0186u) {
                    throw e;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0186u = c0187v.f370t;
            c6462u = c0187v.f369s;
            try {
                AbstractC0243G.m377o(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.f24639s != c0186u) {
                    throw e;
                }
            }
        }
        Object obj3 = c6462u.f24636s;
        if (obj3 != c0084j) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m263e(InterfaceC0170e interfaceC0170e, AbstractC6373c abstractC6373c) throws Throwable {
        C0188w c0188w;
        C6462u c6462u;
        AbortFlowException e;
        C0186u c0186u;
        if (abstractC6373c instanceof C0188w) {
            c0188w = (C0188w) abstractC6373c;
            int i2 = c0188w.f376v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0188w.f376v = i2 - Integer.MIN_VALUE;
            } else {
                c0188w = new C0188w(abstractC6373c);
            }
        } else {
            c0188w = new C0188w(abstractC6373c);
        }
        Object obj = c0188w.f375u;
        Object obj2 = EnumC6363a.f24419s;
        int i3 = c0188w.f376v;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            C6462u c6462u2 = new C6462u();
            C0186u c0186u2 = new C0186u(c6462u2, 1);
            try {
                c0188w.f373s = c6462u2;
                c0188w.f374t = c0186u2;
                c0188w.f376v = 1;
                if (interfaceC0170e.collect(c0186u2, c0188w) == obj2) {
                    return obj2;
                }
                c6462u = c6462u2;
            } catch (AbortFlowException e2) {
                c6462u = c6462u2;
                e = e2;
                c0186u = c0186u2;
                if (e.f24639s != c0186u) {
                    throw e;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0186u = c0188w.f374t;
            c6462u = c0188w.f373s;
            try {
                AbstractC0243G.m377o(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.f24639s != c0186u) {
                    throw e;
                }
            }
        }
        return c6462u.f24636s;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0170e m264f(InterfaceC0191z interfaceC0191z, InterfaceC6353h interfaceC6353h, int i2, EnumC0136a enumC0136a) {
        return ((((i2 < 0 || i2 >= 2) && i2 != -2) || enumC0136a != EnumC0136a.f216t) && !((i2 == 0 || i2 == -3) && enumC0136a == EnumC0136a.f215s)) ? new C0169d(interfaceC0191z, interfaceC6353h, i2, enumC0136a) : interfaceC0191z;
    }
}
