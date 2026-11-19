package androidx.core.location;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.core.location.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1194l implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2697s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f2698t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Executor f2699u;

    public /* synthetic */ RunnableC1194l(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i2) {
        this.f2697s = i2;
        this.f2698t = preRGnssStatusTransport;
        this.f2699u = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2697s) {
            case 0:
                this.f2698t.lambda$onStopped$1(this.f2699u);
                break;
            default:
                this.f2698t.lambda$onStarted$0(this.f2699u);
                break;
        }
    }
}
