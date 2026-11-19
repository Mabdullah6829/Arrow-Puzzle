package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4052ZZ implements View.OnClickListener {
    public final /* synthetic */ C4054Zb A00;

    public ViewOnClickListenerC4052ZZ(C4054Zb c4054Zb) {
        this.A00 = c4054Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A04.AAp();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
