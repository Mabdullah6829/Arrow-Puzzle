package p034T;

import p030R.AbstractC0570n;

/* JADX INFO: renamed from: T.T1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0691T1 extends AbstractC0570n {

    /* JADX INFO: renamed from: b */
    public final C0709Z1 f1578b;

    /* JADX INFO: renamed from: c */
    public long f1579c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0684R0 f1580d;

    public C0691T1(C0684R0 c0684r0, C0709Z1 c0709z1) {
        this.f1580d = c0684r0;
        this.f1578b = c0709z1;
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: l */
    public final void mo1332l(long j2) {
        if (this.f1580d.f1551o.f1614f != null) {
            return;
        }
        synchronized (this.f1580d.f1545i) {
            try {
                if (this.f1580d.f1551o.f1614f == null) {
                    C0709Z1 c0709z1 = this.f1578b;
                    if (!c0709z1.f1658b) {
                        long j3 = this.f1579c + j2;
                        this.f1579c = j3;
                        C0684R0 c0684r0 = this.f1580d;
                        long j4 = c0684r0.f1556t;
                        if (j3 <= j4) {
                            return;
                        }
                        if (j3 > c0684r0.f1547k) {
                            c0709z1.f1659c = true;
                        } else {
                            long jAddAndGet = c0684r0.f1546j.f1883a.addAndGet(j3 - j4);
                            C0684R0 c0684r1 = this.f1580d;
                            c0684r1.f1556t = this.f1579c;
                            if (jAddAndGet > c0684r1.f1548l) {
                                this.f1578b.f1659c = true;
                            }
                        }
                        C0709Z1 c0709z2 = this.f1578b;
                        RunnableC0668L1 runnableC0668L1M1552o = c0709z2.f1659c ? this.f1580d.m1552o(c0709z2) : null;
                        if (runnableC0668L1M1552o != null) {
                            runnableC0668L1M1552o.run();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
