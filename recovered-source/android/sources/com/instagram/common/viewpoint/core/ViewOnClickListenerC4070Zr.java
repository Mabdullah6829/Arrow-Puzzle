package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4070Zr implements View.OnClickListener {
    public final /* synthetic */ C3392Ok A00;
    public final /* synthetic */ C4060Zh A01;
    public final /* synthetic */ C3236MD A02;

    public ViewOnClickListenerC4070Zr(C3236MD c3236md, C4060Zh c4060Zh, C3392Ok c3392Ok) {
        this.A02 = c3236md;
        this.A01 = c4060Zh;
        this.A00 = c3392Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0D.AF4(this.A00);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
