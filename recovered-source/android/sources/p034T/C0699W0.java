package p034T;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p030R.AbstractC0522D;
import p030R.AbstractC0562j;
import p030R.C0556g;
import p030R.C0567l0;

/* JADX INFO: renamed from: T.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0699W0 extends AbstractC0522D {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0708Z0 f1608a;

    public C0699W0(C0708Z0 c0708z0) {
        this.f1608a = c0708z0;
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: k */
    public final AbstractC0562j mo1245k(C0567l0 c0567l0, C0556g c0556g) {
        C0720c1 c0720c1 = this.f1608a.f1656d;
        Logger logger = C0720c1.f1736d0;
        Executor executor = c0556g.f1176b;
        if (executor == null) {
            executor = c0720c1.f1780h;
        }
        C0803y c0803y = new C0803y(c0567l0, executor, c0556g, c0720c1.f1771a0, c0720c1.f1753J ? null : this.f1608a.f1656d.f1778f.f2014s.f2189v, this.f1608a.f1656d.f1756M);
        c0803y.f2109o = this.f1608a.f1656d.f1786n;
        return c0803y;
    }
}
