package p012H0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: H0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0310m {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f623b = AtomicReferenceFieldUpdater.newUpdater(C0310m.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f624c = AtomicIntegerFieldUpdater.newUpdater(C0310m.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f625d = AtomicIntegerFieldUpdater.newUpdater(C0310m.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f626e = AtomicIntegerFieldUpdater.newUpdater(C0310m.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f627a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC0306i m458a(AbstractRunnableC0306i abstractRunnableC0306i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f624c;
        if (atomicIntegerFieldUpdater.get(this) - f625d.get(this) == 127) {
            return abstractRunnableC0306i;
        }
        if (abstractRunnableC0306i.f614t) {
            f626e.incrementAndGet(this);
        }
        int i2 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f627a;
            if (atomicReferenceArray.get(i2) == null) {
                atomicReferenceArray.lazySet(i2, abstractRunnableC0306i);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC0306i m459b() {
        AbstractRunnableC0306i abstractRunnableC0306i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f625d;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - f624c.get(this) == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (abstractRunnableC0306i = (AbstractRunnableC0306i) this.f627a.getAndSet(i3, null)) != null) {
                if (abstractRunnableC0306i.f614t) {
                    f626e.decrementAndGet(this);
                }
                return abstractRunnableC0306i;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractRunnableC0306i m460c(int i2, boolean z) {
        int i3 = i2 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f627a;
        AbstractRunnableC0306i abstractRunnableC0306i = (AbstractRunnableC0306i) atomicReferenceArray.get(i3);
        if (abstractRunnableC0306i != null && abstractRunnableC0306i.f614t == z) {
            while (!atomicReferenceArray.compareAndSet(i3, abstractRunnableC0306i, null)) {
                if (atomicReferenceArray.get(i3) != abstractRunnableC0306i) {
                }
            }
            if (z) {
                f626e.decrementAndGet(this);
            }
            return abstractRunnableC0306i;
        }
        return null;
    }
}
