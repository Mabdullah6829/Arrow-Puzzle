package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4359eX implements Runnable {
    public final /* synthetic */ C2815FO A00;

    public RunnableC4359eX(C2815FO c2815fo) {
        this.A00 = c2815fo;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0B() != 0) {
                this.A00.A04.scrollBy(this.A00.A00, 0);
                this.A00.A03.postDelayed(this, 16L);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
