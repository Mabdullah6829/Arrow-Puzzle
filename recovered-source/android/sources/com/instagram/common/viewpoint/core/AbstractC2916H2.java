package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.H2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2916H2 {
    public static byte[] A04;
    public static String[] A05 = {"uP2VmRjmPrkQ", "gRGWgf4lLYF9Rif8PQPDNbGokb9BUMtV", "bSjOyzwe8Lqn79dPeHIi8kfJVgfNJaEZ", "7R1XMZQjg8S2TiXm1wE8kLqT1leJFKD3", "sD", "qKJRf3b", "Q40N8hoONMcQBFaHNU", "iAP6W7CwppN1UlUQVXHbR"};
    public C2910Gw A00;
    public final int A01;
    public final C4862n0 A02;
    public final InterfaceC2915H1 A03;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 45, 47, 61, 43};
    }

    static {
        A03();
    }

    public AbstractC2916H2(InterfaceC2911Gx interfaceC2911Gx, InterfaceC2915H1 interfaceC2915H1, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.A03 = interfaceC2915H1;
        this.A01 = i2;
        this.A02 = new C4862n0(interfaceC2911Gx, j2, j3, j4, j5, j6, j7);
    }

    private final int A00(InterfaceC4855ms interfaceC4855ms, long j2, C2945HV c2945hv) {
        if (j2 != interfaceC4855ms.A8n()) {
            c2945hv.A00 = j2;
            return 1;
        }
        if (A05[5].length() != 7) {
            throw new RuntimeException();
        }
        A05[4] = "eb0wJDSKJb6zWnRAqReB9UTGfXv";
        return 0;
    }

    private final C2910Gw A01(long j2) {
        return new C2910Gw(j2, this.A02.A05(j2), this.A02.A05, this.A02.A02, this.A02.A04, this.A02.A01, this.A02.A00);
    }

    private final void A04(boolean z, long j2) {
        this.A00 = null;
        this.A03.AFs();
    }

    private final boolean A05(InterfaceC4855ms interfaceC4855ms, long j2) throws IOException {
        long jA8n = j2 - interfaceC4855ms.A8n();
        if (jA8n >= 0 && jA8n <= 262144) {
            interfaceC4855ms.AK3((int) jA8n);
            return true;
        }
        return false;
    }

    public final int A06(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        while (true) {
            C2910Gw c2910Gw = (C2910Gw) AbstractC21273y.A02(this.A00);
            long jA01 = c2910Gw.A01();
            long jA00 = c2910Gw.A00();
            long jA02 = c2910Gw.A02();
            if (jA00 - jA01 <= this.A01) {
                A04(false, jA01);
                String[] strArr = A05;
                if (strArr[3].charAt(1) != strArr[1].charAt(1)) {
                    throw new RuntimeException();
                }
                A05[5] = "cjf3Phs";
                return A00(interfaceC4855ms, jA01, c2945hv);
            }
            if (!A05(interfaceC4855ms, jA02)) {
                return A00(interfaceC4855ms, jA02, c2945hv);
            }
            interfaceC4855ms.AIl();
            C2913Gz c2913GzAIw = this.A03.AIw(interfaceC4855ms, c2910Gw.A04());
            switch (c2913GzAIw.A00) {
                case -3:
                    A04(false, jA02);
                    return A00(interfaceC4855ms, jA02, c2945hv);
                case -2:
                    c2910Gw.A0D(c2913GzAIw.A02, c2913GzAIw.A01);
                    break;
                case -1:
                    c2910Gw.A0C(c2913GzAIw.A02, c2913GzAIw.A01);
                    break;
                case 0:
                    A05(interfaceC4855ms, c2913GzAIw.A01);
                    long floorPosition = c2913GzAIw.A01;
                    A04(true, floorPosition);
                    return A00(interfaceC4855ms, c2913GzAIw.A01, c2945hv);
                default:
                    throw new IllegalStateException(A02(0, 12, 109));
            }
        }
    }

    public final C4862n0 A07() {
        return this.A02;
    }

    public final void A08(long j2) {
        if (this.A00 != null && this.A00.A03() == j2) {
            return;
        }
        this.A00 = A01(j2);
    }

    public final boolean A09() {
        return this.A00 != null;
    }
}
