package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class HandlerC3407Oz extends Handler {
    public final /* synthetic */ C3410P2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3407Oz(C3410P2 c3410p2, Looper looper) {
        super(looper);
        this.A00 = c3410p2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.A00.A02();
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }
}
