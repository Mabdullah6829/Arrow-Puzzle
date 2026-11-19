package p034T;

import p001B.AbstractC0076b;
import p030R.AbstractC0566l;
import p030R.AbstractC0570n;
import p030R.C0529K;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;
import p030R.C0568m;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0735g0 implements InterfaceC0639C {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1870a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f1871b;

    /* JADX INFO: renamed from: c */
    public final Object f1872c;

    public C0735g0(C0589w0 c0589w0, EnumC0633A enumC0633A) {
        AbstractC0076b.m131f(!c0589w0.m1352e(), "error must not be OK");
        this.f1871b = c0589w0;
        this.f1872c = enumC0633A;
    }

    @Override // p034T.InterfaceC0639C
    /* JADX INFO: renamed from: c */
    public final InterfaceC0806z mo1483c(C0567l0 c0567l0, C0559h0 c0559h0, C0556g c0556g, AbstractC0570n[] abstractC0570nArr) {
        int i2 = this.f1870a;
        Object obj = this.f1872c;
        Object obj2 = this.f1871b;
        switch (i2) {
            case 0:
                return new C0731f0((C0589w0) obj2, (EnumC0633A) obj, abstractC0570nArr);
            default:
                C0556g c0556g2 = C0556g.f1174i;
                AbstractC0076b.m133h(c0556g, "callOptions cannot be null");
                AbstractC0570n abstractC0570nMo1316a = ((AbstractC0566l) obj2).mo1316a(new C0568m(c0556g, 0, false), c0559h0);
                AbstractC0076b.m139n(abstractC0570nArr[abstractC0570nArr.length - 1] == AbstractC0759m0.f1933o, "lb tracer already assigned");
                abstractC0570nArr[abstractC0570nArr.length - 1] = abstractC0570nMo1316a;
                return ((InterfaceC0752k1) obj).mo1483c(c0567l0, c0559h0, c0556g, abstractC0570nArr);
        }
    }

    @Override // p030R.InterfaceC0528J
    /* JADX INFO: renamed from: d */
    public final C0529K mo1253d() {
        switch (this.f1870a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((InterfaceC0752k1) this.f1872c).mo1253d();
        }
    }

    public C0735g0(AbstractC0566l abstractC0566l, InterfaceC0752k1 interfaceC0752k1) {
        this.f1871b = abstractC0566l;
        this.f1872c = interfaceC0752k1;
    }
}
