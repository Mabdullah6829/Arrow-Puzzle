package p000A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;
import p010F0.AbstractC0215a;
import p010F0.C0219e;
import p010F0.C0220f;
import p062g0.AbstractC6346a;
import p062g0.C6349d;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6350e;
import p062g0.InterfaceC6351f;
import p062g0.InterfaceC6352g;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: A0.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0063t extends AbstractC6346a implements InterfaceC6350e {
    public static final C0061s Key = new C0061s(C6349d.f24408s, new C0059r(0));

    public AbstractC0063t() {
        super(C6349d.f24408s);
    }

    public static /* synthetic */ AbstractC0063t limitedParallelism$default(AbstractC0063t abstractC0063t, int i2, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        return abstractC0063t.limitedParallelism(i2, str);
    }

    public abstract void dispatch(InterfaceC6353h interfaceC6353h, Runnable runnable);

    public void dispatchYield(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        dispatch(interfaceC6353h, runnable);
    }

    @Override // p062g0.AbstractC6346a, p062g0.InterfaceC6353h
    public <E extends InterfaceC6351f> E get(InterfaceC6352g key) {
        E e;
        AbstractC6452k.m12181e(key, "key");
        if (key instanceof C0061s) {
            C0061s c0061s = (C0061s) key;
            InterfaceC6352g key2 = getKey();
            AbstractC6452k.m12181e(key2, "key");
            if ((key2 == c0061s || c0061s.f77t == key2) && (e = (E) c0061s.f76s.invoke(this)) != null) {
                return e;
            }
        } else if (C6349d.f24408s == key) {
            return this;
        }
        return null;
    }

    @Override // p062g0.InterfaceC6350e
    public final <T> InterfaceC6348c interceptContinuation(InterfaceC6348c interfaceC6348c) {
        return new C0219e(this, interfaceC6348c);
    }

    public boolean isDispatchNeeded(InterfaceC6353h interfaceC6353h) {
        return !(this instanceof AbstractC0058q0);
    }

    public AbstractC0063t limitedParallelism(int i2, String str) {
        AbstractC0215a.m295a(i2);
        return new C0220f(this, i2, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (((p062g0.InterfaceC6351f) r3.f76s.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (p062g0.C6349d.f24408s == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        return p062g0.C6354i.f24409s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        return r2;
     */
    @Override // p062g0.AbstractC6346a, p062g0.InterfaceC6353h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p062g0.InterfaceC6353h minusKey(p062g0.InterfaceC6352g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.AbstractC6452k.m12181e(r3, r0)
            boolean r1 = r3 instanceof p000A0.C0061s
            if (r1 == 0) goto L25
            A0.s r3 = (p000A0.C0061s) r3
            g0.g r1 = r2.getKey()
            kotlin.jvm.internal.AbstractC6452k.m12181e(r1, r0)
            if (r1 == r3) goto L1a
            g0.g r0 = r3.f77t
            if (r0 != r1) goto L19
            goto L1a
        L19:
            return r2
        L1a:
            p0.l r3 = r3.f76s
            java.lang.Object r3 = r3.invoke(r2)
            g0.f r3 = (p062g0.InterfaceC6351f) r3
            if (r3 == 0) goto L2c
            goto L29
        L25:
            g0.d r0 = p062g0.C6349d.f24408s
            if (r0 != r3) goto L2c
        L29:
            g0.i r3 = p062g0.C6354i.f24409s
            return r3
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000A0.AbstractC0063t.minusKey(g0.g):g0.h");
    }

    @Override // p062g0.InterfaceC6350e
    public final void releaseInterceptedContinuation(InterfaceC6348c interfaceC6348c) {
        AbstractC6452k.m12179c(interfaceC6348c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        C0219e c0219e = (C0219e) interfaceC6348c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0219e.f434z;
        while (atomicReferenceFieldUpdater.get(c0219e) == AbstractC0215a.f425c) {
        }
        Object obj = atomicReferenceFieldUpdater.get(c0219e);
        C0039h c0039h = obj instanceof C0039h ? (C0039h) obj : null;
        if (c0039h != null) {
            c0039h.m83n();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0069y.m107f(this);
    }

    public /* synthetic */ AbstractC0063t limitedParallelism(int i2) {
        return limitedParallelism(i2, null);
    }

    public final AbstractC0063t plus(AbstractC0063t abstractC0063t) {
        return abstractC0063t;
    }
}
