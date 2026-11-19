package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class DialogInterfaceOnClickListenerC3981YQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C3456Pp A00;

    public DialogInterfaceOnClickListenerC3981YQ(C3456Pp c3456Pp) {
        this.A00 = c3456Pp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        dialogInterface.cancel();
    }
}
