package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: renamed from: androidx.browser.customtabs.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1076b implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2594s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ EngagementSignalsCallback f2595t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean f2596u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Bundle f2597v;

    public /* synthetic */ RunnableC1076b(EngagementSignalsCallback engagementSignalsCallback, boolean z, Bundle bundle, int i2) {
        this.f2594s = i2;
        this.f2595t = engagementSignalsCallback;
        this.f2596u = z;
        this.f2597v = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2594s) {
            case 0:
                this.f2595t.onSessionEnded(this.f2596u, this.f2597v);
                break;
            case 1:
                this.f2595t.onVerticalScrollEvent(this.f2596u, this.f2597v);
                break;
            case 2:
                this.f2595t.onVerticalScrollEvent(this.f2596u, this.f2597v);
                break;
            default:
                this.f2595t.onSessionEnded(this.f2596u, this.f2597v);
                break;
        }
    }
}
