package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4068Zp implements View.OnClickListener {
    public final /* synthetic */ C4060Zh A00;
    public final /* synthetic */ C3236MD A01;

    public ViewOnClickListenerC4068Zp(C3236MD c3236md, C4060Zh c4060Zh) {
        this.A01 = c3236md;
        this.A00 = c4060Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AAq();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
