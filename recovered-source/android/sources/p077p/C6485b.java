package p077p;

import java.util.concurrent.Executor;
import p001B.C0086l;
import p050c0.InterfaceC1888a;
import p072l.C6471f;
import p074m.InterfaceC6475b;
import p079q.C6512c;
import p081r.InterfaceC6525d;
import p082s.InterfaceC6534b;

/* JADX INFO: renamed from: p.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6485b implements InterfaceC6475b {

    /* JADX INFO: renamed from: s */
    public final InterfaceC1888a f24690s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC1888a f24691t;

    /* JADX INFO: renamed from: u */
    public final C0086l f24692u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC1888a f24693v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC1888a f24694w;

    public C6485b(InterfaceC1888a interfaceC1888a, InterfaceC1888a interfaceC1888a2, C0086l c0086l, InterfaceC1888a interfaceC1888a3, InterfaceC1888a interfaceC1888a4) {
        this.f24690s = interfaceC1888a;
        this.f24691t = interfaceC1888a2;
        this.f24692u = c0086l;
        this.f24693v = interfaceC1888a3;
        this.f24694w = interfaceC1888a4;
    }

    @Override // p050c0.InterfaceC1888a
    public final Object get() {
        return new C6484a((Executor) this.f24690s.get(), (C6471f) this.f24691t.get(), (C6512c) this.f24692u.get(), (InterfaceC6525d) this.f24693v.get(), (InterfaceC6534b) this.f24694w.get());
    }
}
