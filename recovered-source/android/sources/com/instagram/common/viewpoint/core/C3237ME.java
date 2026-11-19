package com.instagram.common.viewpoint.core;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ME */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3237ME extends AbstractC4056Zd {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (AbstractC3926XX.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C3388Og A01;
    public final C4494gi A02;

    public C3237ME(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, String str, C3332Nm c3332Nm, InterfaceC3999Yi interfaceC3999Yi, InterfaceC3998Yh interfaceC3998Yh) {
        super(c4494gi, interfaceC3784VA, str, c3332Nm, interfaceC3999Yi, interfaceC3998Yh);
        this.A02 = c4494gi;
        this.A01 = AbstractC3389Oh.A00(c4494gi.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC3966YB.A0N(this.A00, -1728053248);
        if (C3763Up.A2b(c4494gi)) {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Zi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A0T(view);
                }
            });
        }
    }

    public static RelativeLayout.LayoutParams A00(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4056Zd
    public final void A0O() {
        C3392Ok c3392OkA0A = this.A01.A0A();
        C4071Zs c4071Zs = new C4071Zs(this.A02);
        c4071Zs.setInfo(EnumC3977YM.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c4071Zs.setOnClickListener(new ViewOnClickListenerC4062Zj(this));
        C3392Ok c3392OkA0B = this.A01.A0B();
        C4071Zs c4071Zs2 = new C4071Zs(this.A02);
        c4071Zs2.setInfo(EnumC3977YM.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c4071Zs2.setOnClickListener(new ViewOnClickListenerC4063Zk(this));
        C4071Zs c4071Zs3 = new C4071Zs(this.A02);
        c4071Zs3.setInfo(EnumC3977YM.AD_CHOICES_ICON, this.A01.A0M(), "");
        c4071Zs3.setOnClickListener(new ViewOnClickListenerC4064Zl(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        AbstractC3966YB.A0N(linearLayout, -1);
        if (!c3392OkA0A.A05().isEmpty()) {
            linearLayout.addView(c4071Zs, itemParams);
        }
        if (!c3392OkA0B.A05().isEmpty()) {
            linearLayout.addView(c4071Zs2, itemParams);
        }
        linearLayout.addView(c4071Zs3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4056Zd
    public final void A0P() {
        this.A00.removeAllViews();
        AbstractC3966YB.A0J(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4056Zd
    public final void A0Q(C3392Ok c3392Ok, EnumC3390Oi enumC3390Oi) {
        String strA0E;
        int i2;
        String strA01;
        if (enumC3390Oi == EnumC3390Oi.A05) {
            return;
        }
        boolean z = enumC3390Oi == EnumC3390Oi.A06;
        C4053Za c4053Za = new C4053Za(this.A02, this.A0D);
        if (z) {
            C3388Og c3388Og = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            strA0E = c3388Og.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        C4053Za c4053ZaA0D = c4053Za.A0H(strA0E).A0G(this.A01.A0D()).A0E(c3392Ok.A04()).A0D(z ? EnumC3977YM.REPORT_AD : EnumC3977YM.HIDE_AD);
        if (z) {
            i2 = -552389;
        } else {
            i2 = -13272859;
        }
        C4053Za c4053ZaA0C = c4053ZaA0D.A0C(i2);
        if (this.A0C != null) {
            C3332Nm c3332Nm = this.A0C;
            if (A03[1].charAt(11) != 'X') {
                strA01 = c3332Nm.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                strA01 = c3332Nm.A01();
            }
        } else {
            strA01 = "";
        }
        C4054Zb adHiddenView = c4053ZaA0C.A0F(strA01).A0L();
        AbstractC3966YB.A0N(adHiddenView, -1);
        AbstractC3966YB.A0W(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
        super.A0Q(c3392Ok, enumC3390Oi);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4056Zd
    public final void A0R(C3392Ok c3392Ok, EnumC3390Oi enumC3390Oi) {
        String strA0H;
        boolean z = enumC3390Oi == EnumC3390Oi.A06;
        C4494gi c4494gi = this.A02;
        InterfaceC4058Zf interfaceC4058Zf = this.A0D;
        if (z) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        C4074Zv c4074Zv = new C4074Zv(c4494gi, c3392Ok, interfaceC4058Zf, strA0H, z ? EnumC3977YM.REPORT_AD : EnumC3977YM.HIDE_AD);
        c4074Zv.setClickable(true);
        AbstractC3966YB.A0N(c4074Zv, -1);
        c4074Zv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c4074Zv, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4056Zd
    public final boolean A0S() {
        return false;
    }

    public final /* synthetic */ void A0T(View view) {
        this.A0D.A54();
    }
}
