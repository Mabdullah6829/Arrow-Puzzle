package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4809lw implements InterfaceC2923H9 {
    public static byte[] A03;
    public static String[] A04 = {"IFBRawCVF0AWJOiiVagp2bzm1iWWQKSj", "auHMqC8YUXWsvqiTg7", "x05hwyQceYKgfv4KdHsaZDzMFYGIFABO", "EiWauAjA92n8uYBsDF1eTop4V9uY", "nHLlm8XHOjaWHtwU5p4BIc0GM3UweWlu", "dBwF9hq9j3gGLabp", "n4a5QuSOEmxq5i2DA2", "Zy0ftHIbrTR5qGqkd"};
    public static final InterfaceC2927HD A05;
    public InterfaceC2924HA A00;
    public AbstractC3074Jb A01;
    public boolean A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[3].length() == 20) {
                throw new RuntimeException();
            }
            A04[3] = "IEdap1c7a0gADNuxefg";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 36);
            i5++;
        }
    }

    public static void A02() {
        A03 = new byte[]{96, 71, 79, 74, 67, 66, 6, 82, 73, 6, 66, 67, 82, 67, 84, 75, 79, 72, 67, 6, 68, 79, 82, 85, 82, 84, 67, 71, 75, 6, 82, 95, 86, 67};
    }

    static {
        A02();
        A05 = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.lx
            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final InterfaceC2923H9[] A5N() {
                return C4809lw.A04();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
            public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
                return AbstractC2926HC.A01(this, uri, map);
            }
        };
    }

    public static C21864v A00(C21864v c21864v) {
        c21864v.A0f(0);
        return c21864v;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean A03(InterfaceC4855ms interfaceC4855ms) throws IOException {
        C3070JX c3070jx = new C3070JX();
        if (!c3070jx.A05(interfaceC4855ms, true) || (c3070jx.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c3070jx.A00, 8);
        C21864v c21864v = new C21864v(length);
        interfaceC4855ms.AGt(c21864v.A0l(), 0, length);
        if (C4811ly.A01(A00(c21864v))) {
            this.A01 = new C4811ly();
        } else if (C4806lt.A06(A00(c21864v))) {
            this.A01 = new C4806lt();
        } else {
            if (!C4808lv.A02(A00(c21864v))) {
                return false;
            }
            this.A01 = new C4808lv();
        }
        return true;
    }

    public static /* synthetic */ InterfaceC2923H9[] A04() {
        return new InterfaceC2923H9[]{new C4809lw()};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A00 = interfaceC2924HA;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        AbstractC21273y.A02(this.A00);
        if (this.A01 == null) {
            if (A03(interfaceC4855ms)) {
                interfaceC4855ms.AIl();
            } else {
                throw C20883K.A01(A01(0, 34, 2), null);
            }
        }
        boolean z = this.A02;
        if (A04[0].charAt(6) == 'U') {
            throw new RuntimeException();
        }
        A04[5] = "ISTJLhLpuA8o4P7J";
        if (!z) {
            InterfaceC2953Hd interfaceC2953HdAKS = this.A00.AKS(0, 1);
            this.A00.A6O();
            this.A01.A08(this.A00, interfaceC2953HdAKS);
            this.A02 = true;
        }
        return this.A01.A04(interfaceC4855ms, c2945hv);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AJ6(long j2, long j3) {
        if (this.A01 != null) {
            this.A01.A07(j2, j3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        try {
            return A03(interfaceC4855ms);
        } catch (C20883K unused) {
            return false;
        }
    }
}
