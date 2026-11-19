package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnLongClickListenerC3575Rl implements View.OnLongClickListener {
    public final /* synthetic */ C4534hM A00;
    public final /* synthetic */ C4147b6 A01;

    public ViewOnLongClickListenerC3575Rl(C4534hM c4534hM, C4147b6 c4147b6) {
        this.A00 = c4534hM;
        this.A01 = c4147b6;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00.A00 != null) {
            this.A01.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
