package p034T;

import p001B.C0086l;
import p001B.C0092r;
import p030R.AbstractC0560i;
import p030R.C0559h0;
import p030R.C0589w0;
import p049b0.AbstractC1886b;
import p049b0.C1885a;

/* JADX INFO: renamed from: T.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0790u extends AbstractRunnableC0663K {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f2049u = 1;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0086l f2050v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f2051w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0790u(C0086l c0086l, C0559h0 c0559h0) {
        super(((C0803y) c0086l.f114v).f2099e, 0);
        this.f2050v = c0086l;
        this.f2051w = c0559h0;
    }

    @Override // p034T.AbstractRunnableC0663K
    /* JADX INFO: renamed from: b */
    public final void mo1520b() {
        switch (this.f2049u) {
            case 0:
                C0086l c0086l = this.f2050v;
                AbstractC1886b.m2715c();
                try {
                    AbstractC1886b.m2713a();
                    AbstractC1886b.f2862a.getClass();
                    if (((C0589w0) c0086l.f113u) == null) {
                        try {
                            ((AbstractC0560i) c0086l.f112t).onHeaders((C0559h0) this.f2051w);
                        } catch (Throwable th) {
                            C0589w0 c0589w0M1354g = C0589w0.f1276f.m1353f(th).m1354g("Failed to read headers");
                            c0086l.f113u = c0589w0M1354g;
                            ((C0803y) c0086l.f114v).f2103i.mo1548j(c0589w0M1354g);
                        }
                        break;
                    }
                    AbstractC1886b.f2862a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        AbstractC1886b.f2862a.getClass();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                AbstractC1886b.m2715c();
                try {
                    AbstractC1886b.m2713a();
                    C1885a c1885a = AbstractC1886b.f2862a;
                    c1885a.getClass();
                    m1666c();
                    c1885a.getClass();
                    return;
                } catch (Throwable th4) {
                    try {
                        AbstractC1886b.f2862a.getClass();
                        break;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0033 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1666c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2051w
            B.r r0 = (p001B.C0092r) r0
            B.l r1 = r6.f2050v
            java.lang.Object r2 = r1.f114v
            T.y r2 = (p034T.C0803y) r2
            java.lang.Object r3 = r1.f113u
            R.w0 r3 = (p030R.C0589w0) r3
            if (r3 == 0) goto L1c
            java.util.logging.Logger r1 = p034T.AbstractC0759m0.f1919a
        L12:
            java.io.InputStream r1 = r0.m165e()
            if (r1 == 0) goto L3a
            p034T.AbstractC0759m0.m1621b(r1)
            goto L12
        L1c:
            java.io.InputStream r3 = r0.m165e()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L3a
            java.lang.Object r4 = r1.f112t     // Catch: java.lang.Throwable -> L35
            R.i r4 = (p030R.AbstractC0560i) r4     // Catch: java.lang.Throwable -> L35
            R.l0 r5 = r2.f2095a     // Catch: java.lang.Throwable -> L35
            com.google.protobuf.s0 r5 = r5.m1319c(r3)     // Catch: java.lang.Throwable -> L35
            r4.onMessage(r5)     // Catch: java.lang.Throwable -> L35
            r3.close()     // Catch: java.lang.Throwable -> L33
            goto L1c
        L33:
            r3 = move-exception
            goto L3b
        L35:
            r4 = move-exception
            p034T.AbstractC0759m0.m1621b(r3)     // Catch: java.lang.Throwable -> L33
            throw r4     // Catch: java.lang.Throwable -> L33
        L3a:
            return
        L3b:
            java.util.logging.Logger r4 = p034T.AbstractC0759m0.f1919a
        L3d:
            java.io.InputStream r4 = r0.m165e()
            if (r4 == 0) goto L47
            p034T.AbstractC0759m0.m1621b(r4)
            goto L3d
        L47:
            R.w0 r0 = p030R.C0589w0.f1276f
            R.w0 r0 = r0.m1353f(r3)
            java.lang.String r3 = "Failed to read message."
            R.w0 r0 = r0.m1354g(r3)
            r1.f113u = r0
            T.z r1 = r2.f2103i
            r1.mo1548j(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034T.C0790u.m1666c():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0790u(C0086l c0086l, C0092r c0092r) {
        super(((C0803y) c0086l.f114v).f2099e, 0);
        this.f2050v = c0086l;
        this.f2051w = c0092r;
    }
}
