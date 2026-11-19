package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.ads.internal.androidx.support.p052v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4564hr extends AbstractC3530R2 implements InterfaceC3542RE {
    public static byte[] A0F;
    public static String[] A0G = {"ZTDwmEtle1avZIcEXO6Ngzge8j05pfT9", "s1YfUPq4amp3sGXTr0KOnMWCCCkrB2x5", "RLSriKm", "hA4l3MFFurEjuKvfb479JjwTp2cnC09n", "5GFF521rSn4TdhEStccPhauxYrt7NMVp", "XQN2s9DMc1xKucEpv2CitIAcNHBR8E7y", "8ubGCSX", "EFysGv6XChRnXfWxG2n7d2ksHTdYT6om"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public AbstractC3514Qm A04;
    public boolean A05;
    public int A06;
    public C3510Qh A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C3508Qf A0D;
    public final C3509Qg A0E;

    public static String A0T(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{31, 24, 0, 23, 26, 31, 18, 86, 25, 4, 31, 19, 24, 2, 23, 2, 31, 25, 24, 76};
    }

    static {
        A0V();
    }

    public C4564hr(Context context) {
        this(context, 1, false);
    }

    public C4564hr(Context context, int i2, boolean z) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new C3508Qf(this);
        this.A0E = new C3509Qg();
        this.A06 = 2;
        A2C(i2);
        A0h(z);
        A1T(true);
    }

    private final int A04(int i2, C3538RA c3538ra, C3545RH c3545rh) {
        if (A0Y() == 0 || i2 == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A2B();
        int absDy = i2 > 0 ? 1 : -1;
        int consumed = Math.abs(i2);
        A0Y(absDy, consumed, true, c3545rh);
        int i3 = this.A07.A07;
        int layoutDirection = A07(c3538ra, this.A07, c3545rh, false);
        int i4 = i3 + layoutDirection;
        if (i4 < 0) {
            return 0;
        }
        int absDy2 = consumed > i4 ? absDy * i4 : i2;
        int layoutDirection2 = -absDy2;
        this.A04.A0J(layoutDirection2);
        this.A07.A04 = absDy2;
        return absDy2;
    }

    private int A05(int i2, C3538RA c3538ra, C3545RH c3545rh, boolean z) {
        int fixOffset;
        int gap = this.A04.A07() - i2;
        if (gap > 0) {
            int i3 = -A04(-gap, c3538ra, c3545rh);
            int i4 = i2 + i3;
            if (z && (fixOffset = this.A04.A07() - i4) > 0) {
                this.A04.A0J(fixOffset);
                return fixOffset + i3;
            }
            return i3;
        }
        return 0;
    }

    private int A06(int i2, C3538RA c3538ra, C3545RH c3545rh, boolean z) {
        int iA0A;
        int gap = i2 - this.A04.A0A();
        if (gap > 0) {
            int i3 = -A04(gap, c3538ra, c3545rh);
            int i4 = i2 + i3;
            if (z && (iA0A = i4 - this.A04.A0A()) > 0) {
                this.A04.A0J(-iA0A);
                return i3 - iA0A;
            }
            return i3;
        }
        return 0;
    }

    private final int A07(C3538RA c3538ra, C3510Qh c3510Qh, C3545RH c3545rh, boolean z) {
        int i2 = c3510Qh.A00;
        int start = c3510Qh.A07;
        if (start != Integer.MIN_VALUE) {
            int start2 = c3510Qh.A00;
            if (start2 < 0) {
                int i3 = c3510Qh.A07;
                int start3 = c3510Qh.A00;
                c3510Qh.A07 = i3 + start3;
            }
            A0e(c3538ra, c3510Qh);
        }
        int i4 = c3510Qh.A00;
        int start4 = c3510Qh.A02;
        int i5 = i4 + start4;
        C3509Qg c3509Qg = this.A0E;
        while (true) {
            if ((!c3510Qh.A09 && i5 <= 0) || !c3510Qh.A05(c3545rh)) {
                break;
            }
            c3509Qg.A00();
            A2F(c3538ra, c3545rh, c3510Qh, c3509Qg);
            if (!c3509Qg.A01) {
                int i6 = c3510Qh.A06;
                int remainingSpace = c3509Qg.A00;
                int start5 = c3510Qh.A05;
                c3510Qh.A06 = i6 + (remainingSpace * start5);
                if (!c3509Qg.A03 || this.A07.A08 != null || !c3545rh.A07()) {
                    int remainingSpace2 = c3510Qh.A00;
                    int start6 = c3509Qg.A00;
                    c3510Qh.A00 = remainingSpace2 - start6;
                    int start7 = c3509Qg.A00;
                    i5 -= start7;
                }
                int start8 = c3510Qh.A07;
                if (start8 != Integer.MIN_VALUE) {
                    int remainingSpace3 = c3510Qh.A07;
                    int start9 = c3509Qg.A00;
                    c3510Qh.A07 = remainingSpace3 + start9;
                    int start10 = c3510Qh.A00;
                    if (start10 < 0) {
                        int remainingSpace4 = c3510Qh.A07;
                        int start11 = c3510Qh.A00;
                        c3510Qh.A07 = remainingSpace4 + start11;
                    }
                    A0e(c3538ra, c3510Qh);
                }
                if (z && c3509Qg.A02) {
                    break;
                }
            } else {
                break;
            }
        }
        int start12 = c3510Qh.A00;
        return i2 - start12;
    }

    private int A08(C3545RH c3545rh) {
        if (A0Y() == 0) {
            return 0;
        }
        A2B();
        return AbstractC3549RL.A00(c3545rh, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private int A0A(C3545RH c3545rh) {
        if (A0Y() != 0) {
            A2B();
            return AbstractC3549RL.A02(c3545rh, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
        }
        if (A0G[3].charAt(25) != '2') {
            throw new RuntimeException();
        }
        A0G[1] = "J9JFedtgHh7lzsKv2wGVe5URJzbGPRgH";
        return 0;
    }

    private int A0B(C3545RH c3545rh) {
        if (A0Y() == 0) {
            return 0;
        }
        A2B();
        return AbstractC3549RL.A01(c3545rh, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private final int A0C(C3545RH c3545rh) {
        if (c3545rh.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0Y());
    }

    private View A0E() {
        return A0H(A0Y() - 1, -1);
    }

    private View A0F() {
        return A0v(this.A05 ? 0 : A0Y() - 1);
    }

    private View A0G() {
        return A0v(this.A05 ? A0Y() - 1 : 0);
    }

    private final View A0H(int i2, int i3) {
        int next;
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        A2B();
        if (i3 > i2) {
            next = 1;
        } else {
            next = i3 < i2 ? -1 : 0;
        }
        if (next == 0) {
            return A0v(i2);
        }
        int preferredBoundsFlag2 = this.A04.A0F(A0v(i2));
        int next2 = this.A04.A0A();
        if (preferredBoundsFlag2 < next2) {
            acceptableBoundsFlag = 16644;
            preferredBoundsFlag = 16388;
        } else {
            acceptableBoundsFlag = 4161;
            preferredBoundsFlag = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        int next3 = this.A00;
        if (next3 == 0) {
            return super.A04.A00(i2, i3, acceptableBoundsFlag, preferredBoundsFlag);
        }
        return super.A05.A00(i2, i3, acceptableBoundsFlag, preferredBoundsFlag);
    }

    private final View A0I(int i2, int i3, boolean z, boolean z2) {
        int i4;
        A2B();
        int i5 = 0;
        if (z) {
            i4 = 24579;
        } else {
            i4 = 320;
        }
        if (z2) {
            i5 = 320;
        }
        int i6 = this.A00;
        int acceptableBoundsFlag = A0G[5].charAt(29);
        if (acceptableBoundsFlag != 69) {
            throw new RuntimeException();
        }
        A0G[5] = "CO2lCdhiUyNnJNyVLVKK7uQ85cne8EHP";
        if (i6 == 0) {
            return super.A04.A00(i2, i3, i4, i5);
        }
        return super.A05.A00(i2, i3, i4, i5);
    }

    private View A0J(C3538RA c3538ra, C3545RH c3545rh) {
        return A2A(c3538ra, c3545rh, 0, A0Y(), c3545rh.A03());
    }

    private View A0L(C3538RA c3538ra, C3545RH c3545rh) {
        return A2A(c3538ra, c3545rh, A0Y() - 1, -1, c3545rh.A03());
    }

    private View A0M(C3538RA c3538ra, C3545RH c3545rh) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(C3538RA c3538ra, C3545RH c3545rh) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(C3538RA c3538ra, C3545RH c3545rh) {
        return this.A05 ? A0J(c3538ra, c3545rh) : A0L(c3538ra, c3545rh);
    }

    private View A0P(C3538RA c3538ra, C3545RH c3545rh) {
        return this.A05 ? A0L(c3538ra, c3545rh) : A0J(c3538ra, c3545rh);
    }

    private View A0Q(boolean z, boolean z2) {
        if (this.A05) {
            return A0I(0, A0Y(), z, z2);
        }
        return A0I(A0Y() - 1, -1, z, z2);
    }

    private View A0R(boolean z, boolean z2) {
        if (this.A05) {
            return A0I(A0Y() - 1, -1, z, z2);
        }
        return A0I(0, A0Y(), z, z2);
    }

    private final C3510Qh A0S() {
        return new C3510Qh();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2H()) {
            this.A05 = this.A0A;
        } else {
            this.A05 = !this.A0A;
        }
    }

    private void A0W(int i2, int i3) {
        this.A07.A00 = this.A04.A07() - i3;
        this.A07.A03 = this.A05 ? -1 : 1;
        this.A07.A01 = i2;
        this.A07.A05 = 1;
        this.A07.A06 = i3;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i2, int i3) {
        this.A07.A00 = i3 - this.A04.A0A();
        this.A07.A01 = i2;
        this.A07.A03 = this.A05 ? 1 : -1;
        this.A07.A05 = -1;
        this.A07.A06 = i3;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i2, int i3, boolean z, C3545RH c3545rh) {
        int iA0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(c3545rh);
        this.A07.A05 = i2;
        int i4 = -1;
        if (i2 == 1) {
            this.A07.A02 += this.A04.A08();
            View viewA0F = A0F();
            C3510Qh c3510Qh = this.A07;
            if (!this.A05) {
                i4 = 1;
            }
            c3510Qh.A03 = i4;
            this.A07.A01 = A0r(viewA0F) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(viewA0F);
            iA0A = this.A04.A0C(viewA0F) - this.A04.A07();
        } else {
            View viewA0G = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0r(viewA0G) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(viewA0G);
            iA0A = (-this.A04.A0F(viewA0G)) + this.A04.A0A();
        }
        this.A07.A00 = i3;
        if (z) {
            C3510Qh c3510Qh2 = this.A07;
            int scrollingOffset = c3510Qh2.A00;
            c3510Qh2.A00 = scrollingOffset - iA0A;
        }
        this.A07.A07 = iA0A;
    }

    private void A0Z(C3508Qf c3508Qf) {
        A0W(c3508Qf.A01, c3508Qf.A00);
    }

    private void A0a(C3508Qf c3508Qf) {
        A0X(c3508Qf.A01, c3508Qf.A00);
    }

    private void A0b(C3538RA c3538ra, int i2) {
        int iA0Y = A0Y();
        if (i2 < 0) {
            return;
        }
        int iA06 = this.A04.A06() - i2;
        boolean z = this.A05;
        int limit = A0G[3].charAt(25);
        if (limit != 50) {
            throw new RuntimeException();
        }
        A0G[1] = "5eQap7viEGWOuRbzagNYDGjkAWEMIhVp";
        if (z) {
            for (int i3 = 0; i3 < iA0Y; i3++) {
                View viewA0v = A0v(i3);
                int childCount = this.A04.A0F(viewA0v);
                if (childCount >= iA06) {
                    int childCount2 = this.A04.A0H(viewA0v);
                    if (childCount2 >= iA06) {
                    }
                }
                int limit2 = A0G[4].length();
                if (limit2 != 13) {
                    String[] strArr = A0G;
                    strArr[6] = "EiwXPaP";
                    strArr[2] = "4OvxlWI";
                    A0d(c3538ra, 0, i3);
                    return;
                }
                A0d(c3538ra, 0, i3);
                return;
            }
            return;
        }
        for (int i4 = iA0Y - 1; i4 >= 0; i4--) {
            View viewA0v2 = A0v(i4);
            int childCount3 = this.A04.A0F(viewA0v2);
            if (childCount3 >= iA06) {
                int childCount4 = this.A04.A0H(viewA0v2);
                if (childCount4 >= iA06) {
                }
            }
            int childCount5 = iA0Y - 1;
            A0d(c3538ra, childCount5, i4);
            return;
        }
    }

    private void A0c(C3538RA c3538ra, int i2) {
        if (i2 < 0) {
            return;
        }
        int iA0Y = A0Y();
        if (this.A05) {
            for (int i3 = iA0Y - 1; i3 >= 0; i3--) {
                View viewA0v = A0v(i3);
                AbstractC3514Qm abstractC3514Qm = this.A04;
                int childCount = A0G[5].charAt(29);
                if (childCount != 69) {
                    throw new RuntimeException();
                }
                A0G[3] = "CCkneFsBnjHsOQTiipl2DNgji2H70UcR";
                int limit = abstractC3514Qm.A0C(viewA0v);
                if (limit <= i2) {
                    int limit2 = this.A04.A0G(viewA0v);
                    if (limit2 <= i2) {
                    }
                }
                int limit3 = iA0Y - 1;
                A0d(c3538ra, limit3, i3);
                return;
            }
            return;
        }
        for (int i4 = 0; i4 < iA0Y; i4++) {
            View viewA0v2 = A0v(i4);
            int limit4 = this.A04.A0C(viewA0v2);
            if (limit4 <= i2) {
                int limit5 = this.A04.A0G(viewA0v2);
                if (limit5 <= i2) {
                }
            }
            A0d(c3538ra, 0, i4);
            return;
        }
    }

    private void A0d(C3538RA c3538ra, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 > i2) {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                A16(i4, c3538ra);
            }
            return;
        }
        while (i2 > i3) {
            A16(i2, c3538ra);
            i2--;
        }
    }

    private void A0e(C3538RA c3538ra, C3510Qh c3510Qh) {
        if (!c3510Qh.A0B || c3510Qh.A09) {
            return;
        }
        if (c3510Qh.A05 == -1) {
            A0b(c3538ra, c3510Qh.A07);
        } else {
            A0c(c3538ra, c3510Qh.A07);
        }
    }

    private void A0f(C3538RA c3538ra, C3545RH c3545rh, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!c3545rh.A08() || A0Y() == 0 || c3545rh.A07() || !A24()) {
            return;
        }
        int iA0D = 0;
        int scrapExtraStart = 0;
        List<AbstractC3548RK> listA0J = c3538ra.A0J();
        int i2 = listA0J.size();
        int iA0r = A0r(A0v(0));
        for (int scrapSize = 0; scrapSize < i2; scrapSize++) {
            AbstractC3548RK abstractC3548RK = listA0J.get(scrapSize);
            if (!abstractC3548RK.A0g()) {
                int direction = 1;
                if ((abstractC3548RK.A0O() < iA0r) != this.A05) {
                    direction = -1;
                }
                if (direction == -1) {
                    iA0D += this.A04.A0D(abstractC3548RK.A0H);
                } else {
                    scrapExtraStart += this.A04.A0D(abstractC3548RK.A0H);
                }
            }
        }
        this.A07.A08 = listA0J;
        if (iA0D > 0) {
            A0X(A0r(A0G()), scrapExtraEnd);
            this.A07.A02 = iA0D;
            this.A07.A00 = 0;
            this.A07.A04();
            A07(c3538ra, this.A07, c3545rh, false);
        }
        if (scrapExtraStart > 0) {
            A0W(A0r(A0F()), scrapExtraEnd2);
            this.A07.A02 = scrapExtraStart;
            this.A07.A00 = 0;
            this.A07.A04();
            A07(c3538ra, this.A07, c3545rh, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(C3538RA c3538ra, C3545RH c3545rh, C3508Qf c3508Qf) {
        if (A0k(c3545rh, c3508Qf) || A0j(c3538ra, c3545rh, c3508Qf)) {
            return;
        }
        c3508Qf.A02();
        c3508Qf.A01 = this.A0C ? c3545rh.A03() - 1 : 0;
    }

    private final void A0h(boolean z) {
        A20(null);
        if (z == this.A0A) {
            return;
        }
        this.A0A = z;
        A10();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(C3538RA c3538ra, C3545RH c3545rh, C3508Qf c3508Qf) {
        View viewA0P;
        int iA0A;
        if (A0Y() == 0) {
            return false;
        }
        View viewA0u = A0u();
        if (viewA0u != null && c3508Qf.A06(viewA0u, c3545rh)) {
            c3508Qf.A05(viewA0u);
            return true;
        }
        if (this.A08 != this.A0C) {
            return false;
        }
        if (c3508Qf.A02) {
            viewA0P = A0O(c3538ra, c3545rh);
        } else {
            viewA0P = A0P(c3538ra, c3545rh);
        }
        if (viewA0P == null) {
            return false;
        }
        c3508Qf.A04(viewA0P);
        if (!c3545rh.A07() && A24()) {
            if (this.A04.A0F(viewA0P) >= this.A04.A07() || this.A04.A0C(viewA0P) < this.A04.A0A()) {
                if (c3508Qf.A02) {
                    iA0A = this.A04.A07();
                } else {
                    iA0A = this.A04.A0A();
                }
                c3508Qf.A00 = iA0A;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        r10.A00 = r8.A04.A0A();
        r10.A02 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        r1 = r8.A04.A07() - r8.A04.A0C(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (r1 >= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r10.A00 = r8.A04.A07();
        r10.A02 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        if (r10.A02 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        r1 = r8.A04.A0C(r5);
        r1 = r1 + r8.A04.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r10.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        r1 = r8.A04.A0F(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0k(com.instagram.common.viewpoint.core.C3545RH r9, com.instagram.common.viewpoint.core.C3508Qf r10) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C4564hr.A0k(com.facebook.ads.redexgen.X.RH, com.facebook.ads.redexgen.X.Qf):boolean");
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public int A1f(int i2, C3538RA c3538ra, C3545RH c3545rh) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i2, c3538ra, c3545rh);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public int A1g(int i2, C3538RA c3538ra, C3545RH c3545rh) {
        if (this.A00 == 0) {
            return 0;
        }
        return A04(i2, c3538ra, c3545rh);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final int A1h(C3545RH c3545rh) {
        return A08(c3545rh);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final int A1i(C3545RH c3545rh) {
        return A0A(c3545rh);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final int A1j(C3545RH c3545rh) {
        return A0B(c3545rh);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final int A1k(C3545RH c3545rh) {
        return A08(c3545rh);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final int A1l(C3545RH c3545rh) {
        return A0A(c3545rh);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final int A1m(C3545RH c3545rh) {
        return A0B(c3545rh);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final Parcelable A1n() {
        if (this.A03 != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(this.A03));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
        if (A0Y() > 0) {
            A2B();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = A0F();
                linearLayoutManager$SavedState.A00 = this.A04.A07() - this.A04.A0C(refChild);
                linearLayoutManager$SavedState.A01 = A0r(refChild);
            } else {
                View viewA0G = A0G();
                linearLayoutManager$SavedState.A01 = A0r(viewA0G);
                linearLayoutManager$SavedState.A00 = this.A04.A0F(viewA0G) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final View A1o(int i2) {
        int firstChild = A0Y();
        if (firstChild == 0) {
            return null;
        }
        int childCount = i2 - A0r(A0v(0));
        if (childCount >= 0 && childCount < firstChild) {
            View viewA0v = A0v(childCount);
            if (A0r(viewA0v) == i2) {
                return viewA0v;
            }
        }
        return super.A1o(i2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public View A1p(View view, int i2, C3538RA c3538ra, C3545RH c3545rh) {
        int maxScroll;
        View nextFocus;
        View viewA0F;
        A0U();
        if (A0Y() == 0 || (maxScroll = A29(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        A2B();
        A2B();
        int layoutDir = this.A04.A0B();
        A0Y(maxScroll, (int) (layoutDir * 0.33333334f), false, c3545rh);
        this.A07.A07 = Integer.MIN_VALUE;
        this.A07.A0B = false;
        A07(c3538ra, this.A07, c3545rh, true);
        if (maxScroll == -1) {
            nextFocus = A0N(c3538ra, c3545rh);
        } else {
            nextFocus = A0M(c3538ra, c3545rh);
        }
        if (maxScroll == -1) {
            viewA0F = A0G();
        } else {
            viewA0F = A0F();
        }
        if (viewA0F.hasFocusable()) {
            if (nextFocus == null) {
                return null;
            }
            return viewA0F;
        }
        return nextFocus;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public C3531R3 A1q() {
        return new C3531R3(-2, -2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public void A1r(int i2) {
        this.A01 = i2;
        this.A02 = Integer.MIN_VALUE;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A10();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final void A1s(int i2, int i3, C3545RH c3545rh, InterfaceC3528R0 interfaceC3528R0) {
        if (this.A00 != 0) {
            i2 = i3;
        }
        int delta = A0Y();
        if (delta == 0 || i2 == 0) {
            return;
        }
        A2B();
        int i4 = i2 > 0 ? 1 : -1;
        int delta2 = Math.abs(i2);
        A0Y(i4, delta2, true, c3545rh);
        A2G(c3545rh, this.A07, interfaceC3528R0);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final void A1t(int i2, InterfaceC3528R0 interfaceC3528R0) {
        boolean z;
        int direction;
        if (this.A03 != null && this.A03.A01()) {
            z = this.A03.A02;
            direction = this.A03.A01;
        } else {
            A0U();
            z = this.A05;
            if (this.A01 == -1) {
                direction = z ? i2 - 1 : 0;
            } else {
                direction = this.A01;
            }
        }
        int anchorPos = z ? -1 : 1;
        for (int i3 = 0; i3 < this.A06 && direction >= 0 && direction < i2; i3++) {
            interfaceC3528R0.A42(direction, 0);
            direction += anchorPos;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final void A1u(Parcelable parcelable) {
        ClassLoader classLoader;
        if (!(parcelable instanceof WrappedParcelable) || (classLoader = getClass().getClassLoader()) == null) {
            return;
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (state instanceof LinearLayoutManager$SavedState) {
            this.A03 = (LinearLayoutManager$SavedState) state;
            A10();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final void A1v(AccessibilityEvent accessibilityEvent) {
        super.A1v(accessibilityEvent);
        if (A0Y() > 0) {
            accessibilityEvent.setFromIndex(A26());
            if (A0G[1].charAt(13) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[6] = "JM0e54P";
            strArr[2] = "62qYDCA";
            accessibilityEvent.setToIndex(A27());
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0242  */
    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public void A1w(C3538RA c3538ra, C3545RH c3545rh) {
        int startOffset;
        int fixOffset;
        int extraForStart;
        View viewA1o;
        int fixOffset2;
        int extraForStart2 = -1;
        if ((this.A03 != null || this.A01 != -1) && c3545rh.A03() == 0) {
            A1K(c3538ra);
            return;
        }
        if (this.A03 != null && this.A03.A01()) {
            this.A01 = this.A03.A01;
        }
        A2B();
        C3510Qh c3510Qh = this.A07;
        if (A0G[4].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[6] = "TEU8GGg";
        strArr[2] = "lg12FnG";
        c3510Qh.A0B = false;
        A0U();
        View viewA0u = A0u();
        if (!this.A0D.A03 || this.A01 != -1 || this.A03 != null) {
            this.A0D.A03();
            this.A0D.A02 = this.A05 ^ this.A0C;
            A0g(c3538ra, c3545rh, this.A0D);
            this.A0D.A03 = true;
        } else if (viewA0u != null) {
            int startOffset2 = this.A04.A0F(viewA0u);
            int lastElement = this.A04.A07();
            if (A0G[0].charAt(9) != '8') {
                A0G[1] = "cu8BBcv0k6hBgzqZsr0VN3sfifuVMQ62";
                if (startOffset2 < lastElement) {
                    if (this.A04.A0C(viewA0u) <= this.A04.A0A()) {
                    }
                }
            } else if (startOffset2 < lastElement) {
                if (this.A04.A0C(viewA0u) <= this.A04.A0A()) {
                }
            }
            this.A0D.A05(viewA0u);
        }
        int lastElement2 = A0C(c3545rh);
        if (this.A07.A04 >= 0) {
            startOffset = 0;
        } else {
            startOffset = lastElement2;
            lastElement2 = 0;
        }
        int current = startOffset + this.A04.A0A();
        int startOffset3 = lastElement2 + this.A04.A08();
        if (c3545rh.A07() && this.A01 != -1 && this.A02 != Integer.MIN_VALUE && (viewA1o = A1o(this.A01)) != null) {
            if (this.A05) {
                fixOffset2 = (this.A04.A07() - this.A04.A0C(viewA1o)) - this.A02;
            } else {
                fixOffset2 = this.A02 - (this.A04.A0F(viewA1o) - this.A04.A0A());
            }
            if (fixOffset2 > 0) {
                current += fixOffset2;
            } else {
                startOffset3 -= fixOffset2;
            }
        }
        if (this.A0D.A02) {
            if (this.A05) {
                extraForStart2 = 1;
            }
        } else if (!this.A05) {
            extraForStart2 = 1;
        }
        A2E(c3538ra, c3545rh, this.A0D, extraForStart2);
        A1J(c3538ra);
        this.A07.A09 = A0i();
        this.A07.A0A = c3545rh.A07();
        if (this.A0D.A02) {
            A0a(this.A0D);
            this.A07.A02 = current;
            A07(c3538ra, this.A07, c3545rh, false);
            extraForStart = this.A07.A06;
            int extraForEnd = this.A07.A01;
            if (this.A07.A00 > 0) {
                C3510Qh c3510Qh2 = this.A07;
                if (A0G[7].charAt(1) != 'F') {
                    String[] strArr2 = A0G;
                    strArr2[6] = "MJWLhmn";
                    strArr2[2] = "Xdeja1C";
                    startOffset3 += c3510Qh2.A00;
                } else {
                    A0G[3] = "HkWuM96xU0ciNRE25G4cwktgC29lbS6I";
                    startOffset3 += c3510Qh2.A00;
                }
            }
            A0Z(this.A0D);
            this.A07.A02 = startOffset3;
            this.A07.A01 += this.A07.A03;
            A07(c3538ra, this.A07, c3545rh, false);
            fixOffset = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i2 = this.A07.A00;
                A0X(extraForEnd, extraForStart);
                this.A07.A02 = i2;
                A07(c3538ra, this.A07, c3545rh, false);
                extraForStart = this.A07.A06;
            }
        } else {
            A0Z(this.A0D);
            this.A07.A02 = startOffset3;
            A07(c3538ra, this.A07, c3545rh, false);
            fixOffset = this.A07.A06;
            int extraForEnd2 = this.A07.A01;
            if (this.A07.A00 > 0) {
                current += this.A07.A00;
            }
            A0a(this.A0D);
            this.A07.A02 = current;
            this.A07.A01 += this.A07.A03;
            A07(c3538ra, this.A07, c3545rh, false);
            extraForStart = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i3 = this.A07.A00;
                A0W(extraForEnd2, fixOffset);
                this.A07.A02 = i3;
                A07(c3538ra, this.A07, c3545rh, false);
                fixOffset = this.A07.A06;
            }
        }
        if (A0Y() > 0) {
            if (this.A05 ^ this.A0C) {
                int iA05 = A05(fixOffset, c3538ra, c3545rh, true);
                int extraForStart3 = extraForStart + iA05;
                int fixOffset3 = fixOffset + iA05;
                int iA06 = A06(extraForStart3, c3538ra, c3545rh, false);
                extraForStart = extraForStart3 + iA06;
                fixOffset = fixOffset3 + iA06;
            } else {
                int iA07 = A06(extraForStart, c3538ra, c3545rh, true);
                int extraForStart4 = extraForStart + iA07;
                int fixOffset4 = fixOffset + iA07;
                int iA08 = A05(fixOffset4, c3538ra, c3545rh, false);
                extraForStart = extraForStart4 + iA08;
                fixOffset = fixOffset4 + iA08;
            }
        }
        A0f(c3538ra, c3545rh, extraForStart, fixOffset);
        if (!c3545rh.A07()) {
            this.A04.A0I();
        } else {
            this.A0D.A03();
        }
        this.A08 = this.A0C;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public void A1x(C3545RH c3545rh) {
        super.A1x(c3545rh);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final void A1y(C23377M c23377m, C3538RA c3538ra) {
        super.A1y(c23377m, c3538ra);
        if (this.A09) {
            A1K(c3538ra);
            c3538ra.A0P();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public void A1z(C23377M c23377m, C3545RH c3545rh, int i2) {
        C4563hq linearSmoothScroller = new C4563hq(c23377m.getContext());
        linearSmoothScroller.A0A(i2);
        A1N(linearSmoothScroller);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final void A20(String str) {
        if (this.A03 == null) {
            super.A20(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final boolean A21() {
        return (A0a() == 1073741824 || A0k() == 1073741824 || !A1U()) ? false : true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final boolean A22() {
        return this.A00 == 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public final boolean A23() {
        return this.A00 == 1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3530R2
    public boolean A24() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A25() {
        View child = A0I(0, A0Y(), true, false);
        if (child == null) {
            return -1;
        }
        return A0r(child);
    }

    public final int A26() {
        View child = A0I(0, A0Y(), false, true);
        if (child == null) {
            return -1;
        }
        return A0r(child);
    }

    public final int A27() {
        View child = A0I(A0Y() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return A0r(child);
    }

    public final int A28() {
        return this.A00;
    }

    public final int A29(int i2) {
        switch (i2) {
            case 1:
                if (this.A00 == 1) {
                    return -1;
                }
                boolean zA2H = A2H();
                if (A0G[4].length() != 13) {
                    A0G[7] = "JFBGAdvw0W46p1IiHd184rfjlhxsbjRk";
                    return zA2H ? 1 : -1;
                }
                break;
            case 2:
                return (this.A00 != 1 && A2H()) ? -1 : 1;
            case 17:
                if (this.A00 == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case 33:
                if (this.A00 == 1) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case 66:
                int i3 = this.A00;
                String[] strArr = A0G;
                if (strArr[6].length() == strArr[2].length()) {
                    A0G[0] = "A4gNOGqmCbgTlyYHXDAs3UqrHjABAhAn";
                    return i3 == 0 ? 1 : Integer.MIN_VALUE;
                }
                break;
            case 130:
                return this.A00 == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
        throw new RuntimeException();
    }

    public View A2A(C3538RA c3538ra, C3545RH c3545rh, int i2, int i3, int i4) {
        A2B();
        View view = null;
        View view2 = null;
        int iA0A = this.A04.A0A();
        int boundsEnd = this.A04.A07();
        int boundsStart = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View outOfBoundsMatch = A0v(i2);
            int iA0r = A0r(outOfBoundsMatch);
            if (iA0r >= 0 && iA0r < i4) {
                if (((C3531R3) outOfBoundsMatch.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = outOfBoundsMatch;
                    }
                } else if (this.A04.A0F(outOfBoundsMatch) >= boundsEnd || this.A04.A0C(outOfBoundsMatch) < iA0A) {
                    if (view2 == null) {
                        view2 = outOfBoundsMatch;
                    }
                } else {
                    return outOfBoundsMatch;
                }
            }
            i2 += boundsStart;
        }
        return view2 != null ? view2 : view;
    }

    public final void A2B() {
        if (this.A07 == null) {
            C3510Qh c3510QhA0S = A0S();
            if (A0G[3].charAt(25) != '2') {
                throw new RuntimeException();
            }
            A0G[7] = "6FRvOBuqOIFmnj4QgnBJgNDOjl7oudHL";
            this.A07 = c3510QhA0S;
        }
        if (this.A04 == null) {
            this.A04 = AbstractC3514Qm.A02(this, this.A00);
        }
    }

    public final void A2C(int i2) {
        if (i2 == 0 || i2 == 1) {
            A20(null);
            if (i2 == this.A00) {
                return;
            }
            this.A00 = i2;
            this.A04 = null;
            A10();
            return;
        }
        throw new IllegalArgumentException(A0T(0, 20, 45) + i2);
    }

    public final void A2D(int i2, int i3) {
        this.A01 = i2;
        this.A02 = i3;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A10();
    }

    public void A2E(C3538RA c3538ra, C3545RH c3545rh, C3508Qf c3508Qf, int i2) {
    }

    public void A2F(C3538RA c3538ra, C3545RH c3545rh, C3510Qh c3510Qh, C3509Qg c3509Qg) {
        int iA0i;
        int right;
        int iA0g;
        int iA0E;
        View viewA03 = c3510Qh.A03(c3538ra);
        if (viewA03 == null) {
            c3509Qg.A01 = true;
            return;
        }
        C3531R3 c3531r3 = (C3531R3) viewA03.getLayoutParams();
        if (c3510Qh.A08 == null) {
            if (this.A05 == (c3510Qh.A05 == -1)) {
                A19(viewA03);
            } else {
                A1B(viewA03, 0);
            }
        } else {
            boolean z = this.A05;
            int bottom = c3510Qh.A05;
            if (z == (bottom == -1)) {
                A18(viewA03);
            } else {
                A1A(viewA03, 0);
            }
        }
        A1C(viewA03, 0, 0);
        c3509Qg.A00 = this.A04.A0D(viewA03);
        if (this.A00 == 1) {
            if (A2H()) {
                iA0E = A0j() - A0h();
                iA0g = iA0E - this.A04.A0E(viewA03);
            } else {
                iA0g = A0g();
                iA0E = this.A04.A0E(viewA03) + iA0g;
            }
            if (c3510Qh.A05 == -1) {
                right = c3510Qh.A06;
                iA0i = c3510Qh.A06 - c3509Qg.A00;
            } else {
                iA0i = c3510Qh.A06;
                right = c3510Qh.A06 + c3509Qg.A00;
            }
        } else {
            iA0i = A0i();
            right = this.A04.A0E(viewA03) + iA0i;
            int bottom2 = c3510Qh.A05;
            if (bottom2 == -1) {
                iA0E = c3510Qh.A06;
                int i2 = c3510Qh.A06;
                int bottom3 = c3509Qg.A00;
                iA0g = i2 - bottom3;
            } else {
                iA0g = c3510Qh.A06;
                int i3 = c3510Qh.A06;
                int bottom4 = c3509Qg.A00;
                iA0E = i3 + bottom4;
            }
        }
        A1D(viewA03, iA0g, iA0i, iA0E, right);
        if (c3531r3.A02() || c3531r3.A01()) {
            c3509Qg.A03 = true;
        }
        c3509Qg.A02 = viewA03.hasFocusable();
    }

    public void A2G(C3545RH c3545rh, C3510Qh c3510Qh, InterfaceC3528R0 interfaceC3528R0) {
        int i2 = c3510Qh.A01;
        if (i2 >= 0) {
            int pos = c3545rh.A03();
            if (i2 < pos) {
                int pos2 = c3510Qh.A07;
                interfaceC3528R0.A42(i2, Math.max(0, pos2));
            }
        }
    }

    public final boolean A2H() {
        return A0c() == 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3542RE
    public final PointF A56(int i2) {
        if (A0Y() == 0) {
            return null;
        }
        boolean z = i2 < A0r(A0v(0));
        boolean z2 = this.A05;
        int firstChildPos = A0G[4].length();
        if (firstChildPos == 13) {
            throw new RuntimeException();
        }
        A0G[7] = "FFnbbIQmxzlcCB5QJgqtb02Njm6aLfkX";
        int i3 = z != z2 ? -1 : 1;
        int direction = this.A00;
        if (direction == 0) {
            return new PointF(i3, 0.0f);
        }
        return new PointF(0.0f, i3);
    }
}
