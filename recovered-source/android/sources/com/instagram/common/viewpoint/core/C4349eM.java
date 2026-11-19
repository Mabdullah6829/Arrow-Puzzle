package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4349eM {
    public ViewOnClickListenerC3152Kr A00;
    public final C3307NN A01;
    public final C3318NY A02;
    public final C3323Nd A03;
    public final C3332Nm A04;
    public final C4494gi A05;
    public final C3792VI A06;
    public static final int A09 = (int) (AbstractC3926XX.A02 * 4.0f);
    public static final int A07 = (int) (AbstractC3926XX.A02 * 72.0f);
    public static final int A08 = (int) (AbstractC3926XX.A02 * 8.0f);

    public C4349eM(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, AbstractC4669jd abstractC4669jd) {
        this.A05 = c4494gi;
        this.A06 = new C3792VI(abstractC4669jd.A2E(), interfaceC3784VA);
        this.A01 = abstractC4669jd.A28();
        this.A02 = abstractC4669jd.A29().A0I();
        this.A04 = abstractC4669jd.A2C();
        this.A03 = abstractC4669jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr) {
        C4193bq c4193bq = new C4193bq(this.A05, this.A01.A01(), true, false, false);
        c4193bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c4193bq.setAlignment(17);
        C4187bk c4187bk = new C4187bk(this.A05);
        AbstractC3966YB.A0N(c4187bk, 0);
        c4187bk.setRadius(50);
        new AsyncTaskC3183LM(c4187bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c4187bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c4193bq, layoutParams);
        if (viewOnClickListenerC3152Kr != null) {
            AbstractC3966YB.A0J(viewOnClickListenerC3152Kr);
            linearLayout.addView(viewOnClickListenerC3152Kr, layoutParams);
            viewOnClickListenerC3152Kr.setPadding(AbstractC3924XV.A0Z, 0, AbstractC3924XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC3152Kr.getText())) {
                AbstractC3966YB.A0H(viewOnClickListenerC3152Kr);
            }
        }
        return linearLayout;
    }

    private C23377M A01() {
        C23377M c23377m = new C23377M(this.A05);
        c23377m.setLayoutManager(new C4564hr(this.A05, 0, false));
        c23377m.setAdapter(new C2808FH(this.A05, this.A03.A02(), A09, this.A00));
        return c23377m;
    }

    private final EnumC4348eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC4348eL.A03;
        }
        return EnumC4348eL.A02;
    }

    public final Pair<EnumC4348eL, View> A03(ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr) {
        View viewA01;
        this.A00 = viewOnClickListenerC3152Kr;
        EnumC4348eL enumC4348eLA02 = A02();
        switch (enumC4348eLA02) {
            case A03:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        AbstractC3794VK.A04(viewA01, this.A06, EnumC3791VH.A0S);
        return new Pair<>(enumC4348eLA02, viewA01);
    }
}
