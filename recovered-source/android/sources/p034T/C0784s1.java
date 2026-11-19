package p034T;

import java.util.logging.Level;
import p030R.C0580s;
import p030R.EnumC0578r;
import p030R.InterfaceC0537T;

/* JADX INFO: renamed from: T.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0784s1 implements InterfaceC0537T {

    /* JADX INFO: renamed from: a */
    public C0580s f2034a = C0580s.m1341a(EnumC0578r.f1235v);

    /* JADX INFO: renamed from: b */
    public C0796v1 f2035b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0799w1 f2036c;

    public C0784s1(C0799w1 c0799w1) {
        this.f2036c = c0799w1;
    }

    @Override // p030R.InterfaceC0537T
    /* JADX INFO: renamed from: a */
    public final void mo1263a(C0580s c0580s) {
        C0799w1.f2077o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{c0580s, this.f2035b.f2068a});
        this.f2034a = c0580s;
        C0799w1 c0799w1 = this.f2036c;
        if (c0799w1.f2080h.m1679c() && ((C0796v1) c0799w1.f2079g.get(c0799w1.f2080h.m1677a())).f2070c == this) {
            c0799w1.m1672j(this.f2035b);
        }
    }
}
