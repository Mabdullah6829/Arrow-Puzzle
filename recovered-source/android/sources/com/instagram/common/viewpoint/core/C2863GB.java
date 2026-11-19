package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2863GB extends FrameLayout implements InterfaceC3999Yi {
    public static String[] A0F = {"", "W4Q5rze9OaCj8zYeEqMqJDKHVn1jlwCj", "tfMK6ikBUwqELtuMuu5Kubqydzlt1dTF", "vHKgDETdn9HfwlFLESHxJfcBT5o8ovHI", "7Mubz7OjQQHbSYG", "T8sk6PPloyPWHv5iczs8jf8QHRZ1ZSou", "3ZCO1Nznw11DnI4nXgj4IK6CNfFIYy0N", "YX"};
    public static final RelativeLayout.LayoutParams A0G = new RelativeLayout.LayoutParams(-1, -1);
    public C3568Re A00;
    public InterfaceC3999Yi A01;
    public Intent A02;
    public Bundle A03;
    public InterfaceC3999Yi A04;
    public final AbstractC4669jd A05;
    public final AbstractC4669jd A06;
    public final C3334No A07;
    public final C4494gi A08;
    public final InterfaceC3784VA A09;
    public final EnumC3854WK A0A;
    public final ViewOnSystemUiVisibilityChangeListenerC3952Xx A0B;
    public final InterfaceC3998Yh A0C;
    public final InterfaceC4047ZU A0D;
    public final boolean A0E;

    public C2863GB(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, AbstractC4669jd abstractC4669jd, AbstractC4669jd abstractC4669jd2, InterfaceC3998Yh interfaceC3998Yh, C3568Re c3568Re, EnumC3854WK enumC3854WK) {
        super(c4494gi);
        this.A08 = c4494gi;
        this.A09 = interfaceC3784VA;
        this.A06 = abstractC4669jd;
        this.A05 = abstractC4669jd2;
        this.A07 = this.A05.A29().A0H().A07();
        this.A0C = interfaceC3998Yh;
        this.A0B = new ViewOnSystemUiVisibilityChangeListenerC3952Xx(this);
        this.A0B.A05(EnumC3951Xw.A02);
        this.A0A = enumC3854WK;
        if (this.A0A == EnumC3854WK.A0J) {
            this.A0D = new C3239MG();
        } else {
            this.A0D = new C3240MH();
        }
        boolean z = false;
        if (this.A07 != null) {
            if (this.A07.A0b() && this.A05.A1n()) {
                z = true;
            }
            this.A0E = z;
            return;
        }
        this.A0E = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC3999Yi A05(InterfaceC4047ZU interfaceC4047ZU, C3334No c3334No, Boolean bool) {
        if (bool.booleanValue()) {
            return new C3255MW(this.A08, this.A09, this.A0C, this.A05, c3334No, this.A05.A1G(), interfaceC4047ZU);
        }
        return new C3308NO(this.A08, this.A09, this.A0C, this.A05, this.A05.A1G(), interfaceC4047ZU, true);
    }

    private C21604V A0A() {
        if (this.A07 != null) {
            this.A06.A1R(this.A07.A0X());
            this.A06.A1S(this.A07.A0c());
        }
        C21604V c21604v = new C21604V(this.A08, this.A0D, this.A09, this.A06, new C3648Sx(this.A08), this.A0C);
        c21604v.setVideoLeadingPlayableAdListener(new C2865GD(this));
        return c21604v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A04 != null) {
            this.A04.onDestroy();
            if (this.A04 instanceof View) {
                ((View) this.A04).setVisibility(8);
                removeView((View) this.A04);
            }
        }
    }

    private final void A0C(Intent intent, Bundle bundle, C3568Re c3568Re) {
        this.A04 = A0A();
        this.A04.AAu(intent, bundle, c3568Re);
        if (this.A0E && this.A07 != null) {
            this.A01 = A05(this.A0D, this.A07, Boolean.valueOf(this.A05.A1n()));
            this.A01.AAu(intent, bundle, c3568Re);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AAu(Intent intent, Bundle bundle, C3568Re c3568Re) {
        this.A02 = intent;
        this.A03 = bundle;
        this.A00 = c3568Re;
        this.A0C.A45(this, A0G);
        A0C(intent, bundle, c3568Re);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFA(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFi(boolean z) {
        if (this.A04 instanceof C3255MW) {
            InterfaceC3999Yi interfaceC3999Yi = this.A04;
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[0] = "";
            strArr2[4] = "sBQPYruyJOWbMZu";
            interfaceC3999Yi.AFi(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AIv(Bundle bundle) {
    }

    public InterfaceC3999Yi getContentView() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public String getCurrentClientToken() {
        return this.A06.A2E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        if (this.A04 != null) {
            this.A04.onActivityResult(i2, i3, intent);
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A04 instanceof C3255MW) {
            ((C3255MW) this.A04).onConfigurationChanged(configuration);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void onDestroy() {
    }

    public void setListener(InterfaceC3998Yh interfaceC3998Yh) {
    }
}
