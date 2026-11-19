package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4289dO implements Runnable {
    public final /* synthetic */ C22195S A00;

    public RunnableC4289dO(C22195S c22195s) {
        this.A00 = c22195s;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A08 = true;
            this.A00.A0P.AFw(true);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
