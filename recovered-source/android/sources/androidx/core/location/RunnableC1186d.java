package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* JADX INFO: renamed from: androidx.core.location.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1186d implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2671s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Consumer f2672t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Location f2673u;

    public /* synthetic */ RunnableC1186d(Consumer consumer, Location location, int i2) {
        this.f2671s = i2;
        this.f2672t = consumer;
        this.f2673u = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2671s) {
            case 0:
                this.f2672t.accept(this.f2673u);
                break;
            default:
                this.f2672t.accept(this.f2673u);
                break;
        }
    }
}
