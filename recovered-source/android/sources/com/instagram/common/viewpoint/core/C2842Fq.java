package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2842Fq extends AbstractC3548RK implements InterfaceC4005Yo {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public C3326Ng A00;
    public AbstractC4438fo A01;
    public C4439fp A02;
    public C4439fp A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C4494gi A06;
    public final C22756M A07;

    public C2842Fq(C22756M c22756m, SparseBooleanArray sparseBooleanArray, C4439fp c4439fp, int i2, C4494gi c4494gi, C3326Ng c3326Ng) {
        super(c22756m);
        this.A06 = c4494gi;
        this.A07 = c22756m;
        this.A05 = sparseBooleanArray;
        this.A02 = c4439fp;
        this.A04 = i2;
        this.A00 = c3326Ng;
    }

    private void A05(InterfaceC3784VA interfaceC3784VA, C3957Y2 c3957y2, String str, C4332e5 c4332e5) {
        if (this.A05.get(c4332e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new C2844Fs(this, str, c4332e5, interfaceC3784VA, c4332e5.A04(), c3957y2);
        this.A03 = new C4439fp(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C2843Fr(this, c4332e5));
    }

    public final void A0p(C4332e5 c4332e5, InterfaceC3784VA interfaceC3784VA, C3648Sx c3648Sx, C3957Y2 c3957y2, String str, int i2, int i3, int i4) {
        int iA02 = c4332e5.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(iA02));
        this.A07.setupNativeCtaExtension(c4332e5);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i2, -2);
        int rightMargin = iA02 == 0 ? i4 : i3;
        if (iA02 < this.A04 - 1) {
            i4 = i3;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i4, 0);
        String strA08 = c4332e5.A03().A0H().A08();
        String strA09 = c4332e5.A03().A0H().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A07.A1V()) {
            this.A07.setVideoPlaceholderUrl(strA08);
            this.A07.setVideoUrl(c3648Sx.A0T(strA09));
        } else {
            this.A07.setImageUrl(strA08);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c4332e5.A03().A0J(), c4332e5.A04());
        this.A07.A1W(c4332e5.A04());
        A05(interfaceC3784VA, c3957y2, str, c4332e5);
    }

    public final void A0q(C4439fp c4439fp) {
        this.A02 = c4439fp;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4005Yo
    public final void AJF() {
        this.A07.A1Q();
    }
}
