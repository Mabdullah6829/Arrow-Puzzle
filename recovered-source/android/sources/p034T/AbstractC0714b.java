package p034T;

import io.grpc.StatusRuntimeException;
import p001B.AbstractC0076b;
import p030R.AbstractC0570n;
import p030R.C0559h0;
import p030R.C0572o;
import p030R.C0589w0;
import p030R.C0590x;
import p030R.C0592y;
import p030R.InterfaceC0574p;
import p036U.C0829j;

/* JADX INFO: renamed from: T.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0714b {

    /* JADX INFO: renamed from: a */
    public C0760m1 f1673a;

    /* JADX INFO: renamed from: b */
    public final Object f1674b = new Object();

    /* JADX INFO: renamed from: c */
    public final C0793u2 f1675c;

    /* JADX INFO: renamed from: d */
    public final C0760m1 f1676d;

    /* JADX INFO: renamed from: e */
    public int f1677e;

    /* JADX INFO: renamed from: f */
    public boolean f1678f;

    /* JADX INFO: renamed from: g */
    public boolean f1679g;

    /* JADX INFO: renamed from: h */
    public final C0777q2 f1680h;

    /* JADX INFO: renamed from: i */
    public boolean f1681i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0636B f1682j;

    /* JADX INFO: renamed from: k */
    public C0592y f1683k;

    /* JADX INFO: renamed from: l */
    public boolean f1684l;

    /* JADX INFO: renamed from: m */
    public RunnableC0710a f1685m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f1686n;

    /* JADX INFO: renamed from: o */
    public boolean f1687o;

    /* JADX INFO: renamed from: p */
    public boolean f1688p;

    public AbstractC0714b(int i2, C0777q2 c0777q2, C0793u2 c0793u2) {
        AbstractC0076b.m133h(c0793u2, "transportTracer");
        this.f1675c = c0793u2;
        C0760m1 c0760m1 = new C0760m1(this, i2, c0777q2, c0793u2);
        this.f1676d = c0760m1;
        this.f1673a = c0760m1;
        this.f1683k = C0592y.f1297d;
        this.f1684l = false;
        this.f1680h = c0777q2;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1585a(int i2);

    /* JADX INFO: renamed from: b */
    public final void m1586b(C0589w0 c0589w0, EnumC0633A enumC0633A, C0559h0 c0559h0) {
        if (this.f1681i) {
            return;
        }
        this.f1681i = true;
        C0777q2 c0777q2 = this.f1680h;
        if (c0777q2.f2020b.compareAndSet(false, true)) {
            for (AbstractC0570n abstractC0570n : c0777q2.f2019a) {
                abstractC0570n.mo1333m(c0589w0);
            }
        }
        if (this.f1675c != null) {
            c0589w0.m1352e();
        }
        this.f1682j.mo148a(c0589w0, enumC0633A, c0559h0);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo1587c(boolean z);

    /* JADX INFO: renamed from: d */
    public final void m1588d(C0559h0 c0559h0) {
        C0572o c0572o = C0572o.f1219t;
        AbstractC0076b.m139n(!this.f1687o, "Received headers on closed stream");
        for (AbstractC0570n abstractC0570n : this.f1680h.f2019a) {
            abstractC0570n.mo1322b();
        }
        String str = (String) c0559h0.m1307c(AbstractC0759m0.f1922d);
        if (str != null) {
            C0590x c0590x = (C0590x) this.f1683k.f1298a.get(str);
            InterfaceC0574p interfaceC0574p = c0590x != null ? c0590x.f1290a : null;
            if (interfaceC0574p == null) {
                ((C0829j) this).m1712m(new StatusRuntimeException(C0589w0.f1283m.m1354g("Can't find decompressor for ".concat(str))));
                return;
            } else if (interfaceC0574p != c0572o) {
                C0760m1 c0760m1 = this.f1673a;
                c0760m1.getClass();
                AbstractC0076b.m139n(true, "Already set full stream decompressor");
                c0760m1.f1951w = interfaceC0574p;
            }
        }
        this.f1682j.mo149b(c0559h0);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1589e() {
        boolean z;
        synchronized (this.f1674b) {
            try {
                z = this.f1678f && this.f1677e < 32768 && !this.f1679g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005c */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1590f(p030R.C0589w0 r7, p034T.EnumC0633A r8, boolean r9, p030R.C0559h0 r10) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "status"
            p001B.AbstractC0076b.m133h(r7, r0)
            boolean r0 = r6.f1687o
            if (r0 == 0) goto Lc
            if (r9 != 0) goto Lc
            return
        Lc:
            r0 = 1
            r6.f1687o = r0
            boolean r1 = r7.m1352e()
            r6.f1688p = r1
            java.lang.Object r1 = r6.f1674b
            monitor-enter(r1)
            r6.f1679g = r0     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            boolean r0 = r6.f1684l
            if (r0 == 0) goto L26
            r9 = 0
            r6.f1685m = r9
            r6.m1586b(r7, r8, r10)
            return
        L26:
            T.a r0 = new T.a
            r5 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = r1
            r7.f1685m = r0
            if (r9 == 0) goto L3b
            T.m1 r8 = r7.f1673a
            r8.close()
            return
        L3b:
            T.m1 r8 = r7.f1673a
            boolean r9 = r8.isClosed()
            if (r9 == 0) goto L44
            goto L56
        L44:
            T.G r9 = r8.f1940D
            int r9 = r9.f1455u
            r10 = 1
            if (r9 != 0) goto L4d
            r9 = r10
            goto L4e
        L4d:
            r9 = 0
        L4e:
            if (r9 == 0) goto L54
            r8.close()
            goto L56
        L54:
            r8.f1945I = r10
        L56:
            return
        L57:
            r0 = move-exception
            r7 = r6
        L59:
            r8 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5c
            throw r8
        L5c:
            r0 = move-exception
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: p034T.AbstractC0714b.m1590f(R.w0, T.A, boolean, R.h0):void");
    }

    /* JADX INFO: renamed from: g */
    public final void m1591g(C0589w0 c0589w0, boolean z, C0559h0 c0559h0) throws Throwable {
        m1590f(c0589w0, EnumC0633A.f1391s, z, c0559h0);
    }
}
