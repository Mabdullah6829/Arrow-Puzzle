package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3885Wq extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C3881Wm A00;

    public C3885Wq(C3881Wm c3881Wm) {
        this.A00 = c3881Wm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A00.A0C = false;
        if (this.A00.A0B.getQueue().isEmpty()) {
            this.A00.A0B.execute(this.A00.A0A);
        }
    }
}
