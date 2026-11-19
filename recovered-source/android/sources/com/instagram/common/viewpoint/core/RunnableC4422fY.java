package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4422fY implements Runnable {
    public final /* synthetic */ C4425fb A00;

    public RunnableC4422fY(C4425fb c4425fb) {
        this.A00 = c4425fb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            this.A00.A01.removeCallbacks(this);
            this.A00.A01.postDelayed(this, 250L);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
