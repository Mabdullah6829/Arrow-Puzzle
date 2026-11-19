package p030R;

import java.util.List;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: R.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0522D {
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: f */
    public C0594z m1240f() {
        boolean z;
        List listMo1241g = mo1241g();
        if (listMo1241g != null) {
            z = listMo1241g.size() == 1;
        }
        AbstractC0076b.m137l("%s does not have exactly one group", z, listMo1241g);
        return (C0594z) listMo1241g.get(0);
    }

    /* JADX INFO: renamed from: g */
    public abstract List mo1241g();

    public abstract C0546b getAttributes();

    /* JADX INFO: renamed from: h */
    public abstract AbstractC0558h mo1242h();

    /* JADX INFO: renamed from: i */
    public abstract Object mo1243i();

    /* JADX INFO: renamed from: j */
    public abstract String mo1244j();

    /* JADX INFO: renamed from: k */
    public abstract AbstractC0562j mo1245k(C0567l0 c0567l0, C0556g c0556g);

    /* JADX INFO: renamed from: l */
    public abstract void mo1246l();

    /* JADX INFO: renamed from: m */
    public abstract void mo1247m();

    /* JADX INFO: renamed from: n */
    public abstract void mo1248n();

    /* JADX INFO: renamed from: o */
    public abstract void mo1249o(AbstractC0558h abstractC0558h);

    /* JADX INFO: renamed from: p */
    public abstract void mo1250p(InterfaceC0537T interfaceC0537T);

    /* JADX INFO: renamed from: q */
    public abstract void mo1251q(List list);
}
