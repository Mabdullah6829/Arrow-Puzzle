package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3S */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C20963S extends AbstractC2742ED {
    public static String[] A04 = {"hk0dnqphYZ0B2FA2HHbeoaEOUC9cHUBv", "tTD1hmxYdA3U5n9t8Z20NsAIS", "BfpeWRttIDT9n", "BdF5VvNpfNEd8dAFz8yBB3tju8j2QPKu", "opIRFI8OjkHX6xnIsWRzCqWD0", "Ob0oYr4gU4dgC4EVWukqT8XlG8BtSCcB", "HPuRIIJ62FmEL4YF0ip1f4WrSa12U9bK", "7SB"};
    public final ImageView A00;
    public final C4494gi A01;
    public final AbstractC3735UN<C21494K> A02;
    public final AbstractC3735UN<C2732E3> A03;

    public C20963S(C4494gi c4494gi) {
        this(c4494gi, false);
    }

    public C20963S(C4494gi c4494gi, boolean z) {
        ImageView.ScaleType scaleType;
        int color;
        super(c4494gi);
        this.A03 = new C2705Dc(this);
        this.A02 = new C2704Db(this);
        this.A01 = c4494gi;
        this.A00 = new ImageView(c4494gi);
        if (!z) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
            color = ViewCompat.MEASURED_STATE_MASK;
        } else {
            scaleType = ImageView.ScaleType.FIT_START;
            color = 0;
        }
        this.A00.setScaleType(scaleType);
        AbstractC3966YB.A0N(this.A00, color);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2742ED
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            C3734UM<AbstractC3735UN, C3733UL> eventBus = getVideoView().getEventBus();
            AbstractC3735UN[] abstractC3735UNArr = new AbstractC3735UN[2];
            String[] strArr = A04;
            if (strArr[3].charAt(25) != strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "Nqq";
            strArr2[2] = "4efeQvUmAeHBj";
            abstractC3735UNArr[0] = this.A03;
            abstractC3735UNArr[1] = this.A02;
            eventBus.A03(abstractC3735UNArr);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2742ED
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.A00.layout(0, 0, i4 - i2, i5 - i3);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, InterfaceC4149b8 interfaceC4149b8) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        AsyncTaskC3183LM downloadImageTask = new AsyncTaskC3183LM(this.A00, this.A01).A04();
        if (interfaceC4149b8 != null) {
            downloadImageTask.A06(interfaceC4149b8);
        }
        downloadImageTask.A07(str);
    }
}
