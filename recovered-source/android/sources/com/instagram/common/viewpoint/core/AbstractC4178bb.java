package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.widget.Button;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4178bb extends Button {
    public static byte[] A0B;
    public static String[] A0C = {"AuzWZ8osEfq4z249PYqxDxnd", "GmaNjpajnwuNMOpMTnafkSdm", "IXSwi1vel7aGkSvKIjHlp", "5xYCukR2VNv2y0", "9gt7y21mjsR", "XkvVk", "YCgMHGcNxR5BY", "3lMWF0VDfBsAiU48Gpk3b"};
    public static final int A0D;
    public static final int A0E;
    public int A00;
    public int A01;
    public int A02;
    public C3320Na A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final float A07;
    public final int A08;
    public final Runnable A09;
    public final Runnable A0A;

    public static String A09(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0B = new byte[]{125, -35, -12, -84};
    }

    static {
        A0C();
        A0D = (int) (AbstractC3926XX.A02 * 16.0f);
        A0E = (int) (AbstractC3926XX.A02 * 4.0f);
    }

    public AbstractC4178bb(C4494gi c4494gi, C3320Na c3320Na) {
        super(c4494gi);
        this.A04 = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = A0E;
        this.A05 = true;
        this.A06 = false;
        this.A09 = new C3151Kq(this);
        this.A0A = new C3146Kl(this);
        this.A03 = c3320Na;
        this.A08 = C3763Up.A05(c4494gi);
        this.A07 = C3763Up.A00(c4494gi);
        AbstractC3966YB.A0a(this, false, 16);
        setGravity(17);
        A0A();
    }

    private void A0A() {
        if (this.A03 != null) {
            this.A00 = this.A03.A09(this.A06);
            this.A02 = this.A03.A0A(this.A06);
        }
        AbstractC3966YB.A0Q(this, this.A00, this.A05 ? this.A01 : 0);
        setTextColor(this.A02);
    }

    private void A0B() {
        if (this.A08 < 0 || this.A04) {
            return;
        }
        this.A04 = true;
        String[] strArr = A0C;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "QVGWsKZ9hUXhPHMuZeCIqAcU";
        strArr2[0] = "lfolaSZCl8ASaScD6QDCGzAz";
        if (C3763Up.A2j(getContext())) {
            postDelayed(this.A09, this.A08);
        }
    }

    public final void A0D() {
        String string = getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String text = A09(1, 3, 43);
        String[] strArrSplit = string.split(text);
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            StringBuilder sb = new StringBuilder();
            String text2 = strArrSplit[i2].substring(0, 1).toUpperCase(Locale.getDefault());
            StringBuilder sbAppend = sb.append(text2);
            String text3 = strArrSplit[i2];
            strArrSplit[i2] = sbAppend.append(text3.substring(1).toLowerCase(Locale.getDefault())).toString();
        }
        String text4 = A09(0, 1, 7);
        super.setText((CharSequence) AbstractC4177ba.A01(text4, strArrSplit));
    }

    public C3320Na getColorInfo() {
        return this.A03;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A0B();
    }

    public void setCornerRadiusPx(int i2) {
        this.A01 = i2;
    }

    public void setRoundedCornersEnabled(boolean z) {
        this.A05 = z;
        A0A();
    }

    public void setText(String str) {
        super.setText((CharSequence) str.toUpperCase(Locale.US));
    }

    public void setUpButtonColors(C3320Na c3320Na) {
        this.A03 = c3320Na;
        A0A();
    }

    public void setViewShowsOverMedia(boolean z) {
        this.A06 = z;
        A0A();
    }
}
