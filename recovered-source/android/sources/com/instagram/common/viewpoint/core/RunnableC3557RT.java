package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.RT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC3557RT implements Runnable {
    public final /* synthetic */ C3558RU A00;

    public RunnableC3557RT(C3558RU c3558ru) {
        this.A00 = c3558ru;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
