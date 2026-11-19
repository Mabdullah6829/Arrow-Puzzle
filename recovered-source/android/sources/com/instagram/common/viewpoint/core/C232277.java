package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.77 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C232277 extends C4540hS {
    public C232277(C3568Re c3568Re) {
        super(c3568Re);
    }

    @Override // com.instagram.common.viewpoint.core.C4540hS, com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public final /* bridge */ /* synthetic */ void A44(View view, int i2, RelativeLayout.LayoutParams layoutParams) {
        super.A44(view, i2, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C4540hS, com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public final /* bridge */ /* synthetic */ void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A45(view, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C4540hS, com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public final void A4j(String str) {
        super.A4j(str);
        if (this.A00.get() == null) {
            return;
        }
        String strA03 = EnumC4387ez.A08.A03();
        String rewardedVideoError = EnumC4387ez.A09.A03();
        if (str.equals(strA03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C4540hS, com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public final /* bridge */ /* synthetic */ void A4k(String str, C3733UL c3733ul) {
        super.A4k(str, c3733ul);
    }

    @Override // com.instagram.common.viewpoint.core.C4540hS, com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public final /* bridge */ /* synthetic */ void AAo(String str, C3332Nm c3332Nm) {
        super.AAo(str, c3332Nm);
    }

    @Override // com.instagram.common.viewpoint.core.C4540hS, com.instagram.common.viewpoint.core.InterfaceC3998Yh
    public final /* bridge */ /* synthetic */ void ADJ(int i2) {
        super.ADJ(i2);
    }
}
