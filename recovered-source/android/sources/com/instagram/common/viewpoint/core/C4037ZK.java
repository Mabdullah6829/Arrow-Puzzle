package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.PointerIconCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4037ZK extends LinearLayout {
    public static final int A08 = (int) (AbstractC3926XX.A02 * 15.0f);
    public static final int A09 = (int) (AbstractC3926XX.A02 * 10.0f);
    public static final int A0A = (int) (AbstractC3926XX.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public boolean A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final C4494gi A06;
    public final C4174bX A07;

    public C4037ZK(C4494gi c4494gi, int i2, boolean z) {
        super(c4494gi);
        this.A01 = false;
        this.A06 = c4494gi;
        this.A02 = z;
        this.A03 = new ImageView(c4494gi);
        this.A03.setPadding(A09, A09, A09, A09);
        this.A07 = new C4174bX(c4494gi, this.A02);
        this.A07.setProgress(0.0f);
        this.A07.setPadding(A09, A09, A09, A09);
        this.A05 = new TextView(c4494gi);
        setOrientation(0);
        this.A04 = new LinearLayout(c4494gi);
        this.A00 = i2;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A0A, A0A);
        AbstractC3966YB.A0a(this.A05, true, 16);
        this.A05.setTextColor(-1);
        this.A05.setVisibility(8);
        this.A04.addView(this.A03, layoutParams2);
        this.A04.addView(this.A07, layoutParams2);
        addView(this.A04, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A05, actionTextLayoutParams);
    }

    private void A01() {
        int i2;
        C4174bX c4174bX = this.A07;
        int i3 = 8;
        if (this.A00 == 2 || this.A00 == 6) {
            i2 = this.A01 ? 4 : 0;
        } else {
            i2 = 8;
        }
        c4174bX.setVisibility(i2);
        ImageView imageView = this.A03;
        if (this.A00 == 5) {
            i3 = 4;
        } else if (this.A00 != 2 && this.A00 != 6) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
    }

    public final void A02() {
        setVisibility(4);
    }

    public final void A03(float f2, int i2) {
        this.A07.A02(f2, i2);
    }

    public final void A04(C3320Na c3320Na, boolean z, boolean z2) {
        int iA05 = c3320Na.A05(z);
        this.A07.A03(AbstractC3411P3.A02(iA05, 77), iA05, 110, true);
        this.A03.setColorFilter(iA05);
        if (z2) {
            TextView textView = this.A05;
            int accentColor = AbstractC3411P3.A02(-1, 110);
            textView.setTextColor(accentColor);
            return;
        }
        this.A05.setTextColor(iA05);
    }

    public final boolean A05() {
        return !this.A05.getText().toString().isEmpty();
    }

    public final boolean A06() {
        return (this.A00 == 2 || this.A00 == 4) ? false : true;
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i2) {
        if (i2 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f2) {
        this.A07.setProgressWithAnimation(f2);
    }

    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setProgressImage(EnumC3977YM enumC3977YM) {
        this.A07.setImage(enumC3977YM);
    }

    public void setProgressImmediate(float f2) {
        this.A07.clearAnimation();
        this.A07.setProgress(f2);
    }

    public void setProgressSpinnerInvisible(boolean z) {
        this.A01 = z;
        A01();
    }

    public void setToolbarActionMode(int i2) {
        EnumC3977YM enumC3977YM;
        this.A06.A0F().AGB(i2);
        this.A00 = i2;
        A01();
        setVisibility(0);
        this.A03.setImageAlpha(255);
        this.A03.setPadding(A09, A09, A09, A09);
        switch (i2) {
            case 0:
                enumC3977YM = EnumC3977YM.CROSS;
                break;
            case 1:
                enumC3977YM = !this.A02 ? EnumC3977YM.SKIP_ARROW : EnumC3977YM.REDESIGN_SKIP_ICON;
                break;
            case 2:
            default:
                enumC3977YM = EnumC3977YM.CROSS;
                break;
            case 3:
                enumC3977YM = EnumC3977YM.MINIMIZE_ARROW;
                break;
            case 4:
                enumC3977YM = EnumC3977YM.CROSS;
                this.A03.setVisibility(8);
                setVisibility(8);
                break;
            case 5:
                enumC3977YM = EnumC3977YM.CROSS;
                break;
            case 6:
                enumC3977YM = EnumC3977YM.CROSS;
                break;
            case 7:
                enumC3977YM = EnumC3977YM.CROSS;
                this.A03.setImageAlpha(110);
                this.A03.setPadding(A08, A08, A08, A08);
                break;
            case 8:
                enumC3977YM = EnumC3977YM.OTHER_SKIP;
                break;
        }
        this.A03.setImageBitmap(AbstractC3978YN.A01(enumC3977YM));
        if (i2 == 1) {
            AbstractC3966YB.A0G(1005, this.A03);
            setVisibility(0);
        } else if (i2 == 8) {
            AbstractC3966YB.A0G(PointerIconCompat.TYPE_VERTICAL_TEXT, this.A03);
            setVisibility(0);
        } else {
            AbstractC3966YB.A0G(1002, this.A03);
        }
    }

    public void setToolbarMessage(String str) {
        this.A05.setText(str);
        this.A05.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A05.setVisibility(z ? 0 : 4);
    }
}
