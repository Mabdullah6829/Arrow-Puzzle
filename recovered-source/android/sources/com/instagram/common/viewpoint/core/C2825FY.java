package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2825FY extends AbstractC3548RK implements InterfaceC4005Yo {
    public C3326Ng A00;
    public AbstractC4438fo A01;
    public C4439fp A02;
    public C4439fp A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C4494gi A09;
    public final AbstractC226067 A0A;

    public C2825FY(AbstractC226067 abstractC226067, SparseBooleanArray sparseBooleanArray, C4439fp c4439fp, int i2, int i3, int i4, int i5, C4494gi c4494gi, C3326Ng c3326Ng) {
        super(abstractC226067);
        this.A09 = c4494gi;
        this.A0A = abstractC226067;
        this.A08 = sparseBooleanArray;
        this.A02 = c4439fp;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A07 = i5;
        this.A00 = c3326Ng;
    }

    private void A05(InterfaceC3784VA interfaceC3784VA, C3957Y2 c3957y2, String str, C4332e5 c4332e5) {
        if (this.A08.get(c4332e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C2829Fc(this, str, c4332e5, interfaceC3784VA, c4332e5.A04(), c3957y2);
        this.A03 = new C4439fp(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new C2826FZ(this, c4332e5));
    }

    public final ViewOnClickListenerC3152Kr A0p() {
        return this.A0A.getCtaButton();
    }

    public final void A0q(C4332e5 c4332e5, InterfaceC3784VA interfaceC3784VA, C3648Sx c3648Sx, C3957Y2 c3957y2, String str) {
        int iA02 = c4332e5.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = iA02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, iA02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c4332e5.A03().A0H().A08();
        String strA09 = c4332e5.A03().A0H().A09();
        this.A0A.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A0A.A1V()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c3648Sx.A0T(strA09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c4332e5.A03().A0I().A0G(), c4332e5.A03().A0I().A04());
        this.A0A.setCTAInfo(c4332e5.A03().A0J(), c4332e5.A04());
        this.A0A.A1Y(c4332e5.A04());
        A05(interfaceC3784VA, c3957y2, str, c4332e5);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4005Yo
    public final void AJF() {
        this.A0A.A1Q();
    }
}
