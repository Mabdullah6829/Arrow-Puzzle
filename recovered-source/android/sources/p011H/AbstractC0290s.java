package p011H;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.AbstractC0089o;
import p013I.AbstractC0311a;
import p043a.AbstractC0878a;

/* JADX INFO: renamed from: H.s */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0290s extends AbstractC0311a implements ListenableFuture {

    /* JADX INFO: renamed from: v */
    public static final boolean f563v;

    /* JADX INFO: renamed from: w */
    public static final Logger f564w;

    /* JADX INFO: renamed from: x */
    public static final AbstractC0878a f565x;

    /* JADX INFO: renamed from: y */
    public static final Object f566y;

    /* JADX INFO: renamed from: s */
    public volatile Object f567s;

    /* JADX INFO: renamed from: t */
    public volatile C0274g f568t;

    /* JADX INFO: renamed from: u */
    public volatile C0289r f569u;

    static {
        boolean z;
        Throwable th;
        AbstractC0878a c0280j;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f563v = z;
        f564w = Logger.getLogger(AbstractC0290s.class.getName());
        Throwable th2 = null;
        try {
            c0280j = new C0288q();
            th = null;
        } catch (Error | RuntimeException e) {
            th = e;
            try {
                c0280j = new C0276h(AtomicReferenceFieldUpdater.newUpdater(C0289r.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0289r.class, C0289r.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0290s.class, C0289r.class, "u"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0290s.class, C0274g.class, "t"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0290s.class, Object.class, "s"));
            } catch (Error | RuntimeException e2) {
                th2 = e2;
                c0280j = new C0280j();
            }
        }
        f565x = c0280j;
        if (th2 != null) {
            Logger logger = f564w;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        f566y = new Object();
    }

    /* JADX INFO: renamed from: e */
    public static void m429e(AbstractC0290s abstractC0290s, boolean z) {
        C0274g c0274g = null;
        while (true) {
            for (C0289r c0289rMo422j = f565x.mo422j(abstractC0290s); c0289rMo422j != null; c0289rMo422j = c0289rMo422j.f562b) {
                Thread thread = c0289rMo422j.f561a;
                if (thread != null) {
                    c0289rMo422j.f561a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractC0290s.mo341i();
                z = false;
            }
            abstractC0290s.mo340c();
            C0274g c0274g2 = c0274g;
            C0274g c0274gMo421i = f565x.mo421i(abstractC0290s);
            C0274g c0274g3 = c0274g2;
            while (c0274gMo421i != null) {
                C0274g c0274g4 = c0274gMo421i.f538c;
                c0274gMo421i.f538c = c0274g3;
                c0274g3 = c0274gMo421i;
                c0274gMo421i = c0274g4;
            }
            while (c0274g3 != null) {
                c0274g = c0274g3.f538c;
                Runnable runnable = c0274g3.f536a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC0278i) {
                    RunnableC0278i runnableC0278i = (RunnableC0278i) runnable;
                    abstractC0290s = runnableC0278i.f548s;
                    if (abstractC0290s.f567s == runnableC0278i) {
                        if (f565x.mo419d(abstractC0290s, runnableC0278i, m432h(runnableC0278i.f549t))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c0274g3.f537b;
                    Objects.requireNonNull(executor);
                    m430f(runnable, executor);
                }
                c0274g3 = c0274g;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m430f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f564w.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m431g(Object obj) throws ExecutionException {
        if (obj instanceof C0268d) {
            Throwable th = ((C0268d) obj).f524b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0272f) {
            throw new ExecutionException(((C0272f) obj).f528a);
        }
        if (obj == f566y) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static Object m432h(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thMo433a;
        if (listenableFuture instanceof InterfaceC0282k) {
            Object c0268d = ((AbstractC0290s) listenableFuture).f567s;
            if (c0268d instanceof C0268d) {
                C0268d c0268d2 = (C0268d) c0268d;
                if (c0268d2.f523a) {
                    c0268d = c0268d2.f524b != null ? new C0268d(false, c0268d2.f524b) : C0268d.f522d;
                }
            }
            Objects.requireNonNull(c0268d);
            return c0268d;
        }
        if ((listenableFuture instanceof AbstractC0311a) && (thMo433a = ((AbstractC0311a) listenableFuture).mo433a()) != null) {
            return new C0272f(thMo433a);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!f563v) && zIsCancelled) {
            C0268d c0268d3 = C0268d.f522d;
            Objects.requireNonNull(c0268d3);
            return c0268d3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new C0272f(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | RuntimeException e2) {
                e = e2;
                return new C0272f(e);
            } catch (CancellationException e3) {
                if (zIsCancelled) {
                    return new C0268d(false, e3);
                }
                return new C0272f(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e3));
            } catch (ExecutionException e4) {
                if (!zIsCancelled) {
                    return new C0272f(e4.getCause());
                }
                return new C0268d(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e4));
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? f566y : obj;
        }
        return new C0268d(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
    }

    @Override // p013I.AbstractC0311a
    /* JADX INFO: renamed from: a */
    public final Throwable mo433a() {
        if (!(this instanceof InterfaceC0282k)) {
            return null;
        }
        Object obj = this.f567s;
        if (obj instanceof C0272f) {
            return ((C0272f) obj).f528a;
        }
        return null;
    }

    public void addListener(Runnable runnable, Executor executor) {
        C0274g c0274g;
        C0274g c0274g2 = C0274g.f535d;
        AbstractC0076b.m133h(runnable, "Runnable was null.");
        AbstractC0076b.m133h(executor, "Executor was null.");
        if (!isDone() && (c0274g = this.f568t) != c0274g2) {
            C0274g c0274g3 = new C0274g(runnable, executor);
            do {
                c0274g3.f538c = c0274g;
                if (f565x.mo418c(this, c0274g, c0274g3)) {
                    return;
                } else {
                    c0274g = this.f568t;
                }
            } while (c0274g != c0274g2);
        }
        m430f(runnable, executor);
    }

    /* JADX INFO: renamed from: b */
    public final void m434b(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        m435d(obj, sb);
        sb.append("]");
    }

    public boolean cancel(boolean z) {
        C0268d c0268d;
        Object obj = this.f567s;
        if (!(obj == null) && !(obj instanceof RunnableC0278i)) {
            return false;
        }
        if (f563v) {
            c0268d = new C0268d(z, new CancellationException("Future.cancel() was called."));
        } else {
            c0268d = z ? C0268d.f521c : C0268d.f522d;
            Objects.requireNonNull(c0268d);
        }
        AbstractC0290s abstractC0290s = this;
        boolean z2 = false;
        while (true) {
            if (f565x.mo419d(abstractC0290s, obj, c0268d)) {
                m429e(abstractC0290s, z);
                if (obj instanceof RunnableC0278i) {
                    ListenableFuture listenableFuture = ((RunnableC0278i) obj).f549t;
                    if (listenableFuture instanceof InterfaceC0282k) {
                        abstractC0290s = (AbstractC0290s) listenableFuture;
                        obj = abstractC0290s.f567s;
                        if ((obj == null) | (obj instanceof RunnableC0278i)) {
                            z2 = true;
                        }
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = abstractC0290s.f567s;
            if (!(obj instanceof RunnableC0278i)) {
                return z2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m435d(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j3;
        C0289r c0289r = C0289r.f560c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f567s;
        if ((obj != null) && (!(obj instanceof RunnableC0278i))) {
            return m431g(obj);
        }
        long j4 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0289r c0289r2 = this.f569u;
            if (c0289r2 != c0289r) {
                C0289r c0289r3 = new C0289r();
                z = true;
                while (true) {
                    AbstractC0878a abstractC0878a = f565x;
                    abstractC0878a.mo423p(c0289r3, c0289r2);
                    if (abstractC0878a.mo420e(this, c0289r2, c0289r3)) {
                        j3 = j4;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m436k(c0289r3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f567s;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC0278i))) {
                                return m431g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m436k(c0289r3);
                        break;
                    }
                    long j5 = j4;
                    c0289r2 = this.f569u;
                    if (c0289r2 != c0289r) {
                        j4 = j5;
                    }
                }
            }
            Object obj3 = this.f567s;
            Objects.requireNonNull(obj3);
            return m431g(obj3);
        }
        z = true;
        j3 = 0;
        while (nanos > j3) {
            Object obj4 = this.f567s;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof RunnableC0278i))) {
                return m431g(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strM414v = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j3) {
            String strM414v2 = AbstractC0271e0.m414v(strM414v, " (plus ");
            long j6 = -nanos;
            long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j3 || nanos2 > 1000) ? z : false;
            if (jConvert > j3) {
                String strM414v3 = strM414v2 + jConvert + " " + lowerCase;
                if (z2) {
                    strM414v3 = AbstractC0271e0.m414v(strM414v3, ",");
                }
                strM414v2 = AbstractC0271e0.m414v(strM414v3, " ");
            }
            if (z2) {
                strM414v2 = strM414v2 + nanos2 + " nanoseconds ";
            }
            strM414v = AbstractC0271e0.m414v(strM414v2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0271e0.m414v(strM414v, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC0271e0.m415w(strM414v, " for ", string));
    }

    public boolean isCancelled() {
        return this.f567s instanceof C0268d;
    }

    public boolean isDone() {
        Object obj = this.f567s;
        return (!(obj instanceof RunnableC0278i)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public String mo342j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: k */
    public final void m436k(C0289r c0289r) {
        c0289r.f561a = null;
        while (true) {
            C0289r c0289r2 = this.f569u;
            if (c0289r2 == C0289r.f560c) {
                return;
            }
            C0289r c0289r3 = null;
            while (c0289r2 != null) {
                C0289r c0289r4 = c0289r2.f562b;
                if (c0289r2.f561a != null) {
                    c0289r3 = c0289r2;
                } else if (c0289r3 != null) {
                    c0289r3.f562b = c0289r4;
                    if (c0289r3.f561a == null) {
                    }
                } else if (!f565x.mo420e(this, c0289r2, c0289r4)) {
                }
                c0289r2 = c0289r4;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m437l(Object obj) {
        if (obj == null) {
            obj = f566y;
        }
        if (!f565x.mo419d(this, null, obj)) {
            return false;
        }
        m429e(this, false);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m438m(Throwable th) {
        th.getClass();
        if (!f565x.mo419d(this, null, new C0272f(th))) {
            return false;
        }
        m429e(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX INFO: renamed from: n */
    public boolean m439n(ListenableFuture listenableFuture) {
        C0272f c0272f;
        listenableFuture.getClass();
        Object obj = this.f567s;
        if (obj != null) {
            if (obj instanceof C0268d) {
                listenableFuture.cancel(((C0268d) obj).f523a);
            }
        } else if (listenableFuture.isDone()) {
            if (f565x.mo419d(this, null, m432h(listenableFuture))) {
                m429e(this, false);
                return true;
            }
        } else {
            RunnableC0278i runnableC0278i = new RunnableC0278i(this, listenableFuture);
            if (f565x.mo419d(this, null, runnableC0278i)) {
                try {
                    listenableFuture.addListener(runnableC0278i, EnumC0244H.f483s);
                    return true;
                } catch (Error | RuntimeException e) {
                    try {
                        c0272f = new C0272f(e);
                    } catch (Error | RuntimeException unused) {
                        c0272f = C0272f.f527b;
                    }
                    f565x.mo419d(this, runnableC0278i, c0272f);
                    return true;
                }
            }
            obj = this.f567s;
            if (obj instanceof C0268d) {
                listenableFuture.cancel(((C0268d) obj).f523a);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m440o() {
        Object obj = this.f567s;
        return (obj instanceof C0268d) && ((C0268d) obj).f523a;
    }

    public String toString() {
        String strMo342j;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m434b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f567s;
            if (obj instanceof RunnableC0278i) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((RunnableC0278i) obj).f549t;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (RuntimeException e) {
                    e = e;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strMo342j = mo342j();
                    if (AbstractC0089o.m161a(strMo342j)) {
                        strMo342j = null;
                    }
                } catch (RuntimeException | StackOverflowError e3) {
                    strMo342j = "Exception thrown from implementation: " + e3.getClass();
                }
                if (strMo342j != null) {
                    sb.append(", info=[");
                    sb.append(strMo342j);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m434b(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public void mo340c() {
    }

    /* JADX INFO: renamed from: i */
    public void mo341i() {
    }

    public Object get() throws InterruptedException {
        Object obj;
        C0289r c0289r = C0289r.f560c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f567s;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC0278i))) {
                return m431g(obj2);
            }
            C0289r c0289r2 = this.f569u;
            if (c0289r2 != c0289r) {
                C0289r c0289r3 = new C0289r();
                do {
                    AbstractC0878a abstractC0878a = f565x;
                    abstractC0878a.mo423p(c0289r3, c0289r2);
                    if (abstractC0878a.mo420e(this, c0289r2, c0289r3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f567s;
                            } else {
                                m436k(c0289r3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC0278i))));
                        return m431g(obj);
                    }
                    c0289r2 = this.f569u;
                } while (c0289r2 != c0289r);
            }
            Object obj3 = this.f567s;
            Objects.requireNonNull(obj3);
            return m431g(obj3);
        }
        throw new InterruptedException();
    }
}
