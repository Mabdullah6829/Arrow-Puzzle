package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4307dg implements Runnable {
    public final /* synthetic */ C219655 A00;

    public RunnableC4307dg(C219655 c219655) {
        this.A00 = c219655;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0B = true;
            this.A00.A0Z.AFw(true);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
