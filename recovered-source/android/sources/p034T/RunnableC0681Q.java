package p034T;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import p030R.AbstractC0522D;
import p030R.C0549c0;
import p030R.C0589w0;
import p033S0.C0609c;
import p033S0.C0613g;
import p036U.C0822c;
import p036U.C0833n;

/* JADX INFO: renamed from: T.Q */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0681Q implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1524s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f1525t;

    public /* synthetic */ RunnableC0681Q(Object obj, int i2) {
        this.f1524s = i2;
        this.f1525t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1524s) {
            case 0:
                ((C0686S) this.f1525t).f1564a.onReady();
                return;
            case 1:
                ((C0704Y) this.f1525t).f1624s.mo151d();
                return;
            case 2:
                C0643D0 c0643d0 = (C0643D0) ((RunnableC0666L) this.f1525t).f1496t;
                InterfaceC0752k1 interfaceC0752k1 = c0643d0.f1429r;
                c0643d0.f1428q = null;
                c0643d0.f1429r = null;
                interfaceC0752k1.mo1563b(C0589w0.f1284n.m1354g("InternalSubchannel closed transport due to address change"));
                return;
            case 3:
                ((C0720c1) ((C0660J) this.f1525t).f1473b).m1603B();
                return;
            case 4:
                C0720c1 c0720c1 = ((C0693U0) this.f1525t).f1586e;
                c0720c1.f1785m.m1237d();
                if (c0720c1.f1795w) {
                    c0720c1.f1794v.mo1246l();
                    return;
                }
                return;
            case 5:
                C0643D0 c0643d1 = ((C0716b1) this.f1525t).f1694f;
                c0643d1.f1422k.execute(new RunnableC0795v0(c0643d1, C0720c1.f1740h0, 0));
                return;
            case 6:
                C0799w1 c0799w1 = (C0799w1) this.f1525t;
                c0799w1.f2083k = null;
                if (c0799w1.f2080h.m1678b()) {
                    c0799w1.mo1268e();
                    return;
                }
                return;
            case 7:
                ((AbstractC0522D) ((C0792u1) this.f1525t).f2056c).mo1247m();
                return;
            case 8:
                C0684R0 c0684r0 = (C0684R0) this.f1525t;
                if (c0684r0.f1562z) {
                    return;
                }
                c0684r0.f1557u.mo151d();
                return;
            case 9:
                RunnableC0703X1 runnableC0703X1 = (RunnableC0703X1) this.f1525t;
                C0684R0 c0684r1 = (C0684R0) runnableC0703X1.f1623u.f2061u;
                C0709Z1 c0709z1 = runnableC0703X1.f1622t;
                C0549c0 c0549c0 = C0684R0.f1529E;
                c0684r1.m1555r(c0709z1);
                return;
            case 10:
                ((C0729e2) this.f1525t).mo1246l();
                return;
            case 11:
                C0822c c0822c = (C0822c) this.f1525t;
                C0833n c0833n = c0822c.f2164v;
                try {
                    C0609c c0609c = c0822c.f2156A;
                    if (c0609c != null) {
                        C0613g c0613g = c0822c.f2162t;
                        long j2 = c0613g.f1342t;
                        if (j2 > 0) {
                            c0609c.mo1356s(c0613g, j2);
                        }
                    }
                } catch (IOException e) {
                    c0833n.m1726o(e);
                }
                try {
                    C0609c c0609c2 = c0822c.f2156A;
                    if (c0609c2 != null) {
                        c0609c2.close();
                    }
                } catch (IOException e2) {
                    c0833n.m1726o(e2);
                }
                try {
                    Socket socket = c0822c.f2157B;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    c0833n.m1726o(e3);
                    return;
                }
            case 12:
                C0730f c0730f = (C0730f) this.f1525t;
                long j3 = c0730f.f1853a;
                long jMax = Math.max(2 * j3, j3);
                C0734g c0734g = c0730f.f1854b;
                if (c0734g.f1869b.compareAndSet(j3, jMax)) {
                    C0734g.f1867c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{c0734g.f1868a, Long.valueOf(jMax)});
                    return;
                }
                return;
            default:
                ((C0833n) this.f1525t).getClass();
                C0833n c0833n2 = (C0833n) this.f1525t;
                c0833n2.f2270o.execute(c0833n2.f2275t);
                synchronized (((C0833n) this.f1525t).f2266k) {
                    C0833n c0833n3 = (C0833n) this.f1525t;
                    c0833n3.f2243C = Integer.MAX_VALUE;
                    c0833n3.m1729s();
                    break;
                }
                ((C0833n) this.f1525t).getClass();
                return;
        }
    }
}
