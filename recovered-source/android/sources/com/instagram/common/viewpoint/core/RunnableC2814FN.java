package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class RunnableC2814FN implements Runnable {
    public final InterfaceC2813FM A00;

    public RunnableC2814FN(InterfaceC2813FM interfaceC2813FM) {
        this.A00 = interfaceC2813FM;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.AEj();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
