package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4175bY extends RelativeLayout {
    public static String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final LinearLayout A01;
    public final C4661jT A02;
    public final C4494gi A03;
    public final InterfaceC3784VA A04;
    public final InterfaceC3998Yh A05;

    public C4175bY(C4494gi c4494gi, C4661jT c4661jT, InterfaceC3784VA interfaceC3784VA, InterfaceC3998Yh interfaceC3998Yh, int i2, int i3) {
        super(c4494gi);
        this.A03 = c4494gi;
        this.A02 = c4661jT;
        this.A04 = interfaceC3784VA;
        this.A05 = interfaceC3998Yh;
        this.A00 = i2;
        this.A01 = new LinearLayout(c4494gi);
        A00();
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i3);
    }

    private void A00() {
        int i2 = 0;
        while (true) {
            int iA23 = this.A02.A23();
            String[] strArr = A06;
            String str = strArr[2];
            String str2 = strArr[4];
            int iCharAt = str.charAt(18);
            int i3 = str2.charAt(18);
            if (iCharAt == i3) {
                throw new RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i2 < iA23) {
                C3176LF c3176lf = new C3176LF(this.A03, this.A02.A27(i2), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i4 = C3176LF.A0C;
                int i5 = C3176LF.A0C;
                int i6 = C3176LF.A0C;
                int i7 = C3176LF.A0C;
                layoutParams.setMargins(i4, i5, i6, i7);
                c3176lf.setLayoutParams(layoutParams);
                this.A01.addView(c3176lf);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i2) {
        if (i2 != 1) {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (((double) this.A00) * 0.25d));
        } else {
            this.A01.setOrientation(1);
            this.A01.setPadding(0, (int) (((double) this.A00) * 1.5d), 0, this.A00);
        }
    }
}
