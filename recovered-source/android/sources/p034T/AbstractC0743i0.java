package p034T;

import com.google.firebase.firestore.remote.RunnableC5964g;
import java.util.concurrent.TimeUnit;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.AbstractC0541X;
import p030R.AbstractC0562j;
import p030R.C0556g;
import p030R.C0567l0;
import p030R.EnumC0578r;

/* JADX INFO: renamed from: T.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0743i0 extends AbstractC0541X {

    /* JADX INFO: renamed from: a */
    public final C0720c1 f1890a;

    public AbstractC0743i0(C0720c1 c0720c1) {
        this.f1890a = c0720c1;
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: k */
    public final AbstractC0562j mo1245k(C0567l0 c0567l0, C0556g c0556g) {
        return this.f1890a.f1792t.mo1245k(c0567l0, c0556g);
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: r */
    public final boolean mo1276r(long j2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return this.f1890a.mo1276r(j2);
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: s */
    public final void mo1277s() {
        this.f1890a.mo1277s();
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: t */
    public final EnumC0578r mo1278t() {
        return this.f1890a.mo1278t();
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1890a, "delegate");
        return c0087mM143s.toString();
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: u */
    public final void mo1279u(EnumC0578r enumC0578r, RunnableC5964g runnableC5964g) {
        this.f1890a.mo1279u(enumC0578r, runnableC5964g);
    }
}
