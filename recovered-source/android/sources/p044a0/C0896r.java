package p044a0;

import p030R.AbstractC0566l;
import p030R.AbstractC0570n;
import p030R.C0559h0;
import p030R.C0568m;

/* JADX INFO: renamed from: a0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0896r extends AbstractC0566l {

    /* JADX INFO: renamed from: a */
    public final C0889k f2514a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0566l f2515b;

    public C0896r(C0889k c0889k, AbstractC0566l abstractC0566l) {
        this.f2514a = c0889k;
        this.f2515b = abstractC0566l;
    }

    @Override // p030R.AbstractC0566l
    /* JADX INFO: renamed from: a */
    public final AbstractC0570n mo1316a(C0568m c0568m, C0559h0 c0559h0) {
        AbstractC0566l abstractC0566l = this.f2515b;
        return abstractC0566l != null ? new C0894p(this, abstractC0566l.mo1316a(c0568m, c0559h0)) : new C0895q(this);
    }
}
