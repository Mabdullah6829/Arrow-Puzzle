package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4227cO implements Runnable {
    public final /* synthetic */ C3113KE A00;

    public RunnableC4227cO(C3113KE c3113ke) {
        this.A00 = c3113ke;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0M) {
                this.A00.A0K();
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
