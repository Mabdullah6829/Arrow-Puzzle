package p010F0;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import p000A0.AbstractC0014O;
import p000A0.AbstractC0054o0;
import p000A0.AbstractC0063t;
import p000A0.AbstractC0069y;
import p000A0.C0034e0;
import p000A0.C0055p;
import p000A0.C0057q;
import p000A0.C0060r0;
import p000A0.C0065u;
import p000A0.InterfaceC0022X;
import p000A0.InterfaceC0052n0;
import p001B.C0084j;
import p002B0.C0102b;
import p011H.AbstractC0242F;
import p011H.AbstractC0243G;
import p011H.AbstractC0271e0;
import p043a.AbstractC0878a;
import p057d0.AbstractC6285g;
import p058e0.C6301i;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: F0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0215a {

    /* JADX INFO: renamed from: a */
    public static final C0084j f423a = new C0084j("CLOSED", 1);

    /* JADX INFO: renamed from: b */
    public static final C0084j f424b = new C0084j("UNDEFINED", 1);

    /* JADX INFO: renamed from: c */
    public static final C0084j f425c = new C0084j("REUSABLE_CLAIMED", 1);

    /* JADX INFO: renamed from: d */
    public static final C0084j f426d = new C0084j("NO_THREAD_ELEMENTS", 1);

    /* JADX INFO: renamed from: e */
    public static final C0057q f427e = new C0057q(4);

    /* JADX INFO: renamed from: f */
    public static final C0057q f428f = new C0057q(5);

    /* JADX INFO: renamed from: g */
    public static final C0057q f429g = new C0057q(6);

    /* JADX INFO: renamed from: a */
    public static final void m295a(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "Expected positive parallelism level, but got ").toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m296b(AbstractC0232r abstractC0232r, long j2, InterfaceC6502p interfaceC6502p) {
        while (true) {
            if (abstractC0232r.f466c >= j2 && !abstractC0232r.mo309c()) {
                return abstractC0232r;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0216b.f430a;
            Object obj = atomicReferenceFieldUpdater.get(abstractC0232r);
            C0084j c0084j = f423a;
            if (obj == c0084j) {
                return c0084j;
            }
            AbstractC0232r abstractC0232r2 = (AbstractC0232r) ((AbstractC0216b) obj);
            if (abstractC0232r2 == null) {
                abstractC0232r2 = (AbstractC0232r) interfaceC6502p.invoke(Long.valueOf(abstractC0232r.f466c + 1), abstractC0232r);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC0232r, null, abstractC0232r2)) {
                        if (abstractC0232r.mo309c()) {
                            abstractC0232r.m310d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC0232r) == null);
            }
            abstractC0232r = abstractC0232r2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC0232r m297c(Object obj) {
        if (obj != f423a) {
            return (AbstractC0232r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* JADX INFO: renamed from: d */
    public static final void m298d(InterfaceC6353h interfaceC6353h, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC0218d.f433a.iterator();
        while (it.hasNext()) {
            try {
                ((C0102b) it.next()).m171j(th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0878a.m1796b(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC0878a.m1796b(th, new DiagnosticCoroutineContextException(interfaceC6353h));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m299e(Object obj) {
        return obj == f423a;
    }

    /* JADX INFO: renamed from: f */
    public static final Object m300f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static final void m301g(InterfaceC6353h interfaceC6353h, Object obj) {
        if (obj == f426d) {
            return;
        }
        if (!(obj instanceof C0236v)) {
            Object objFold = interfaceC6353h.fold(null, f428f);
            AbstractC6452k.m12179c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC1456a.m2454u(objFold);
            throw null;
        }
        C0236v c0236v = (C0236v) obj;
        InterfaceC0052n0[] interfaceC0052n0Arr = c0236v.f472b;
        int length = interfaceC0052n0Arr.length - 1;
        if (length < 0) {
            return;
        }
        InterfaceC0052n0 interfaceC0052n0 = interfaceC0052n0Arr[length];
        AbstractC6452k.m12178b(null);
        Object obj2 = c0236v.f471a[length];
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static final void m302h(InterfaceC6348c interfaceC6348c, Object obj) {
        if (!(interfaceC6348c instanceof C0219e)) {
            interfaceC6348c.resumeWith(obj);
            return;
        }
        C0219e c0219e = (C0219e) interfaceC6348c;
        AbstractC0063t abstractC0063t = c0219e.f435v;
        Throwable thM12075a = AbstractC6285g.m12075a(obj);
        Object c0055p = thM12075a == null ? obj : new C0055p(false, thM12075a);
        InterfaceC6348c interfaceC6348c2 = c0219e.f436w;
        if (abstractC0063t.isDispatchNeeded(interfaceC6348c2.getContext())) {
            c0219e.f437x = c0055p;
            c0219e.f2u = 1;
            abstractC0063t.dispatch(interfaceC6348c2.getContext(), c0219e);
            return;
        }
        AbstractC0014O abstractC0014OM97a = AbstractC0054o0.m97a();
        if (abstractC0014OM97a.f15s >= 4294967296L) {
            c0219e.f437x = c0055p;
            c0219e.f2u = 1;
            C6301i c6301i = abstractC0014OM97a.f17u;
            if (c6301i == null) {
                c6301i = new C6301i();
                abstractC0014OM97a.f17u = c6301i;
            }
            c6301i.addLast(c0219e);
            return;
        }
        abstractC0014OM97a.m22n(true);
        try {
            InterfaceC0022X interfaceC0022X = (InterfaceC0022X) interfaceC6348c2.getContext().get(C0065u.f80t);
            if (interfaceC0022X == null || interfaceC0022X.mo28c()) {
                Object obj2 = c0219e.f438y;
                InterfaceC6353h context = interfaceC6348c2.getContext();
                Object objM306l = m306l(context, obj2);
                C0060r0 c0060r0M118q = objM306l != f426d ? AbstractC0069y.m118q(interfaceC6348c2, context, objM306l) : null;
                try {
                    interfaceC6348c2.resumeWith(obj);
                    if (c0060r0M118q == null || c0060r0M118q.m100T()) {
                        m301g(context, objM306l);
                    }
                } catch (Throwable th) {
                    if (c0060r0M118q == null || c0060r0M118q.m100T()) {
                        m301g(context, objM306l);
                    }
                    throw th;
                }
            } else {
                c0219e.resumeWith(AbstractC0243G.m372j(((C0034e0) interfaceC0022X).m67u()));
            }
            while (abstractC0014OM97a.m23p()) {
            }
        } catch (Throwable th2) {
            try {
                c0219e.m8g(th2);
            } finally {
                abstractC0014OM97a.m20j(true);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static final long m303i(long j2, long j3, long j4, String str) {
        String property;
        boolean z;
        String str2;
        Long lValueOf;
        int i2 = AbstractC0234t.f468a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        AbstractC6452k.m12181e(property, "<this>");
        AbstractC0242F.m346a(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
        } else {
            int i3 = 0;
            char cCharAt = property.charAt(0);
            long j5 = -9223372036854775807L;
            if (AbstractC6452k.m12182f(cCharAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (cCharAt != '+') {
                        if (cCharAt == '-') {
                            j5 = Long.MIN_VALUE;
                            i3 = 1;
                        }
                        lValueOf = null;
                    } else {
                        z = false;
                        i3 = 1;
                    }
                }
                str2 = property;
                lValueOf = null;
            } else {
                z = false;
            }
            long j6 = 0;
            long j7 = -256204778801521550L;
            while (true) {
                if (i3 >= length) {
                    str2 = property;
                    lValueOf = z ? Long.valueOf(j6) : Long.valueOf(-j6);
                } else {
                    int iDigit = Character.digit((int) property.charAt(i3), 10);
                    if (iDigit >= 0) {
                        if (j6 < j7) {
                            if (j7 == -256204778801521550L) {
                                str2 = property;
                                j7 = j5 / ((long) 10);
                                if (j6 < j7) {
                                }
                            }
                            lValueOf = null;
                        } else {
                            str2 = property;
                        }
                        long j8 = j6 * ((long) 10);
                        long j9 = iDigit;
                        if (j8 < j5 + j9) {
                            lValueOf = null;
                        } else {
                            j6 = j8 - j9;
                            i3++;
                            property = str2;
                        }
                    }
                    str2 = property;
                    lValueOf = null;
                }
            }
        }
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j3);
        AbstractC1456a.m2456w(sb, "..", j4, ", but is '");
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: j */
    public static int m304j(int i2, int i3, String str) {
        return (int) m303i(i2, 1, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    /* JADX INFO: renamed from: k */
    public static final Object m305k(InterfaceC6353h interfaceC6353h) {
        Object objFold = interfaceC6353h.fold(0, f427e);
        AbstractC6452k.m12178b(objFold);
        return objFold;
    }

    /* JADX INFO: renamed from: l */
    public static final Object m306l(InterfaceC6353h interfaceC6353h, Object obj) {
        if (obj == null) {
            obj = m305k(interfaceC6353h);
        }
        if (obj == 0) {
            return f426d;
        }
        if (obj instanceof Integer) {
            return interfaceC6353h.fold(new C0236v(((Number) obj).intValue(), interfaceC6353h), f429g);
        }
        AbstractC1456a.m2454u(obj);
        throw null;
    }
}
