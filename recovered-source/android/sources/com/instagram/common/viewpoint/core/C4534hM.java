package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4534hM extends AbstractC3286N2 {
    public static byte[] A03;
    public static String[] A04 = {"G2rh", "Fb5x", "6CyVQJjLjUxkB4NOtEwwqOuY7kB2daf", "v2svMG5ZVzKjVXyH1MXvdM9krQWCKsNq", "oRWr7RpHwOoI3beQIRyDA09DO9LlUwST", "SjgxBMhR0kRV74MEQavsGpgIJGrbvWLl", "8l9W", "lapvzpZuNASF"};
    public View A00;
    public final C3567Rd A01;
    public final C232176 A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {69, 103, 104, 104, 105, 114, 38, 118, 116, 99, 117, 99, 104, 114, 38, 104, 115, 106, 106, 38, 103, 98, 80, 111, 99, 113};
        if (A04[7].length() == 31) {
            throw new RuntimeException();
        }
        A04[0] = "ScK1";
        A03 = bArr;
    }

    static {
        A03();
    }

    public C4534hM(C3567Rd c3567Rd) {
        this.A02 = c3567Rd.A09();
        this.A01 = c3567Rd;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0C() {
        this.A02.A0F().A4U();
        AbstractC3862WT.A00(new C4536hO(this));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0D() {
        this.A02.A0F().A4X();
        AbstractC3862WT.A00(new C4535hN(this));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0E(View view) {
        if (view != null) {
            C232176 c232176 = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A04[0] = "eqHc";
            c232176.A0F().A4W();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if ((this.A00 instanceof C3192LV) || (this.A00 instanceof C4019Z2)) {
                AbstractC3826Vs.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            C23617k controller = this.A01.A08();
            if (controller != null) {
                controller.A0L();
            }
            AbstractC3862WT.A00(new C4537hP(this));
            this.A01.A0B(this.A01.A07(), this.A00);
            if (C3763Up.A1C(this.A01.A07().getContext())) {
                C4147b6 c4147b6 = new C4147b6();
                this.A01.A0D(c4147b6);
                c4147b6.A0C(this.A01.getPlacementId());
                c4147b6.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0J() != null) {
                    c4147b6.A09(this.A01.A08().A0J().A0C());
                }
                if (this.A00 instanceof C3192LV) {
                    c4147b6.A0A(((C3192LV) this.A00).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new ViewOnLongClickListenerC3575Rl(this, c4147b6));
                this.A00.getOverlay().add(c4147b6);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 22));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0F(InterfaceC3285N1 interfaceC3285N1) {
        this.A02.A0F().A4V(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0M();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3286N2
    public final void A0G(C3821Vm c3821Vm) {
        this.A02.A0F().A3N(C3956Y1.A01(this.A01.A04()), c3821Vm.A03().getErrorCode(), c3821Vm.A04());
        AbstractC3862WT.A00(new C4538hQ(this, c3821Vm));
    }
}
