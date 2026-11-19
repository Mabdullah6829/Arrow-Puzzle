package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4044ZR implements InterfaceC3661TA {
    public static C4044ZR A07;
    public static byte[] A08;
    public InterfaceC3220Lx A00;
    public InterfaceC3652T1 A01;
    public InterfaceC3660T9 A02;
    public InterfaceC3676TP A03;
    public C3719U7 A04;
    public InterfaceC3796VM A05;
    public InterfaceC2639CY A06;

    static {
        A07();
    }

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{44, 62, 76, 76, 66, 72, 71, -7, 61, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, 61, 28, -13, -19, 32, 27, -15, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C4490ge c4490ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c4490ge);
        this.A06 = A05(c4490ge, this.A03, A03(c4490ge));
        A09(c4490ge, A00(c4490ge, this.A06));
        A0A(c4490ge, this.A06);
        A0B(c4490ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static InterfaceC3617SR A00(C4490ge c4490ge, InterfaceC2639CY interfaceC2639CY) {
        if (!C3763Up.A1r(c4490ge) || interfaceC2639CY == null) {
            return null;
        }
        return AbstractC3618SS.A00().A00(interfaceC2639CY);
    }

    public static InterfaceC3676TP A01(C4490ge c4490ge) {
        return AbstractC3677TQ.A00().A00(c4490ge, new C4192bp());
    }

    public static synchronized C4044ZR A02() {
        if (A07 == null) {
            A07 = new C4044ZR();
        }
        return A07;
    }

    public static InterfaceC4445fv A03(C4490ge c4490ge) {
        if (!C3763Up.A1n(c4490ge)) {
            return null;
        }
        return C4463gD.A01(c4490ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC2639CY A9F() {
        return this.A06;
    }

    public static InterfaceC2639CY A05(C4490ge c4490ge, InterfaceC3676TP interfaceC3676TP, InterfaceC4445fv interfaceC4445fv) {
        if (!C3763Up.A2m(c4490ge) || interfaceC4445fv == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC4486ga.A00().A00(c4490ge, interfaceC3676TP, interfaceC4445fv, AbstractC3852WI.A04(c4490ge), new C4049ZW(new C3844WA(c4490ge, A06(0, 0, 9), null, EnumC3824Vq.A08, 0, new C3828Vu(), AbstractC3948Xt.A01(C3763Up.A0N(c4490ge)), null, null, new C4615ij()), c4490ge), C4484gY.A00().A00());
    }

    public static void A08() {
        AbstractC3832Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(C4490ge c4490ge, InterfaceC3617SR interfaceC3617SR) {
        if (!C3763Up.A1r(c4490ge) || interfaceC3617SR == null) {
            return;
        }
        AbstractC3615SP.A00().A00(interfaceC3617SR, c4490ge);
    }

    public static void A0A(C4490ge c4490ge, InterfaceC2639CY interfaceC2639CY) {
        if (!C3763Up.A0m(c4490ge) || interfaceC2639CY == null) {
            return;
        }
        new C3637Sm(c4490ge, interfaceC2639CY, new C3638Sn(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C4490ge c4490ge, InterfaceC2639CY interfaceC2639CY) {
        if (interfaceC2639CY == null) {
            return;
        }
        AbstractC3767Ut.A00(c4490ge, interfaceC2639CY);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    public final InterfaceC3784VA A6n(C4490ge c4490ge) {
        return C3865WW.A01(c4490ge);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    public final synchronized InterfaceC3660T9 A74(C3659T8 c3659t8) {
        if (this.A02 == null) {
            this.A02 = new C4059Zg(this);
        }
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    public final synchronized InterfaceC3652T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new C4495gj();
        }
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    public final synchronized InterfaceC3676TP A7l(C3659T8 c3659t8) {
        if (this.A03 == null) {
            this.A03 = A01(c3659t8.A02());
        }
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    public final synchronized InterfaceC3689Tc A7n(C3659T8 c3659t8) {
        return new C4388f0(c3659t8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    public final synchronized InterfaceC3662TB A7x(final C3659T8 c3659t8) {
        return new AbstractC4191bo(c3659t8) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.instagram.common.viewpoint.core.InterfaceC3662TB
            public final boolean A9m() {
                return TextureViewSurfaceTextureListenerC2666Cz.A09();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC3662TB
            public final void ACP() {
                C3714U2.A06(C3579Rp.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC3662TB
            public final void ACn() {
                C3714U2.A07(C3579Rp.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC3662TB
            public final void ADI(C4490ge c4490ge) {
                AbstractC3371OP.A01(c4490ge);
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    public final synchronized InterfaceC3220Lx A8C(C3659T8 c3659t8) {
        if (!C3763Up.A13(c3659t8)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC3221Ly.A00().A00(new C4155bE(c3659t8));
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    public final synchronized InterfaceC3664TD A8y(C3659T8 c3659t8) {
        return new C4129ao(c3659t8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    public final C4490ge A8z(Context context) {
        C4490ge sdkContext = AbstractC3658T7.A00();
        if (sdkContext == null) {
            C4490ge sdkContext2 = new C4490ge(context, this);
            AbstractC3658T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    public final synchronized InterfaceC3796VM A90(C4490ge c4490ge) {
        if (this.A05 == null) {
            this.A05 = new C3918XP(c4490ge);
        }
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3661TA
    public final synchronized C3719U7 A96() {
        if (this.A04 == null) {
            this.A04 = new C3719U7();
            A08();
        }
        return this.A04;
    }
}
