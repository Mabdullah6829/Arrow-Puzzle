package p010F0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: F0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0216b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f430a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0216b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f431b = AtomicReferenceFieldUpdater.newUpdater(AbstractC0216b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC0216b(AbstractC0232r abstractC0232r) {
        this._prev$volatile = abstractC0232r;
    }

    /* JADX INFO: renamed from: a */
    public final void m307a() {
        f431b.set(this, null);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0216b m308b() {
        Object obj = f430a.get(this);
        if (obj == AbstractC0215a.f423a) {
            return null;
        }
        return (AbstractC0216b) obj;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo309c();

    /* JADX INFO: renamed from: d */
    public final void m310d() {
        AbstractC0216b abstractC0216bM308b;
        if (m308b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f431b;
            AbstractC0216b abstractC0216b = (AbstractC0216b) atomicReferenceFieldUpdater.get(this);
            while (abstractC0216b != null && abstractC0216b.mo309c()) {
                abstractC0216b = (AbstractC0216b) atomicReferenceFieldUpdater.get(abstractC0216b);
            }
            AbstractC0216b abstractC0216bM308b2 = m308b();
            AbstractC6452k.m12178b(abstractC0216bM308b2);
            while (abstractC0216bM308b2.mo309c() && (abstractC0216bM308b = abstractC0216bM308b2.m308b()) != null) {
                abstractC0216bM308b2 = abstractC0216bM308b;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC0216bM308b2);
                AbstractC0216b abstractC0216b2 = ((AbstractC0216b) obj) == null ? null : abstractC0216b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC0216bM308b2, obj, abstractC0216b2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(abstractC0216bM308b2) != obj) {
                    }
                }
            }
            if (abstractC0216b != null) {
                f430a.set(abstractC0216b, abstractC0216bM308b2);
            }
            if (!abstractC0216bM308b2.mo309c() || abstractC0216bM308b2.m308b() == null) {
                if (abstractC0216b == null || !abstractC0216b.mo309c()) {
                    return;
                }
            }
        }
    }
}
