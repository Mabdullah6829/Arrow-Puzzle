package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4076Zx implements View.OnClickListener {
    public final /* synthetic */ C4060Zh A00;
    public final /* synthetic */ C3235MC A01;

    public ViewOnClickListenerC4076Zx(C3235MC c3235mc, C4060Zh c4060Zh) {
        this.A01 = c3235mc;
        this.A00 = c4060Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC3390Oi.A04);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
