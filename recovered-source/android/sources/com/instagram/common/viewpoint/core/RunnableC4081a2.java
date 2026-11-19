package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4081a2 implements Runnable {
    public final /* synthetic */ C4083a4 A00;

    public RunnableC4081a2(C4083a4 c4083a4) {
        this.A00 = c4083a4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02.getVisibility() == 0) {
                this.A00.A07(8);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
