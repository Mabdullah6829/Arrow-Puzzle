package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.he */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4552he extends AbstractC3428PL {
    public static String[] A01 = {"TEi6qE8rkCQGgGy4v7NzSxsVq0pzva7O", "YDOvw0rnr4UKw3Mnxoslotwc24p8", "a0zjiBNZeYiCSuvwyHtYeell8KyTQ5xY", "ogjV6WpDB35FLp8RKY", "WANqVRIVKxhPnPWopei7e1k0CZWy62T", "aZZWj5Yt51SqLR33GVZjsdPHZCc7cpWa", "7MlacYU9Pwo9bfliYZC3slRrct3tH7Ko", "0XE4m45s2Z74YdVCvJuFI2R02XTQtmXa"};
    public final C4549hb A00;

    public C4552he(C4549hb c4549hb) {
        this.A00 = c4549hb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3428PL
    public final void A08(View view, C3473Q6 c3473q6) {
        super.A08(view, c3473q6);
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            AbstractC3530R2 layoutManager = this.A00.A01.getLayoutManager();
            if (A01[1].length() != 28) {
                throw new RuntimeException();
            }
            A01[4] = "lLG2rM4BR6TSMRI6WEis0bH1e3aTZeM";
            layoutManager.A1E(view, c3473q6);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3428PL
    public final boolean A09(View view, int i2, Bundle bundle) {
        if (super.A09(view, i2, bundle)) {
            return true;
        }
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            return this.A00.A01.getLayoutManager().A1Z(view, i2, bundle);
        }
        return false;
    }
}
