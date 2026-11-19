package p069k;

import java.io.Closeable;
import p001B.C0092r;
import p050c0.InterfaceC1888a;
import p081r.C6526e;
import p081r.C6530i;
import p081r.InterfaceC6525d;

/* JADX INFO: renamed from: k.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6431l implements Closeable {

    /* JADX INFO: renamed from: s */
    public InterfaceC1888a f24601s;

    /* JADX INFO: renamed from: t */
    public C0092r f24602t;

    /* JADX INFO: renamed from: u */
    public InterfaceC1888a f24603u;

    /* JADX INFO: renamed from: v */
    public C6526e f24604v;

    /* JADX INFO: renamed from: w */
    public InterfaceC1888a f24605w;

    /* JADX INFO: renamed from: x */
    public InterfaceC1888a f24606x;

    /* JADX INFO: renamed from: y */
    public InterfaceC1888a f24607y;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C6530i) ((InterfaceC6525d) this.f24606x.get())).close();
    }
}
