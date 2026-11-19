package androidx.core.location;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.core.location.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1188f implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2678s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Executor f2679t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f2680u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f2681v;

    public /* synthetic */ RunnableC1188f(Object obj, Executor executor, int i2, int i3) {
        this.f2678s = i3;
        this.f2681v = obj;
        this.f2679t = executor;
        this.f2680u = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2678s) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.f2681v).lambda$onStatusChanged$1(this.f2679t, this.f2680u);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.f2681v).lambda$onGpsStatusChanged$2(this.f2679t, this.f2680u);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f2681v).lambda$onFirstFix$2(this.f2679t, this.f2680u);
                break;
        }
    }
}
