package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4403fF implements View.OnClickListener {
    public final /* synthetic */ C207434 A00;

    public ViewOnClickListenerC4403fF(C207434 c207434) {
        this.A00 = c207434;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
        }
        try {
            if (this.A00.getVideoView() != null) {
                if (this.A00.A02 != null) {
                    this.A00.A02.A04(EnumC3791VH.A0x, null);
                }
                this.A00.A01.A0F().A3g();
                switch (this.A00.getVideoView().getState()) {
                    case A07:
                    case A04:
                    case A05:
                    case A06:
                        this.A00.getVideoView().A0e(EnumC4381et.A04, 12);
                        break;
                    case A0A:
                        this.A00.getVideoView().A0i(true, 8);
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
