package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2851Fz implements InterfaceC4257cs {
    public final /* synthetic */ C2850Fy A00;

    public C2851Fz(C2850Fy c2850Fy) {
        this.A00 = c2850Fy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4257cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4257cs
    public final void AGY(View view) {
        AbstractC3079Jg abstractC3079Jg = (AbstractC3079Jg) view;
        abstractC3079Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC3079Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
