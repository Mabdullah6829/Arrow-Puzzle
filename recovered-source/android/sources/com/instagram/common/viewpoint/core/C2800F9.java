package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.F9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2800F9 extends C4188bl {
    public final ImageView A00;
    public final C4494gi A01;

    public C2800F9(C4494gi c4494gi) {
        super(c4494gi);
        this.A01 = c4494gi;
        setRadius(30);
        this.A00 = new ImageView(c4494gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C4148b7 c4148b7) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        AsyncTaskC3183LM asyncTaskC3183LM = new AsyncTaskC3183LM(this.A00, this.A01);
        asyncTaskC3183LM.A04();
        asyncTaskC3183LM.A07(str);
        asyncTaskC3183LM.A06(new InterfaceC4149b8() { // from class: com.facebook.ads.redexgen.X.FA
            @Override // com.instagram.common.viewpoint.core.InterfaceC4149b8
            public final void AE7(C4148b7 c4148b7) {
                this.A00.A00(c4148b7);
            }
        });
    }
}
