package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4079a0 implements View.OnClickListener {
    public final /* synthetic */ C3235MC A00;

    public ViewOnClickListenerC4079a0(C3235MC c3235mc) {
        this.A00 = c3235mc;
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
