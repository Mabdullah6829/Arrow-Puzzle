package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Q1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3468Q1 extends AbstractRunnableC3871Wc {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC3982YR A01;

    public C3468Q1(DialogInterfaceOnClickListenerC3982YR dialogInterfaceOnClickListenerC3982YR, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC3982YR;
        this.A00 = dialogInterface;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        if (this.A01.A01.A02 != null) {
            this.A01.A01.A02.AGx(AbstractC3852WI.A03(this.A01.A01.A00), new C4459g9().A05(this.A01.A01.A02(this.A01.A00.getText().toString())).A08());
        }
        this.A00.cancel();
    }
}
