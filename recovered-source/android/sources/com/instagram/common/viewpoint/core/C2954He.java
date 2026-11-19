package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.He */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2954He {
    public static byte[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public final byte[] A06 = new byte[10];

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{78, 104, 111, 127, 82, 94, 58, 121, 114, 111, 116, 113, 58, 105, 123, 119, 106, 118, 127, 105, 58, 119, 111, 105, 110, 58, 120, 127, 58, 121, 117, 116, 110, 115, 125, 111, 117, 111, 105, 58, 115, 116, 58, 110, 114, 127, 58, 105, 123, 119, 106, 118, 127, 58, 107, 111, 127, 111, 127, 52};
    }

    public final void A02() {
        this.A05 = false;
        this.A02 = 0;
    }

    public final void A03(InterfaceC4855ms interfaceC4855ms) throws IOException {
        if (this.A05) {
            return;
        }
        interfaceC4855ms.AGt(this.A06, 0, 10);
        interfaceC4855ms.AIl();
        if (AbstractC2905Gr.A06(this.A06) == 0) {
            return;
        }
        this.A05 = true;
    }

    public final void A04(InterfaceC2953Hd interfaceC2953Hd, long j2, int i2, int i3, int i4, C2951Hb c2951Hb) {
        AbstractC21273y.A0A(this.A01 <= i3 + i4, A00(0, 60, 64));
        if (!this.A05) {
            return;
        }
        int i5 = this.A02;
        this.A02 = i5 + 1;
        if (i5 == 0) {
            this.A04 = j2;
            this.A00 = i2;
            this.A03 = 0;
        }
        this.A03 += i3;
        this.A01 = i4;
        if (this.A02 >= 16) {
            A05(interfaceC2953Hd, c2951Hb);
        }
    }

    public final void A05(InterfaceC2953Hd interfaceC2953Hd, C2951Hb c2951Hb) {
        if (this.A02 > 0) {
            interfaceC2953Hd.AIu(this.A04, this.A00, this.A03, this.A01, c2951Hb);
            this.A02 = 0;
        }
    }
}
