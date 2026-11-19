package p036U;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.AbstractC0081g;
import p011H.AbstractC0271e0;
import p024O.C0463f;
import p030R.AbstractC0530L;
import p030R.AbstractC0531M;
import p030R.AbstractC0570n;
import p030R.C0549c0;
import p030R.C0555f0;
import p030R.C0559h0;
import p030R.C0589w0;
import p033S0.C0613g;
import p033S0.C0616j;
import p034T.AbstractC0653G1;
import p034T.AbstractC0718c;
import p034T.AbstractC0759m0;
import p034T.AbstractC0771p0;
import p034T.AbstractC0789t2;
import p034T.C0650F1;
import p034T.C0664K0;
import p034T.C0760m1;
import p034T.C0777q2;
import p034T.EnumC0633A;
import p034T.RunnableC0710a;
import p039W.C0862b;
import p039W.EnumC0861a;
import p049b0.AbstractC1886b;
import p049b0.C1885a;
import p049b0.C1887c;

/* JADX INFO: renamed from: U.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0829j extends AbstractC0771p0 implements InterfaceC0841v {

    /* JADX INFO: renamed from: A */
    public boolean f2209A;

    /* JADX INFO: renamed from: B */
    public boolean f2210B;

    /* JADX INFO: renamed from: C */
    public int f2211C;

    /* JADX INFO: renamed from: D */
    public int f2212D;

    /* JADX INFO: renamed from: E */
    public final C0823d f2213E;

    /* JADX INFO: renamed from: F */
    public final C0463f f2214F;

    /* JADX INFO: renamed from: G */
    public final C0833n f2215G;

    /* JADX INFO: renamed from: H */
    public boolean f2216H;

    /* JADX INFO: renamed from: I */
    public final C1887c f2217I;

    /* JADX INFO: renamed from: J */
    public C0842w f2218J;

    /* JADX INFO: renamed from: K */
    public int f2219K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C0830k f2220L;

    /* JADX INFO: renamed from: v */
    public final int f2221v;

    /* JADX INFO: renamed from: w */
    public final Object f2222w;

    /* JADX INFO: renamed from: x */
    public ArrayList f2223x;

    /* JADX INFO: renamed from: y */
    public final C0613g f2224y;

    /* JADX INFO: renamed from: z */
    public boolean f2225z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0829j(C0830k c0830k, int i2, C0777q2 c0777q2, Object obj, C0823d c0823d, C0463f c0463f, C0833n c0833n, int i3) {
        super(i2, c0777q2, c0830k.f1706c);
        this.f2220L = c0830k;
        this.f1997s = AbstractC0081g.f108b;
        this.f2224y = new C0613g();
        this.f2225z = false;
        this.f2209A = false;
        this.f2210B = false;
        this.f2216H = true;
        this.f2219K = -1;
        AbstractC0076b.m133h(obj, "lock");
        this.f2222w = obj;
        this.f2213E = c0823d;
        this.f2214F = c0463f;
        this.f2215G = c0833n;
        this.f2211C = i3;
        this.f2212D = i3;
        this.f2221v = i3;
        AbstractC1886b.f2862a.getClass();
        this.f2217I = C1885a.f2860a;
    }

    /* JADX INFO: renamed from: j */
    public static void m1709j(C0829j c0829j, C0559h0 c0559h0, String str) throws Throwable {
        C0830k c0830k = c0829j.f2220L;
        String str2 = c0830k.f2230m;
        String str3 = c0830k.f2228k;
        boolean z = c0830k.f2234q;
        C0833n c0833n = c0829j.f2215G;
        boolean z2 = c0833n.f2242B == null;
        C0862b c0862b = AbstractC0824e.f2173a;
        AbstractC0076b.m133h(c0559h0, "headers");
        AbstractC0076b.m133h(str, "defaultPath");
        AbstractC0076b.m133h(str2, "authority");
        c0559h0.m1305a(AbstractC0759m0.f1927i);
        c0559h0.m1305a(AbstractC0759m0.f1928j);
        C0549c0 c0549c0 = AbstractC0759m0.f1929k;
        c0559h0.m1305a(c0549c0);
        ArrayList arrayList = new ArrayList(c0559h0.f1190b + 7);
        if (z2) {
            arrayList.add(AbstractC0824e.f2174b);
        } else {
            arrayList.add(AbstractC0824e.f2173a);
        }
        if (z) {
            arrayList.add(AbstractC0824e.f2176d);
        } else {
            arrayList.add(AbstractC0824e.f2175c);
        }
        arrayList.add(new C0862b(C0862b.f2403h, str2));
        arrayList.add(new C0862b(C0862b.f2401f, str));
        arrayList.add(new C0862b(c0549c0.f1162a, str3));
        arrayList.add(AbstractC0824e.f2177e);
        arrayList.add(AbstractC0824e.f2178f);
        Logger logger = AbstractC0789t2.f2047a;
        Charset charset = AbstractC0530L.f1127a;
        int i2 = c0559h0.f1190b * 2;
        byte[][] bArr = new byte[i2][];
        Object[] objArr = c0559h0.f1189a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i2);
        } else {
            for (int i3 = 0; i3 < c0559h0.f1190b; i3++) {
                int i4 = i3 * 2;
                bArr[i4] = c0559h0.m1309e(i3);
                int i5 = i4 + 1;
                Object obj = c0559h0.f1189a[i5];
                if (!(obj instanceof byte[])) {
                    AbstractC1456a.m2454u(obj);
                    throw null;
                }
                bArr[i5] = (byte[]) obj;
            }
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7 += 2) {
            byte[] bArr2 = bArr[i7];
            byte[] bArr3 = bArr[i7 + 1];
            if (AbstractC0789t2.m1665a(bArr2, AbstractC0789t2.f2048b)) {
                bArr[i6] = bArr2;
                bArr[i6 + 1] = AbstractC0530L.f1128b.m287c(bArr3).getBytes(AbstractC0081g.f107a);
            } else {
                int length = bArr3.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        bArr[i6] = bArr2;
                        bArr[i6 + 1] = bArr3;
                    } else {
                        byte b = bArr3[i8];
                        if (b < 32 || b > 126) {
                            String str4 = new String(bArr2, AbstractC0081g.f107a);
                            Logger logger2 = AbstractC0789t2.f2047a;
                            StringBuilder sbM411s = AbstractC0271e0.m411s("Metadata key=", str4, ", value=");
                            sbM411s.append(Arrays.toString(bArr3));
                            sbM411s.append(" contains invalid ASCII characters");
                            logger2.warning(sbM411s.toString());
                        } else {
                            i8++;
                        }
                    }
                }
            }
            i6 += 2;
        }
        if (i6 != i2) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i6);
        }
        for (int i9 = 0; i9 < bArr.length; i9 += 2) {
            C0616j c0616jM1400m = C0616j.m1400m(bArr[i9]);
            byte[] bArr4 = c0616jM1400m.f1344s;
            if (bArr4.length != 0 && bArr4[0] != 58) {
                arrayList.add(new C0862b(c0616jM1400m, C0616j.m1400m(bArr[i9 + 1])));
            }
        }
        c0829j.f2223x = arrayList;
        C0589w0 c0589w0 = c0833n.f2277v;
        if (c0589w0 != null) {
            c0830k.f2231n.m1590f(c0589w0, EnumC0633A.f1394v, true, new C0559h0());
            return;
        }
        if (c0833n.f2269n.size() < c0833n.f2243C) {
            c0833n.m1730t(c0830k);
            return;
        }
        c0833n.f2244D.add(c0830k);
        if (!c0833n.f2281z) {
            c0833n.f2281z = true;
            C0664K0 c0664k0 = c0833n.f2246F;
            if (c0664k0 != null) {
                c0664k0.m1522b();
            }
        }
        if (c0830k.f1708e) {
            c0833n.f2253M.m1664a(c0830k, true);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m1710k(C0829j c0829j, C0613g c0613g, boolean z, boolean z2) {
        if (c0829j.f2210B) {
            return;
        }
        if (!c0829j.f2216H) {
            AbstractC0076b.m139n(c0829j.f2219K != -1, "streamId should be set");
            c0829j.f2214F.m985a(z, c0829j.f2218J, c0613g, z2);
        } else {
            c0829j.f2224y.mo1356s(c0613g, (int) c0613g.f1342t);
            c0829j.f2225z |= z;
            c0829j.f2209A |= z2;
        }
    }

    @Override // p034T.AbstractC0714b
    /* JADX INFO: renamed from: a */
    public final void mo1585a(int i2) {
        int i3 = this.f2212D - i2;
        this.f2212D = i3;
        float f2 = i3;
        int i4 = this.f2221v;
        if (f2 <= i4 * 0.5f) {
            int i5 = i4 - i3;
            this.f2211C += i5;
            this.f2212D = i3 + i5;
            this.f2213E.m1708j(this.f2219K, i5);
        }
    }

    @Override // p034T.AbstractC0714b
    /* JADX INFO: renamed from: c */
    public final void mo1587c(boolean z) throws Throwable {
        EnumC0633A enumC0633A = EnumC0633A.f1391s;
        if (this.f1686n) {
            this.f2215G.m1720i(this.f2219K, null, enumC0633A, false, null, null);
        } else {
            this.f2215G.m1720i(this.f2219K, null, enumC0633A, false, EnumC0861a.CANCEL, null);
        }
        AbstractC0076b.m139n(this.f1687o, "status should have been reported on deframer closed");
        this.f1684l = true;
        if (this.f1688p && z) {
            m1591g(C0589w0.f1283m.m1354g("Encountered end-of-stream mid-frame"), true, new C0559h0());
        }
        RunnableC0710a runnableC0710a = this.f1685m;
        if (runnableC0710a != null) {
            runnableC0710a.run();
            this.f1685m = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1711l(C0589w0 c0589w0, boolean z, C0559h0 c0559h0) throws Throwable {
        if (this.f2210B) {
            return;
        }
        this.f2210B = true;
        if (!this.f2216H) {
            this.f2215G.m1720i(this.f2219K, c0589w0, EnumC0633A.f1391s, z, EnumC0861a.CANCEL, c0559h0);
            return;
        }
        C0833n c0833n = this.f2215G;
        LinkedList linkedList = c0833n.f2244D;
        C0830k c0830k = this.f2220L;
        linkedList.remove(c0830k);
        c0833n.m1725n(c0830k);
        this.f2223x = null;
        C0613g c0613g = this.f2224y;
        c0613g.m1382J(c0613g.f1342t);
        this.f2216H = false;
        if (c0559h0 == null) {
            c0559h0 = new C0559h0();
        }
        m1591g(c0589w0, true, c0559h0);
    }

    /* JADX INFO: renamed from: m */
    public final void m1712m(Throwable th) {
        m1711l(C0589w0.m1350d(th), true, new C0559h0());
    }

    /* JADX INFO: renamed from: n */
    public final void m1713n(int i2, C0613g c0613g, boolean z) throws Throwable {
        Throwable th;
        long j2 = c0613g.f1342t;
        int i3 = this.f2211C - (((int) j2) + i2);
        this.f2211C = i3;
        this.f2212D -= i2;
        if (i3 < 0) {
            this.f2213E.m1707i(this.f2219K, EnumC0861a.FLOW_CONTROL_ERROR);
            this.f2215G.m1720i(this.f2219K, C0589w0.f1283m.m1354g("Received data size exceeded our receiving window size"), EnumC0633A.f1391s, false, null, null);
            return;
        }
        C0837r c0837r = new C0837r(c0613g);
        C0589w0 c0589w0 = this.f1995q;
        boolean z2 = false;
        if (c0589w0 != null) {
            Charset charset = this.f1997s;
            C0650F1 c0650f1 = AbstractC0653G1.f1458a;
            AbstractC0076b.m133h(charset, "charset");
            int i4 = (int) c0613g.f1342t;
            byte[] bArr = new byte[i4];
            c0837r.mo1494n(bArr, 0, i4);
            this.f1995q = c0589w0.m1351a("DATA-----------------------------\n".concat(new String(bArr, charset)));
            c0837r.close();
            if (this.f1995q.f1288b.length() > 1000 || z) {
                m1711l(this.f1995q, false, this.f1996r);
                return;
            }
            return;
        }
        if (!this.f1998t) {
            m1711l(C0589w0.f1283m.m1354g("headers not received before payload"), false, new C0559h0());
            return;
        }
        int i5 = (int) j2;
        boolean z3 = true;
        try {
            if (this.f1687o) {
                AbstractC0718c.f1705i.log(Level.INFO, "Received data on closed stream");
                c0837r.close();
            } else {
                try {
                    C0760m1 c0760m1 = this.f1673a;
                    c0760m1.getClass();
                    try {
                        if (c0760m1.isClosed() || c0760m1.f1945I) {
                            c0837r.close();
                        } else {
                            c0760m1.f1940D.m1503w(c0837r);
                            try {
                                c0760m1.m1628c();
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = false;
                                if (z3) {
                                    c0837r.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        m1712m(th4);
                    } catch (Throwable th5) {
                        th = th5;
                        if (!z2) {
                            throw th;
                        }
                        c0837r.close();
                        throw th;
                    }
                }
            }
            if (z) {
                if (i5 > 0) {
                    this.f1995q = C0589w0.f1283m.m1354g("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f1995q = C0589w0.f1283m.m1354g("Received unexpected EOS on empty DATA frame from server");
                }
                C0559h0 c0559h0 = new C0559h0();
                this.f1996r = c0559h0;
                m1591g(this.f1995q, false, c0559h0);
            }
        } catch (Throwable th6) {
            th = th6;
            z2 = true;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1714o(ArrayList arrayList, boolean z) throws Throwable {
        C0589w0 c0589w0M1351a;
        C0555f0 c0555f0 = AbstractC0771p0.f1994u;
        if (z) {
            byte[][] bArrM1741a = AbstractC0844y.m1741a(arrayList);
            int length = bArrM1741a.length / 2;
            C0559h0 c0559h0 = new C0559h0();
            c0559h0.f1190b = length;
            c0559h0.f1189a = bArrM1741a;
            if (this.f1995q == null && !this.f1998t) {
                C0589w0 c0589w0M1650i = AbstractC0771p0.m1650i(c0559h0);
                this.f1995q = c0589w0M1650i;
                if (c0589w0M1650i != null) {
                    this.f1996r = c0559h0;
                }
            }
            C0589w0 c0589w0 = this.f1995q;
            if (c0589w0 != null) {
                C0589w0 c0589w0M1351a2 = c0589w0.m1351a("trailers: " + c0559h0);
                this.f1995q = c0589w0M1351a2;
                m1711l(c0589w0M1351a2, false, this.f1996r);
                return;
            }
            C0555f0 c0555f1 = AbstractC0531M.f1130b;
            C0589w0 c0589w1 = (C0589w0) c0559h0.m1307c(c0555f1);
            if (c0589w1 != null) {
                c0589w0M1351a = c0589w1.m1354g((String) c0559h0.m1307c(AbstractC0531M.f1129a));
            } else if (this.f1998t) {
                c0589w0M1351a = C0589w0.f1277g.m1354g("missing GRPC status in response");
            } else {
                Integer num = (Integer) c0559h0.m1307c(c0555f0);
                c0589w0M1351a = (num != null ? AbstractC0759m0.m1626g(num.intValue()) : C0589w0.f1283m.m1354g("missing HTTP status code")).m1351a("missing GRPC status, inferred error from HTTP status code");
            }
            c0559h0.m1305a(c0555f0);
            c0559h0.m1305a(c0555f1);
            c0559h0.m1305a(AbstractC0531M.f1129a);
            if (this.f1687o) {
                AbstractC0718c.f1705i.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{c0589w0M1351a, c0559h0});
                return;
            }
            for (AbstractC0570n abstractC0570n : this.f1680h.f2019a) {
                abstractC0570n.mo1325e(c0559h0);
            }
            m1591g(c0589w0M1351a, false, c0559h0);
            return;
        }
        byte[][] bArrM1741a2 = AbstractC0844y.m1741a(arrayList);
        int length2 = bArrM1741a2.length / 2;
        C0559h0 c0559h1 = new C0559h0();
        c0559h1.f1190b = length2;
        c0559h1.f1189a = bArrM1741a2;
        C0589w0 c0589w2 = this.f1995q;
        if (c0589w2 != null) {
            this.f1995q = c0589w2.m1351a("headers: " + c0559h1);
            return;
        }
        try {
            if (this.f1998t) {
                C0589w0 c0589w0M1354g = C0589w0.f1283m.m1354g("Received headers twice");
                this.f1995q = c0589w0M1354g;
                this.f1995q = c0589w0M1354g.m1351a("headers: " + c0559h1);
                this.f1996r = c0559h1;
                this.f1997s = AbstractC0771p0.m1649h(c0559h1);
                return;
            }
            Integer num2 = (Integer) c0559h1.m1307c(c0555f0);
            if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                C0589w0 c0589w3 = this.f1995q;
                if (c0589w3 != null) {
                    this.f1995q = c0589w3.m1351a("headers: " + c0559h1);
                    this.f1996r = c0559h1;
                    this.f1997s = AbstractC0771p0.m1649h(c0559h1);
                    return;
                }
                return;
            }
            this.f1998t = true;
            C0589w0 c0589w0M1650i2 = AbstractC0771p0.m1650i(c0559h1);
            this.f1995q = c0589w0M1650i2;
            if (c0589w0M1650i2 != null) {
                this.f1995q = c0589w0M1650i2.m1351a("headers: " + c0559h1);
                this.f1996r = c0559h1;
                this.f1997s = AbstractC0771p0.m1649h(c0559h1);
                return;
            }
            c0559h1.m1305a(c0555f0);
            c0559h1.m1305a(AbstractC0531M.f1130b);
            c0559h1.m1305a(AbstractC0531M.f1129a);
            m1588d(c0559h1);
            C0589w0 c0589w4 = this.f1995q;
            if (c0589w4 != null) {
                this.f1995q = c0589w4.m1351a("headers: " + c0559h1);
                this.f1996r = c0559h1;
                this.f1997s = AbstractC0771p0.m1649h(c0559h1);
            }
        } catch (Throwable th) {
            C0589w0 c0589w5 = this.f1995q;
            if (c0589w5 != null) {
                this.f1995q = c0589w5.m1351a("headers: " + c0559h1);
                this.f1996r = c0559h1;
                this.f1997s = AbstractC0771p0.m1649h(c0559h1);
            }
            throw th;
        }
    }
}
