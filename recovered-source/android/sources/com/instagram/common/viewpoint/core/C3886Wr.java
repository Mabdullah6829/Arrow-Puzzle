package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3886Wr extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C3881Wm A00;

    public C3886Wr(C3881Wm c3881Wm) {
        this.A00 = c3881Wm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() throws Exception {
        C3881Wm.A00(this.A00);
        if (this.A00.A01 > 0) {
            try {
                Thread.sleep(this.A00.A01);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
