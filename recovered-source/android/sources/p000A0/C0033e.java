package p000A0;

import java.util.concurrent.ScheduledFuture;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: A0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0033e implements InterfaceC0042i0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41a;

    /* JADX INFO: renamed from: b */
    public final Object f42b;

    public /* synthetic */ C0033e(Object obj, int i2) {
        this.f41a = i2;
        this.f42b = obj;
    }

    public final String toString() {
        switch (this.f41a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f42b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((InterfaceC6498l) this.f42b).getClass().getSimpleName() + '@' + AbstractC0069y.m107f(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC0008I) this.f42b) + ']';
        }
    }
}
