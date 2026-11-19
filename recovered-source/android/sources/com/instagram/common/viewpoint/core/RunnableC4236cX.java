package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4236cX implements Runnable {
    public final /* synthetic */ C3110KB A00;

    public RunnableC4236cX(C3110KB c3110kb) {
        this.A00 = c3110kb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A03 != null && this.A00.A03.getVisibility() == 0) {
                this.A00.A0T(8);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
