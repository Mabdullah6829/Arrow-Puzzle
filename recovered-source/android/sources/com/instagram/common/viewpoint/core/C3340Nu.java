package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3340Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C3648Sx A00;
    public EnumC4154bD A01 = EnumC4154bD.A05;
    public ArrayList<C4277dC> A02 = new ArrayList<>();
    public final AbstractC3310NQ A03;
    public final InterfaceC3339Nt A04;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C3340Nu(C4494gi c4494gi, C3354O8 c3354o8, InterfaceC3339Nt interfaceC3339Nt, String str) {
        JSONObject dataObject = c3354o8.A03();
        this.A03 = A01(c4494gi, c3354o8, str, dataObject);
        this.A04 = interfaceC3339Nt;
    }

    private AdError A00(C4494gi c4494gi, AbstractC4669jd abstractC4669jd) {
        if (abstractC4669jd == null || abstractC4669jd.A2G().isEmpty()) {
            c4494gi.A08().ABC(A04(62, 3, 33), AbstractC3690Td.A0Z, new C3691Te(A04(5, 43, 20)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static AbstractC3310NQ A01(C4494gi c4494gi, C3354O8 c3354o8, String str, JSONObject jSONObject) {
        AbstractC3310NQ abstractC3310NQA00 = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                abstractC3310NQA00 = C4661jT.A01(jSONObject, c4494gi, true);
                abstractC3310NQA00.A1Q(true);
                abstractC3310NQA00.A1N(A04(96, 12, C1137R.styleable.ConstraintSet_pivotAnchor));
            } catch (JSONException unused) {
            }
        }
        if (abstractC3310NQA00 == null) {
            abstractC3310NQA00 = C23647n.A00(jSONObject, c4494gi);
        }
        abstractC3310NQA00.A1M(str);
        C3710Tx c3710TxA01 = c3354o8.A01();
        if (c3710TxA01 != null) {
            abstractC3310NQA00.A1I(c3710TxA01.A06());
        }
        return abstractC3310NQA00;
    }

    private C3648Sx A03(C4494gi c4494gi) {
        return this.A00 != null ? this.A00 : new C3648Sx(c4494gi);
    }

    private void A08(C4494gi c4494gi, C23647n c23647n) {
        C3334No playableData = c23647n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC4154bD.A05);
        C4644jC c4644jC = new C4644jC(this);
        C3648Sx c3648Sx = new C3648Sx(c4494gi);
        boolean z = C3763Up.A2H(c4494gi) && C3613SN.A0A(c23647n.A1H());
        if (z) {
            C3613SN unifiedAssetsLoader = new C3613SN(c3648Sx, c23647n.A1H(), c23647n.A10(), c23647n.A1D(), z, new C4643jB(this));
            c3648Sx.A0e(new C3792VI(c23647n.A2E(), c4494gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AbstractC3351O5.A02(c4494gi, c23647n, true, c4644jC);
    }

    private void A09(C4494gi c4494gi, EnumSet<CacheFlag> enumSet, AbstractC4669jd abstractC4669jd, int i2, InterfaceC3339Nt interfaceC3339Nt) {
        boolean isDSL = abstractC4669jd.A1g();
        C3648Sx c3648SxA03 = A03(c4494gi);
        c3648SxA03.A0e(new C3792VI(abstractC4669jd.A2E(), c4494gi.A0A()));
        boolean z = C3763Up.A2H(c4494gi) && C3613SN.A0A(abstractC4669jd.A1H());
        if (z) {
            new C3613SN(c3648SxA03, abstractC4669jd.A1H(), abstractC4669jd.A10(), abstractC4669jd.A1D(), z, new C4647jF(this, c4494gi, isDSL, abstractC4669jd, interfaceC3339Nt)).A0B();
            return;
        }
        String strA04 = A04(96, 12, C1137R.styleable.ConstraintSet_pivotAnchor);
        if (isDSL) {
            C3644St c3644St = new C3644St(abstractC4669jd.A0x(), abstractC4669jd.A1D(), strA04);
            c3644St.A04 = true;
            c3644St.A03 = A04(0, 5, 78);
            c3648SxA03.A0Y(c3644St);
        }
        c3648SxA03.A0d(new C3646Sv(abstractC4669jd.A2C().A01(), C4331e4.A04, C4331e4.A04, abstractC4669jd.A1D(), A04(96, 12, C1137R.styleable.ConstraintSet_pivotAnchor)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i3 = 0;
        boolean zA30 = C3763Up.A30(c4494gi, C4421fX.A03());
        for (C3311NR c3311nr : abstractC4669jd.A2G()) {
            C3646Sv c3646Sv = new C3646Sv(c3311nr.A0H().A08(), AbstractC3347O1.A00(c3311nr.A0H()), AbstractC3347O1.A01(c3311nr.A0H()), abstractC4669jd.A1D(), A04(96, 12, C1137R.styleable.ConstraintSet_pivotAnchor));
            if (i3 == 0) {
                c3648SxA03.A0c(c3646Sv);
            } else {
                c3648SxA03.A0d(c3646Sv);
            }
            Iterator<String> it = c3311nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c3648SxA03.A0d(new C3646Sv(it.next(), -1, -1, abstractC4669jd.A1D(), A04(96, 12, C1137R.styleable.ConstraintSet_pivotAnchor)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(c3311nr.A0H().A09())) {
                C3644St c3644St2 = new C3644St(c3311nr.A0H().A09(), abstractC4669jd.A1D(), A04(96, 12, C1137R.styleable.ConstraintSet_pivotAnchor), c3311nr.A0H().A06());
                c3644St2.A04 = false;
                if (i3 == 0) {
                    if (isDSL && !zA30) {
                        c3648SxA03.A0Y(c3644St2);
                    } else {
                        c3648SxA03.A0b(c3644St2);
                    }
                } else if (isDSL && !zA30) {
                    c3648SxA03.A0Z(c3644St2);
                } else {
                    c3648SxA03.A0a(c3644St2);
                }
            }
            i3++;
        }
        if (abstractC4669jd.A1W() && !TextUtils.isEmpty(abstractC4669jd.A11())) {
            c3648SxA03.A0d(new C3646Sv(abstractC4669jd.A11(), C3446Pe.A0A, C3446Pe.A0A, abstractC4669jd.A1D(), A04(96, 12, C1137R.styleable.ConstraintSet_pivotAnchor)));
        }
        AbstractC3346O0.A00(abstractC4669jd, c3648SxA03, strA04);
        c3648SxA03.A0X(new C4645jD(this, c4494gi, isDSL, abstractC4669jd, interfaceC3339Nt), new C3641Sq(abstractC4669jd.A1D(), strA04, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C4494gi c4494gi, EnumSet<CacheFlag> enumSet, C4661jT c4661jT, AbstractC4669jd abstractC4669jd, int i2, InterfaceC3339Nt interfaceC3339Nt) {
        A09(c4494gi, enumSet, abstractC4669jd, i2, new C4649jH(this, c4494gi, abstractC4669jd, c4661jT, i2, interfaceC3339Nt, enumSet));
    }

    private void A0B(EnumC4154bD enumC4154bD) {
        this.A01 = enumC4154bD;
    }

    private boolean A0C(C4494gi c4494gi, AbstractC4669jd abstractC4669jd) {
        AdError adErrorA00 = A00(c4494gi, abstractC4669jd);
        if (adErrorA00 != null) {
            this.A04.ACo(adErrorA00);
            return true;
        }
        return false;
    }

    public final AbstractC3310NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        return com.instagram.common.viewpoint.core.EnumC3854WK.A0C;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.common.viewpoint.core.EnumC3854WK A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.NQ r0 = r5.A03
            boolean r0 = r0.A1b()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.EnumC3854WK.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.NQ r4 = r5.A03
            com.facebook.ads.redexgen.X.jd r4 = (com.instagram.common.viewpoint.core.AbstractC4669jd) r4
            boolean r0 = r4.A1g()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.EnumC3854WK.A06
            return r0
        L18:
            java.util.List r0 = r4.A2G()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.EnumC3854WK.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.NR r0 = r4.A29()
            com.facebook.ads.redexgen.X.NU r0 = r0.A0H()
            com.facebook.ads.redexgen.X.No r3 = r0.A07()
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C3340Nu.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L9f
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C3340Nu.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L7a
            boolean r0 = r4.A1n()
            if (r0 != 0) goto L71
            boolean r3 = r4.A1u()
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C3340Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C3340Nu.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L77
        L71:
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.EnumC3854WK.A0E
            return r0
        L74:
            if (r3 == 0) goto L77
            goto L71
        L77:
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.EnumC3854WK.A0C
            return r0
        L7a:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C3340Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C3340Nu.A06
            java.lang.String r1 = "iDu"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L96
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.EnumC3854WK.A0D
            return r0
        L96:
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.EnumC3854WK.A0B
            return r0
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C3340Nu.A0E():com.facebook.ads.redexgen.X.WK");
    }

    public final EnumC4154bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C4661jT) this.A03).A2A();
        }
        return ((AbstractC4669jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C4494gi c4494gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == EnumC3854WK.A04) {
            C4661jT c4661jT = (C4661jT) this.A03;
            AbstractC4669jd abstractC4669jdA26 = c4661jT.A26();
            if (A0C(c4494gi, abstractC4669jdA26) || abstractC4669jdA26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c4494gi, enumSet, c4661jT, abstractC4669jdA26, 0, this.A04);
            return;
        }
        AbstractC4669jd abstractC4669jd = (AbstractC4669jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c4494gi, abstractC4669jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == EnumC3854WK.A0C) {
            C23647n c23647n = (C23647n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c4494gi, c23647n);
                return;
            } else {
                A08(c4494gi, c23647n);
                return;
            }
        }
        A09(c4494gi, enumSet, (C23647n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC4669jd abstractC4669jd) {
        return !TextUtils.isEmpty(abstractC4669jd.A29().A0H().A09());
    }
}
