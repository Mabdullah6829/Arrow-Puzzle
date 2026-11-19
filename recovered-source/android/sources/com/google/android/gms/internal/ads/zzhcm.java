package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhcm extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: s */
    public static final Runnable f18522s = new zzhcl();

    /* JADX INFO: renamed from: t */
    public static final Runnable f18523t = new zzhcl();

    /* JADX INFO: renamed from: a */
    public abstract Object mo7354a();

    /* JADX INFO: renamed from: b */
    public final void m7381b(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzhck zzhckVar = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            boolean z2 = runnable instanceof zzhck;
            Runnable runnable2 = f18523t;
            if (!z2) {
                if (runnable != runnable2) {
                    break;
                }
            } else {
                zzhckVar = (zzhck) runnable;
            }
            i2++;
            if (i2 <= 1000) {
                Thread.yield();
            } else if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                z = Thread.interrupted() || z;
                LockSupport.park(zzhckVar);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo7355c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo7357d();

    /* JADX INFO: renamed from: e */
    public abstract void mo7358e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract void mo7359f(Throwable th);

    /* JADX INFO: renamed from: g */
    public final void m7382g() {
        Runnable runnable = f18523t;
        Runnable runnable2 = f18522s;
        Runnable runnable3 = (Runnable) get();
        if (runnable3 instanceof Thread) {
            zzhck zzhckVar = new zzhck(this);
            zzhckVar.m7380a(Thread.currentThread());
            if (compareAndSet(runnable3, zzhckVar)) {
                try {
                    ((Thread) runnable3).interrupt();
                    if (((Runnable) getAndSet(runnable2)) == runnable) {
                    }
                } finally {
                    if (((Runnable) getAndSet(runnable2)) == runnable) {
                        LockSupport.unpark((Thread) runnable3);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objMo7354a = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zMo7357d = mo7357d();
            Runnable runnable = f18522s;
            if (!zMo7357d) {
                try {
                    objMo7354a = mo7354a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, runnable)) {
                            m7381b(threadCurrentThread);
                        }
                        mo7359f(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, runnable)) {
                            m7381b(threadCurrentThread);
                        }
                        mo7358e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnable)) {
                m7381b(threadCurrentThread);
            }
            if (zMo7357d) {
                return;
            }
            mo7358e(objMo7354a);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strM2450q;
        Runnable runnable = (Runnable) get();
        if (runnable == f18522s) {
            strM2450q = "running=[DONE]";
        } else if (runnable instanceof zzhck) {
            strM2450q = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strM2450q = "running=[NOT STARTED YET]";
        }
        String strMo7355c = mo7355c();
        return AbstractC1456a.m2450q(new StringBuilder(strM2450q.length() + 2 + String.valueOf(strMo7355c).length()), strM2450q, ", ", strMo7355c);
    }
}
