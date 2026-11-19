package com.instagram.common.viewpoint.core;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4760l9 implements InterfaceC3178LH {
    public static String[] A06 = {"EnQWPJ3V2xjVAThncas5joPITTvIB7EF", "1EuaMqG73HQ", "rjBteZjJ0vNfufCjCKCkAuxJVtJJHvWb", "xDvWT2DyWg3zA1fFgEAgA6zc8FBdFJ1B", "sfKNNRwM9cmkD7QHngaf04", "qaF2qGcI8dYBUqEwfxAr3oVVO8wm", "moKLjsoCWr0SdwKtjYcTHr1Csc5rll9E", "bRjHr7kF"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final C21864v A04 = new C21864v(32);
    public final InterfaceC3169L8 A05;

    public C4760l9(InterfaceC3169L8 interfaceC3169L8) {
        this.A05 = interfaceC3169L8;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3178LH
    public final void A5B(C21864v c21864v, int i2) {
        boolean z = (i2 & 1) != 0;
        int iA09 = -1;
        if (z) {
            iA09 = c21864v.A09() + c21864v.A0I();
        }
        boolean payloadUnitStartIndicator = this.A03;
        if (payloadUnitStartIndicator) {
            if (!z) {
                return;
            }
            this.A03 = false;
            c21864v.A0f(iA09);
            this.A00 = 0;
        }
        while (c21864v.A07() > 0) {
            if (this.A00 < 3) {
                if (this.A00 == 0) {
                    int iA0I = c21864v.A0I();
                    c21864v.A0f(c21864v.A09() - 1);
                    if (iA0I == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int iMin = Math.min(c21864v.A07(), 3 - this.A00);
                c21864v.A0k(this.A04.A0l(), this.A00, iMin);
                this.A00 += iMin;
                if (this.A00 == 3) {
                    this.A04.A0f(0);
                    this.A04.A0e(3);
                    this.A04.A0g(1);
                    int iA0I2 = this.A04.A0I();
                    int iA0I3 = this.A04.A0I();
                    boolean payloadUnitStartIndicator2 = (iA0I2 & 128) != 0;
                    this.A02 = payloadUnitStartIndicator2;
                    this.A01 = (((iA0I2 & 15) << 8) | iA0I3) + 3;
                    if (this.A04.A08() < this.A01) {
                        this.A04.A0c(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(this.A01, this.A04.A08() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c21864v.A07(), this.A01 - this.A00);
                c21864v.A0k(this.A04.A0l(), this.A00, iMin2);
                this.A00 += iMin2;
                if (this.A00 == this.A01) {
                    boolean payloadUnitStartIndicator3 = this.A02;
                    if (payloadUnitStartIndicator3) {
                        if (AbstractC22035C.A0I(this.A04.A0l(), 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        this.A04.A0e(this.A01 - 4);
                    } else {
                        this.A04.A0e(this.A01);
                    }
                    this.A04.A0f(0);
                    InterfaceC3169L8 interfaceC3169L8 = this.A05;
                    if (A06[3].charAt(18) == '6') {
                        throw new RuntimeException();
                    }
                    A06[6] = "q6sMTbjJkDPtFUqTMgY1hgSKkn8mDgdv";
                    interfaceC3169L8.A5A(this.A04);
                    this.A00 = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3178LH
    public final void AAA(C219453 c219453, InterfaceC2924HA interfaceC2924HA, C3177LG c3177lg) {
        this.A05.AAA(c219453, interfaceC2924HA, c3177lg);
        this.A03 = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3178LH
    public final void AJ5() {
        this.A03 = true;
    }
}
