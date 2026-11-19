package p010F0;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p000A0.InterfaceC0042i0;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: F0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0232r extends AbstractC0216b implements InterfaceC0042i0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f465d = AtomicIntegerFieldUpdater.newUpdater(AbstractC0232r.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c */
    public final long f466c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC0232r(long j2, AbstractC0232r abstractC0232r, int i2) {
        super(abstractC0232r);
        this.f466c = j2;
        this.cleanedAndPointers$volatile = i2 << 16;
    }

    @Override // p010F0.AbstractC0216b
    /* JADX INFO: renamed from: c */
    public final boolean mo309c() {
        return f465d.get(this) == mo245f() && m308b() != null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m328e() {
        return f465d.addAndGet(this, SupportMenu.CATEGORY_MASK) == mo245f() && m308b() != null;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo245f();

    /* JADX INFO: renamed from: g */
    public abstract void mo246g(int i2, InterfaceC6353h interfaceC6353h);

    /* JADX INFO: renamed from: h */
    public final void m329h() {
        if (f465d.incrementAndGet(this) == mo245f()) {
            m310d();
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m330i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f465d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == mo245f() && m308b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
