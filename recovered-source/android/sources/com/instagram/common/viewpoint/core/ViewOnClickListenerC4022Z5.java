package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Z5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4022Z5 implements View.OnClickListener {
    public final /* synthetic */ C3308NO A00;

    public ViewOnClickListenerC4022Z5(C3308NO c3308no) {
        this.A00 = c3308no;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0T.A04(EnumC3791VH.A07, null);
            this.A00.A0W.A4j(this.A00.A0X.A7w());
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
