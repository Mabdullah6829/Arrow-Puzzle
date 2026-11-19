package p034T;

import io.grpc.StatusRuntimeException;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import p001B.AbstractC0076b;
import p001B.C0092r;
import p030R.AbstractC0570n;
import p030R.C0572o;
import p030R.C0589w0;
import p030R.InterfaceC0574p;
import p072l.AbstractC6468c;

/* JADX INFO: renamed from: T.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0760m1 implements Closeable {

    /* JADX INFO: renamed from: A */
    public int f1937A;

    /* JADX INFO: renamed from: B */
    public boolean f1938B;

    /* JADX INFO: renamed from: C */
    public C0651G f1939C;

    /* JADX INFO: renamed from: D */
    public C0651G f1940D;

    /* JADX INFO: renamed from: E */
    public long f1941E;

    /* JADX INFO: renamed from: F */
    public boolean f1942F;

    /* JADX INFO: renamed from: G */
    public int f1943G;

    /* JADX INFO: renamed from: H */
    public int f1944H;

    /* JADX INFO: renamed from: I */
    public boolean f1945I;

    /* JADX INFO: renamed from: J */
    public volatile boolean f1946J;

    /* JADX INFO: renamed from: s */
    public AbstractC0714b f1947s;

    /* JADX INFO: renamed from: t */
    public int f1948t;

    /* JADX INFO: renamed from: u */
    public final C0777q2 f1949u;

    /* JADX INFO: renamed from: v */
    public final C0793u2 f1950v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0574p f1951w;

    /* JADX INFO: renamed from: x */
    public byte[] f1952x;

    /* JADX INFO: renamed from: y */
    public int f1953y;

    /* JADX INFO: renamed from: z */
    public int f1954z;

    public C0760m1(AbstractC0714b abstractC0714b, int i2, C0777q2 c0777q2, C0793u2 c0793u2) {
        C0572o c0572o = C0572o.f1219t;
        this.f1954z = 1;
        this.f1937A = 5;
        this.f1940D = new C0651G();
        this.f1942F = false;
        this.f1943G = -1;
        this.f1945I = false;
        this.f1946J = false;
        this.f1947s = abstractC0714b;
        this.f1951w = c0572o;
        this.f1948t = i2;
        this.f1949u = c0777q2;
        AbstractC0076b.m133h(c0793u2, "transportTracer");
        this.f1950v = c0793u2;
    }

    /* JADX INFO: renamed from: c */
    public final void m1628c() {
        String str;
        if (this.f1942F) {
            return;
        }
        boolean z = true;
        this.f1942F = true;
        while (!this.f1946J && this.f1941E > 0 && m1631i()) {
            try {
                int iM12193b = AbstractC6468c.m12193b(this.f1954z);
                if (iM12193b == 0) {
                    m1630h();
                } else {
                    if (iM12193b != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid state: ");
                        int i2 = this.f1954z;
                        if (i2 != 1) {
                            str = i2 != 2 ? "null" : "BODY";
                        } else {
                            str = "HEADER";
                        }
                        sb.append(str);
                        throw new AssertionError(sb.toString());
                    }
                    m1629e();
                    this.f1941E--;
                }
            } catch (Throwable th) {
                this.f1942F = false;
                throw th;
            }
        }
        if (this.f1946J) {
            close();
            this.f1942F = false;
            return;
        }
        if (this.f1945I) {
            if (this.f1940D.f1455u != 0) {
                z = false;
            }
            if (z) {
                close();
            }
        }
        this.f1942F = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (isClosed()) {
            return;
        }
        C0651G c0651g = this.f1939C;
        boolean z = c0651g != null && c0651g.f1455u > 0;
        try {
            C0651G c0651g2 = this.f1940D;
            if (c0651g2 != null) {
                c0651g2.close();
            }
            C0651G c0651g3 = this.f1939C;
            if (c0651g3 != null) {
                c0651g3.close();
            }
            this.f1940D = null;
            this.f1939C = null;
            this.f1947s.mo1587c(z);
        } catch (Throwable th) {
            this.f1940D = null;
            this.f1939C = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1629e() {
        Object c0756l1;
        int i2 = this.f1943G;
        long j2 = this.f1944H;
        C0777q2 c0777q2 = this.f1949u;
        for (AbstractC0570n abstractC0570n : c0777q2.f2019a) {
            abstractC0570n.mo1324d(i2, j2);
        }
        this.f1944H = 0;
        if (this.f1938B) {
            InterfaceC0574p interfaceC0574p = this.f1951w;
            if (interfaceC0574p == C0572o.f1219t) {
                throw new StatusRuntimeException(C0589w0.f1283m.m1354g("Can't decode compressed gRPC message as compression not configured"));
            }
            try {
                C0651G c0651g = this.f1939C;
                C0650F1 c0650f1 = AbstractC0653G1.f1458a;
                C0647E1 c0647e1 = new C0647E1();
                AbstractC0076b.m133h(c0651g, "buffer");
                c0647e1.f1442s = c0651g;
                c0756l1 = new C0756l1(interfaceC0574p.mo1335b(c0647e1), this.f1948t, c0777q2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            long j3 = this.f1939C.f1455u;
            for (AbstractC0570n abstractC0570n2 : c0777q2.f2019a) {
                abstractC0570n2.mo1326f(j3);
            }
            C0651G c0651g2 = this.f1939C;
            C0650F1 c0650f2 = AbstractC0653G1.f1458a;
            C0647E1 c0647e2 = new C0647E1();
            AbstractC0076b.m133h(c0651g2, "buffer");
            c0647e2.f1442s = c0651g2;
            c0756l1 = c0647e2;
        }
        this.f1939C.getClass();
        this.f1939C = null;
        AbstractC0714b abstractC0714b = this.f1947s;
        C0092r c0092r = new C0092r(7);
        c0092r.f130t = c0756l1;
        abstractC0714b.f1682j.mo150c(c0092r);
        this.f1954z = 1;
        this.f1937A = 5;
    }

    /* JADX INFO: renamed from: h */
    public final void m1630h() {
        int iMo1495o = this.f1939C.mo1495o();
        if ((iMo1495o & 254) != 0) {
            throw new StatusRuntimeException(C0589w0.f1283m.m1354g("gRPC frame header malformed: reserved bits not zero"));
        }
        this.f1938B = (iMo1495o & 1) != 0;
        C0651G c0651g = this.f1939C;
        c0651g.m1607c(4);
        int iMo1495o2 = c0651g.mo1495o() | (c0651g.mo1495o() << 24) | (c0651g.mo1495o() << 16) | (c0651g.mo1495o() << 8);
        this.f1937A = iMo1495o2;
        if (iMo1495o2 < 0 || iMo1495o2 > this.f1948t) {
            C0589w0 c0589w0 = C0589w0.f1281k;
            Locale locale = Locale.US;
            throw new StatusRuntimeException(c0589w0.m1354g("gRPC message exceeds maximum size " + this.f1948t + ": " + iMo1495o2));
        }
        int i2 = this.f1943G + 1;
        this.f1943G = i2;
        for (AbstractC0570n abstractC0570n : this.f1949u.f2019a) {
            abstractC0570n.mo1323c(i2);
        }
        C0793u2 c0793u2 = this.f1950v;
        ((InterfaceC0670M0) c0793u2.f2061u).mo1516a();
        ((C0785s2) c0793u2.f2060t).m1661e();
        this.f1954z = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r8.f1954z == 2) goto L17;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1631i() throws java.lang.Throwable {
        /*
            r8 = this;
            T.q2 r0 = r8.f1949u
            r1 = 2
            r2 = 0
            T.G r3 = r8.f1939C     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L12
            T.G r3 = new T.G     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            r8.f1939C = r3     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L5b
        L12:
            r3 = r2
        L13:
            int r4 = r8.f1937A     // Catch: java.lang.Throwable -> L48
            T.G r5 = r8.f1939C     // Catch: java.lang.Throwable -> L48
            int r5 = r5.f1455u     // Catch: java.lang.Throwable -> L48
            int r4 = r4 - r5
            if (r4 <= 0) goto L4d
            T.G r5 = r8.f1940D     // Catch: java.lang.Throwable -> L48
            int r5 = r5.f1455u     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L37
            if (r3 <= 0) goto L36
            T.b r4 = r8.f1947s
            r4.mo1585a(r3)
            int r4 = r8.f1954z
            if (r4 != r1) goto L36
        L2d:
            long r4 = (long) r3
            r0.m1654a(r4)
            int r0 = r8.f1944H
            int r0 = r0 + r3
            r8.f1944H = r0
        L36:
            return r2
        L37:
            int r4 = java.lang.Math.min(r4, r5)     // Catch: java.lang.Throwable -> L48
            int r3 = r3 + r4
            T.G r5 = r8.f1939C     // Catch: java.lang.Throwable -> L48
            T.G r6 = r8.f1940D     // Catch: java.lang.Throwable -> L48
            T.d r4 = r6.mo1491i(r4)     // Catch: java.lang.Throwable -> L48
            r5.m1503w(r4)     // Catch: java.lang.Throwable -> L48
            goto L13
        L48:
            r2 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L5b
        L4d:
            r2 = 1
            if (r3 <= 0) goto L5a
            T.b r4 = r8.f1947s
            r4.mo1585a(r3)
            int r4 = r8.f1954z
            if (r4 != r1) goto L5a
            goto L2d
        L5a:
            return r2
        L5b:
            if (r2 <= 0) goto L6f
            T.b r4 = r8.f1947s
            r4.mo1585a(r2)
            int r4 = r8.f1954z
            if (r4 != r1) goto L6f
            long r4 = (long) r2
            r0.m1654a(r4)
            int r0 = r8.f1944H
            int r0 = r0 + r2
            r8.f1944H = r0
        L6f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p034T.C0760m1.m1631i():boolean");
    }

    public final boolean isClosed() {
        return this.f1940D == null;
    }
}
