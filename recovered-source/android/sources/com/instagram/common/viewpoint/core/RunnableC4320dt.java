package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4320dt implements Runnable {
    public final /* synthetic */ C21604V A00;

    public RunnableC4320dt(C21604V c21604v) {
        this.A00 = c21604v;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            ((AbstractC2897Gj) this.A00).A0A.A4j(((AbstractC2897Gj) this.A00).A0B.A7w());
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
