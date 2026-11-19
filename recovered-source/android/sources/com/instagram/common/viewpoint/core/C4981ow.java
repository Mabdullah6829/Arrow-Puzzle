package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ow */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4981ow implements InterfaceC232378 {
    public static byte[] A07;
    public static String[] A08 = {"yII62Bxz4ePSH41vB2jdKSugEbZVWw1P", "xxJts2URfaqafakNk2KbG7F81xmmDazV", "4dv2SznKWSxWwafbIX2ls1ujl8jSHd2n", "ZTUBGrXVNXomnx09AH", "GEOoy7FoThRACcjBmfZ1TUIlEpKlWtQ8", "rZtP7yRh3duuKSKGXoPyzbqapeA3agH5", "0fM4GZ86zQsT7VByU2LW0lXLtFUbu0NT", "1qHBrVxL1wzL98lt8KL7QvczAsaDn4yk"};
    public InterfaceC232378 A00;
    public InterfaceC4973oo A01;
    public boolean A04;
    public final InterfaceC22786P A05;
    public final C4969ok A06;
    public boolean A03 = true;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "This reverts a bug introduced in D48802706. The upgraded exoaccounts for this but not the old exo. Hence, this is needed here temporarily")
    public boolean A02 = MetaExoPlayerUpgradeConfig.A03(EnumC4663jX.A1h);

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{86, 110, 119, 111, 114, 107, 119, 126, 59, 105, 126, 117, 127, 126, 105, 126, 105, 59, 118, 126, 127, 114, 122, 59, 120, 119, 116, 120, 112, 104, 59, 126, 117, 122, 121, 119, 126, 127, 53};
    }

    static {
        A01();
    }

    public C4981ow(InterfaceC22786P interfaceC22786P, InterfaceC213445 interfaceC213445) {
        this.A05 = interfaceC22786P;
        this.A06 = new C4969ok(interfaceC213445);
    }

    private void A02(boolean z) {
        if (A03(z)) {
            this.A03 = true;
            if (this.A04) {
                this.A06.A00();
                return;
            }
            return;
        }
        InterfaceC232378 interfaceC232378 = (InterfaceC232378) AbstractC21273y.A01(this.A00);
        long jA8p = interfaceC232378.A8p();
        if (this.A03) {
            InterfaceC232378 rendererClock = this.A06;
            long rendererClockPositionUs = rendererClock.A8p();
            if (jA8p < rendererClockPositionUs) {
                this.A06.A01();
                return;
            }
            this.A03 = false;
            if (this.A04) {
                C4969ok c4969ok = this.A06;
                String[] strArr = A08;
                if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                    throw new RuntimeException();
                }
                A08[3] = "DdBgGw0WSHdH6u";
                c4969ok.A00();
            }
        }
        this.A06.A02(jA8p);
        C5043px c5043pxA8m = interfaceC232378.A8m();
        InterfaceC232378 rendererClock2 = this.A06;
        if (!c5043pxA8m.equals(rendererClock2.A8m())) {
            InterfaceC232378 rendererClock3 = this.A06;
            rendererClock3.AJd(c5043pxA8m);
            this.A05.AFI(c5043pxA8m);
        }
    }

    private boolean A03(boolean z) {
        if (this.A01 != null) {
            InterfaceC4973oo interfaceC4973oo = this.A01;
            String[] strArr = A08;
            if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "259perxNRfR5uYao2q6cSAfIVJfeeK6N";
            strArr2[7] = "EI3wTVxb9Zi5034aB38J7XgUXur7uJJK";
            if (!interfaceC4973oo.AAP()) {
                if (!this.A01.AAe()) {
                    if (!z) {
                        boolean zA9p = this.A01.A9p();
                        String[] strArr3 = A08;
                        if (strArr3[4].charAt(0) != strArr3[5].charAt(0)) {
                            A08[3] = "UNE8e4mByuhRiLOUb8sZtJ";
                            if (zA9p) {
                            }
                        } else if (zA9p) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final long A04(boolean z) {
        A02(z);
        return A8p();
    }

    public final void A05() {
        this.A04 = true;
        this.A06.A00();
    }

    public final void A06() {
        this.A04 = false;
        this.A06.A01();
    }

    public final void A07(long j2) {
        this.A06.A02(j2);
    }

    public final void A08(InterfaceC4973oo interfaceC4973oo) {
        if (interfaceC4973oo == this.A01) {
            this.A00 = null;
            this.A01 = null;
            this.A03 = true;
        }
    }

    public final void A09(InterfaceC4973oo interfaceC4973oo) throws C2496AD {
        InterfaceC232378 interfaceC232378A8T = interfaceC4973oo.A8T();
        if (interfaceC232378A8T != null) {
            InterfaceC232378 rendererMediaClock = this.A00;
            if (interfaceC232378A8T != rendererMediaClock) {
                InterfaceC232378 interfaceC232378 = this.A00;
                String[] strArr = A08;
                if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                    throw new RuntimeException();
                }
                A08[3] = "dGOISEf";
                if (interfaceC232378 == null) {
                    this.A00 = interfaceC232378A8T;
                    this.A01 = interfaceC4973oo;
                    InterfaceC232378 interfaceC232379 = this.A00;
                    InterfaceC232378 rendererMediaClock2 = this.A06;
                    interfaceC232379.AJd(rendererMediaClock2.A8m());
                    return;
                }
                throw C2496AD.A02(new IllegalStateException(A00(0, 39, 8)));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC232378
    public final C5043px A8m() {
        if (this.A00 != null) {
            return this.A00.A8m();
        }
        return this.A06.A8m();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC232378
    public final long A8p() {
        if (this.A03) {
            return this.A06.A8p();
        }
        return ((InterfaceC232378) AbstractC21273y.A01(this.A00)).A8p();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC232378
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "This reverts a bug introduced in D48802706. The upgraded exoaccounts for this but not the old exo. Hence, this is needed here temporarily")
    public final void AJd(C5043px c5043px) {
        if (this.A00 != null) {
            this.A00.AJd(c5043px);
            c5043px = this.A00.A8m();
        }
        this.A06.AJd(c5043px);
        if (this.A02) {
            this.A05.AFI(c5043px);
        }
    }
}
