package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5005pK implements InterfaceC21614W {
    public Message A00;
    public C5004pJ A01;

    public C5005pK() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C5004pJ.A01(this);
    }

    public final C5005pK A01(Message message, C5004pJ c5004pJ) {
        this.A00 = message;
        this.A01 = c5004pJ;
        return this;
    }

    public final void A02() {
        ((Message) AbstractC21273y.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((Message) AbstractC21273y.A01(this.A00));
        A00();
        return success;
    }
}
