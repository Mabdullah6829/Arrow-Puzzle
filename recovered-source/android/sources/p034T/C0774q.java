package p034T;

import java.net.SocketAddress;
import p036U.C0826g;

/* JADX INFO: renamed from: T.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0774q implements InterfaceC0645E {

    /* JADX INFO: renamed from: s */
    public final C0826g f2014s;

    /* JADX INFO: renamed from: t */
    public final ExecutorC0690T0 f2015t;

    public C0774q(C0826g c0826g, ExecutorC0690T0 executorC0690T0) {
        this.f2014s = c0826g;
        this.f2015t = executorC0690T0;
    }

    @Override // p034T.InterfaceC0645E
    /* JADX INFO: renamed from: D */
    public final InterfaceC0654H mo1488D(SocketAddress socketAddress, C0642D c0642d, C0640C0 c0640c0) {
        return new C0770p(this, this.f2014s.mo1488D(socketAddress, c0642d, c0640c0), c0642d.f1409a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2014s.close();
    }
}
