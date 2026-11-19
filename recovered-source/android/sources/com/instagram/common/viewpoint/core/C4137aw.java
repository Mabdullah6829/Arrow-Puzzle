package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4137aw extends RelativeLayout {
    public static InterfaceC3998Yh A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC4542hU A00;
    public C4494gi A01;
    public C19440w A02;
    public C3224M1 A03;
    public C4186bj A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, 15, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = AbstractC3924XV.A0v;
        A07 = A08 * 10;
        A09 = (int) (AbstractC3926XX.A02 * 15.0f);
        A05 = new C3218Lv();
    }

    public C4137aw(C4494gi c4494gi) {
        super(c4494gi);
        this.A01 = c4494gi;
        this.A02 = new C19440w(c4494gi);
        AbstractC3966YB.A0K(this.A02);
        this.A00 = new C23387N();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C4332e5> A01(AbstractC4669jd abstractC4669jd) {
        if (abstractC4669jd == null) {
            return new ArrayList<>();
        }
        List<C3311NR> listA2G = abstractC4669jd.A2G();
        ArrayList<C4332e5> arrayList = new ArrayList<>(listA2G.size());
        for (int i2 = 0; i2 < listA2G.size(); i2++) {
            arrayList.add(new C4332e5(i2, listA2G.size(), listA2G.get(i2)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C3732UK c3732uk, int i2) {
        ArrayList<C4332e5> arrayListA01 = A01(c3732uk.A13());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new C3224M1(this.A01, arrayListA01, c3732uk.A13(), this.A01.A02().A0A(), c3732uk, A05, c3732uk.A13().A2E(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i2 == 0) {
            i2 = AbstractC3926XX.A04.widthPixels;
        }
        this.A03.A0O(i2 - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(c3732uk, arrayListA01);
    }

    public final void A06(C4439fp c4439fp) {
        if (this.A03 != null) {
            this.A03.A0P(c4439fp);
        } else {
            this.A01.A08().ABC(A00(51, 7, 24), AbstractC3690Td.A1v, new C3691Te(A00(0, 51, 125)));
        }
        this.A02.A20(c4439fp);
    }

    public static InterfaceC3998Yh getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (z && this.A03 != null) {
            this.A03.A0O((i4 - i2) - A07, 16, 0);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i2) {
        if (this.A04 != null) {
            this.A04.A00(i2);
        }
    }

    private void setupDotsLayout(C3732UK c3732uk, ArrayList<C4332e5> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C3215Ls(this));
        this.A04 = new C4186bj(this.A01, c3732uk.A13().A28().A01(), arrayList.size());
        AbstractC3966YB.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
