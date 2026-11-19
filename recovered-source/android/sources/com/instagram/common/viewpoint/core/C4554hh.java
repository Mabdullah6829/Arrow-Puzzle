package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4554hh implements InterfaceC3551RN {
    public final /* synthetic */ AbstractC3530R2 A00;

    public C4554hh(AbstractC3530R2 abstractC3530R2) {
        this.A00 = abstractC3530R2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3551RN
    public final View A7H(int i2) {
        return this.A00.A0v(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3551RN
    public final int A7J(View view) {
        return this.A00.A0l(view) + ((C3531R3) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3551RN
    public final int A7K(View view) {
        return this.A00.A0q(view) - ((C3531R3) view.getLayoutParams()).topMargin;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3551RN
    public final int A8g() {
        return this.A00.A0Z() - this.A00.A0f();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3551RN
    public final int A8h() {
        return this.A00.A0i();
    }
}
