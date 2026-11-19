package p011H;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p001B.AbstractC0076b;
import p001B.InterfaceC0082h;

/* JADX INFO: renamed from: H.Q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0253Q {
    /* JADX INFO: renamed from: a */
    public static C0262a m378a(ListenableFuture listenableFuture, Class cls, InterfaceC0238B interfaceC0238B, Executor executor) {
        int i2 = AbstractRunnableC0266c.f515D;
        C0262a c0262a = new C0262a(listenableFuture, cls, interfaceC0238B);
        listenableFuture.addListener(c0262a, AbstractC0243G.m375m(executor, c0262a));
        return c0262a;
    }

    /* JADX INFO: renamed from: b */
    public static Object m379b(Future future) {
        Object obj;
        AbstractC0076b.m137l("Future was expected to be done: %s", future.isDone(), future);
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static C0255T m380c(Exception exc) {
        C0255T c0255t = new C0255T();
        c0255t.m438m(exc);
        return c0255t;
    }

    /* JADX INFO: renamed from: d */
    public static C0256U m381d(Object obj) {
        return obj == null ? C0256U.f504t : new C0256U(obj);
    }

    /* JADX INFO: renamed from: e */
    public static ListenableFuture m382e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        RunnableC0252P runnableC0252P = new RunnableC0252P();
        runnableC0252P.f502z = listenableFuture;
        listenableFuture.addListener(runnableC0252P, EnumC0244H.f483s);
        return runnableC0252P;
    }

    /* JADX INFO: renamed from: f */
    public static C0292u m383f(ListenableFuture listenableFuture, InterfaceC0082h interfaceC0082h, Executor executor) {
        int i2 = AbstractRunnableC0293v.f570C;
        interfaceC0082h.getClass();
        C0292u c0292u = new C0292u(listenableFuture, interfaceC0082h);
        listenableFuture.addListener(c0292u, AbstractC0243G.m375m(executor, c0292u));
        return c0292u;
    }

    /* JADX INFO: renamed from: g */
    public static C0291t m384g(ListenableFuture listenableFuture, InterfaceC0238B interfaceC0238B, Executor executor) {
        int i2 = AbstractRunnableC0293v.f570C;
        executor.getClass();
        C0291t c0291t = new C0291t(listenableFuture, interfaceC0238B);
        listenableFuture.addListener(c0291t, AbstractC0243G.m375m(executor, c0291t));
        return c0291t;
    }
}
