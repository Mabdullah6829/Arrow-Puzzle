package p011H;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p003C.AbstractC0109D;
import p003C.AbstractC0111b;

/* JADX INFO: renamed from: H.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C0241E extends AbstractC0297z {

    /* JADX INFO: renamed from: G */
    public static final Logger f478G = Logger.getLogger(C0241E.class.getName());

    /* JADX INFO: renamed from: D */
    public AbstractC0111b f479D;

    /* JADX INFO: renamed from: E */
    public final boolean f480E;

    /* JADX INFO: renamed from: F */
    public C0240D f481F;

    public C0241E(AbstractC0111b abstractC0111b, boolean z) {
        int size = abstractC0111b.size();
        this.f581z = null;
        this.f580A = size;
        this.f479D = abstractC0111b;
        this.f480E = z;
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: c */
    public final void mo340c() {
        AbstractC0111b abstractC0111b = this.f479D;
        this.f479D = null;
        this.f481F = null;
        if ((this.f567s instanceof C0268d) && (abstractC0111b != null)) {
            boolean zM440o = m440o();
            AbstractC0109D it = abstractC0111b.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zM440o);
            }
        }
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: i */
    public final void mo341i() {
        C0240D c0240d = this.f481F;
        if (c0240d != null) {
            c0240d.m386c();
        }
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: j */
    public final String mo342j() {
        AbstractC0111b abstractC0111b = this.f479D;
        if (abstractC0111b == null) {
            return super.mo342j();
        }
        return "futures=" + abstractC0111b;
    }

    /* JADX INFO: renamed from: p */
    public final void m343p(AbstractC0111b abstractC0111b) {
        int iMo362g = AbstractC0297z.f578B.mo362g(this);
        AbstractC0076b.m139n(iMo362g >= 0, "Less than 0 remaining futures");
        if (iMo362g == 0) {
            if (abstractC0111b != null) {
                AbstractC0109D it = abstractC0111b.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            AbstractC0253Q.m379b(future);
                        } catch (Error e) {
                            e = e;
                            m344q(e);
                        } catch (RuntimeException e2) {
                            e = e2;
                            m344q(e);
                        } catch (ExecutionException e3) {
                            m344q(e3.getCause());
                        }
                    }
                }
            }
            this.f581z = null;
            C0240D c0240d = this.f481F;
            if (c0240d != null) {
                try {
                    c0240d.f473u.execute(c0240d);
                } catch (RejectedExecutionException e4) {
                    c0240d.f474v.m438m(e4);
                }
            }
            this.f479D = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m344q(Throwable th) {
        th.getClass();
        if (this.f480E && !m438m(th)) {
            Set set = this.f581z;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f567s instanceof C0268d)) {
                    Throwable thMo433a = mo433a();
                    Objects.requireNonNull(thMo433a);
                    while (thMo433a != null && setNewSetFromMap.add(thMo433a)) {
                        thMo433a = thMo433a.getCause();
                    }
                }
                AbstractC0297z.f578B.mo361e(this, setNewSetFromMap);
                set = this.f581z;
                Objects.requireNonNull(set);
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    f478G.log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        boolean z = th instanceof Error;
        if (z) {
            f478G.log(Level.SEVERE, z ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m345r() {
        Objects.requireNonNull(this.f479D);
        if (this.f479D.isEmpty()) {
            C0240D c0240d = this.f481F;
            if (c0240d != null) {
                try {
                    c0240d.f473u.execute(c0240d);
                    return;
                } catch (RejectedExecutionException e) {
                    c0240d.f474v.m438m(e);
                    return;
                }
            }
            return;
        }
        boolean z = this.f480E;
        EnumC0244H enumC0244H = EnumC0244H.f483s;
        if (!z) {
            RunnableC0294w runnableC0294w = new RunnableC0294w(1, this, (Object) null);
            AbstractC0109D it = this.f479D.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).addListener(runnableC0294w, enumC0244H);
            }
            return;
        }
        AbstractC0109D it2 = this.f479D.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            listenableFuture.addListener(new RunnableC0294w(this, listenableFuture, i2), enumC0244H);
            i2++;
        }
    }
}
