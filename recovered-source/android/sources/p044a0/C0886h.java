package p044a0;

import p030R.AbstractC0522D;
import p030R.AbstractC0536S;
import p030R.AbstractC0538U;
import p030R.AbstractC0558h;
import p030R.C0533O;
import p030R.EnumC0578r;
import p030R.InterfaceC0537T;

/* JADX INFO: renamed from: a0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0886h extends AbstractC0879a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2479d;

    /* JADX INFO: renamed from: e */
    public final Object f2480e;

    public /* synthetic */ C0886h(Object obj, int i2) {
        this.f2479d = i2;
        this.f2480e = obj;
    }

    @Override // p044a0.AbstractC0879a, p030R.AbstractC0558h
    /* JADX INFO: renamed from: a */
    public AbstractC0522D mo1295a(C0533O c0533o) {
        switch (this.f2479d) {
            case 0:
                InterfaceC0537T interfaceC0537T = (InterfaceC0537T) c0533o.m1258b();
                AbstractC0522D abstractC0522DMo1295a = super.mo1295a(c0533o);
                if (interfaceC0537T != null) {
                    return abstractC0522DMo1295a.getAttributes().f1155a.get(AbstractC0538U.f1145d) == null ? new C0885g(abstractC0522DMo1295a, interfaceC0537T) : abstractC0522DMo1295a;
                }
                return abstractC0522DMo1295a;
            default:
                return super.mo1295a(c0533o);
        }
    }

    @Override // p044a0.AbstractC0879a, p030R.AbstractC0558h
    /* JADX INFO: renamed from: k */
    public void mo1304k(EnumC0578r enumC0578r, AbstractC0536S abstractC0536S) {
        switch (this.f2479d) {
            case 1:
                C0887i c0887i = (C0887i) this.f2480e;
                C0902x c0902x = c0887i.f2487g;
                if (c0902x.f2536f.containsKey(c0887i.f2481a)) {
                    c0887i.f2484d = enumC0578r;
                    c0887i.f2485e = abstractC0536S;
                    if (!c0887i.f2486f && !c0902x.f2538h) {
                        if (enumC0578r == EnumC0578r.f1235v) {
                            c0887i.f2482b.mo1268e();
                        }
                        c0902x.m1824j();
                        break;
                    }
                }
                break;
            default:
                super.mo1304k(enumC0578r, abstractC0536S);
                break;
        }
    }

    @Override // p044a0.AbstractC0879a
    /* JADX INFO: renamed from: l */
    public final AbstractC0558h mo1806l() {
        switch (this.f2479d) {
            case 0:
                return (AbstractC0558h) this.f2480e;
            default:
                return ((C0887i) this.f2480e).f2487g.f2537g;
        }
    }
}
