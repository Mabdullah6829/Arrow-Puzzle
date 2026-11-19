package p034T;

import p030R.C0589w0;
import p036U.C0833n;

/* JADX INFO: renamed from: T.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0775q0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2016s = 0;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0661J0 f2017t;

    public RunnableC0775q0(C0661J0 c0661j0, long j2) {
        this.f2017t = c0661j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2016s) {
            case 0:
                this.f2017t.getClass();
                break;
            default:
                ((C0833n) this.f2017t.f1474a.f130t).mo1564e(C0589w0.f1284n.m1354g("Keepalive failed. The connection is likely gone"));
                break;
        }
    }

    public RunnableC0775q0(C0661J0 c0661j0, Throwable th) {
        this.f2017t = c0661j0;
    }
}
