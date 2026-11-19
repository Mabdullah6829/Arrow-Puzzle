package p000A0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import p001B.AbstractC0076b;
import p001B.C0086l;
import p001B.C0087m;
import p002B0.C0104d;
import p010F0.C0220f;
import p011H.AbstractC0253Q;
import p011H.ExecutorC0273f0;
import p011H.InterfaceC0251O;
import p013I.AbstractC0311a;
import p032S.C0597a;
import p032S.C0598b;
import p032S.C0599c;
import p062g0.C6354i;

/* JADX INFO: renamed from: A0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0046k0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f57s;

    /* JADX INFO: renamed from: t */
    public final Object f58t;

    /* JADX INFO: renamed from: u */
    public Object f59u;

    public /* synthetic */ RunnableC0046k0(int i2, Object obj, Object obj2) {
        this.f57s = i2;
        this.f59u = obj;
        this.f58t = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f59u).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        p011H.ExecutorC0273f0.f529x.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f59u), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f59u = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m94a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f58t     // Catch: java.lang.Throwable -> L58
            H.f0 r2 = (p011H.ExecutorC0273f0) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f531t     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f58t     // Catch: java.lang.Throwable -> L20
            H.f0 r0 = (p011H.ExecutorC0273f0) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f532u     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f533v     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f533v = r6     // Catch: java.lang.Throwable -> L20
            r0.f532u = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f58t     // Catch: java.lang.Throwable -> L20
            H.f0 r4 = (p011H.ExecutorC0273f0) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f531t     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f59u = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f58t     // Catch: java.lang.Throwable -> L20
            H.f0 r0 = (p011H.ExecutorC0273f0) r0     // Catch: java.lang.Throwable -> L20
            r0.f532u = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f59u     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f59u = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = p011H.ExecutorC0273f0.f529x     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f59u     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f59u = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000A0.RunnableC0046k0.m94a():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thMo433a;
        switch (this.f57s) {
            case 0:
                ((C0039h) this.f58t).m77B((C0016Q) this.f59u);
                return;
            case 1:
                ((C0039h) this.f58t).m77B((C0104d) this.f59u);
                return;
            case 2:
                C0220f c0220f = (C0220f) this.f58t;
                AbstractC0063t abstractC0063t = c0220f.f441t;
                int i2 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f59u).run();
                    } catch (Throwable th) {
                        AbstractC0069y.m109h(C6354i.f24409s, th);
                    }
                    Runnable runnableM311j = c0220f.m311j();
                    if (runnableM311j == null) {
                        return;
                    }
                    this.f59u = runnableM311j;
                    i2++;
                    if (i2 >= 16 && abstractC0063t.isDispatchNeeded(c0220f)) {
                        abstractC0063t.dispatch(c0220f, this);
                        return;
                    }
                    break;
                }
                break;
            case 3:
                InterfaceC0251O interfaceC0251O = (InterfaceC0251O) this.f58t;
                ListenableFuture listenableFuture = (ListenableFuture) this.f59u;
                if ((listenableFuture instanceof AbstractC0311a) && (thMo433a = ((AbstractC0311a) listenableFuture).mo433a()) != null) {
                    interfaceC0251O.onFailure(thMo433a);
                    return;
                }
                try {
                    interfaceC0251O.onSuccess(AbstractC0253Q.m379b(listenableFuture));
                    return;
                } catch (Error e) {
                    e = e;
                    interfaceC0251O.onFailure(e);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    interfaceC0251O.onFailure(e);
                    return;
                } catch (ExecutionException e3) {
                    interfaceC0251O.onFailure(e3.getCause());
                    return;
                }
            case 4:
                try {
                    m94a();
                    return;
                } catch (Error e4) {
                    synchronized (((ExecutorC0273f0) this.f58t).f531t) {
                        ((ExecutorC0273f0) this.f58t).f532u = 1;
                        throw e4;
                    }
                }
            case 5:
                ((C0599c) this.f58t).f1317c.unregisterNetworkCallback((C0597a) this.f59u);
                return;
            default:
                ((C0599c) this.f58t).f1316b.unregisterReceiver((C0598b) this.f59u);
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f57s) {
            case 3:
                C0087m c0087mM143s = AbstractC0076b.m143s(this);
                InterfaceC0251O interfaceC0251O = (InterfaceC0251O) this.f58t;
                C0086l c0086l = new C0086l(0);
                c0087mM143s.f117c.f114v = c0086l;
                c0087mM143s.f117c = c0086l;
                c0086l.f113u = interfaceC0251O;
                return c0087mM143s.toString();
            case 4:
                Runnable runnable = (Runnable) this.f59u;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((ExecutorC0273f0) this.f58t).f532u;
                if (i2 == 1) {
                    str = "IDLE";
                } else if (i2 == 2) {
                    str = "QUEUING";
                } else if (i2 != 3) {
                    str = i2 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC0046k0(Object obj, Object obj2, int i2, boolean z) {
        this.f57s = i2;
        this.f58t = obj;
        this.f59u = obj2;
    }

    public RunnableC0046k0(ExecutorC0273f0 executorC0273f0) {
        this.f57s = 4;
        this.f58t = executorC0273f0;
    }
}
