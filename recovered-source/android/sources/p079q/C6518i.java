package p079q;

import android.content.Context;
import java.util.concurrent.Executor;
import p001B.C0086l;
import p049b0.C1887c;
import p050c0.InterfaceC1888a;
import p072l.C6471f;
import p074m.InterfaceC6475b;
import p081r.InterfaceC6524c;
import p081r.InterfaceC6525d;
import p082s.InterfaceC6534b;

/* JADX INFO: renamed from: q.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6518i implements InterfaceC6475b {

    /* JADX INFO: renamed from: s */
    public final InterfaceC1888a f24725s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC1888a f24726t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC1888a f24727u;

    /* JADX INFO: renamed from: v */
    public final C0086l f24728v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC1888a f24729w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC1888a f24730x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC1888a f24731y;

    public C6518i(InterfaceC1888a interfaceC1888a, InterfaceC1888a interfaceC1888a2, InterfaceC1888a interfaceC1888a3, C0086l c0086l, InterfaceC1888a interfaceC1888a4, InterfaceC1888a interfaceC1888a5, InterfaceC1888a interfaceC1888a6) {
        this.f24725s = interfaceC1888a;
        this.f24726t = interfaceC1888a2;
        this.f24727u = interfaceC1888a3;
        this.f24728v = c0086l;
        this.f24729w = interfaceC1888a4;
        this.f24730x = interfaceC1888a5;
        this.f24731y = interfaceC1888a6;
    }

    @Override // p050c0.InterfaceC1888a
    public final Object get() {
        return new C6517h((Context) this.f24725s.get(), (C6471f) this.f24726t.get(), (InterfaceC6525d) this.f24727u.get(), (C6512c) this.f24728v.get(), (Executor) this.f24729w.get(), (InterfaceC6534b) this.f24730x.get(), new C1887c(11), new C1887c(10), (InterfaceC6524c) this.f24731y.get());
    }
}
