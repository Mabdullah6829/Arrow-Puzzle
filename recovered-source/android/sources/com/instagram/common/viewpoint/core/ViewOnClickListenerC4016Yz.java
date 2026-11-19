package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4016Yz implements View.OnClickListener {
    public final /* synthetic */ C4019Z2 A00;

    public ViewOnClickListenerC4016Yz(C4019Z2 c4019z2) {
        this.A00 = c4019z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
