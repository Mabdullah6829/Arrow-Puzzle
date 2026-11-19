package p034T;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import p030R.InterfaceC0528J;
import p036U.C0833n;

/* JADX INFO: renamed from: T.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0787t0 {

    /* JADX INFO: renamed from: a */
    public final Set f2042a = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2043b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0528J f2044c;

    public C0787t0(InterfaceC0528J interfaceC0528J, int i2) {
        this.f2043b = i2;
        this.f2044c = interfaceC0528J;
    }

    /* JADX INFO: renamed from: a */
    public final void m1664a(Object obj, boolean z) {
        Set set = this.f2042a;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                switch (this.f2043b) {
                    case 0:
                        C0643D0 c0643d0 = (C0643D0) this.f2044c;
                        ((C0716b1) c0643d0.f1415d.f2061u).f1698j.f1769Z.m1664a(c0643d0, true);
                        break;
                    case 1:
                        ((C0720c1) this.f2044c).m1603B();
                        break;
                    default:
                        ((C0833n) this.f2044c).f2263h.m1480b(true);
                        break;
                }
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            switch (this.f2043b) {
                case 0:
                    C0643D0 c0643d1 = (C0643D0) this.f2044c;
                    ((C0716b1) c0643d1.f1415d.f2061u).f1698j.f1769Z.m1664a(c0643d1, false);
                    break;
                case 1:
                    C0720c1 c0720c1 = (C0720c1) this.f2044c;
                    if (!c0720c1.f1750G.get()) {
                        c0720c1.m1604D();
                        break;
                    }
                    break;
                default:
                    ((C0833n) this.f2044c).f2263h.m1480b(false);
                    break;
            }
        }
    }
}
