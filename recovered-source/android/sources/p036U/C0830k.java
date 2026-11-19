package p036U;

import p001B.C0092r;
import p024O.C0463f;
import p030R.C0546b;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;
import p033S0.C0613g;
import p034T.AbstractC0718c;
import p034T.C0777q2;
import p034T.C0793u2;
import p049b0.C1887c;

/* JADX INFO: renamed from: U.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0830k extends AbstractC0718c {

    /* JADX INFO: renamed from: r */
    public static final C0613g f2226r = new C0613g();

    /* JADX INFO: renamed from: j */
    public final C0567l0 f2227j;

    /* JADX INFO: renamed from: k */
    public final String f2228k;

    /* JADX INFO: renamed from: l */
    public final C0777q2 f2229l;

    /* JADX INFO: renamed from: m */
    public final String f2230m;

    /* JADX INFO: renamed from: n */
    public final C0829j f2231n;

    /* JADX INFO: renamed from: o */
    public final C0092r f2232o;

    /* JADX INFO: renamed from: p */
    public final C0546b f2233p;

    /* JADX INFO: renamed from: q */
    public boolean f2234q;

    public C0830k(C0567l0 c0567l0, C0559h0 c0559h0, C0823d c0823d, C0833n c0833n, C0463f c0463f, Object obj, int i2, int i3, String str, String str2, C0777q2 c0777q2, C0793u2 c0793u2, C0556g c0556g) {
        super(new C1887c(5), c0777q2, c0793u2, c0559h0, c0556g, false);
        this.f2232o = new C0092r(this, 9);
        this.f2234q = false;
        this.f2229l = c0777q2;
        this.f2227j = c0567l0;
        this.f2230m = str;
        this.f2228k = str2;
        this.f2233p = c0833n.f2276u;
        String str3 = c0567l0.f1201b;
        this.f2231n = new C0829j(this, i2, c0777q2, obj, c0823d, c0463f, c0833n, i3);
    }

    @Override // p034T.InterfaceC0806z
    public final C0546b getAttributes() {
        return this.f2233p;
    }
}
