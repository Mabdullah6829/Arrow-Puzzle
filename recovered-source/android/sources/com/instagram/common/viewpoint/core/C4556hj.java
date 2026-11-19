package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4556hj implements InterfaceC3551RN {
    public final /* synthetic */ AbstractC3530R2 A00;

    public C4556hj(AbstractC3530R2 abstractC3530R2) {
        this.A00 = abstractC3530R2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3551RN
    public final View A7H(int i2) {
        return this.A00.A0v(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3551RN
    public final int A7J(View view) {
        return this.A00.A0p(view) + ((C3531R3) view.getLayoutParams()).rightMargin;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3551RN
    public final int A7K(View view) {
        return this.A00.A0m(view) - ((C3531R3) view.getLayoutParams()).leftMargin;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3551RN
    public final int A8g() {
        return this.A00.A0j() - this.A00.A0h();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3551RN
    public final int A8h() {
        return this.A00.A0g();
    }
}
