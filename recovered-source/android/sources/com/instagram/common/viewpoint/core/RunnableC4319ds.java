package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ds */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4319ds implements Runnable {
    public final /* synthetic */ C2880GS A00;

    public RunnableC4319ds(C2880GS c2880gs) {
        this.A00 = c2880gs;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0H(EnumC3791VH.A0b);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
