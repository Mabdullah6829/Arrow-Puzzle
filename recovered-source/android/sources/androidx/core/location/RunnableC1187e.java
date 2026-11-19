package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.core.location.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1187e implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2674s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Executor f2675t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f2676u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f2677v;

    public /* synthetic */ RunnableC1187e(Object obj, Executor executor, Object obj2, int i2) {
        this.f2674s = i2;
        this.f2676u = obj;
        this.f2675t = executor;
        this.f2677v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2674s) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.f2676u).lambda$onGnssMeasurementsReceived$0(this.f2675t, (GnssMeasurementsEvent) this.f2677v);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.f2676u).lambda$onGpsStatusChanged$3(this.f2675t, (GnssStatusCompat) this.f2677v);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f2676u).lambda$onSatelliteStatusChanged$3(this.f2675t, (GnssStatus) this.f2677v);
                break;
        }
    }
}
