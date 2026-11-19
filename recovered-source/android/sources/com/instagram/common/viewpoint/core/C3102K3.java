package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.K3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3102K3 implements InterfaceC4149b8 {
    public final /* synthetic */ C3081Ji A00;

    public C3102K3(C3081Ji c3081Ji) {
        this.A00 = c3081Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4149b8
    public final void AE7(C4148b7 c4148b7) {
        if (this.A00.A02 != null && c4148b7.A00() != null) {
            this.A00.A02.setImageBitmap(c4148b7.A00());
            this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
