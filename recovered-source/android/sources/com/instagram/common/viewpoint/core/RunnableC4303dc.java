package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4303dc implements Runnable {
    public final /* synthetic */ C219655 A00;

    public RunnableC4303dc(C219655 c219655) {
        this.A00 = c219655;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A07 != null && this.A00.getResources().getConfiguration().orientation == 1) {
                this.A00.A07.A0A();
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
