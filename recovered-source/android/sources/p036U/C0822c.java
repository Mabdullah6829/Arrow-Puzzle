package p036U;

import java.io.IOException;
import java.net.Socket;
import p001B.AbstractC0076b;
import p033S0.C0609c;
import p033S0.C0613g;
import p033S0.InterfaceC0601A;
import p034T.ExecutorC0749j2;
import p034T.RunnableC0681Q;
import p049b0.AbstractC1886b;

/* JADX INFO: renamed from: U.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0822c implements InterfaceC0601A {

    /* JADX INFO: renamed from: A */
    public C0609c f2156A;

    /* JADX INFO: renamed from: B */
    public Socket f2157B;

    /* JADX INFO: renamed from: C */
    public boolean f2158C;

    /* JADX INFO: renamed from: D */
    public int f2159D;

    /* JADX INFO: renamed from: E */
    public int f2160E;

    /* JADX INFO: renamed from: u */
    public final ExecutorC0749j2 f2163u;

    /* JADX INFO: renamed from: v */
    public final C0833n f2164v;

    /* JADX INFO: renamed from: w */
    public final int f2165w;

    /* JADX INFO: renamed from: s */
    public final Object f2161s = new Object();

    /* JADX INFO: renamed from: t */
    public final C0613g f2162t = new C0613g();

    /* JADX INFO: renamed from: x */
    public boolean f2166x = false;

    /* JADX INFO: renamed from: y */
    public boolean f2167y = false;

    /* JADX INFO: renamed from: z */
    public boolean f2168z = false;

    public C0822c(ExecutorC0749j2 executorC0749j2, C0833n c0833n) {
        AbstractC0076b.m133h(executorC0749j2, "executor");
        this.f2163u = executorC0749j2;
        this.f2164v = c0833n;
        this.f2165w = 10000;
    }

    /* JADX INFO: renamed from: c */
    public final void m1703c(C0609c c0609c, Socket socket) {
        AbstractC0076b.m139n(this.f2156A == null, "AsyncSink's becomeConnected should only be called once.");
        this.f2156A = c0609c;
        this.f2157B = socket;
    }

    @Override // p033S0.InterfaceC0601A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2168z) {
            return;
        }
        this.f2168z = true;
        this.f2163u.execute(new RunnableC0681Q(this, 11));
    }

    @Override // p033S0.InterfaceC0601A, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f2168z) {
            throw new IOException("closed");
        }
        AbstractC1886b.m2715c();
        try {
            synchronized (this.f2161s) {
                if (!this.f2167y) {
                    this.f2167y = true;
                    this.f2163u.execute(new C0820a(this, 1));
                }
            }
            AbstractC1886b.f2862a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1886b.f2862a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p033S0.InterfaceC0601A
    /* JADX INFO: renamed from: s */
    public final void mo1356s(C0613g c0613g, long j2) throws IOException {
        if (this.f2168z) {
            throw new IOException("closed");
        }
        AbstractC1886b.m2715c();
        try {
            synchronized (this.f2161s) {
                try {
                    this.f2162t.mo1356s(c0613g, j2);
                    int i2 = this.f2160E + this.f2159D;
                    this.f2160E = i2;
                    boolean z = false;
                    this.f2159D = 0;
                    if (!this.f2158C && i2 > this.f2165w) {
                        this.f2158C = true;
                        z = true;
                    } else if (!this.f2166x && !this.f2167y && this.f2162t.m1390c() > 0) {
                        this.f2166x = true;
                    }
                    if (z) {
                        try {
                            this.f2157B.close();
                        } catch (IOException e) {
                            this.f2164v.m1726o(e);
                        }
                    } else {
                        this.f2163u.execute(new C0820a(this, 0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            AbstractC1886b.f2862a.getClass();
        } catch (Throwable th2) {
            try {
                AbstractC1886b.f2862a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
