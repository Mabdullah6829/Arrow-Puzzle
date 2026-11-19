package p010F0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: F0.j */
/* JADX INFO: loaded from: classes.dex */
public class C0224j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f450a = AtomicReferenceFieldUpdater.newUpdater(C0224j.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C0226l(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m317a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f450a;
            C0226l c0226l = (C0226l) atomicReferenceFieldUpdater.get(this);
            int iM321a = c0226l.m321a(runnable);
            if (iM321a == 0) {
                return true;
            }
            if (iM321a == 1) {
                C0226l c0226lM323c = c0226l.m323c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0226l, c0226lM323c) && atomicReferenceFieldUpdater.get(this) == c0226l) {
                }
            } else if (iM321a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m318b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f450a;
            C0226l c0226l = (C0226l) atomicReferenceFieldUpdater.get(this);
            if (c0226l.m322b()) {
                return;
            }
            C0226l c0226lM323c = c0226l.m323c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0226l, c0226lM323c) && atomicReferenceFieldUpdater.get(this) == c0226l) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m319c() {
        C0226l c0226l = (C0226l) f450a.get(this);
        c0226l.getClass();
        long j2 = C0226l.f453f.get(c0226l);
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j2))) & 1073741823;
    }

    /* JADX INFO: renamed from: d */
    public final Object m320d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f450a;
            C0226l c0226l = (C0226l) atomicReferenceFieldUpdater.get(this);
            Object objM324d = c0226l.m324d();
            if (objM324d != C0226l.f454g) {
                return objM324d;
            }
            C0226l c0226lM323c = c0226l.m323c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0226l, c0226lM323c) && atomicReferenceFieldUpdater.get(this) == c0226l) {
            }
        }
    }
}
