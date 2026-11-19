package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4084a5 extends LinearLayout {
    public final Bitmap A00;

    public C4084a5(C4494gi c4494gi, EnumC4101aM enumC4101aM) {
        super(c4494gi);
        this.A00 = AbstractC3978YN.A01(EnumC3977YM.AD_CHOICE_ICON);
        c4494gi.A0F().AAz(enumC4101aM.name().toLowerCase(Locale.US));
        A00();
        setAdChoiceIcon(c4494gi);
    }

    private void A00() {
        setOrientation(0);
        setPadding(AbstractC3924XV.A0I, AbstractC3924XV.A0I, AbstractC3924XV.A0I, AbstractC3924XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        AbstractC3966YB.A0N(this, -859190839);
        AbstractC3966YB.A0E(AbstractC3924XV.A0C, this);
    }

    private void setAdChoiceIcon(C4494gi c4494gi) {
        ImageView imageView = new ImageView(c4494gi);
        AbstractC3966YB.A0K(imageView);
        imageView.setImageBitmap(this.A00);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, AbstractC3924XV.A0U));
        addView(imageView);
    }
}
