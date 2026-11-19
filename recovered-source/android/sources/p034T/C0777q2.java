package p034T;

import java.util.concurrent.atomic.AtomicBoolean;
import p030R.AbstractC0570n;

/* JADX INFO: renamed from: T.q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0777q2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0570n[] f2019a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f2020b = new AtomicBoolean(false);

    static {
        new C0777q2(new AbstractC0570n[0]);
    }

    public C0777q2(AbstractC0570n[] abstractC0570nArr) {
        this.f2019a = abstractC0570nArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m1654a(long j2) {
        for (AbstractC0570n abstractC0570n : this.f2019a) {
            abstractC0570n.mo1327g(j2);
        }
    }
}
