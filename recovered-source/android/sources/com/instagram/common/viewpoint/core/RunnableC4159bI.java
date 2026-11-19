package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4159bI implements Runnable {
    public final /* synthetic */ AbstractC3181LK A00;

    public RunnableC4159bI(AbstractC3181LK abstractC3181LK) {
        this.A00 = abstractC3181LK;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0r();
            this.A00.A0v(1000L);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
