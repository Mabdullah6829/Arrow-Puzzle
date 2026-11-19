package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4751l0 implements InterfaceC3182LL {
    public static byte[] A08;
    public static String[] A09 = {"mF6wsmKEoSH0oaFjYCs54xiQsDf", "7fvgeHK83IOxRTsxSXxl4b3GDJCkJYIR", "3AWdxUjQjYm4RALX7ZxT6TNspaUhotFB", "ejd6qsjsHb99jkL857XJ5GpzVF9O4Dmm", "HjmRuX1Dl2gTeBJaQInX56gY9CThxDdt", "4dP72HMzoJKZI0lPLVreHOZSlD0czmst", "VabPsN9EmqWHNd02VeXfGkhVpY5qzzPo", "1TiSMCKkeVz3FItUT5PAcFJ22kgDAGxf"};
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C5064qI A04;
    public final InterfaceC2924HA A05;
    public final InterfaceC2953Hd A06;
    public final C3184LN A07;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-68, -95, -24, -16, -11, -69, -95, -34, 17, 9, -2, -4, 13, -2, -3, -71, -5, 5, 8, -4, 4, -71, 12, 2, 19, -2, -45, -71};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC3182LL
    public final boolean AIt(InterfaceC4855ms interfaceC4855ms, long j2) throws IOException {
        long j3 = j2;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(28) != strArr[5].charAt(28)) {
                throw new RuntimeException();
            }
            A09[7] = "xyHijgDe1t0LZE27YhGAb5keyZPdsLp6";
            if (j3 <= 0 || this.A00 >= this.A03) {
                int i2 = this.A07.A02;
                int i3 = this.A00 / i2;
                if (i3 > 0) {
                    long jA0U = this.A02 + AbstractC22035C.A0U(this.A01, 1000000L, this.A07.A04);
                    int i4 = i3 * i2;
                    int i5 = this.A00 - i4;
                    this.A06.AIu(jA0U, 1, i4, i5, null);
                    this.A01 += (long) i3;
                    this.A00 = i5;
                }
                return j3 <= 0;
            }
            int iAIp = this.A06.AIp(interfaceC4855ms, (int) Math.min(this.A03 - this.A00, j3), true);
            if (iAIp == -1) {
                j3 = 0;
            } else {
                this.A00 += iAIp;
                j3 -= (long) iAIp;
            }
        }
    }

    static {
        A01();
    }

    public C4751l0(InterfaceC2924HA interfaceC2924HA, InterfaceC2953Hd interfaceC2953Hd, C3184LN c3184ln, String str, int i2) throws C20883K {
        this.A05 = interfaceC2924HA;
        this.A06 = interfaceC2953Hd;
        this.A07 = c3184ln;
        int i3 = (c3184ln.A05 * c3184ln.A01) / 8;
        int bytesPerFrame = c3184ln.A02;
        if (bytesPerFrame == i3) {
            int bytesPerFrame2 = c3184ln.A04;
            int constantBitrate = bytesPerFrame2 * i3 * 8;
            int bytesPerFrame3 = c3184ln.A04;
            this.A03 = Math.max(i3, (bytesPerFrame3 * i3) / 10);
            C20592p c20592pA0j = new C20592p().A11(str).A0a(constantBitrate).A0j(constantBitrate);
            int bytesPerFrame4 = this.A03;
            C20592p c20592pA0h = c20592pA0j.A0h(bytesPerFrame4);
            int bytesPerFrame5 = c3184ln.A05;
            C20592p c20592pA0b = c20592pA0h.A0b(bytesPerFrame5);
            int bytesPerFrame6 = c3184ln.A04;
            this.A04 = c20592pA0b.A0m(bytesPerFrame6).A0i(i2).A14();
            return;
        }
        StringBuilder sbAppend = new StringBuilder().append(A00(7, 21, 72)).append(i3).append(A00(0, 7, 48));
        int bytesPerFrame7 = c3184ln.A02;
        throw C20883K.A01(sbAppend.append(bytesPerFrame7).toString(), null);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3182LL
    public final void AA8(int i2, long j2) {
        this.A05.AJ7(new C4749ky(this.A07, 1, i2, j2));
        this.A06.A6e(this.A04);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3182LL
    public final void AIk(long j2) {
        this.A02 = j2;
        this.A00 = 0;
        this.A01 = 0L;
    }
}
