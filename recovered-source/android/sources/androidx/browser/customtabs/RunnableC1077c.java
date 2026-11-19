package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: renamed from: androidx.browser.customtabs.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1077c implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2598s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ EngagementSignalsCallback f2599t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f2600u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Bundle f2601v;

    public /* synthetic */ RunnableC1077c(EngagementSignalsCallback engagementSignalsCallback, int i2, Bundle bundle, int i3) {
        this.f2598s = i3;
        this.f2599t = engagementSignalsCallback;
        this.f2600u = i2;
        this.f2601v = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2598s) {
            case 0:
                CustomTabsSession.BinderC10711.lambda$onGreatestScrollPercentageIncreased$1(this.f2599t, this.f2600u, this.f2601v);
                break;
            default:
                CustomTabsSession.BinderC10722.lambda$onGreatestScrollPercentageIncreased$1(this.f2599t, this.f2600u, this.f2601v);
                break;
        }
    }
}
