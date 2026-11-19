package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.62 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C225562 extends FrameLayout implements InterfaceC3029Is {
    public static byte[] A0A;
    public static String[] A0B = {"cNW8ZlUzhquZSz6XSi", "gKIjGDOIeaOzZR9qeyStr8duZ", "mQKfIuNnQZgt5ES8sx19fjwTYxycx0Lp", "WvoZHe7VElSdYX15O8PPMcOC5YskUK4l", "BfRVnLJiFu3hDnD", "WxgvJAZOXh", "crPtNK55mSnLeOXFeJGYeBq3ABMrpYK", "K6RBlZSEjGoukPcRXJY4znE0whNpCjIj"};
    public C4439fp A00;
    public final int A01;
    public final AbstractC4669jd A02;
    public final C4494gi A03;
    public final InterfaceC3784VA A04;
    public final C3957Y2 A05;
    public final InterfaceC4266d1 A06;
    public final C4277dC A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{100, 70, 73, 0, 83, 7, 84, 83, 70, 85, 83, 7, 102, 82, 67, 78, 66, 73, 68, 66, 105, 66, 83, 80, 72, 85, 76, 102, 68, 83, 78, 81, 78, 83, 94, 9, 7, 106, 70, 76, 66, 7, 84, 82, 85, 66, 7, 83, 79, 70, 83, 7, 78, 83, 0, 84, 7, 78, 73, 7, 94, 72, 82, 85, 7, 102, 73, 67, 85, 72, 78, 67, 106, 70, 73, 78, 65, 66, 84, 83, 9, 95, 74, 75, 7, 65, 78, 75, 66, 9, 24, 28, 31, 43, 58, 55, 59, 48, 61, 59, 16, 59, 42, 41, 49, 44, 53, 69, 74, 123, 69, 71, 80, 77, 82, 77, 80, 93, 4, 11, 14, 4, 12, 56, 20, 8, 18, 21, 4, 2, 90, 85, 64, 93, 66, 81, 117, 80, 112, 85, 64, 85, 118, 65, 90, 80, 88, 81, 27, 29, 11, 28, 13, 2, 7, 13, 5, 22, 9, 5, 23, 52, 25, 16, 5};
    }

    static {
        A02();
    }

    public C225562(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, InterfaceC4266d1 interfaceC4266d1, AbstractC4669jd abstractC4669jd, String str, int i2, C3957Y2 c3957y2) {
        super(c4494gi);
        this.A03 = c4494gi;
        this.A04 = interfaceC3784VA;
        this.A02 = abstractC4669jd;
        this.A08 = str;
        this.A06 = interfaceC4266d1;
        this.A01 = i2;
        C4277dC preloadedDynamicWebViewController = AbstractC4278dD.A02(abstractC4669jd.A1D());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            this.A07 = new C4277dC(this.A03, abstractC4669jd, interfaceC3784VA, i2);
            AbstractC4278dD.A03(abstractC4669jd, this.A07);
            this.A09 = false;
        }
        if (c3957y2 != null) {
            this.A05 = c3957y2;
            this.A07.A0Z(c3957y2);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new C3056JJ(this));
        this.A07.A0a(interfaceC4266d1);
        EnumC3931Xc.A04(this, EnumC3931Xc.A0B);
        if (C3763Up.A1z(c4494gi)) {
            c4494gi.A0B().AKp(this.A07.A0O(), abstractC4669jd.A2E(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0F().A66();
            this.A07.A0X();
        } else {
            this.A03.A0F().A67();
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    if (this.A06 != null) {
                        this.A06.ADm(this);
                    }
                    if (C3763Up.A1z(this.A03)) {
                        InterfaceC3796VM interfaceC3796VMA0B = this.A03.A0B();
                        if (A0B[1].length() != 25) {
                            throw new RuntimeException();
                        }
                        A0B[5] = "";
                        interfaceC3796VMA0B.ADb();
                    }
                } else {
                    AKD();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C4277dC.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC4669jd abstractC4669jd) {
        intent.putExtra(A01(157, 8, 110), EnumC3854WK.A07);
        intent.putExtra(A01(130, 18, 58), abstractC4669jd);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC4669jd abstractC4669jd) {
        AdActivityIntent adActivityIntentA05 = C3889Wu.A05(this.A03);
        A05(adActivityIntentA05, abstractC4669jd);
        try {
            C3889Wu.A0B(this.A03, adActivityIntentA05);
        } catch (Exception e) {
            this.A03.A08().ABC(A01(107, 11, 42), AbstractC3690Td.A0D, new C3691Te(e));
            Log.e(A01(90, 17, 80), A01(0, 90, 41), e);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C4172bV c4172bV = new C4172bV(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A2A());
        HashMap map = new HashMap();
        map.put(A01(C1137R.styleable.ConstraintSet_polarRelativeTo, 12, 105), A01(148, 9, 96));
        c4172bV.A05(this.A02.A2E(), str, map);
    }

    public final void A08() {
        AbstractC3966YB.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void A9f() {
        A07(this.A02.A29().A0J().A05());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void A9g(String str) {
        A07(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void A9k() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AAm() {
        new Handler(Looper.getMainLooper()).post(new C3052JF(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AE0() {
        A06(this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AE4() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AEu(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AFz() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AGX(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AGZ(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AGo(String str) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void AKD() {
        if (this.A06 != null) {
            this.A06.ADm(this);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3029Is
    public final void close() {
    }

    public InterfaceC3784VA getAdEventManager() {
        return this.A04;
    }

    public C4277dC getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C4439fp c4439fp) {
        this.A00 = c4439fp;
        this.A07.A0e(c4439fp);
    }
}
