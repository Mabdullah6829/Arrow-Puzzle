package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4581iA implements InterfaceC3401Ot {
    public Drawable A00;
    public final /* synthetic */ C3400Os A01;

    public C4581iA(C3400Os c3400Os) {
        this.A01 = c3400Os;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3401Ot
    public final Drawable A7E() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3401Ot
    public final C3400Os A7F() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3401Ot
    public final boolean A8q() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3401Ot
    public final boolean A9R() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3401Ot
    public final void AJK(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3401Ot
    public final void AJl(int i2, int i3, int i4, int i5) {
        this.A01.A05.set(i2, i3, i4, i5);
        super/*android.widget.FrameLayout*/.setPadding(this.A01.A04.left + i2, this.A01.A04.top + i3, this.A01.A04.right + i4, this.A01.A04.bottom + i5);
    }
}
