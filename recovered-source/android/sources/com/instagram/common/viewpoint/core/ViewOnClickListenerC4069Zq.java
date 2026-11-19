package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4069Zq implements View.OnClickListener {
    public final /* synthetic */ C3236MD A00;

    public ViewOnClickListenerC4069Zq(C3236MD c3236md) {
        this.A00 = c3236md;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.A9c();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
