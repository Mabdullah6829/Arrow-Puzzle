package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4200bx implements Runnable {
    public final /* synthetic */ C3137Kc A00;

    public RunnableC4200bx(C3137Kc c3137Kc) {
        this.A00 = c3137Kc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC4206c3) this.A00).A07.A0D() != null) {
                ((AbstractC4206c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
