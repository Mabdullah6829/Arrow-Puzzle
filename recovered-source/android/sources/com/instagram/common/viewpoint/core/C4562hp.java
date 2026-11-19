package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4562hp extends AbstractC3514Qm {
    public C4562hp(AbstractC3530R2 abstractC3530R2) {
        super(abstractC3530R2, null);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A06() {
        return this.A02.A0j();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A07() {
        return this.A02.A0j() - this.A02.A0h();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A08() {
        return this.A02.A0h();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A09() {
        return this.A02.A0k();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A0B() {
        return (this.A02.A0j() - this.A02.A0g()) - this.A02.A0h();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A0C(View view) {
        return this.A02.A0p(view) + ((C3531R3) view.getLayoutParams()).rightMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A0D(View view) {
        C3531R3 c3531r3 = (C3531R3) view.getLayoutParams();
        return this.A02.A0o(view) + c3531r3.leftMargin + c3531r3.rightMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A0E(View view) {
        C3531R3 c3531r3 = (C3531R3) view.getLayoutParams();
        return this.A02.A0n(view) + c3531r3.topMargin + c3531r3.bottomMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A0F(View view) {
        return this.A02.A0m(view) - ((C3531R3) view.getLayoutParams()).leftMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A0G(View view) {
        this.A02.A1G(view, true, this.A01);
        return this.A01.right;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final int A0H(View view) {
        this.A02.A1G(view, true, this.A01);
        return this.A01.left;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3514Qm
    public final void A0J(int i2) {
        this.A02.A11(i2);
    }
}
