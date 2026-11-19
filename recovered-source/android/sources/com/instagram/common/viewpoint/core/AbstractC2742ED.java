package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ED */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2742ED extends RelativeLayout implements InterfaceC4382eu {
    public C2775Ek A00;

    public AbstractC2742ED(C4494gi c4494gi) {
        super(c4494gi);
    }

    public AbstractC2742ED(C4494gi c4494gi, AttributeSet attributeSet, int i2) {
        super(c4494gi, attributeSet, i2);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4382eu
    public final void AAv(C2775Ek c2775Ek) {
        this.A00 = c2775Ek;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4382eu
    public final void AKV(C2775Ek c2775Ek) {
        A08();
        this.A00 = null;
    }

    public C2775Ek getVideoView() {
        return this.A00;
    }
}
