package p010F0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;

/* JADX INFO: renamed from: F0.i */
/* JADX INFO: loaded from: classes.dex */
public class C0223i {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f447s = AtomicReferenceFieldUpdater.newUpdater(C0223i.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f448t = AtomicReferenceFieldUpdater.newUpdater(C0223i.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f449u = AtomicReferenceFieldUpdater.newUpdater(C0223i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: a */
    public final boolean m313a(C0223i c0223i, int i2) {
        while (true) {
            C0223i c0223iM314e = m314e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f448t;
            if (c0223iM314e == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c0223iM314e = (C0223i) obj;
                    if (!c0223iM314e.mo73h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c0223iM314e);
                }
            }
            if (c0223iM314e instanceof C0221g) {
                return (((C0221g) c0223iM314e).f446v & i2) == 0 && c0223iM314e.m313a(c0223i, i2);
            }
            atomicReferenceFieldUpdater.set(c0223i, c0223iM314e);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f447s;
            atomicReferenceFieldUpdater2.set(c0223i, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(c0223iM314e, this, c0223i)) {
                    c0223i.m315f(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(c0223iM314e) == this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final C0223i m314e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f448t;
            C0223i c0223i = (C0223i) atomicReferenceFieldUpdater2.get(this);
            C0223i c0223i2 = c0223i;
            while (true) {
                C0223i c0223i3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f447s;
                    obj = atomicReferenceFieldUpdater.get(c0223i2);
                    if (obj == this) {
                        if (c0223i == c0223i2) {
                            return c0223i2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, c0223i, c0223i2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != c0223i) {
                                break;
                            }
                        }
                        return c0223i2;
                    }
                    if (mo73h()) {
                        return null;
                    }
                    if (!(obj instanceof C0229o)) {
                        AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c0223i3 = c0223i2;
                        c0223i2 = (C0223i) obj;
                    } else {
                        if (c0223i3 != null) {
                            break;
                        }
                        c0223i2 = (C0223i) atomicReferenceFieldUpdater2.get(c0223i2);
                    }
                }
                C0223i c0223i4 = ((C0229o) obj).f463a;
                while (!atomicReferenceFieldUpdater.compareAndSet(c0223i3, c0223i2, c0223i4)) {
                    if (atomicReferenceFieldUpdater.get(c0223i3) != c0223i2) {
                        break;
                    }
                }
                c0223i2 = c0223i3;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m315f(C0223i c0223i) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f448t;
            C0223i c0223i2 = (C0223i) atomicReferenceFieldUpdater.get(c0223i);
            if (f447s.get(this) != c0223i) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c0223i, c0223i2, this)) {
                    if (mo73h()) {
                        c0223i.m314e();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c0223i) == c0223i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final C0223i m316g() {
        C0223i c0223i;
        Object obj = f447s.get(this);
        C0229o c0229o = obj instanceof C0229o ? (C0229o) obj : null;
        if (c0229o != null && (c0223i = c0229o.f463a) != null) {
            return c0223i;
        }
        AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C0223i) obj;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo73h() {
        return f447s.get(this) instanceof C0229o;
    }

    public String toString() {
        return new C0222h(this, AbstractC0069y.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0069y.m107f(this);
    }
}
