package androidx.core.location;

/* JADX INFO: renamed from: androidx.core.location.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1190h implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2685s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f2686t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ String f2687u;

    public /* synthetic */ RunnableC1190h(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i2) {
        this.f2685s = i2;
        this.f2686t = locationListenerTransport;
        this.f2687u = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2685s) {
            case 0:
                this.f2686t.lambda$onProviderEnabled$4(this.f2687u);
                break;
            default:
                this.f2686t.lambda$onProviderDisabled$5(this.f2687u);
                break;
        }
    }
}
