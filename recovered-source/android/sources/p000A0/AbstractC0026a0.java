package p000A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;
import p010F0.C0223i;
import p010F0.C0229o;

/* JADX INFO: renamed from: A0.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0026a0 extends C0223i implements InterfaceC0008I, InterfaceC0018T {

    /* JADX INFO: renamed from: v */
    public C0034e0 f27v;

    @Override // p000A0.InterfaceC0018T
    /* JADX INFO: renamed from: c */
    public final boolean mo10c() {
        return true;
    }

    @Override // p000A0.InterfaceC0018T
    /* JADX INFO: renamed from: d */
    public final C0038g0 mo11d() {
        return null;
    }

    @Override // p000A0.InterfaceC0008I
    public final void dispose() {
        C0034e0 c0034e0M38i = m38i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0034e0.f43s;
            Object obj = atomicReferenceFieldUpdater.get(c0034e0M38i);
            if (obj instanceof AbstractC0026a0) {
                if (obj != this) {
                    return;
                }
                C0009J c0009j = AbstractC0069y.f95j;
                while (!atomicReferenceFieldUpdater.compareAndSet(c0034e0M38i, obj, c0009j)) {
                    if (atomicReferenceFieldUpdater.get(c0034e0M38i) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC0018T) || ((InterfaceC0018T) obj).mo11d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0223i.f447s;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C0229o) {
                    C0223i c0223i = ((C0229o) obj2).f463a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                AbstractC6452k.m12179c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                C0223i c0223i2 = (C0223i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C0223i.f449u;
                C0229o c0229o = (C0229o) atomicReferenceFieldUpdater3.get(c0223i2);
                if (c0229o == null) {
                    c0229o = new C0229o(c0223i2);
                    atomicReferenceFieldUpdater3.set(c0223i2, c0229o);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c0229o)) {
                        c0223i2.m314e();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    public InterfaceC0022X getParent() {
        return m38i();
    }

    /* JADX INFO: renamed from: i */
    public final C0034e0 m38i() {
        C0034e0 c0034e0 = this.f27v;
        if (c0034e0 != null) {
            return c0034e0;
        }
        AbstractC6452k.m12185i("job");
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo26j();

    /* JADX INFO: renamed from: k */
    public abstract void mo27k(Throwable th);

    @Override // p010F0.C0223i
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0069y.m107f(this) + "[job@" + AbstractC0069y.m107f(m38i()) + ']';
    }
}
