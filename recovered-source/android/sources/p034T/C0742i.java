package p034T;

import java.util.HashSet;
import java.util.concurrent.Executor;
import p001B.C0086l;
import p030R.C0589w0;
import p050c0.InterfaceC1888a;
import p074m.InterfaceC6475b;
import p079q.C6512c;
import p079q.C6519j;
import p081r.InterfaceC6525d;
import p082s.InterfaceC6534b;

/* JADX INFO: renamed from: T.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0742i implements InterfaceC6475b {

    /* JADX INFO: renamed from: t */
    public Object f1887t = AbstractC0761m2.m1632n();

    /* JADX INFO: renamed from: u */
    public Object f1888u = AbstractC0761m2.m1632n();

    /* JADX INFO: renamed from: v */
    public Object f1889v = AbstractC0761m2.m1632n();

    /* JADX INFO: renamed from: s */
    public Object f1886s = C0785s2.f2037t;

    /* JADX INFO: renamed from: a */
    public void m1614a(C0589w0 c0589w0) {
        synchronized (this.f1886s) {
            try {
                if (((C0589w0) this.f1888u) != null) {
                    return;
                }
                this.f1888u = c0589w0;
                boolean zIsEmpty = ((HashSet) this.f1887t).isEmpty();
                if (zIsEmpty) {
                    ((C0720c1) this.f1889v).f1748E.mo1563b(c0589w0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p050c0.InterfaceC1888a
    public Object get() {
        return new C6519j((Executor) ((InterfaceC1888a) this.f1886s).get(), (InterfaceC6525d) ((InterfaceC1888a) this.f1887t).get(), (C6512c) ((C0086l) this.f1888u).get(), (InterfaceC6534b) ((InterfaceC1888a) this.f1889v).get());
    }
}
