package p004C0;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.InterfaceC0064t0;
import p010F0.AbstractC0232r;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: C0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0146k extends AbstractC0232r {

    /* JADX INFO: renamed from: e */
    public final C0138c f258e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f259f;

    public C0146k(long j2, C0146k c0146k, C0138c c0138c, int i2) {
        super(j2, c0146k, i2);
        this.f258e = c0138c;
        this.f259f = new AtomicReferenceArray(AbstractC0140e.f234b * 2);
    }

    @Override // p010F0.AbstractC0232r
    /* JADX INFO: renamed from: f */
    public final int mo245f() {
        return AbstractC0140e.f234b;
    }

    @Override // p010F0.AbstractC0232r
    /* JADX INFO: renamed from: g */
    public final void mo246g(int i2, InterfaceC6353h interfaceC6353h) {
        C0138c c0138c;
        int i3 = AbstractC0140e.f234b;
        boolean z = i2 >= i3;
        if (z) {
            i2 -= i3;
        }
        this.f259f.get(i2 * 2);
        while (true) {
            Object objM248k = m248k(i2);
            boolean z2 = objM248k instanceof InterfaceC0064t0;
            c0138c = this.f258e;
            if (z2 || (objM248k instanceof C0155t)) {
                if (m247j(i2, objM248k, z ? AbstractC0140e.f242j : AbstractC0140e.f243k)) {
                    m250m(i2, null);
                    m249l(i2, !z);
                    if (z) {
                        AbstractC6452k.m12178b(c0138c);
                        return;
                    }
                    return;
                }
            } else {
                if (objM248k == AbstractC0140e.f242j || objM248k == AbstractC0140e.f243k) {
                    break;
                }
                if (objM248k != AbstractC0140e.f239g && objM248k != AbstractC0140e.f238f) {
                    if (objM248k == AbstractC0140e.f241i || objM248k == AbstractC0140e.f236d || objM248k == AbstractC0140e.f244l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objM248k).toString());
                }
            }
        }
        m250m(i2, null);
        if (z) {
            AbstractC6452k.m12178b(c0138c);
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m247j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i3 = (i2 * 2) + 1;
        do {
            atomicReferenceArray = this.f259f;
            if (atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i3) == obj);
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final Object m248k(int i2) {
        return this.f259f.get((i2 * 2) + 1);
    }

    /* JADX INFO: renamed from: l */
    public final void m249l(int i2, boolean z) {
        if (z) {
            C0138c c0138c = this.f258e;
            AbstractC6452k.m12178b(c0138c);
            c0138c.m222F((this.f466c * ((long) AbstractC0140e.f234b)) + ((long) i2));
        }
        m329h();
    }

    /* JADX INFO: renamed from: m */
    public final void m250m(int i2, Object obj) {
        this.f259f.set(i2 * 2, obj);
    }

    /* JADX INFO: renamed from: n */
    public final void m251n(int i2, Object obj) {
        this.f259f.set((i2 * 2) + 1, obj);
    }
}
