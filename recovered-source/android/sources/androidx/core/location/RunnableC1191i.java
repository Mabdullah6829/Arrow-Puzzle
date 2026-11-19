package androidx.core.location;

import android.location.Location;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.location.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1191i implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2688s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f2689t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f2690u;

    public /* synthetic */ RunnableC1191i(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Object obj, int i2) {
        this.f2688s = i2;
        this.f2689t = locationListenerTransport;
        this.f2690u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2688s) {
            case 0:
                this.f2689t.lambda$onLocationChanged$1((List) this.f2690u);
                break;
            default:
                this.f2689t.lambda$onLocationChanged$0((Location) this.f2690u);
                break;
        }
    }
}
