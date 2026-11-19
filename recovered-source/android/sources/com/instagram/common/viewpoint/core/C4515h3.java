package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4515h3 extends AbstractRunnableC3871Wc {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C3600SA A01;
    public final /* synthetic */ C3732UK A02;

    public C4515h3(C3600SA c3600sa, C3732UK c3732uk, Drawable drawable) {
        this.A01 = c3600sa;
        this.A02 = c3732uk;
        this.A00 = drawable;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A02.A1P(this.A00);
    }
}
