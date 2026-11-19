package p036U;

import java.io.IOException;
import p001B.AbstractC0076b;
import p024O.C0463f;
import p033S0.C0613g;
import p034T.AbstractC0714b;

/* JADX INFO: renamed from: U.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0842w {

    /* JADX INFO: renamed from: b */
    public final int f2306b;

    /* JADX INFO: renamed from: c */
    public int f2307c;

    /* JADX INFO: renamed from: d */
    public int f2308d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0841v f2309e;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0463f f2311g;

    /* JADX INFO: renamed from: a */
    public final C0613g f2305a = new C0613g();

    /* JADX INFO: renamed from: f */
    public boolean f2310f = false;

    public C0842w(C0463f c0463f, int i2, int i3, InterfaceC0841v interfaceC0841v) {
        this.f2311g = c0463f;
        this.f2306b = i2;
        this.f2307c = i3;
        this.f2309e = interfaceC0841v;
    }

    /* JADX INFO: renamed from: a */
    public final int m1738a(int i2) {
        if (i2 <= 0 || Integer.MAX_VALUE - i2 >= this.f2307c) {
            int i3 = this.f2307c + i2;
            this.f2307c = i3;
            return i3;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f2306b);
    }

    /* JADX INFO: renamed from: b */
    public final void m1739b(int i2, C0613g c0613g, boolean z) {
        boolean zM1589e;
        do {
            int iMin = Math.min(i2, ((C0823d) this.f2311g.f801d).f2171t.f2154s.f2438v);
            int i3 = -iMin;
            ((C0842w) this.f2311g.f802e).m1738a(i3);
            m1738a(i3);
            try {
                boolean z2 = false;
                ((C0823d) this.f2311g.f801d).m1704c(c0613g.f1342t == ((long) iMin) && z, this.f2306b, c0613g, iMin);
                AbstractC0714b abstractC0714b = (AbstractC0714b) this.f2309e;
                synchronized (abstractC0714b.f1674b) {
                    AbstractC0076b.m139n(abstractC0714b.f1678f, "onStreamAllocated was not called, but it seems the stream is active");
                    int i4 = abstractC0714b.f1677e;
                    boolean z3 = i4 < 32768;
                    int i5 = i4 - iMin;
                    abstractC0714b.f1677e = i5;
                    boolean z4 = i5 < 32768;
                    if (!z3 && z4) {
                        z2 = true;
                    }
                }
                if (z2) {
                    synchronized (abstractC0714b.f1674b) {
                        zM1589e = abstractC0714b.m1589e();
                    }
                    if (zM1589e) {
                        abstractC0714b.f1682j.mo151d();
                    }
                }
                i2 -= iMin;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (i2 > 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m1740c(int i2, C0843x c0843x) {
        int i3 = this.f2307c;
        C0463f c0463f = this.f2311g;
        int iMin = Math.min(i2, Math.min(i3, ((C0842w) c0463f.f802e).f2307c));
        int i4 = 0;
        while (true) {
            C0613g c0613g = this.f2305a;
            long j2 = c0613g.f1342t;
            if (j2 <= 0 || iMin <= 0) {
                return;
            }
            if (iMin >= j2) {
                int i5 = (int) j2;
                i4 += i5;
                m1739b(i5, c0613g, this.f2310f);
            } else {
                i4 += iMin;
                m1739b(iMin, c0613g, false);
            }
            c0843x.f2312a++;
            iMin = Math.min(i2 - i4, Math.min(this.f2307c, ((C0842w) c0463f.f802e).f2307c));
        }
    }
}
