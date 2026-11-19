package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4248cj implements Runnable {
    public final /* synthetic */ C3081Ji A00;

    public RunnableC4248cj(C3081Ji c3081Ji) {
        this.A00 = c3081Ji;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            if (this.A00.A0b.A0D() != null) {
                this.A00.A0b.A0D().AFw(true);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
