package p011H;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p043a.AbstractC0878a;

/* JADX INFO: renamed from: H.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0276h extends AbstractC0878a {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f539a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f540b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f541c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f542d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f543e;

    public C0276h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f539a = atomicReferenceFieldUpdater;
        this.f540b = atomicReferenceFieldUpdater2;
        this.f541c = atomicReferenceFieldUpdater3;
        this.f542d = atomicReferenceFieldUpdater4;
        this.f543e = atomicReferenceFieldUpdater5;
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: c */
    public final boolean mo418c(AbstractC0290s abstractC0290s, C0274g c0274g, C0274g c0274g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f542d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0290s, c0274g, c0274g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0290s) == c0274g);
        return false;
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: d */
    public final boolean mo419d(AbstractC0290s abstractC0290s, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f543e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0290s, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0290s) == obj);
        return false;
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: e */
    public final boolean mo420e(AbstractC0290s abstractC0290s, C0289r c0289r, C0289r c0289r2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f541c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0290s, c0289r, c0289r2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0290s) == c0289r);
        return false;
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: i */
    public final C0274g mo421i(AbstractC0290s abstractC0290s) {
        return (C0274g) this.f542d.getAndSet(abstractC0290s, C0274g.f535d);
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: j */
    public final C0289r mo422j(AbstractC0290s abstractC0290s) {
        return (C0289r) this.f541c.getAndSet(abstractC0290s, C0289r.f560c);
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: p */
    public final void mo423p(C0289r c0289r, C0289r c0289r2) {
        this.f540b.lazySet(c0289r, c0289r2);
    }

    @Override // p043a.AbstractC0878a
    /* JADX INFO: renamed from: q */
    public final void mo424q(C0289r c0289r, Thread thread) {
        this.f539a.lazySet(c0289r, thread);
    }
}
