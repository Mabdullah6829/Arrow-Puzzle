package p000A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;
import p001B.C0084j;
import p010F0.AbstractC0215a;
import p010F0.C0219e;
import p011H.AbstractC0243G;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: A0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0043j extends AbstractC0026a0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55w;

    /* JADX INFO: renamed from: x */
    public final Object f56x;

    public /* synthetic */ C0043j(Object obj, int i2) {
        this.f55w = i2;
        this.f56x = obj;
    }

    @Override // p000A0.AbstractC0026a0
    /* JADX INFO: renamed from: j */
    public final boolean mo26j() {
        switch (this.f55w) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override // p000A0.AbstractC0026a0
    /* JADX INFO: renamed from: k */
    public final void mo27k(Throwable th) {
        switch (this.f55w) {
            case 0:
                C0039h c0039h = (C0039h) this.f56x;
                Throwable thMo39p = c0039h.mo39p(m38i());
                if (c0039h.m90v()) {
                    C0219e c0219e = (C0219e) c0039h.f51v;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0219e.f434z;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c0219e);
                        C0084j c0084j = AbstractC0215a.f425c;
                        if (AbstractC6452k.m12177a(obj, c0084j)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c0219e, c0084j, thMo39p)) {
                                if (atomicReferenceFieldUpdater.get(c0219e) != c0084j) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(c0219e, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(c0219e) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                c0039h.m82m(thMo39p);
                if (!c0039h.m90v()) {
                    c0039h.m83n();
                }
                break;
            case 1:
                ((InterfaceC6498l) this.f56x).invoke(th);
                break;
            default:
                C0028b0 c0028b0 = (C0028b0) this.f56x;
                Object obj2 = C0034e0.f43s.get(m38i());
                if (!(obj2 instanceof C0055p)) {
                    c0028b0.resumeWith(AbstractC0069y.m117p(obj2));
                } else {
                    c0028b0.resumeWith(AbstractC0243G.m372j(((C0055p) obj2).f68a));
                }
                break;
        }
    }
}
