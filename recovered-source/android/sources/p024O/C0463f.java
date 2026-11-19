package p024O;

import androidx.core.internal.view.SupportMenu;
import java.io.IOException;
import p001B.AbstractC0076b;
import p033S0.C0613g;
import p036U.C0823d;
import p036U.C0833n;
import p036U.C0842w;
import p036U.C0843x;

/* JADX INFO: renamed from: O.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0463f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f798a;

    /* JADX INFO: renamed from: b */
    public int f799b;

    /* JADX INFO: renamed from: c */
    public final Object f800c;

    /* JADX INFO: renamed from: d */
    public final Object f801d;

    /* JADX INFO: renamed from: e */
    public final Object f802e;

    public C0463f(int i2) {
        this.f798a = 0;
        this.f802e = new int[i2];
        this.f801d = new int[i2];
        this.f800c = new C0464g[i2];
    }

    /* JADX INFO: renamed from: a */
    public void m985a(boolean z, C0842w c0842w, C0613g c0613g, boolean z2) {
        AbstractC0076b.m133h(c0613g, "source");
        int iMin = Math.min(c0842w.f2307c, ((C0842w) c0842w.f2311g.f802e).f2307c);
        C0613g c0613g2 = c0842w.f2305a;
        boolean z3 = c0613g2.f1342t > 0;
        int i2 = (int) c0613g.f1342t;
        if (z3 || iMin < i2) {
            if (!z3 && iMin > 0) {
                c0842w.m1739b(iMin, c0613g, false);
            }
            c0613g2.mo1356s(c0613g, (int) c0613g.f1342t);
            c0842w.f2310f = z | c0842w.f2310f;
        } else {
            c0842w.m1739b(i2, c0613g, z);
        }
        if (z2) {
            try {
                ((C0823d) this.f801d).flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m986b(C0842w c0842w, int i2) {
        if (c0842w == null) {
            ((C0842w) this.f802e).m1738a(i2);
            m987c();
            return;
        }
        c0842w.m1738a(i2);
        C0843x c0843x = new C0843x();
        c0842w.m1740c(Math.min(c0842w.f2307c, ((C0842w) c0842w.f2311g.f802e).f2307c), c0843x);
        if (c0843x.f2312a > 0) {
            try {
                ((C0823d) this.f801d).flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public void m987c() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f800c
            U.n r0 = (p036U.C0833n) r0
            U.w[] r1 = r0.m1721j()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.f802e
            U.w r2 = (p036U.C0842w) r2
            int r2 = r2.f2307c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.f2307c
            S0.g r10 = r8.f2305a
            long r11 = r10.f1342t
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f2308d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.f2308d
            int r11 = r11 + r9
            r8.f2308d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.f2307c
            long r10 = r10.f1342t
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f2308d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            U.x r1 = new U.x
            r1.<init>()
            U.w[] r0 = r0.m1721j()
            int r2 = r0.length
            r3 = r4
        L75:
            if (r3 >= r2) goto L83
            r5 = r0[r3]
            int r6 = r5.f2308d
            r5.m1740c(r6, r1)
            r5.f2308d = r4
            int r3 = r3 + 1
            goto L75
        L83:
            int r0 = r1.f2312a
            if (r0 <= 0) goto L96
            java.lang.Object r0 = r13.f801d     // Catch: java.io.IOException -> L8f
            U.d r0 = (p036U.C0823d) r0     // Catch: java.io.IOException -> L8f
            r0.flush()     // Catch: java.io.IOException -> L8f
            return
        L8f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p024O.C0463f.m987c():void");
    }

    public String toString() {
        switch (this.f798a) {
            case 0:
                StringBuilder sb = new StringBuilder("{");
                for (int i2 = 0; i2 < this.f799b; i2++) {
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(((int[]) this.f801d)[i2]);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0463f(C0833n c0833n, C0823d c0823d) {
        this.f798a = 1;
        this.f800c = c0833n;
        this.f801d = c0823d;
        this.f799b = SupportMenu.USER_MASK;
        this.f802e = new C0842w(this, 0, SupportMenu.USER_MASK, null);
    }
}
