package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0063t;
import p010F0.AbstractC0227m;
import p012H0.C0302e;
import p062g0.InterfaceC6353h;

/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcher extends AbstractC0063t {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // p000A0.AbstractC0063t
    public void dispatch(InterfaceC6353h context, Runnable block) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // p000A0.AbstractC0063t
    public boolean isDispatchNeeded(InterfaceC6353h context) {
        AbstractC6452k.m12181e(context, "context");
        C0302e c0302e = AbstractC0007H.f4a;
        if (AbstractC0227m.f459a.f153u.isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
