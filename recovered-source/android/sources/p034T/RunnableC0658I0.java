package p034T;

import io.grpc.StatusException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.C0092r;
import p001B.C0096v;
import p011H.EnumC0244H;
import p030R.C0589w0;
import p036U.C0833n;

/* JADX INFO: renamed from: T.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0658I0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1468s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0664K0 f1469t;

    public /* synthetic */ RunnableC0658I0(C0664K0 c0664k0, int i2) {
        this.f1468s = i2;
        this.f1469t = c0664k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0664K0 c0664k0;
        boolean z;
        long jNextLong;
        boolean z2 = true;
        switch (this.f1468s) {
            case 0:
                synchronized (this.f1469t) {
                    try {
                        c0664k0 = this.f1469t;
                        if (c0664k0.f1488d != 6) {
                            c0664k0.f1488d = 6;
                        } else {
                            z2 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z2) {
                    ((C0833n) c0664k0.f1487c.f130t).mo1564e(C0589w0.f1284n.m1354g("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            default:
                synchronized (this.f1469t) {
                    try {
                        C0664K0 c0664k1 = this.f1469t;
                        c0664k1.f1490f = null;
                        int i2 = c0664k1.f1488d;
                        if (i2 == 2) {
                            c0664k1.f1488d = 4;
                            c0664k1.f1489e = c0664k1.f1485a.schedule(c0664k1.f1491g, c0664k1.f1494j, TimeUnit.NANOSECONDS);
                            z = true;
                        } else {
                            if (i2 == 3) {
                                c0664k1.f1490f = c0664k1.f1485a.schedule(c0664k1.f1492h, c0664k1.f1493i - c0664k1.f1486b.m168a(), TimeUnit.NANOSECONDS);
                                this.f1469t.f1488d = 2;
                            }
                            z = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (z) {
                    C0092r c0092r = this.f1469t.f1487c;
                    C0833n c0833n = (C0833n) c0092r.f130t;
                    C0661J0 c0661j0 = new C0661J0(c0092r);
                    EnumC0244H enumC0244H = EnumC0244H.f483s;
                    synchronized (c0833n.f2266k) {
                        try {
                            AbstractC0076b.m138m(c0833n.f2264i != null);
                            if (c0833n.f2280y) {
                                StatusException statusExceptionM1723l = c0833n.m1723l();
                                Logger logger = C0779r0.f2023g;
                                try {
                                    enumC0244H.execute(new RunnableC0775q0(c0661j0, statusExceptionM1723l));
                                    break;
                                } catch (Throwable th3) {
                                    C0779r0.f2023g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
                                }
                                return;
                            }
                            C0779r0 c0779r0 = c0833n.f2279x;
                            if (c0779r0 != null) {
                                jNextLong = 0;
                                z2 = false;
                            } else {
                                jNextLong = c0833n.f2259d.nextLong();
                                C0096v c0096v = (C0096v) c0833n.f2260e.get();
                                c0096v.m169b();
                                C0779r0 c0779r1 = new C0779r0(jNextLong, c0096v);
                                c0833n.f2279x = c0779r1;
                                c0833n.f2252L.getClass();
                                c0779r0 = c0779r1;
                            }
                            if (z2) {
                                c0833n.f2264i.m1706h((int) (jNextLong >>> 32), (int) jNextLong, false);
                            }
                            synchronized (c0779r0) {
                                try {
                                    if (!c0779r0.f2027d) {
                                        c0779r0.f2026c.put(c0661j0, enumC0244H);
                                        return;
                                    }
                                    StatusException statusException = c0779r0.f2028e;
                                    RunnableC0775q0 runnableC0775q0 = statusException != null ? new RunnableC0775q0(c0661j0, statusException) : new RunnableC0775q0(c0661j0, c0779r0.f2029f);
                                    try {
                                        enumC0244H.execute(runnableC0775q0);
                                        return;
                                    } catch (Throwable th4) {
                                        C0779r0.f2023g.log(Level.SEVERE, "Failed to execute PingCallback", th4);
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
                return;
        }
    }
}
