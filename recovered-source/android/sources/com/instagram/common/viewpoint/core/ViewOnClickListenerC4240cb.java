package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4240cb implements View.OnClickListener {
    public final /* synthetic */ C3110KB A00;

    public ViewOnClickListenerC4240cb(C3110KB c3110kb) {
        this.A00 = c3110kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A08 != null) {
                this.A00.A08.AJz();
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
