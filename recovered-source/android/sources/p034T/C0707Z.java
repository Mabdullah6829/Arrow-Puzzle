package p034T;

import java.util.ArrayList;
import java.util.List;
import p001B.AbstractC0076b;
import p030R.C0546b;
import p030R.C0559h0;
import p030R.C0588w;
import p030R.C0589w0;
import p030R.C0592y;
import p030R.InterfaceC0574p;
import p041Y.C0873a;

/* JADX INFO: renamed from: T.Z */
/* JADX INFO: loaded from: classes.dex */
public class C0707Z implements InterfaceC0806z {

    /* JADX INFO: renamed from: a */
    public volatile boolean f1644a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0636B f1645b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0806z f1646c;

    /* JADX INFO: renamed from: d */
    public C0589w0 f1647d;

    /* JADX INFO: renamed from: f */
    public C0704Y f1649f;

    /* JADX INFO: renamed from: g */
    public long f1650g;

    /* JADX INFO: renamed from: h */
    public long f1651h;

    /* JADX INFO: renamed from: e */
    public List f1648e = new ArrayList();

    /* JADX INFO: renamed from: i */
    public ArrayList f1652i = new ArrayList();

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: a */
    public final void mo1539a(InterfaceC0574p interfaceC0574p) {
        AbstractC0076b.m139n(this.f1645b == null, "May only be called before start");
        this.f1652i.add(new RunnableC0666L(6, this, interfaceC0574p));
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: b */
    public final void mo1540b(boolean z) {
        AbstractC0076b.m139n(this.f1645b != null, "May only be called after start");
        if (this.f1644a) {
            this.f1646c.mo1540b(z);
        } else {
            m1578n(new RunnableC0669M(this, z, 1));
        }
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: c */
    public final void mo1541c(int i2) {
        AbstractC0076b.m139n(this.f1645b == null, "May only be called before start");
        this.f1652i.add(new RunnableC0698W(this, i2, 2));
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: d */
    public final void mo1542d() {
        AbstractC0076b.m139n(this.f1645b != null, "May only be called after start");
        m1578n(new RunnableC0701X(this, 3));
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: e */
    public void mo1543e(C0783s0 c0783s0) {
        synchronized (this) {
            try {
                if (this.f1645b == null) {
                    return;
                }
                if (this.f1646c != null) {
                    c0783s0.m1659c(Long.valueOf(this.f1651h - this.f1650g), "buffered_nanos");
                    this.f1646c.mo1543e(c0783s0);
                } else {
                    c0783s0.m1659c(Long.valueOf(System.nanoTime() - this.f1650g), "buffered_nanos");
                    c0783s0.f2033b.add("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: f */
    public final void mo1544f(int i2) {
        AbstractC0076b.m139n(this.f1645b != null, "May only be called after start");
        if (this.f1644a) {
            this.f1646c.mo1544f(i2);
        } else {
            m1578n(new RunnableC0698W(this, i2, 0));
        }
    }

    @Override // p034T.InterfaceC0781r2
    public final void flush() {
        AbstractC0076b.m139n(this.f1645b != null, "May only be called after start");
        if (this.f1644a) {
            this.f1646c.flush();
        } else {
            m1578n(new RunnableC0701X(this, 2));
        }
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: g */
    public final void mo1545g(int i2) {
        AbstractC0076b.m139n(this.f1645b == null, "May only be called before start");
        this.f1652i.add(new RunnableC0698W(this, i2, 1));
    }

    @Override // p034T.InterfaceC0806z
    public final C0546b getAttributes() {
        InterfaceC0806z interfaceC0806z;
        synchronized (this) {
            interfaceC0806z = this.f1646c;
        }
        return interfaceC0806z != null ? interfaceC0806z.getAttributes() : C0546b.f1154b;
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: h */
    public final void mo1546h(C0588w c0588w) {
        AbstractC0076b.m139n(this.f1645b == null, "May only be called before start");
        this.f1652i.add(new RunnableC0666L(8, this, c0588w));
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: i */
    public final void mo1547i(C0592y c0592y) {
        AbstractC0076b.m139n(this.f1645b == null, "May only be called before start");
        AbstractC0076b.m133h(c0592y, "decompressorRegistry");
        this.f1652i.add(new RunnableC0666L(7, this, c0592y));
    }

    @Override // p034T.InterfaceC0781r2
    public final boolean isReady() {
        if (this.f1644a) {
            return this.f1646c.isReady();
        }
        return false;
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: j */
    public void mo1548j(C0589w0 c0589w0) {
        boolean z = false;
        boolean z2 = true;
        AbstractC0076b.m139n(this.f1645b != null, "May only be called after start");
        AbstractC0076b.m133h(c0589w0, "reason");
        synchronized (this) {
            try {
                InterfaceC0806z interfaceC0806z = this.f1646c;
                if (interfaceC0806z == null) {
                    C0776q1 c0776q1 = C0776q1.f2018a;
                    if (interfaceC0806z != null) {
                        z2 = false;
                    }
                    AbstractC0076b.m137l("realStream already set to %s", z2, interfaceC0806z);
                    this.f1646c = c0776q1;
                    this.f1651h = System.nanoTime();
                    this.f1647d = c0589w0;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m1578n(new RunnableC0666L(10, this, c0589w0));
            return;
        }
        m1579o();
        mo1561q(c0589w0);
        this.f1645b.mo148a(c0589w0, EnumC0633A.f1391s, new C0559h0());
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: k */
    public final void mo1549k(C0873a c0873a) {
        AbstractC0076b.m139n(this.f1645b != null, "May only be called after start");
        if (this.f1644a) {
            this.f1646c.mo1549k(c0873a);
        } else {
            m1578n(new RunnableC0666L(9, this, c0873a));
        }
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: l */
    public final void mo1550l(InterfaceC0636B interfaceC0636B) {
        C0589w0 c0589w0;
        boolean z;
        AbstractC0076b.m133h(interfaceC0636B, "listener");
        AbstractC0076b.m139n(this.f1645b == null, "already started");
        synchronized (this) {
            try {
                c0589w0 = this.f1647d;
                z = this.f1644a;
                if (!z) {
                    C0704Y c0704y = new C0704Y(interfaceC0636B);
                    this.f1649f = c0704y;
                    interfaceC0636B = c0704y;
                }
                this.f1645b = interfaceC0636B;
                this.f1650g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0589w0 != null) {
            interfaceC0636B.mo148a(c0589w0, EnumC0633A.f1391s, new C0559h0());
        } else if (z) {
            m1580p(interfaceC0636B);
        }
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: m */
    public final void mo1551m() {
        AbstractC0076b.m139n(this.f1645b == null, "May only be called before start");
        this.f1652i.add(new RunnableC0701X(this, 0));
    }

    /* JADX INFO: renamed from: n */
    public final void m1578n(Runnable runnable) {
        AbstractC0076b.m139n(this.f1645b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f1644a) {
                    runnable.run();
                } else {
                    this.f1648e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x001f, B:13:0x0027, B:14:0x002b, B:18:0x002f, B:19:0x0033), top: B:41:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e A[LOOP:3: B:21:0x0038->B:23:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1579o() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.f1648e     // Catch: java.lang.Throwable -> L50
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L52
            r0 = 0
            r6.f1648e = r0     // Catch: java.lang.Throwable -> L50
            r1 = 1
            r6.f1644a = r1     // Catch: java.lang.Throwable -> L50
            T.Y r2 = r6.f1649f     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.f1626u     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            r2.f1626u = r0     // Catch: java.lang.Throwable -> L2d
            r2.f1625t = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r0 = move-exception
            goto L4d
        L2f:
            java.util.List r4 = r2.f1626u     // Catch: java.lang.Throwable -> L2d
            r2.f1626u = r3     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r4.iterator()
        L38:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L48
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L38
        L48:
            r4.clear()
            r3 = r4
            goto L1e
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L4f:
            return
        L50:
            r0 = move-exception
            goto L70
        L52:
            java.util.List r1 = r6.f1648e     // Catch: java.lang.Throwable -> L50
            r6.f1648e = r0     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r1.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L5b
        L6b:
            r1.clear()
            r0 = r1
            goto L5
        L70:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034T.C0707Z.m1579o():void");
    }

    /* JADX INFO: renamed from: p */
    public final void m1580p(InterfaceC0636B interfaceC0636B) {
        ArrayList arrayList = this.f1652i;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
        this.f1652i = null;
        this.f1646c.mo1550l(interfaceC0636B);
    }

    /* JADX INFO: renamed from: r */
    public final RunnableC0701X m1581r(InterfaceC0806z interfaceC0806z) {
        synchronized (this) {
            try {
                if (this.f1646c != null) {
                    return null;
                }
                AbstractC0076b.m133h(interfaceC0806z, "stream");
                InterfaceC0806z interfaceC0806z2 = this.f1646c;
                AbstractC0076b.m137l("realStream already set to %s", interfaceC0806z2 == null, interfaceC0806z2);
                this.f1646c = interfaceC0806z;
                this.f1651h = System.nanoTime();
                InterfaceC0636B interfaceC0636B = this.f1645b;
                if (interfaceC0636B == null) {
                    this.f1648e = null;
                    this.f1644a = true;
                }
                if (interfaceC0636B == null) {
                    return null;
                }
                m1580p(interfaceC0636B);
                return new RunnableC0701X(this, 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo1561q(C0589w0 c0589w0) {
    }
}
