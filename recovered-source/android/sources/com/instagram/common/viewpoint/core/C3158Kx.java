package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3158Kx implements InterfaceC3916XN {
    public static byte[] A0B;
    public int A00;
    public int A01;
    public int A02;
    public AbstractC3992Yb A03;
    public String A04;
    public String A05;
    public ViewOnClickListenerC3152Kr A06;
    public boolean A0A = false;
    public boolean A09 = false;
    public boolean A08 = false;
    public Integer A07 = null;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{78, 102, 112, 118, 102, 72, 117, 97, 96, 123, 119, 120, 125, 119, 127};
    }

    public C3158Kx(int i2, int i3, int i4, String str, String str2, AbstractC3992Yb abstractC3992Yb, ViewOnClickListenerC3152Kr viewOnClickListenerC3152Kr) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = abstractC3992Yb;
        this.A06 = viewOnClickListenerC3152Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (this.A08) {
            A04();
        }
    }

    public final synchronized void A04() {
        if (this.A09) {
            return;
        }
        this.A09 = true;
        if (this.A01 == 1 && this.A03 != null) {
            this.A03.setProgressImage(null);
            this.A03.setProgressClickListener(null);
            this.A03.setToolbarActionMessage(A00(0, 0, 66));
            this.A03.A0A();
            if (this.A07 != null) {
                this.A03.setToolbarActionMode(this.A07.intValue());
            }
            if (this.A06.getColorInfo() != null) {
                this.A03.A0D(this.A06.getColorInfo(), false);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final synchronized void ADS() {
        if (!this.A09) {
            this.A06.A0E(A00(6, 9, 101));
        }
        A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final synchronized void AFV(float f2) {
        if (!this.A09 && this.A03 != null) {
            if (this.A01 == 1) {
                if (!this.A0A) {
                    this.A07 = Integer.valueOf(this.A03.getToolbarActionMode());
                    this.A03.setProgressClickListener(new ViewOnClickListenerC4164bN(this));
                    this.A03.A0B();
                    this.A03.setToolbarListener(new C3172LB(this));
                    this.A0A = true;
                    if (this.A07 == null || this.A07.intValue() == 4) {
                        this.A03.setToolbarActionMode(5);
                    } else {
                        this.A03.setToolbarActionMode(6);
                    }
                }
                if (f2 <= this.A02) {
                    if (!this.A08) {
                        this.A08 = true;
                        if (this.A07 == null || this.A07.intValue() == 4) {
                            this.A03.setToolbarActionMode(7);
                        } else {
                            this.A03.setProgressImage(EnumC3977YM.CROSS);
                            this.A03.setToolbarActionMode(6);
                        }
                    }
                    this.A03.setToolbarActionMessage(this.A04.replace(A00(0, 6, 100), String.valueOf((int) Math.ceil(f2))));
                } else {
                    this.A03.setToolbarActionMessage(this.A05);
                }
            }
        }
    }
}
