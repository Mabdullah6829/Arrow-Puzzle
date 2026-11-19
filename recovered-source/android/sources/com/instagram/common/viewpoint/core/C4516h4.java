package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4516h4 implements InterfaceC3598S8 {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C3600SA A01;
    public final /* synthetic */ C3732UK A02;

    public C4516h4(C3600SA c3600sa, ImageView imageView, C3732UK c3732uk) {
        this.A01 = c3600sa;
        this.A00 = imageView;
        this.A02 = c3732uk;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3598S8
    public final void AE8(Drawable drawable) {
        C3732UK.A0f(drawable, this.A00);
        this.A02.A1P(drawable);
    }
}
