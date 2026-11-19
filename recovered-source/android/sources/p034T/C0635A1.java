package p034T;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p030R.AbstractC0522D;
import p030R.AbstractC0538U;
import p030R.AbstractC0558h;
import p030R.C0533O;
import p030R.C0534P;
import p030R.C0535Q;
import p030R.C0589w0;
import p030R.EnumC0578r;

/* JADX INFO: renamed from: T.A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0635A1 extends AbstractC0538U {

    /* JADX INFO: renamed from: f */
    public final AbstractC0558h f1398f;

    /* JADX INFO: renamed from: g */
    public AbstractC0522D f1399g;

    /* JADX INFO: renamed from: h */
    public EnumC0578r f1400h = EnumC0578r.f1235v;

    public C0635A1(AbstractC0558h abstractC0558h) {
        this.f1398f = abstractC0558h;
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: a */
    public final C0589w0 mo1264a(C0535Q c0535q) {
        Boolean bool;
        List list = c0535q.f1140a;
        if (list.isEmpty()) {
            C0589w0 c0589w0M1354g = C0589w0.f1284n.m1354g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + c0535q.f1141b);
            mo1266c(c0589w0M1354g);
            return c0589w0M1354g;
        }
        Object obj = c0535q.f1142c;
        if ((obj instanceof C0805y1) && (bool = ((C0805y1) obj).f2112a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        AbstractC0522D abstractC0522D = this.f1399g;
        if (abstractC0522D == null) {
            C0533O c0533oM1256c = C0533O.m1256c();
            c0533oM1256c.m1259d(list);
            C0533O c0533o = new C0533O(c0533oM1256c.f1132b, c0533oM1256c.f1133c, c0533oM1256c.f1134d);
            AbstractC0558h abstractC0558h = this.f1398f;
            AbstractC0522D abstractC0522DMo1295a = abstractC0558h.mo1295a(c0533o);
            abstractC0522DMo1295a.mo1250p(new C0802x1(this, abstractC0522DMo1295a));
            this.f1399g = abstractC0522DMo1295a;
            C0808z1 c0808z1 = new C0808z1(C0534P.m1261b(abstractC0522DMo1295a, null));
            EnumC0578r enumC0578r = EnumC0578r.f1232s;
            this.f1400h = enumC0578r;
            abstractC0558h.mo1304k(enumC0578r, c0808z1);
            abstractC0522DMo1295a.mo1247m();
        } else {
            abstractC0522D.mo1251q(list);
        }
        return C0589w0.f1275e;
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: c */
    public final void mo1266c(C0589w0 c0589w0) {
        AbstractC0522D abstractC0522D = this.f1399g;
        if (abstractC0522D != null) {
            abstractC0522D.mo1248n();
            this.f1399g = null;
        }
        C0808z1 c0808z1 = new C0808z1(C0534P.m1260a(c0589w0));
        EnumC0578r enumC0578r = EnumC0578r.f1234u;
        this.f1400h = enumC0578r;
        this.f1398f.mo1304k(enumC0578r, c0808z1);
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: e */
    public final void mo1268e() {
        AbstractC0522D abstractC0522D = this.f1399g;
        if (abstractC0522D != null) {
            abstractC0522D.mo1247m();
        }
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: f */
    public final void mo1269f() {
        AbstractC0522D abstractC0522D = this.f1399g;
        if (abstractC0522D != null) {
            abstractC0522D.mo1248n();
        }
    }
}
