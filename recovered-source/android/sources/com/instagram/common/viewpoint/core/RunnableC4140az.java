package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.az */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4140az implements Runnable {
    public final /* synthetic */ C4141b0 A00;
    public final /* synthetic */ InterfaceC4142b1 A01;

    public RunnableC4140az(C4141b0 c4141b0, InterfaceC4142b1 interfaceC4142b1) {
        this.A00 = c4141b0;
        this.A01 = interfaceC4142b1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A01.ACz();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
