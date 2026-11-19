package p012H0;

import p000A0.AbstractC0063t;
import p010F0.AbstractC0215a;
import p010F0.C0228n;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: H0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0309l extends AbstractC0063t {

    /* JADX INFO: renamed from: s */
    public static final C0309l f622s = new C0309l();

    @Override // p000A0.AbstractC0063t
    public final void dispatch(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        C0302e.f610t.f612s.m454e(runnable, true, false);
    }

    @Override // p000A0.AbstractC0063t
    public final void dispatchYield(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        C0302e.f610t.f612s.m454e(runnable, true, true);
    }

    @Override // p000A0.AbstractC0063t
    public final AbstractC0063t limitedParallelism(int i2, String str) {
        AbstractC0215a.m295a(i2);
        if (i2 >= AbstractC0308k.f619d) {
            return str != null ? new C0228n(this, str) : this;
        }
        return super.limitedParallelism(i2, str);
    }

    @Override // p000A0.AbstractC0063t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
