package p034T;

import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.AbstractC0522D;
import p030R.AbstractC0536S;
import p030R.C0534P;
import p030R.C0546b;
import p044a0.C0889k;
import p044a0.C0896r;
import p044a0.C0898t;

/* JADX INFO: renamed from: T.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0808z1 extends AbstractC0536S {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2116a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f2117b;

    public C0808z1(C0534P c0534p) {
        AbstractC0076b.m133h(c0534p, "result");
        this.f2117b = c0534p;
    }

    @Override // p030R.AbstractC0536S
    /* JADX INFO: renamed from: a */
    public final C0534P mo1262a(C0641C1 c0641c1) {
        switch (this.f2116a) {
            case 0:
                return (C0534P) this.f2117b;
            default:
                C0534P c0534pMo1262a = ((AbstractC0536S) this.f2117b).mo1262a(c0641c1);
                AbstractC0522D abstractC0522D = c0534pMo1262a.f1136a;
                if (abstractC0522D == null) {
                    return c0534pMo1262a;
                }
                C0546b attributes = abstractC0522D.getAttributes();
                return C0534P.m1261b(abstractC0522D, new C0896r((C0889k) attributes.f1155a.get(C0898t.f2523n), c0534pMo1262a.f1137b));
        }
    }

    public String toString() {
        switch (this.f2116a) {
            case 0:
                C0087m c0087m = new C0087m(C0808z1.class.getSimpleName());
                c0087m.m158b((C0534P) this.f2117b, "result");
                return c0087m.toString();
            default:
                return super.toString();
        }
    }

    public C0808z1(AbstractC0536S abstractC0536S) {
        this.f2117b = abstractC0536S;
    }
}
