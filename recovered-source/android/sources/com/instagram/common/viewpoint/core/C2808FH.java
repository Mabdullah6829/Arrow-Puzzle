package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2808FH extends AbstractC3518Qq<C2803FC> {
    public final int A00;
    public final C4494gi A01;
    public final ViewOnClickListenerC3152Kr A02;
    public final List<String> A03;

    public C2808FH(C4494gi c4494gi, List<String> screenshotUrls, int i2, ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr) {
        this.A03 = screenshotUrls;
        this.A00 = i2;
        this.A01 = c4494gi;
        this.A02 = viewOnClickListenerC3152Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C2803FC A0F(ViewGroup viewGroup, int i2) {
        C2804FD c2804fd = new C2804FD(this.A01);
        if (C3763Up.A1D(this.A01)) {
            c2804fd.setOnClickListener(new ViewOnClickListenerC4361eZ(this));
        }
        return new C2803FC(c2804fd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0K(C2803FC c2803fc, int i2) {
        String str = this.A03.get(i2);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i2 != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i2 >= A0B() + (-1) ? this.A00 * 4 : this.A00, 0);
        c2803fc.A0p().setLayoutParams(marginLayoutParams);
        c2803fc.A0p().A00(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    public final int A0B() {
        return this.A03.size();
    }
}
