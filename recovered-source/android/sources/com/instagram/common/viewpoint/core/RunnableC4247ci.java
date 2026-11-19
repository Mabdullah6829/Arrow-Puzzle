package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ci */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4247ci implements Runnable {
    public final /* synthetic */ C3081Ji A00;

    public RunnableC4247ci(C3081Ji c3081Ji) {
        this.A00 = c3081Ji;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0D) {
                this.A00.A0M();
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
