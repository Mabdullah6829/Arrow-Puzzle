package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4338eB implements InterfaceC3861WS {
    @Override // com.instagram.common.viewpoint.core.InterfaceC3861WS
    public final void AIZ(Throwable th, Object obj) {
        if (obj instanceof InterfaceC3655T4) {
            C4494gi adContext = ((InterfaceC3655T4) obj).A6m();
            if (adContext != null) {
                adContext.A0Q(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C4494gi)) {
            return;
        }
        ((C4494gi) context).A0Q(th);
    }
}
