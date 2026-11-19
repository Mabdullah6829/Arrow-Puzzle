package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4477gR implements Runnable {
    public final /* synthetic */ C2640CZ A00;

    public RunnableC4477gR(C2640CZ c2640cz) {
        this.A00 = c2640cz;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            C2640CZ.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
