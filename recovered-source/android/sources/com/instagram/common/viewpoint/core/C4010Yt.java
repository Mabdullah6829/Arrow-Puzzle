package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4010Yt extends AdNativeComponentView {
    public static final int A01 = (int) (AbstractC3926XX.A02 * 1.0f);
    public final ImageView A00;

    public C4010Yt(C4494gi c4494gi) {
        super(c4494gi);
        this.A00 = new C4035ZI(c4494gi);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC3931Xc.A04(this.A00, EnumC3931Xc.A0B);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        AbstractC3966YB.A0N(this.A00, -2130706433);
        setPadding(A01, A01, A01, A01);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
