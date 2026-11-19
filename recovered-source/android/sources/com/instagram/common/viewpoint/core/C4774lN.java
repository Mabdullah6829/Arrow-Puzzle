package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4774lN implements InterfaceC3156Kv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public final List<C3173LC> A04;
    public final InterfaceC2953Hd[] A05;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, -49, 4, 22, 2, 19, 21, 2, 19};
    }

    public C4774lN(List<C3173LC> list) {
        this.A04 = list;
        this.A05 = new InterfaceC2953Hd[list.size()];
    }

    private boolean A02(C21864v c21864v, int i2) {
        if (c21864v.A07() == 0) {
            return false;
        }
        if (c21864v.A0I() != i2) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void A5A(C21864v c21864v) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c21864v, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c21864v, 0)) {
                return;
            }
            int iA09 = c21864v.A09();
            int iA07 = c21864v.A07();
            for (InterfaceC2953Hd interfaceC2953Hd : this.A05) {
                c21864v.A0f(iA09);
                interfaceC2953Hd.AIr(c21864v, iA07);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + iA07;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void A5c(InterfaceC2924HA interfaceC2924HA, C3177LG c3177lg) {
        for (int i2 = 0; i2 < i; i2++) {
            C3173LC c3173lc = this.A04.get(i2);
            c3177lg.A05();
            InterfaceC2953Hd interfaceC2953HdAKS = interfaceC2924HA.AKS(c3177lg.A03(), 3);
            interfaceC2953HdAKS.A6e(new C20592p().A0y(c3177lg.A04()).A11(A00(0, 19, 111)).A12(Collections.singletonList(c3173lc.A02)).A10(c3173lc.A01).A14());
            this.A05[i2] = interfaceC2953HdAKS;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void AGp() {
        if (this.A03) {
            if (this.A02 != -9223372036854775807L) {
                for (InterfaceC2953Hd interfaceC2953Hd : this.A05) {
                    interfaceC2953Hd.AIu(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void AGq(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j2 != -9223372036854775807L) {
            this.A02 = j2;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3156Kv
    public final void AJ5() {
        this.A03 = false;
        this.A02 = -9223372036854775807L;
    }
}
