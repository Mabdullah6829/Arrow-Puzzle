package com.instagram.common.viewpoint.core;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4193bq extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"5HLU", "cJmhtdIbv5Y5xdwCDl3dT8HPvklAUmwI", "4stzzs6gVfUC8wPYX", "7o6tBFGKBnQKcZsvXBJ4ayd9LnRtCNJ", "BSijPHOaulEPVGa4U1fKlqwI", "TamflSlcNH2rcKEIo3f72qWopMk8DENN", "Hhh3HDuTgivrAf4KqreTZK2", "SugScFu"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final boolean A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{31, 26, 26, 27, 10, 31, 23, 18, 13};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().density;
        A08 = (int) (A06 * 6.0f);
        A07 = (int) (A06 * 8.0f);
    }

    public C4193bq(C4494gi c4494gi, C3320Na c3320Na, boolean z, int i2, int i3, int i4) {
        super(c4494gi);
        setOrientation(1);
        this.A02 = new TextView(c4494gi);
        AbstractC3966YB.A0a(this.A02, true, i2);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A08, 1.0f);
        this.A01 = new TextView(c4494gi);
        this.A00 = new TextView(c4494gi);
        AbstractC3966YB.A0a(this.A00, false, i3);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A08, 1.0f);
        this.A03 = C3763Up.A17(c4494gi);
        int i5 = this.A03 ? -2 : -1;
        addView(this.A02, new LinearLayout.LayoutParams(i5, -2));
        addView(this.A01, new LinearLayout.LayoutParams(i5, -2));
        this.A01.setVisibility(8);
        A03(c3320Na, z);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, -2);
        layoutParams.setMargins(0, i4, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4193bq(C4494gi c4494gi, C3320Na c3320Na, boolean z, boolean z2, boolean z3) {
        int i2 = z2 ? 18 : 22;
        int i3 = z2 ? 14 : 16;
        int i4 = A07;
        this(c4494gi, c3320Na, z, i2, i3, z3 ? i4 / 2 : i4);
    }

    public final void A02() {
        this.A02.setTypeface(this.A02.getTypeface(), 1);
    }

    public final void A03(C3320Na c3320Na, boolean z) {
        this.A02.setTextColor(c3320Na.A07(z));
        this.A01.setTextColor(c3320Na.A05(z));
        this.A00.setTextColor(c3320Na.A06(z));
    }

    public final void A04(String str, String str2, String str3, boolean z, boolean z2) {
        int i2 = 1;
        boolean z3 = !TextUtils.isEmpty(str);
        boolean z4 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z3) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z3) {
            str2 = A00(0, 0, 51);
        }
        textView2.setText(str2);
        int i3 = 3;
        String[] strArr = A05;
        if (strArr[6].length() != strArr[4].length()) {
            String[] strArr2 = A05;
            strArr2[3] = "nuTyQWYrKUsKt4wC014k9cpf4UiNlrc";
            strArr2[0] = "l7Wy";
            if (!z3 || !z4) {
                TextView textView3 = this.A02;
                if (A05[1].charAt(4) != 'F') {
                    String[] strArr3 = A05;
                    strArr3[3] = "qWmgL2iM9nfMb7yMq7CVR7HS6Guvx6S";
                    strArr3[0] = "mFhP";
                    if (z) {
                        i3 = 2;
                    } else if (z2) {
                        i3 = 4;
                    }
                    textView3.setMaxLines(i3);
                    return;
                }
            } else {
                this.A02.setMaxLines(z ? 1 : 2);
                TextView textView4 = this.A00;
                if (!z) {
                    i2 = z2 ? 3 : 2;
                }
                textView4.setMaxLines(i2);
                return;
            }
        }
        throw new RuntimeException();
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i2) {
        if (this.A03) {
            setGravity(i2);
        }
        this.A02.setGravity(i2);
        this.A00.setGravity(i2);
    }

    public void setCTAClickListener(ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr) {
        ViewOnClickListenerC4196bt viewOnClickListenerC4196btA03 = AbstractC4197bu.A03(viewOnClickListenerC3152Kr, A00(0, 9, 20));
        this.A02.setOnClickListener(viewOnClickListenerC4196btA03);
        this.A00.setOnClickListener(viewOnClickListenerC4196btA03);
        this.A01.setOnClickListener(viewOnClickListenerC4196btA03);
    }

    public void setDescriptionTextSize(int i2) {
        this.A00.setTextSize(i2);
    }

    public void setDescriptionVisibility(int i2) {
        this.A00.setVisibility(i2);
    }

    public void setTitleTextSize(int i2) {
        this.A02.setTextSize(i2);
    }
}
