package p000A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p010F0.AbstractC0215a;
import p010F0.C0231q;
import p043a.AbstractC0878a;

/* JADX INFO: renamed from: A0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0004E extends C0231q {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1w = AtomicIntegerFieldUpdater.newUpdater(C0004E.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p010F0.C0231q, p000A0.C0034e0
    /* JADX INFO: renamed from: k */
    public final void mo2k(Object obj) {
        mo3l(obj);
    }

    @Override // p010F0.C0231q, p000A0.C0034e0
    /* JADX INFO: renamed from: l */
    public final void mo3l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f1w;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC0215a.m302h(AbstractC0878a.m1802m(this.f464v), AbstractC0069y.m113l(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
