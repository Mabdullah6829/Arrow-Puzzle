package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4238cZ implements View.OnClickListener {
    public final /* synthetic */ C3110KB A00;

    public ViewOnClickListenerC4238cZ(C3110KB c3110kb) {
        this.A00 = c3110kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A08 != null) {
                this.A00.A08.A9l();
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
