package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class DialogInterfaceOnClickListenerC3982YR implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C3456Pp A01;

    public DialogInterfaceOnClickListenerC3982YR(C3456Pp c3456Pp, EditText editText) {
        this.A01 = c3456Pp;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.A01.A03.execute(new C3468Q1(this, dialogInterface));
    }
}
