package p044a0;

import java.util.concurrent.atomic.AtomicLong;
import p030R.AbstractC0570n;
import p030R.C0589w0;

/* JADX INFO: renamed from: a0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0895q extends AbstractC0570n {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0896r f2513b;

    public C0895q(C0896r c0896r) {
        this.f2513b = c0896r;
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: m */
    public final void mo1333m(C0589w0 c0589w0) {
        C0889k c0889k = this.f2513b.f2514a;
        boolean zM1352e = c0589w0.m1352e();
        C0893o c0893o = c0889k.f2490a;
        if (c0893o.f2508e == null && c0893o.f2509f == null) {
            return;
        }
        if (zM1352e) {
            ((AtomicLong) c0889k.f2491b.f333u).getAndIncrement();
        } else {
            ((AtomicLong) c0889k.f2491b.f332t).getAndIncrement();
        }
    }
}
