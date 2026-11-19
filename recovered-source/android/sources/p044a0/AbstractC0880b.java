package p044a0;

import java.util.List;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.AbstractC0522D;
import p030R.AbstractC0558h;

/* JADX INFO: renamed from: a0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0880b extends AbstractC0522D {
    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: g */
    public final List mo1241g() {
        return mo1807r().mo1241g();
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: h */
    public final AbstractC0558h mo1242h() {
        return mo1807r().mo1242h();
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: i */
    public final Object mo1243i() {
        return mo1807r().mo1243i();
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: m */
    public final void mo1247m() {
        mo1807r().mo1247m();
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: n */
    public void mo1248n() {
        mo1807r().mo1248n();
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: q */
    public void mo1251q(List list) {
        mo1807r().mo1251q(list);
    }

    /* JADX INFO: renamed from: r */
    public abstract AbstractC0522D mo1807r();

    public String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(mo1807r(), "delegate");
        return c0087mM143s.toString();
    }
}
