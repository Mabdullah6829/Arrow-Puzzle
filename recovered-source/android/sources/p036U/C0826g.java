package p036U;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;
import p001B.AbstractC0076b;
import p001B.C0092r;
import p034T.C0640C0;
import p034T.C0642D;
import p034T.C0730f;
import p034T.C0734g;
import p034T.C0773p2;
import p034T.C0785s2;
import p034T.InterfaceC0645E;
import p034T.InterfaceC0654H;
import p034T.InterfaceC0769o2;
import p034T.RunnableC0681Q;
import p038V.C0849c;

/* JADX INFO: renamed from: U.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0826g implements InterfaceC0645E {

    /* JADX INFO: renamed from: A */
    public final boolean f2180A;

    /* JADX INFO: renamed from: B */
    public final C0734g f2181B;

    /* JADX INFO: renamed from: C */
    public final long f2182C;

    /* JADX INFO: renamed from: D */
    public final int f2183D;

    /* JADX INFO: renamed from: E */
    public final int f2184E;

    /* JADX INFO: renamed from: F */
    public boolean f2185F;

    /* JADX INFO: renamed from: s */
    public final C0092r f2186s;

    /* JADX INFO: renamed from: t */
    public final Executor f2187t;

    /* JADX INFO: renamed from: u */
    public final C0092r f2188u;

    /* JADX INFO: renamed from: v */
    public final ScheduledExecutorService f2189v;

    /* JADX INFO: renamed from: w */
    public final C0785s2 f2190w;

    /* JADX INFO: renamed from: x */
    public final SSLSocketFactory f2191x;

    /* JADX INFO: renamed from: y */
    public final C0849c f2192y;

    /* JADX INFO: renamed from: z */
    public final int f2193z;

    public C0826g(C0092r c0092r, C0092r c0092r2, SSLSocketFactory sSLSocketFactory, C0849c c0849c, int i2, boolean z, long j2, long j3, int i3, int i4, C0785s2 c0785s2) {
        this.f2186s = c0092r;
        this.f2187t = (Executor) C0773p2.m1652a((InterfaceC0769o2) c0092r.f130t);
        this.f2188u = c0092r2;
        this.f2189v = (ScheduledExecutorService) C0773p2.m1652a((InterfaceC0769o2) c0092r2.f130t);
        this.f2191x = sSLSocketFactory;
        this.f2192y = c0849c;
        this.f2193z = i2;
        this.f2180A = z;
        this.f2181B = new C0734g(j2);
        this.f2182C = j3;
        this.f2183D = i3;
        this.f2184E = i4;
        AbstractC0076b.m133h(c0785s2, "transportTracerFactory");
        this.f2190w = c0785s2;
    }

    @Override // p034T.InterfaceC0645E
    /* JADX INFO: renamed from: D */
    public final InterfaceC0654H mo1488D(SocketAddress socketAddress, C0642D c0642d, C0640C0 c0640c0) {
        if (this.f2185F) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        C0734g c0734g = this.f2181B;
        long j2 = c0734g.f1869b.get();
        C0833n c0833n = new C0833n(this, (InetSocketAddress) socketAddress, c0642d.f1409a, c0642d.f1410b, c0642d.f1411c, new RunnableC0681Q(new C0730f(c0734g, j2), 12));
        if (this.f2180A) {
            c0833n.f2247G = true;
            c0833n.f2248H = j2;
            c0833n.f2249I = this.f2182C;
        }
        return c0833n;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2185F) {
            return;
        }
        this.f2185F = true;
        C0773p2.m1653b((InterfaceC0769o2) this.f2186s.f130t, this.f2187t);
        C0773p2.m1653b((InterfaceC0769o2) this.f2188u.f130t, this.f2189v);
    }
}
