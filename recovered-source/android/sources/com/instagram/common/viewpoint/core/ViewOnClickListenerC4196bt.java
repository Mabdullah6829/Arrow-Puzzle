package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4196bt implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC3152Kr A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC4196bt(ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr, String str) {
        this.A00 = viewOnClickListenerC3152Kr;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0E(this.A01);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
