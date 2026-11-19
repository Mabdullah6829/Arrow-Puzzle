package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4008Yr implements View.OnClickListener {
    public final /* synthetic */ C3437PU A00;

    public ViewOnClickListenerC4008Yr(C3437PU c3437pu) {
        this.A00 = c3437pu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A01 != null && this.A00.A02.A03()) {
                this.A00.A01.ACl(this.A00);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
